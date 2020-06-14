package com.hibernate.DemoHibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Book 
{
	@Id
	private int bId;
	private String bookName;
	
	@ManyToMany
	private List<Student> student = new ArrayList<Student>();
	
	public int getbId() {
		return bId;
	}
	public void setbId(int bId) {
		this.bId = bId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	
	  public List<Student> getStudent() 
	  {
		  return student;
	  } 
	  public void setStudent(List<Student> student) 
	  {
		  this.student = student; 
	  }
	 
	@Override
	public String toString() {
		return "Book [bId=" + bId + ", bookName=" + bookName + "]";
	}
	
	
}
