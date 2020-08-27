import java.util.Scanner;

public class AriaOfTriangle {
	

public static void main(String[]args) {

    Scanner sc = new Scanner(System.in);
	
    System.out.print("Please enter length of the side A of triangle: ");
    double a = sc.nextInt();
    System.out.println("A is "+ a);
    
    System.out.print("Please enter length of the side B of triangle: ");
    double b = sc.nextInt();
    System.out.println("B is "+ b);
    
    System.out.print("Please enter length of the side C of triangle: ");
    double c = sc.nextInt();
    System.out.println("C is "+ c);
    
    double p = (a + b + c) / 2;
    double area = (double) Math.sqrt(p * (p - a) * (p - b) * (p - c));
    if(a> 0.5 & b> 0.5 & c > 0.5)System.out.println("Area of triangle is: "+ area);
    else System.out.println("NaN");
}
}