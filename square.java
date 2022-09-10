import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner (System.in);
	    double length,breadth,area=0.0d; 
		System.out.print("Enter The Length: ");
		length = sc.nextDouble();
		System.out.print("Enter The Breadth: ");
		breadth = sc.nextDouble();
		if(length == breadth)
		{
		    System.out.println("Yes It is a Square.");
		}
		else
		{
		    System.out.println("No It is not a Square.");
		}
	}
}
