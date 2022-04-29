package Array;

public class Main {
	public static void main(String[] args) {
		Test test = new Test();
		int num1 = 100;
		System.out.println(test.num1 + " " + test.num2 + " " + test.num3);
		System.out.println("=================================");
		int num2 = test.setNum(5);	
		System.out.println("mainnum1 : " + num1);
		System.out.println("mainnum2 : " + num2);
		System.out.println("================");
		
		System.out.println(test.num1 + " " + test.num2 + " " + test.num3);
		System.out.println("=========================");
		num1 = test.setNum(num1);
		System.out.println("mainnum1 : " + num1);
		System.out.println("mainnum2 : " + num2);
		System.out.println("==============================");
		System.out.println(test.num1 + " " + test.num2 + " " + test.num3);
	}
}
