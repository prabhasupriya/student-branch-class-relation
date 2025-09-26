package studenthelper;
import student.Studentinfo;
import student.Branch;
import java.util.ArrayList;
import java.util.List;
public class Studenthelper {
	ArrayList<Studentinfo> studentlist = new ArrayList<>();
	//adding students into the list
	public boolean addstudents(Studentinfo s) {
		for(Studentinfo std : studentlist) {
			if(std.getRollnum() == s.getRollnum()) {
				return false;
			}
		}
		studentlist.add(s);
		return true;
	}
	//get the student details
	public Studentinfo getstudent(int rollnum) {
		for(Studentinfo s : studentlist) {
			if(s.getRollnum() == rollnum) {
				return s;
			}
		}
		return null;
		
	}
	//delete the student using id
	public boolean deletestudent(int rollnum) {
		Studentinfo temp =null;
		boolean flag = false;
		for(Studentinfo stg : studentlist) {
			if(stg.getRollnum() == rollnum) {
				temp = stg;
				flag = true;
			}
		}
		if(flag) {
			studentlist.remove(temp);
			return true;
		}
		else {
			return false;
		}
	}
	public ArrayList<Studentinfo>  getallstudentsdetails() {
		return studentlist;
	}
	public void replacestudent(Studentinfo s1 , Studentinfo s2) {
		deletestudent(s1.getRollnum());
		addstudents(s2);
	}
	//find using branch
	public List<Studentinfo> getstudentbybranch(Branch b){
		List<Studentinfo> list = new ArrayList<>();
		for(Studentinfo stg : studentlist) {
			if(stg.getBranch().equals(b.getBranchname())){
				list.add(stg);
			}
		}
		return list;
	}

}
