package cycles12;

public class tsiklizad12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a, x;
		a = 20;
		x = 11;
		for (int i = 2; i <= 10; i++) {

			a = 6 + (i - 1);

			x = a * x;
			
		}
		System.out.print(" "+ x);
	}

}
