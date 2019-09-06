package programme2;

public class MarkValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static  boolean isPass(int mark) {
		if(mark>=40) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static String markGrade(int mark){
			if(isPass(mark)) {
				if(mark>=90)return "Grade A";
				if(mark>=75)return "Grade B";
				if(mark>=60)return "Grade C";
				else{return "Grade D";}
			}
			else {return "Fail";}
			}
	
		

}
