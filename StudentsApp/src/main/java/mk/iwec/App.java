package mk.iwec;

public class App {

	public static void main(String[] args) {

		MemoryManager mm = new MemoryManager();
		mm.setMemory();
		StudentDAOImpl sc = mm.getSc();

		// show all the students
		System.out.println(sc.selectAll());
		//Check the other methods that can be used instead of selectAll() in the StudentDAO interface.
	}

}
