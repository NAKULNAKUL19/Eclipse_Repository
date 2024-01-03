package com.mvc4.SpringMvcFirstProgram;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
@Entity
@Table
public class Student {

	public String name;
	public int age;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sequence")
    @SequenceGenerator(name = "student_sequence", sequenceName = "student_sequence", allocationSize = 1)
	public int id;
	//public LocalDate date;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	/*public LocalDate getDate() {
		return date;
	}
	//public void setDate(LocalDate date) {
		this.date = date;
	}
	*/

	public Student(String name, int age, int id) {
		super();
		 System.out.println("I run first I'm Student Class");
		this.name = name;
		this.age = age;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", id=" + id + ", getName()=" + getName() + ", getAge()="
				+ getAge() + ", getId()=" + getId() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}
