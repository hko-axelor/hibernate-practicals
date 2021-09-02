package mapping;

//import java.util.ArrayList; 
//import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.ManyToOne;
//import javax.persistence.ManyToMany;

@Entity
public class Laptop {
	@Id
	private int lid;
	private String lname;
	
//For ManyToMany
	
	//	@ManyToMany		
	//	private List<Student> student = new ArrayList<Student>();

//For ManyToOne
	
	//	@ManyToOne		
	//	private Student student;
	
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
//For ManyToMany
	
	//	public List<Student> getStudent() {
	//		return student;
	//	}
	//	public void setStudent(List<Student> student) {
	//		this.student = student;
	//	}
	
//For ManyToOne
	
	//	public Student getStudent() {
	//		return student;
	//	}
	//	public void setStudent(Student student) {
	//		this.student = student;
	//	}
	
	
// For OneToOne
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", lname=" + lname + "]";
		
		
//For ManyToOne & ManyToMany
		
		//@Override
		//public String toString() {
		//	return "Laptop [lid=" + lid + ", lname=" + lname + ", student=" + student + "]";
	
	}
	

}
	
	
