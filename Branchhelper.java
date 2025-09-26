package studenthelper;
import student.Branch;
import java.util.ArrayList;
import java.util.List;
public class Branchhelper {
	ArrayList<Branch> branchlist = new ArrayList<>();
	//add branches
	public boolean addBranch(Branch b) {
		for(Branch b1 : branchlist) {
			if(b1.getBranchname().equals(b.getBranchname())){
				return false;
			}
		}
		branchlist.add(b);
		return true;
	}
	//delete branch
	public boolean deletebranch(int id) {
		Branch temp = null;
		boolean flag = false;
		for (Branch bcheck : branchlist) {
			if(bcheck.getbranchid() == id) {
				temp = bcheck;
				flag = true;
			}
		}
		if(flag) {
			branchlist.remove(temp);
			return true;
		}
		else {
			return false;
		}
	}
	public Branch getbranchbyid(int id) {
		for(Branch b : branchlist) {
			if(b.getbranchid() == id) {
				return b;
			}
		}
		return null;
	}
	//getallbranches
	public List<Branch> getallbranches(){
		return branchlist;
	}
	
	

}
