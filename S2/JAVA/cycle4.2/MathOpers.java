import java.util.Scanner;
import ArithmeticPackage.Opers;


public class MathOpers {
	
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	float a,b;
	
	System.out.println("ARITHMETIC OPERATIONS");
	System.out.println("*********************");
	System.out.println("\nEnter any two numbers to be operated with:");
	a = s.nextFloat();
	b = s.nextFloat();
	
	Opers op = new Opers(a,b);
	op.add();
	op.sub();
	op.mul();
	op.div();
	
	s.close();
	
	}	

}
