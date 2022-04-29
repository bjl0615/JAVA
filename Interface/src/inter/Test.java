package inter;
public class Test {
	static int b = 0;
	static int add(int a) {
		int tmp = b;
		b = a;
		return a + tmp;
	}
	public static void main(String[] args) {
		System.out.println(add(1));
		System.out.println(add(2));
		System.out.println(add(3));
		System.out.println(add(4));
		System.out.println(add(400));
	}
}
/*
 * 1 1
 * 2 3
 * 3 5
 * 4 7
 * a a
 * b a+b
 * c b+c
 * d c+d
 */