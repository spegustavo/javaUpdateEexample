package version.eight.lambda;

import java.util.Comparator;

class Person {
	  public String firstName;
	  public String lastName;
	  public int age;

	  public final static Comparator<Person> compareFirstName =
	    (lhs, rhs) -> lhs.firstName.compareTo(rhs.firstName);

	  public final static Comparator<Person> compareLastName =
	    (lhs, rhs) -> lhs.lastName.compareTo(rhs.lastName);

	  public Person(String f, String l, int a) {
	    firstName = f; lastName = l; age = a;
	  }

	  public String toString() {
	    return "[Person: firstName:" + firstName + " " +
	      "lastName:" + lastName + " " +
	      "age:" + age + "]";
	  }
	}
