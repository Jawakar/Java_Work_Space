package UniquePack;
import java.util.*;
public class TimeConversion {
	static String timeConversion(String time) {
	      String [] timeArr = time.split(":");
	      String isPm = timeArr[2].substring(2,4);
	      int HH = Integer.parseInt(timeArr[0]);
	      int MM = Integer.parseInt(timeArr[1]);
	      int SS = Integer.parseInt(timeArr[2].substring(0,2));
	      String PM = "PM";
	      String AM = "AM";
	      if(isPm.equals(PM)&&HH!=12) {
	          HH+=12;
	      }
	      else if(HH==12 && isPm.equals(AM)){
	          HH = 0;
	      }
	      return String.format("%02d:%02d:%02d", HH,MM,SS);
	    }
	public static void main(String[] args) { 
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the time in 12-Hours format:");
	  String time = sc.next();
	  System.out.println("The time in 24-Hours format is:");
	  System.out.println(timeConversion(time));
  }
}