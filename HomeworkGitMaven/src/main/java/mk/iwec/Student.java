package mk.iwec;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Student {
	private Integer id;
	@NonNull
	private String firstName;
	@NonNull
	private String lastName;

}
