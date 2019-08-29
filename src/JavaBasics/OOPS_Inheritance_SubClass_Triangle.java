package JavaBasics;


public class OOPS_Inheritance_SubClass_Triangle extends OOPS_Inheritance_SuperClass_Shapes{
	public static double area(double h,double b){
		
		double a=(0.5)*(b*h);
		System.out.println(a);
		return a;
	}
	
public static double area(int h,int b){
		
		double a=(0.5)*(b*h);
		System.out.println(a);
		return a;
	}
	public static void main(String[] arg)
	{	
		nameofShape="triangle";
		int h1=10,b1=5;
		double h=10.00,b=5.00;
		System.out.println(nameofShape);
		System.out.println(area(h,b));
		System.out.println(area(h1,b1));
//		System.out.println(area());
		
	
	}
	
}
