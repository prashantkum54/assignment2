import java.util.*;
class Main
{
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter age");
		int age = sc.nextInt();
		System.out.println("Enter Gender: ");
		int gender = sc.next().charAt(0);
		System.out.println("Are you married? ");
		int married = sc.next().charAt(0);
		if(gender == 'F') {
			System.out.println("You will work only in urban areas");
		}
		if(gender == 'M') {
			if((age >= 20) && (age < 40)) {
				System.out.println("You may work anywhere");
			}
			else if((age >= 40) && (age < 60)) {
				System.out.println("You will work only in urban areas");
			}
			else {
				System.out.println("ERROR");
			}
		}
	}
}