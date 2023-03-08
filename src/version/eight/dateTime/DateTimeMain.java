package version.eight.dateTime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeMain {

	public static void main(String[] args) {

		/*
		 * All the core classes in the new API are constructed by fluent factory
		 * methods. When constructing a value by its constituent fields, the factory is
		 * called of; when converting from another type, the factory is called from.
		 * There are also parse methods that take strings as parameters.
		 * 
		 * ANSI SQL                  Java SE 8 
		 * 
		 * DATE                      LocalDate 
		 * TIME                      LocalTime 
		 * TIMESTAMP                 LocalDateTime 
		 * TIME WITH TIMEZONE        OffsetTime 
		 * TIMESTAMP WITH TIMEZONE   OffsetDateTime
		 * 
		 * 
		 */

		LocalDateTime timePoint = LocalDateTime.now(); // The current date and time
		LocalDate.of(2012, Month.DECEMBER, 12); // from values
		LocalDate.ofEpochDay(150); // middle of 1970
		LocalTime.of(17, 18); // the train I took home today
		LocalTime.parse("10:15:30"); // From a String
		

		System.out.println(timePoint);
		System.out.println(timePoint.getSecond());

		System.out.println(timePoint.truncatedTo(ChronoUnit.SECONDS)+" Truncaded");
		System.out.println("------------------");
		
		// Set the value, returning a new object
		LocalDateTime thePast = timePoint.withDayOfMonth(
		    10).withYear(2010);
		
		System.out.println(thePast);
		System.out.println("------------------");

		/* You can use direct manipulation methods, 
		    or pass a value and field pair */
		LocalDateTime yetAnother = thePast.plusWeeks(1).plus(3, ChronoUnit.WEEKS);
		
		System.out.println(yetAnother);
		System.out.println("------------------");
		
		// You can specify the zone id when creating a zoned date time
		ZoneId id = ZoneId.of("America/Indiana/Indianapolis");
		ZonedDateTime zoned = ZonedDateTime.of(timePoint, id);
		
		System.out.println(zoned);
		System.out.println("------------------");
		
		// A duration of 3 seconds and 5 nanoseconds
		Duration duration = Duration.ofSeconds(3, 5);
		Duration oneDay = Duration.between(LocalDateTime.now(), LocalDateTime.now().minusDays(1));
		
		System.out.println(oneDay);
		System.out.println("------------------");
		
		
		
	}

}
