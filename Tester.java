package student;

public class Tester {
	public static void main(String args[]) {
	Branch cse = new Branch("cse " , 101 ,200);
	Studentinfo stu1 = new Studentinfo(106 , "Supriya" , cse , 80);
	Branch aiml = new Branch("Aiml" , 102 ,100);
	Studentinfo stu2 = new Studentinfo(107,"mouni",aiml,90);
	System.out.println(cse);
	System.out.println(stu1);
	System.out.println(aiml);
	System.out.println(stu2);
	}
	
	

}
