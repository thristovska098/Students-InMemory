package mk.iwec;

import java.util.List;

public interface StudentDAO<T> {
	public void insert(String firstName, String lastName);

	public boolean delete(int id);

	public boolean updateObject(int id, String firstName, String lastName);

	public boolean updateObjectName(int id, String firstName);

	public boolean updateObjectLastName(int id, String lastName);

	public List<T> selectAll();

	public T selectId(int id);

	public List<T> selectName(String firstName);

	public List<T> selectLastName(String lastName);

	public List<T> selectNames(String firstName, String lastName);

}
