package student;

public class TestStudent {
	public static void main(String args[]) {
		Student student1 = new Student(1, "Rohit", "AI", 'C');//parameterized constructor
		Student student2 = new Student();//default constructor
		Student student3 = new Student(student1); // copy constructor
		HostelStudent hs = new HostelStudent(1, "Priya", "AIML", 'G', 80, "H506", "Araya");
		
		RegularStudent rs = new RegularStudent(1, "Priya", "AIML", 'G', 80, "H506");
		//rs.displayInfo();
		//rs.payFee();
		//System.out.println(hs.Name);
		//hs.payFee();
		//student1.payFee();
		Student search = new Student();
		search.Search(2);
		search.Search(3, "Prahlad");
		
}
}