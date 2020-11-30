import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class Test1 {

	
	enum Month
	{
	    January, February, April, March, May, July    
	};
	static Integer y;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//System.out.println(Month.March.ordinal());
		
		Period p1 = Period.ofYears(1);
		  Period p2 = Period.of(0, 1, 0);
		  Period p3 = p1.plus(p2);
		  System.out.println(p3.getDays());
		  
		  System.out.println(DateTimeFormatter.ISO_LOCAL_DATE.format(LocalDateTime.now()));
		  
//		  int x = 10;
//		    if ( x++ > 10 & y++ == 1) y += 10;
//		    System.out.print(y);
//		    
		    
		    LocalTime lt = LocalTime.of(2,2,15);
		    System.out.println(lt.getLong(ChronoField.valueOf("MINUTE_OF_DAY")));
	}

}
