package version.thirteen.textBlock;

public class TextBlock {

	public static void main(String[] args) {
		
		/*
		 * A text block is an alternative form of Java string representation that can be used anywhere a traditional double quoted string literal can be used
		 * */
		
		// Using a literal string
		String dqName = "Pat Q. Smith";
		
		System.out.println(dqName);

		// Using a text block
		String tbName = """
		                Pat Q. Smith""";
		
		System.out.println(tbName);
		
		System.out.println("""
			    This is the first line
			    This is the second line
			    This is the third line
			    """);
		
		String message = """
			    'The time has come,' the Walrus said,
			    'To talk of many things:
			    Of shoes -- and ships -- and sealing-wax --
			    Of cabbages -- and kings --
			    And why the sea is boiling hot --
			    And whether pigs have wings.'
			    """;
		
		
		System.out.println(message);
		
		
		String source = """
			    String message = "Hello, World!";
			    System.out.println(message);
			    """;
		
		System.out.println(source);
		
	}

}
