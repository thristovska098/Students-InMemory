package mk.iwec;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemoryManager {
	StudentsCollecton sc = new StudentsCollecton();

	public void setMemory() {
		// Inserting students
		sc.insertStudent("Trajanka", "Trajkovska");
		sc.insertStudent("Petranka", "Petrovska");
		sc.insertStudent("Mirko", "Mirkovski");
		sc.insertStudent("Petre", "Petrevski");
		sc.insertStudent("Trajanka", "Trajkovska");
		sc.insertStudent("Petranka", "Petrovska");
		sc.insertStudent("Mirko", "Mirkovski");
		sc.insertStudent("Petre", "Petrevski");

		// Delete student with id 3
		sc.deleteStudent(3);

		// Update student with id 5
		sc.updateStudent(5, "Milica", "Milicovska");

		// Update student with id 6 with new name
		sc.updateStudentName(6, "Petra");

		// Update student with id 7 with new lastName
		sc.updateStudentLastName(7, "Mirkov");

	}

}
