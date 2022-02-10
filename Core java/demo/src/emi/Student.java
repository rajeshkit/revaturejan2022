package emi;

public class Student {
	int studentId;
	String studentName;
	float cgpa;
	public Student() {
		System.out.println("Student no arg Constructor called");
		studentId=4575;	
		studentName="Rajesh";
		cgpa=7.8f;
	}
	public Student(int studentId,String studentName,float cgpa) {
	//	System.out.println("Student 3 arg Constructor called");
		this.studentId=studentId;
		this.studentName=studentName;
		this.cgpa=cgpa;
//		studentId=id;
//		studentName=name;
//		cgpa=cgp;
	}
	public void show() {
		
		System.out.println("show method is called");
		System.out.println("Student ID: "+studentId);
		System.out.println("Student Name: "+studentName);
		System.out.println("Student CGPA: "+cgpa);
	}
	public static void main(String[] args) {
		Student s1=new Student(676,"Rajesh",9.0f);
		//s1.show();
		Student s2=new Student(456,"ajay",7.6f);
		//s2.show();
		Student s3=new Student(452,"rohit",5.6f);
		//s3.show();
		
		int marks[]=new int[10];// 10 int primitive values
		
		Student students[]=new Student[5];//10 student object
		// 10 student object references
		students[0]=s1;
		students[1]=s2;
		students[2]=s3;
		
		for (Student student : students) {
			System.out.println(student.studentId);
			System.out.println(student.studentName);
			System.out.println(student.cgpa);
			System.out.println("*************************");
		}
		
	}
}
