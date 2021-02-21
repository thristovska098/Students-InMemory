package mk.iwec;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemoryManager {
	StudentDAOImpl sc = new StudentDAOImpl();

	public void setMemory() {
		// Inserting students
		sc.insert("Trajanka", "Trajkovska");
		sc.insert("Petranka", "Petrovska");
		sc.insert("Mirko", "Mirkovski");
		sc.insert("Petre", "Petrevski");
		sc.insert("Trajanka", "Trajkovska");
		sc.insert("Petranka", "Petrovska");
		sc.insert("Mirko", "Mirkovski");
		sc.insert("Petre", "Petrevski");

		// Delete student with id 3
		sc.delete(3);

		// Update student with id 5
		sc.updateObject(5, "Milica", "Milicovska");

		// Update student with id 6 with new name
		sc.updateObjectName(6, "Petra");

		// Update student with id 7 with new lastName
		sc.updateObjectLastName(7, "Mirkov");

	}

}
