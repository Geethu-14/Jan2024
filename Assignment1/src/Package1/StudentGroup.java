package Package1;

public class StudentGroup {
	int rollno, age;
	
	public void Display1() {
		System.out.println("Welcome to all of you.");}
	public void Display2() {
		System.out.println("Automation is very easy.");}
	
	public static void main(String[] args) {
		StudentGroup obj=new StudentGroup();
		obj.Display1();
		obj.Display2();
		
		obj.rollno=10;
		obj.age=18;
		System.out.println("Roll number of the student: " +obj.rollno);
		System.out.println("Age of the Student: " +obj.age);
	}
}
