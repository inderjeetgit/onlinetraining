package programme5;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calculateFactorial(5));

	}
	public static int calculateFactorial(int number) {
		if(number==1)return 1;
		else {
			return number*calculateFactorial(number-1);
		}
}
}
