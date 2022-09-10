import java.util.Scanner;
class Main
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 System.out.print("No of times Classes Held: ");
 int h=sc.nextInt();
 System.out.print("No of Times Classes Attend: ");
 int a=sc.nextInt();
float percentage;
percentage=((a*100)/h);

if(percentage>=75)
{
System.out.println("He/She is Eligible: "+percentage);
}
else 
{
System.out.println("Sorry You'r Not Allowed To Sit in Exam.");
}
}
}
