package version.eight.streams.Gender;

public class Person {
	
	  private final String name;
	  private final String lastName;
	  private final int age;
	  private final Gender gender;

	  public Person(String name, String lastName, int age, Gender gender) {
	    this.name = name;
	    this.lastName = lastName;
	    this.age = age;
	    this.gender = gender;
	  }

	  public String getName() {
	    return name;
	  }

	  public int getAge() {
	    return age;
	  }

	  public Gender getGender() {
	    return gender;
	  }
	  
	  public String getLastName() {
		return lastName;
	}

	@Override
	  public String toString() {
	    return "Person{" +
	        "name='" + name + '\'' +
	        "lastName='" + lastName + '\'' +
	        ", age=" + age +
	        ", gender=" + gender +
	        '}';
	  }
	

}
