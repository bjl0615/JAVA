package Array;

import java.util.Arrays;

public class Arr {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int[] b = {6,7,8,9,0};
		int[] c = {};
		
		c = a;
		a = b;
		b = c;
		for(int i=0 ; i < b.length ; i ++) {
			System.out.print(a[i]);
		}
	}
}
