package mk.iwec;

public class App {

	public static void main(String[] args) {
		
		MemoryManager mm=new MemoryManager();
		mm.setMemory();
		StudentsCollecton sc = mm.getSc();

		// show all the students 
		System.out.println(sc.selectAll());

	}

}
