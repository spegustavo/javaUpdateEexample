package version.nine.tryWhithResource;

public class tryWhithResourceMain {

	public static void main(String[] args) {
		

		/*
		 * 
		 * If you already have a resource as a final or effectively final variable, you
		 * can use that variable in a try-with-resources statement without declaring a
		 * new variable. An "effectively final" variable is one whose value is never
		 * changed after it is initialized.
		 * 
		 * 
		 * A final resource final Resource resource1 = new Resource("resource1"); An
		 * effectively final resource Resource resource2 = new Resource("resource2");
		 * 
		 * 
		 * In Java SE 7 or 8, you would declare new variables, like this:
		 * 
		 * try (Resource r1 = resource1; 
		 * Resource r2 = resource2) { ... } 
		 * 
		 * In Java SE 9, you don’t need to declare r1 and r2:
		 * 
		 * // New and improved try-with-resources statement in Java SE 9 
		 * try (resource1;
		 * 		resource2) { ... }
		 * 
		 */
		
		
	}

}
