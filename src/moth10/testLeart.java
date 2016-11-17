package moth10;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

public class testLeart {

	
	public static boolean compare_date(String DATE1, String DATE2) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm");
        try {
            Date dt1 = df.parse(DATE1);
            Date dt2 = df.parse(DATE2);
            if (dt1.getTime() >= dt2.getTime()) {
                System.out.println("dt1 在dt2前");
                return true;
            } else if (dt1.getTime() < dt2.getTime()) {
                System.out.println("dt1在dt2后");
                return false;
            } 
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return true;
    }
	public static void main(String[] args) {
		String StartTime="2016-10-28 09:00:00";
		String EndTime="2016-10-28 19:00:00";
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(compare_date(StartTime, sdf.format(new Date())));
		System.out.println(compare_date(sdf.format(new Date()), EndTime));
	}

}
