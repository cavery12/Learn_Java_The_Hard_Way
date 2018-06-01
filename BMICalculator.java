import java.util.Scanner;

public class BMICalculator {
	public static void main( String[] args ) {
		Scanner key = new Scanner(System.in);
		double ft, in, m, lb, kg, bmi;
		
		System.out.print( "Your height in ft: " );
		ft = key.nextDouble();
		System.out.print( "Your height in in: " );
		in = key.nextDouble();
		System.out.println( "You are " + ft + "' " + in + "\"" );
		m = ((ft*12)+in)*.0254;
		
		System.out.print( "Your weight in lbs: " );
		lb = key.nextDouble();
		kg = .4535*lb;
		
		bmi = kg/(m*m);
		
		System.out.println( "Your BMI is " + bmi );
	}
}
