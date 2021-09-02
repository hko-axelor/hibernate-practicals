package EmbeddableObject;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int rollno;
	private StudName name;
	private String hobby;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public StudName getName() {
		return name;
	}
	public void setName(StudName name) {
		this.name = name;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", hobby=" + hobby + "]";
	}
	

}
