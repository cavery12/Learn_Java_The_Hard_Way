public class CreatingVariables {
	public static void main( String[] args ) {
		int x, y, age, apples;
		double seconds, e, checking, price;
		String firstName, lastName, title, product, bye;
		
		x = 10;
		y = 400;
		age = 39;
		apples = 17;
		
		seconds = 4.71;
		e = 2.71828182845904523536;
		checking = 1.89;
		price = .39;
		
		firstName = "Graham";
		lastName = "Mitchel";
		title = "Mr.";
		product = "apples";
		bye = "Thanks for coming!";
		
		System.out.println( "The variable x contains " + x );
		System.out.println( "The value " + y + " is stored in the variable y" );
		System.out.println( "The experiment took " + seconds + " seconds" );
		System.out.println( "A favorite irrational # is Euler's number: " + e );
		System.out.println( "Hopefully you have more money than $" + checking + "!" );
		System.out.println( "My name is " + title + " " + firstName + " " + lastName );
		System.out.println( "I am selling " + apples + " " + product + " for $" + price + " each." + bye);
	}
}
