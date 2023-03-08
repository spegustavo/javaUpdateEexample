package version.eight.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class MainLambda {

	public static void main(String[] args) {
		
		
		//1st example 
		Runnable r = new Runnable() {
		      public void run() {
		        System.out.println("Normal, world!");
		      }
		    };
		    r.run();
		    
		    //Using Lambda
		    Runnable r2 = () -> System.out.println("Lambda, world!");
		    r2.run();
		    
		    System.out.println("--------------------------");
		    
		    //With Parameters
		    Comparator<String> c = (String lhs, String rhs) -> lhs.compareTo(rhs);
		    int result = c.compare("Hello", "World");
		    
		    System.out.println(result);
		    
		    System.out.println("--------------------------");
		    
		    //Will not Compile, Object is not a functional interface
		    //Object o = () -> System.out.println("Howdy, world!");
		    
		    //Use a Cast
		    Object o = (Runnable) () -> System.out.println("Howdy, world!");
		    
		    //You may change parameter values before run
		    StringBuilder message = new StringBuilder();
		    Runnable r1 = () -> System.out.println(message);
		    message.append("Im Using , ");
		    message.append("String builder!");
		    r1.run();
		    
		    System.out.println("--------------------------");
		    
		    //Using it inside classes
		    Person[] people = new Person[] {
		    	      new Person("Ted", "Neward", 41),
		    	      new Person("Charlotte", "New", 41),
		    	      new Person("Michael", "Snow", 19),
		    	      new Person("Matthew", "Sun", 13)
		    	    };
		    
		 // Sort by first name
		    Arrays.sort(people, Person.compareFirstName);
		    
		    for (Person p : people)
		      System.out.println(p);
		    
		    System.out.println("--------------------------");
		    
		 // Sort by Last name
		    Arrays.sort(people, Person.compareLastName);
		    
		    for (Person p : people)
		      System.out.println(p);
		    
		

	}

}
