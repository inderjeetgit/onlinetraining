package programme3;

public class Markvalswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public  String markGrade(int mark) {
		char s;
		String r;
		if(mark>=90)s='A';
		else if(mark>=75)s='B';
		else if(mark>=60)s='C';
		else s='D';
		switch(s) {
		case 'A' : r="Grade A";
		break;
		case 'B':r="Grade B";
		break;
		case 'C':r="Grade C";
		break;
		case 'D':r="Grade D";
		break;
		default:r="fail";
		break;
		
		}
		return r;
	}

}
