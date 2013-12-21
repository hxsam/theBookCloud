package com.thebookcloud.persistence;

public interface GenericDao<T, PK> {

	public PK create(T newInstance);

	public T read(PK id);

	public void update(T transientObject);

	public void delete(T persistentObject);

}
