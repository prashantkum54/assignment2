import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner (System.in);
	    int x,y; 
		System.out.print("Enter The First Number: ");
		x = sc.nextInt();
		System.out.print("Enter The -First Number: ");
		y = sc.nextInt();
		if(x > y)
		    System.out.println(x+ " is Greatest Number.");
		else
		    System.out.println(y+ " is Greatest Number.");
	}
}
