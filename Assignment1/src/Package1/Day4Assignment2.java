package Package1;

public class Day4Assignment2 {

	public void mtd0() {
		this.mtd4(10,20,30,40);
		System.out.println("Default Method");
		}
	public void mtd1(int a) {
		this.mtd0();
		System.out.println("One parameterized method");
		}
	public void mtd2(int a, int b) {
		this.mtd1(10);
		System.out.println("Two parameterized method");
		}
	public void mtd3(int a, int b, int c) {
		System.out.println("Three parameterized method");
		}
	public void mtd4(int a, int b, int c, int d) {
		this.mtd3(10,20,30);
		System.out.println("Four parameterized method");
		}
	public static void main(String[] args) {
		Day4Assignment2 obj=new Day4Assignment2();
		obj.mtd2(0, 0);
	}
}
