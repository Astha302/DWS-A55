package org.automation.generic_utilities;

import java.time.LocalDateTime;
import java.util.Random;

public class javaUtil
{
	
	/**this method is used to get the random number
	 * 
	 * @param boundary
	 * @return
	 */
	public static int getrandomNumber(int boundary)
	{
		Random random  = new Random();
		return random.nextInt();
	}
	
	
	/**This method is used to get the time stamp[Date+time]
	 * 
	 * @return timeStamp[String]
	 */
	public static String timeStamp()
	{
		LocalDateTime ldt = LocalDateTime.now();
		return(ldt.toString().replace(":", "-"));
		
	}
}
