package Package1;

public class Day3Assignment2 {
	public int sum(int a, int b) {
		int val1;
		val1 = a+b;
		System.out.println("Result of sum: " +val1);
		return val1;
	}
	public int sub(int c, int d) {
		int val2;
		val2=c-d;
		System.out.println("Result of subtract: " +val2);
		return val2;
	}
	public int div(int y, int z) {
		int val4;
		val4=y/z;
		System.out.println("Result of div: " +val4);
		return val4;
	}
	public static void main(String[] args) {
		Day3Assignment2 obj = new Day3Assignment2();
		int divresult1 = obj.div(10, 2);
		int subresult1 =obj.sub(divresult1, 2);
		int sumresult =obj.sum(subresult1, 2);
		int subresult2 =obj.sub(sumresult, 2);
		int divresult2 = obj.div(subresult2, 2);
		System.out.println("Final result of Arthimethic expression (((((10/2)-2)+2)-2)/2): "+divresult2);
	}
}
