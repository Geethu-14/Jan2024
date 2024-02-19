package Package1;

public class Day4Assignment {
	public Day4Assignment() {
		this(10,20,30);
		System.out.println("Default constructor");
	}
	public Day4Assignment(int a) {
		this();
		System.out.println("one parameterized constructor");
	}
	public Day4Assignment(int a,int b) {
		this(30);
		System.out.println("Two parameterized constructor");
	}
	public Day4Assignment(int a,int b, int c) {
		System.out.println("Three parameterized constructor");
	}
	public Day4Assignment(int a,int b, int c, int d) {
		this(10,20);
		System.out.println("Four parameterized constructor");
	}
public static void main(String[] args) {
	Day4Assignment obj=new Day4Assignment(10,20,30,40);
}
}
