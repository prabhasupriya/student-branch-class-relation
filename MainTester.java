package studenthelper;

import student.Branch;
import student.Studentinfo;

public class Maintester {
	public static void main(String args[]) {
	Studenthelper sh = new Studenthelper();
	
	Branch cse = new Branch("cse" , 111,230);
	Branch aiml = new Branch("aiml" , 222,220);
	Branch ece= new Branch("ece" , 333,120);
	Branch ds = new Branch("ds" , 444,320);
	Branch mech = new Branch("mech" ,555,420);
	
	Studentinfo s1 = new Studentinfo(101,"Supriya" ,cse, 1234 );
	Studentinfo s2 = new Studentinfo(102,"prabha" ,aiml, 2234 );
	Studentinfo s3 = new Studentinfo(103,"mouni" ,ece, 1434 );
	Studentinfo s4 = new Studentinfo(104,"vijaya" ,ds, 6234 );
	Studentinfo s5 = new Studentinfo(105,"ramu" ,mech, 8234 );
	sh.addstudents(s1);
	sh.addstudents(s2);
	sh.addstudents(s3);
	sh.addstudents(s4);
	sh.addstudents(s5);
	System.out.println(sh.getallstudentsdetails());
	Branchhelper ab = new Branchhelper();
	ab.addBranch(cse);
	ab.addBranch(aiml);
	ab.addBranch(ece);
	ab.addBranch(ds);
	ab.addBranch(mech);
	
	System.out.println(ab.getallbranches());
	System.out.println(sh.getstudent(102));
	System.out.println("get element by branch : ");
	System.out.println(ab.deletebranch(555));
	
	
	
	
	

}
	}
