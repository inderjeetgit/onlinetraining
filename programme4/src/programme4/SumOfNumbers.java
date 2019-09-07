package programme4;

public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	public  int sumOfOddNumbers( int start, int end) {
		int sum;
		if(start%2==0) {
			sum=0;
			for(int i=start+1;i<=end; ) {
				sum=sum+i;
				i+=2;
			}
			
		}
		else {
			sum=0;
			for(int i=start;i<=end; ) {
				sum=sum+i;
				i+=2;
				
			}
		}
		return sum;
	}
	public static int sumOfEvenNumbers( int start, int end) {
		int sum;
		if(start%2==0) {
			sum=0;
			for(int i=start;i<=end; ) {
				sum=sum+i;
				i+=2;
			}
		}
		else {
			sum=0;
			for(int i=start+1;i<=end; ) {
				sum=sum+i;
				i+=2;
			}
		}
		return sum;
	}

}
