package version.eight.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Gustavo.Duarte
 * 
 * {@link https://www.oracle.com/technical-resources/articles/java/java8-Generics.html}
 * 
 *         Consider the following scenario: You wish to develop a container that
 *         will be used to pass an object around within your application.
 *         However, the object type is not always going to be the same.
 *         Therefore, you need to develop a container that has the ability to
 *         store objects of various types. Given this scenario, the most obvious
 *         way to achieve the goal would be to develop a container that has the
 *         ability to store and retrieve the Object type itself, and then cast
 *         that object when using it with various types.
 * 
 *
 */

public class MainGenerics {

	public static void main(String[] args) {
		ObjectContainerExample();
		GenericContainerExample();

	}
	
	
	 static void ObjectContainerExample(){
		
		ObjectContainer myObj = new ObjectContainer();


		// store a string
		myObj.setObj("Test");
		System.out.println("Value of myObj:" + myObj.getObj());
		// store an int (which is autoboxed to an Integer object)
		myObj.setObj(3);
		System.out.println("Value of myObj:" + myObj.getObj());

		List objectList = new ArrayList();
		objectList.add(myObj);
		// We have to cast and must cast the correct type to avoid ClassCastException!
		Integer myStr = (Integer) ((ObjectContainer)objectList.get(0)).getObj(); 
		System.out.println("myStr: " + myStr);
		
	}
	 
	 
	/**
	 * Benefits of Using Generics
	 * 
	 * Stronger type-checking is one of the most important, because it saves time by
	 * fending off ClassCastExceptions that might be thrown at runtime.
	 * 
	 * Another benefit is the elimination of casts, which means you can use less
	 * code, since the compiler knows exactly what type is being stored within a
	 * collection. For example, in the code shown in Listing 4, let's look at the
	 * differences between storing instances of our Object container into a
	 * collection versus storing instances of the GenericContainer.
	 * 
	 */
	
	static void GenericContainerExample() {
		List<GenericContainer> genericList = new ArrayList<GenericContainer>();

		// Store instances of GenericContainer
		for(int x=0; x <=10; x++){
		    GenericContainer<String> myGeneric = new GenericContainer<String>();
		    myGeneric.setObj(" Generic Test" + x);
		    genericList.add(myGeneric);
		}
		// Get the objects; no need to cast to String

		for(GenericContainer<String> obj:genericList){
		    String objectString = obj.getObj();
		    // Do something with the string...here we will print it
		    System.out.println(objectString);
		}
	}
	
	/**
	 * Bounded Types Oftentimes there are cases where we need to specify a generic
	 * type, but we want to control which types can be specified, rather than
	 * keeping the gate wide open. Bounded types can be used to restrict the bounds
	 * of the generic type by specifying the extends or the super keyword in the
	 * type parameter section to restrict the type by using an upper bound or lower
	 * bound, respectively. For instance, if you wish to restrict a type to a
	 * specific type or to a subtype of that specific type, use the following
	 * notation:
	 * 
	 * <T extends UpperBoundType>
	 * 
	 * Similarly, if you wish to restrict a type to a specific type or to a
	 * supertype of that specific type, use the following notation:
	 * 
	 * <T super LowerBoundType>
	 */
	static void GenericBoundedExample() {
		
		GenericNumberContainer<Integer> gn = new GenericNumberContainer<Integer>();

		gn.setObj(3);

		// Type argument String is not within the upper bounds of type variable T
		//GenericNumberContainer<String> gn2 = new GenericNumberContainer<String>(); <-  This will not Work
		
	}
	

}
