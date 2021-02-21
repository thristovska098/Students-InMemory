
package mk.iwec;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDAOImpl implements StudentDAO<Student> {
	private List<Student> students = new ArrayList<Student>();

	public void insert(String firstName, String lastName) {
		int newId;
		if (students.size() == 0) {
			newId = 1;
		} else {
			newId = students.size() + 1;
		}
		students.add(new Student(newId, firstName, lastName));
	}

	public boolean delete(int id) {
		if (students.size() == 0 || students.size() < id) {
			return false;
		} else {
			students.remove(id - 1);
			return true;
		}
	}

	public boolean updateObject(int id, String firstName, String lastName) {
		// Update the student with id with the new firstName and lastName
		if (students.size() == 0 || students.size() < id) {
			return false;
		} else {
			Student student = students.get(id - 1);
			student.setFirstName(firstName);
			student.setLastName(lastName);
			return true;
		}

	}

	public boolean updateObjectName(int id, String firstName) {
		// Update the student with id with the new firstName
		if (students.size() == 0 || students.size() < id) {
			return false;
		} else {
			Student student = students.get(id - 1);
			student.setFirstName(firstName);
			return true;
		}

	}

	public boolean updateObjectLastName(int id, String lastName) {
		// Update the student with id with the new firstName and lastName
		if (students.size() == 0 || students.size() < id) {
			return false;
		} else {
			Student student = students.get(id - 1);
			student.setLastName(lastName);
			return true;
		}

	}

	public List<Student> selectAll() {
		return this.getStudents();
	}

	public Student selectId(int id) {
		if (students.size() == 0 || students.size() < id) {
			return null;
		}
		Student student = students.get(id - 1);
		return student;
	}

	public List<Student> selectName(String firstName) {
		List<Student> newStudents = students.stream().filter(s -> s.getFirstName().equals(firstName))
				.collect(Collectors.toList());
		return newStudents;
	}

	public List<Student> selectLastName(String lastName) {
		List<Student> newStudents = students.stream().filter(s -> s.getLastName().equals(lastName))
				.collect(Collectors.toList());
		return newStudents;
	}

	public List<Student> selectNames(String firstName, String lastName) {
		List<Student> newStudents = students.stream().filter(s -> s.getLastName().equals(lastName))
				.filter(s -> s.getLastName().equals(lastName)).collect(Collectors.toList());
		return newStudents;
	}
}
