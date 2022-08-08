package sasyspro.functions;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author Laola233
 * @since 0.2B
 * @version 0.1
 * @serial SchoolAdminSystemPro
 *
 */
public class GetNowTime {
	public final static String Date() {
		Date currentTime = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateString = formatter.format(currentTime);
		return dateString;
	}
}
