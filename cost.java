import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner (System.in);
	    int cost;
	    double total;
		System.out.print("Enter The Cost: ");
		cost = sc.nextInt();
		if(cost*100>1000)
		{
		total = ((cost*100) - (0.1*(cost*100)));
		}
		else
		{
		    total = (cost*100);
		}
        System.out.println("Total Cost is " +total);
	}
}
