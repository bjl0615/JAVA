package name;

public class name {
	public static void Random(int[] array) {
		int temp = 0;
		
		for(int i = 0 ; i < array.length; i++ ) {
			for ( int j = 0 ; j < i ; j++) {
				if(array[i] <= array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
					array[i] = (int)(Math.random()*10)+1;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] array = new int[5];
		Random(array);
		
		for(int i=0; i< array.length; i++) {
			System.out.println(i + 1 +" 번쨰 난수 : " + array[i]) ;
		}
	}
}
