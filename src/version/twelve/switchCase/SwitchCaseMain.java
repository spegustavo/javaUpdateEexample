package version.twelve.switchCase;

public class SwitchCaseMain {

	public static void main(String[] args) {
		Day day = Day.WEDNESDAY;    
	    System.out.println(
	        switch (day) {
	            case MONDAY, FRIDAY, SUNDAY -> 6;
	            case TUESDAY                -> 7;
	            case THURSDAY, SATURDAY     -> 8;
	            case WEDNESDAY              -> 9;
	            default -> throw new IllegalStateException("Invalid day: " + day);
	        }
	    );  
	    
	    /*
	    Note:It's recommended that you use "arrow case" labels. It's easy to forget to insert break statements when using "colon case" labels; if you do, you might introduce unintentional fall through in your code.
	    For "arrow case" labels, to specify multiple statements or code that's not an expression or throw statement, enclose them in a block. Specify the value that the case label produces with the break statement:
	    */
	    
	    
	}

}
