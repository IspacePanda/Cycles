package cycles14;

public class tsiklizad14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 1;
		double n = 5;
		double res = 0;
		
		
		for (double i = 0; i <= n; i++) {
			a = 1 / (1 + i);
			res = res + a;
		}
		System.out.println(+res);
	}

}
