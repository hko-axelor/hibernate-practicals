package mapping;

//import java.util.ArrayList;
//import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.ManyToMany;
//import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Student {
	@Id
	private int sid;
	private String sname;
	
	@OneToOne		//For OneToOne
	private Laptop laptop;
	
//	@OneToMany(mappedBy="student")	For OneToMany
//	private List<Laptop> laptop = new ArrayList<Laptop>();
	
//	@ManyToMany
//	private List<Laptop> laptop = new ArrayList<Laptop>();
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	
// For OneToOne
	
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	
	
// For OneToMany
	
//	public List<Laptop> getLaptop() {
//		return laptop;
//	}
//	public void setLaptop(List<Laptop> laptop) {
//		this.laptop = laptop;
//	}
	
	
	
// For ManyToMany
	
//		public List<Laptop> getLaptop() {
//			return laptop;
//		}
//		public void setLaptop(List<Laptop> laptop) {
//			this.laptop = laptop;
//		}
	
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", laptop=" + laptop + "]";
	}
	
	
}
