package main;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.HashSet;
import java.util.Set;

import com.thebookcloud.objects.Author;
import com.thebookcloud.objects.Book;
import com.thebookcloud.objects.User;


public class MainBook {

	public static void main(String[] args) {
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		System.out.println(session);
		try {
			trns = session.beginTransaction();
			
			//Set up a book
			Book book = new Book();
			book.setBookType(1);
			book.setCategory(1);
			book.setIsbn("12344241234");
			book.setPicturePath("/opt/Man on the moon");
			book.setTitle("Man on the Moon");
			book.setYear("1978");
			
			//
			Set<Author> authors = new HashSet<Author>();
			Author author = new Author();
			author.setFirstName("Henry");
			author.setMiddleName("qwery");
			author.setLastName("Thorue");
			authors.add(author);
			
			
			
			book.setAuthors(authors);
			
			session.save(book);
			
			User user = (User)session.get(User.class, 1);
			System.out.println(user);
			
			session.getTransaction().commit();
			
		} catch (RuntimeException e) {
			if (trns != null) {
				trns.rollback();
			}
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}

	}

}
