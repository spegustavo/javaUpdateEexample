package version.eight.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import version.eight.streams.Gender.Gender;
import version.eight.streams.Gender.Person;

public class MainStreamGender {

	public static void main(String[] args) {
		 List<Person> people = getPeople();

		    // Imperative approach ❌

		 	people.forEach(System.out::println);
		 	
		 	System.out.println("--------------------------");
		    
		    List<Person> females = new ArrayList<>();
		    for (Person person : people) {
		      if (person.getGender().equals(Gender.FEMALE)) {
		        females.add(person);
		      }
		    }
		    females.forEach(System.out::println);
		    
		    System.out.println("--------------------------");
		

		    // Declarative approach ✅

		    // Filter
//		 	people.stream().filter( p -> p.getGender().equals(Gender.MALE)).forEach(System.out::println);
		   
		    
		    // Sort
		   people.stream().sorted(Comparator.comparing(Person::getAge)).forEach(System.out::println);
		   
		   System.out.println("--------------------------");
		   
		   people.stream().sorted(Comparator.comparing(Person::getGender).thenComparing(Person::getAge)).forEach(System.out::println);

		   System.out.println("--------------------------");
		   
		    // All match
		   Boolean allMatch = people.stream().allMatch(p -> p.getAge() > 10);
		   
		   System.out.println(allMatch);
		   System.out.println("--------------------------");
//		    System.out.println(allMatch);
		    // Any match
		   Boolean anyMatch = people.stream().anyMatch(p -> p.getName().equals("Antonio"));
		   System.out.println(anyMatch);
		   System.out.println("--------------------------");

//		    System.out.println(anyMatch);
		    // None match
		   Boolean noneMatch = people.stream().noneMatch(p -> p.getName().equals("Antonio"));
		   System.out.println(noneMatch);
		   System.out.println("--------------------------");
		   

//		    System.out.println(noneMatch);

		    // Max
		   Optional<Person> maxOpAge = people.stream().max(Comparator.comparing(Person::getAge));
		   
		   if(maxOpAge.isPresent()) {
			 System.out.println(maxOpAge.get().getAge());
			 System.out.println("--------------------------");
		   }
		  

		    // Min
		   Optional<Person> minOpAge = people.stream().min(Comparator.comparing(Person::getAge));
		   
		   if(minOpAge.isPresent()) {
				 System.out.println(minOpAge.get().getAge());
				 System.out.println("--------------------------");
			   }
		   
		    // Group
		    Map<Gender, List<Person>> groupByGender = people.stream().collect(Collectors.groupingBy(Person::getGender));

		    groupByGender.forEach((gender, people1) -> {
		      System.out.println(gender);
		      people1.forEach(System.out::println);
		      System.out.println();
		    });
		    
		    System.out.println("--------------------------");
		    
		    //Distinct
		    people.stream().filter(p -> p.getGender() == Gender.MALE).map(p -> p.getName()).
		          distinct().
		          forEach(System.out::println);
		    
		    System.out.println("--------------------------");
		    
		    //Reduce
		    people.
		    stream().filter(p -> p.getGender() == Gender.MALE).
		    map(p -> p.getName()).
		    distinct().
		    reduce("Distinct First Names ",(name1, name2) -> name1+", "+name2);

		    
		    System.out.println("--------------------------");
		    
		    //Sorted
		    Comparator<Person> byAge = Comparator.comparing(Person::getAge);
		    
		    people.stream().
		    filter(p -> p.getAge() < 40).
		    sorted(byAge).
		    map(p-> p.getName()+" "+p.getLastName()).
		    forEach(System.out::println);
		    
		    System.out.println("--------------------------");
		    
		    people.
		    stream().
		      filter(p -> p.getAge() < 40).
		        sorted((e1, e2) -> e1.getAge() - e2.getAge()).
		          map(p-> p.getName()+" "+p.getLastName()).
		            forEach(System.out::println);
		    
		    System.out.println("--------------------------");
		    //GroupBy
		    people.
		    stream().
		      collect(Collectors.groupingBy(Person::getGender)).
		         forEach((g,lp) -> {  System.out.println(" Aggregated age of "+g+" is "
		                                                + lp.stream().mapToInt(p-> p.getAge()).sum());});

		    
		  
		  }

		  private static List<Person> getPeople() {
		    return List.of(
		        new Person("Antonio ", "Bandeiras",20, Gender.MALE),
		        new Person("Alina ", "Smith", 33, Gender.FEMALE),
		        new Person("Helen ", "White", 57, Gender.FEMALE),
		        new Person("Alex ","Boz", 14, Gender.MALE),
		        new Person("Jamie ","Goa", 99, Gender.MALE),
		        new Person("Anna ","Cook", 7, Gender.FEMALE),
		        new Person("Zelda ","Brown", 120, Gender.FEMALE)
		    );
		  }


	

}
