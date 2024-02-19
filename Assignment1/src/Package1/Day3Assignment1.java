package Package1;

public class Day3Assignment1 {

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
	public int mul(int w, int x) {
		int val3;
		val3=w*x;
		System.out.println("Result of multiple: " +val3);
		return val3;
	}
	public int div(int y, int z) {
		int val4;
		val4=y/z;
		System.out.println("Result of div: " +val4);
		return val4;
	}
	public static void main(String[] args) {
		Day3Assignment1 obj = new Day3Assignment1();
		int sumresult1 =obj.sum(10,2);
		int sumresult2 =obj.sum(sumresult1, 2);
		int subresult =obj.sub(sumresult2, 2);
		int mulresult = obj.mul(subresult, 2);
		int divresult = obj.div(mulresult, 2);
		System.out.println("Final result of Arthimethic expression (((((10+2)+2)-2)*2)/2): "+divresult);
	}
}
