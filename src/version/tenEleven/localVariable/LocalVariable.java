package version.tenEleven.localVariable;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class LocalVariable {

	/*
	 * In JDK 10 and later, you can declare local variables with non-null
	 * initializers with the var identifier, which can help you write code that’s
	 * easier to read.
	 * 
	 */

	public static void main(String[] args) {

		URL url;
		try {

			url = new URL("http://www.oracle.com/");
			URLConnection conn = url.openConnection();
			Reader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));

		} catch (Exception e) {
			e.printStackTrace();
		}

		// You can rewrite this example by declaring the local variables with the var
		// identifier. The type of the variables are inferred from the context:
		try {
			
			var url1 = new URL("http://www.oracle.com/");
			var conn1 = url1.openConnection();
			var reader1 = new BufferedReader(new InputStreamReader(conn1.getInputStream()));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		List<String> myList = Arrays.asList("a", "b", "c");
		for (var element : myList) {
			//Do  something
		}  // infers String
		
		for (var counter = 0; counter < 10; counter++) {
			//Do  something
		}
		
		//In JDK 11 and later, you can declare each formal parameter of an implicitly typed lambda expression with the var identifier
		BiFunction<Integer, Integer, Integer> result = (var a, var b) -> a + b;
		
		//(var x, y) -> x.process(y)      // Cannot mix var and inferred formal parameters
        // in implicitly typed lambda expressions
		//(var x, int y) -> x.process(y)  // Cannot mix var and manifest types
		//in explicitly typed lambda expressions

	}

}
