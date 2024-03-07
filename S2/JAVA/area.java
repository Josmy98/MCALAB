import java.util.*;

public class area {
	int a;
	int area;
	float x;
	double y;
	
	void area(int l,int b) {
		int length = l;
		int breadth = b;
		a=length*breadth;
		System.out.println("Area of rectangle: "+a);
	}
	
	void area(int s) {
		int side = s;
		area = side * side;
		System.out.println("Area of square: "+area);	
	}
	
	void area(float b, float h) {
		float base = b;
		float height =h;
		x = (base*height)/2;
		System.out.println("Area of triangle: "+x);			
	}
	
	void area(double r) {
	    double radius = r;
		y = 3.14*radius*radius;
		System.out.println("Area of radius: "+y);	
	}
	
	
public static void main(String[] args)	{
	area obj = new area();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the length and breadth:");
	int l = sc.nextInt();
	int b = sc.nextInt();
	obj.area(l,b);
	System.out.println("Enter the side:");
	int s = sc.nextInt();
	obj.area(s);
	System.out.println("Enter the base and height:");
	float base = sc.nextFloat();
	float h= sc.nextFloat();
	obj.area(base,h);
	System.out.println("Enter the radius:");
	double r = sc.nextDouble();
	obj.area(r);
	sc.close();
  }
	
}
