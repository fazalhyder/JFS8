import java.util.Scanner;
class AttendanceShortageException extends RuntimeException{
	public AttendanceShortageException (){
		super ();
		System.out.println("AttendanceShortageException ()");
	}
	public AttendanceShortageException( String msg){
		super(msg);
	}
}
class GPAException extends RuntimeException{
	public GPAException (){
		super();
		System.out.println("GPAException()");
		
	}
		public GPAException(String msg){
			super(msg);
		}
}
public class exception{
	public static void main (String [] srgs){
		Scanner in = new Scanner(System.in);
		System.out.println("enter your attendence : ");
		int atd = in.nextInt();
		System.out.println("enter your GPA : ");
		int gpa = in.nextInt();
		if(atd<75){
			throw new AttendanceShortageException();
		}
		else{
			System.out.println("Attendence criteria passed");
		}
		if(gpa<7){
		throw new GPAException();
		}
		else{
			System.out.println("GPA criteria passed ");
		}
	}
}


		
		