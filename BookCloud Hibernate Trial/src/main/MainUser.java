package main;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.thebookcloud.objects.Author;
import com.thebookcloud.objects.Book;
import com.thebookcloud.objects.BookRating;
import com.thebookcloud.objects.Flag;
import com.thebookcloud.objects.Preference;
import com.thebookcloud.objects.Queue;
import com.thebookcloud.objects.QueueEntry;
import com.thebookcloud.objects.User;

public class MainUser {

	public static void main(String[] args) {
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		System.out.println(session);
		try {
			trns = session.beginTransaction();
			
			//Sets up the User
			User user = new User();		
			user.setFirstName("Justin");
			user.setMiddleName("Franz");
			user.setLastName("Vail");
			
			//Sets up 2 preferences for user
			Preference prefer1 = new Preference();
			prefer1.setPreferenceType(1);
			prefer1.setUser(user);
			prefer1.setValue("value1");			
			Preference prefer2 = new Preference();
			prefer2.setPreferenceType(1);
			prefer2.setUser(user);
			prefer2.setValue("value2");
			
			//Sets up a Preference hashset that will be passed to the user
			Set<Preference> preferences = new HashSet<Preference>();
			preferences.add(prefer1);	
			preferences.add(prefer2);	
			
			//Sets up three Queues for the User
			Queue queue1 = new Queue();
			queue1.setName("My Short Stories");
			queue1.setUser(user);
			Queue queue2 = new Queue();
			queue2.setName("My Novels");
			queue2.setUser(user);
			Queue queue3 = new Queue();
			queue3.setName("Mark Twain Stories");
			queue3.setUser(user);
			
			//Sets up six queue entries, two for each queue. (I use the same book for all entries for simplicities sake)
			QueueEntry queueEntry1 = new QueueEntry();
			queueEntry1.setOrderPlacement(1);
			queueEntry1.setQueue(queue1);
			queueEntry1.setBookId(1);
			QueueEntry queueEntry2 = new QueueEntry();
			queueEntry2.setOrderPlacement(2);
			queueEntry2.setQueue(queue1);
			queueEntry2.setBookId(1);
			QueueEntry queueEntry3 = new QueueEntry();
			queueEntry3.setOrderPlacement(1);
			queueEntry3.setQueue(queue2);
			queueEntry3.setBookId(1);
			QueueEntry queueEntry4 = new QueueEntry();
			queueEntry4.setOrderPlacement(2);
			queueEntry4.setQueue(queue2);
			queueEntry4.setBookId(1);
			QueueEntry queueEntry5 = new QueueEntry();
			queueEntry5.setOrderPlacement(1);
			queueEntry5.setQueue(queue3);
			queueEntry5.setBookId(1);
			QueueEntry queueEntry6 = new QueueEntry();
			queueEntry6.setOrderPlacement(2);
			queueEntry6.setQueue(queue3);
			queueEntry6.setBookId(1);
			
			//Sets up 3 sets of QueuesEntries to be added to the 3 queues.
			Set<QueueEntry> queueEntries1 = new HashSet<QueueEntry>();
			queueEntries1.add(queueEntry1);
			queueEntries1.add(queueEntry2);
			queue1.setQueueEntries(queueEntries1);
			
			
			Set<QueueEntry> queueEntries2 = new HashSet<QueueEntry>();
			queueEntries2.add(queueEntry3);
			queueEntries2.add(queueEntry4);
			queue2.setQueueEntries(queueEntries2);
			
			
			Set<QueueEntry> queueEntries3 = new HashSet<QueueEntry>();
			queueEntries3.add(queueEntry5);
			queueEntries3.add(queueEntry6);
			queue3.setQueueEntries(queueEntries3);
			
			//Adds the Queues to the set of Queues
			Set<Queue> queues = new HashSet<Queue>();
			queues.add(queue1);
			queues.add(queue2);
			queues.add(queue3);
			
			//Sets the Queues and Preferences in the User.
			user.setQueues(queues);
			user.setPreferences(preferences);
			
			//the User object is now complete and can be saved to the Database.
						
			session.save(user);
			
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
