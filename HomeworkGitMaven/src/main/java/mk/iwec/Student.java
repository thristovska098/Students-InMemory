package mk.iwec;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Student {
	private Integer id;
	private String firstName;
	private String lastName;

	public Student(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

}
