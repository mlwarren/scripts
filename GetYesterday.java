import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.io.*;

public class GetYesterday{
	public static void main(String args[]){
		try{
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd"); //See http://docs.oracle.com/javase/6/docs/api/java/text/SimpleDateFormat.html for more options
			Calendar calendar = Calendar.getInstance();
			calendar.add(Calendar.DATE, -1); //Remove one from current calendar date
			
			System.out.println(dateFormat.format(calendar.getTime()));
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}