import java.util.Scanner;
public class ModulusChallenges
	{
	public static void main(String[] args)
		{
		oddOrEven();
		leapYear();
		everyThird();
		}
	public static void oddOrEven()
		{
		Scanner userInput=new Scanner(System.in);
		System.out.println("Hello, please type a number.");
		int number = userInput.nextInt();
		System.out.println(number % 2 == 0 ? "even" : "odd");
		System.out.println(" ");
		}
	public static void leapYear()
		{
		Scanner userInput=new Scanner(System.in);
		System.out.println("Please type a year.");
		int year = userInput.nextInt();
		System.out.println(year % 4 == 0 ? "leap yeat" : "not a leap year");
		System.out.println(" ");
		}
	public static void everyThird()
		{
		int[] numbers = {12, 4, 2, 10, 6, 18, 16, 20, 8, 14};
		for (int i=0; i<numbers.length; i++)
			{
		if ((i+1)%3 == 0)
			System.out.println(numbers[i]);
		
		}
	}
}