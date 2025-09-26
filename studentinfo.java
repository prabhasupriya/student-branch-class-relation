package student;

public class Studentinfo {
	private int rollnum;
	private String name;
	private Branch branch;
	private int mobilenum;
	public Studentinfo() {}
	public Studentinfo(int rollnum , String name , Branch branch , int mobilenum) {
		this.rollnum= rollnum;
		this.name = name;
		this.branch = branch;
		this.mobilenum = mobilenum;
	}
	public int getRollnum() {
		return rollnum;
	}
	public void setRollnum(int rollnum) {
		this.rollnum = rollnum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name =  name;
	}
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	public double getmobilenum() {
		return mobilenum;
	}
	public void setMarks(int mobilenum ) {
		this.mobilenum = mobilenum;
	}
	
	public String toString() {
		return "student roll number : " + rollnum + " student name : " + name +" student branch : " + branch + " student mobilenum : " + mobilenum+ "\n"; 
	}

}
