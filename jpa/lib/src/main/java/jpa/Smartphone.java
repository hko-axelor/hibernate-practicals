package jpa;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Smartphone {
	@Id
	private int sm_id;
	private String sm_name;
	@OneToOne
	private Student student;
	public int getSm_id() {
		return sm_id;
	}
	public void setSm_id(int sm_id) {
		this.sm_id = sm_id;
	}
	public String getSm_name() {
		return sm_name;
	}
	public void setSm_name(String sm_name) {
		this.sm_name = sm_name;
	}
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Smartphone [sm_id=" + sm_id + ", sm_name=" + sm_name + ", student=" + student + "]";
	}
	
	
	
}
