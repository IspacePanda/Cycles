package cycles7;

public class tsiklizad7 {

	public static void main(String[] args) {

		int � = -4;
		int B = 2;
		int shagh = 3;
		System.out.println("opredelit znach. fynktsii ot a  = " + � + " do b = " + B + " s shagom h = " + shagh);
		for (int i = �; i <= B; i = i + shagh) {
			int numX = i;
			int result;
			if (numX <= 2) {
				result = -numX;
			} else {
				result = numX;
			}
			System.out.println("znachenie funktsii y = " + result + " pri x = " + numX);
		}
	}

}
