package jpa;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(schema = "public")
public class Student {
	@Id
	private int sid;
	private String sname;
	
	@OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
	private Smartphone smartphone;
	@OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
	private List<Books> books;
	@ManyToMany(mappedBy = "student", cascade = CascadeType.ALL)
	private List<Laptop> laptop;
	
	public List<Books> getBooks() {
		return books;
	}

	public void setBooks(List<Books> books) {
		this.books = books;
	}

	public List<Laptop> getLaptop() {
		return laptop;
	}

	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}

	public Smartphone getSmartphone() {
		return smartphone;
	}

	public void setSmartphone(Smartphone smartphone) {
		this.smartphone = smartphone;
	}

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

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", smartphone=" + smartphone + ", books=" + books
				+ ", laptop=" + laptop + "]";
	}

	

	
	

}
