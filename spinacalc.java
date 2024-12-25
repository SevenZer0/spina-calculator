import java.util.Scanner;
public class Main {
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		char repeat;
		System.out.println("This calculator assumes that you sell items at FULL STACK.\nYou get better value when selling at full. :)");
		do
		{
			System.out.println("Choose mode\n'g' for spina goal\n's' for spina per sale\n'r' for rate of spina");
			char mode = input.next().toLowerCase().charAt(0);
			
			switch (mode)
			{
				case 'g':
				{
					double tax;
		
					System.out.print("How much spina do you want? ");
					double dividend = input.nextInt();
		
					System.out.print("How much do you sell an item? ");
					double divisor = input.nextInt();
		
					System.out.print("Is there a tax? Press y if yes ");
					char taxq = input.next().toLowerCase().charAt(0);
				
					if (taxq == 'y')
					{
						System.out.println("Enter tax amount (whole number, not the percent/decimal) ");
						tax = input.nextDouble();
						tax = tax / 100;
			
						double result = Math.floor(dividend / (divisor - (divisor * tax)));
						double remain = dividend % (divisor - (divisor * tax));
	
						System.out.println("With a tax of " + (tax * 100) + "%," + " you need to sell " + result + " stacks, but you will miss the goal by " + remain + "S.");
						break;
					}
		
					else
					{
						double result = Math.floor(dividend / divisor);
						double remain = dividend % divisor;
		
						System.out.println("You need to sell " + result + " stacks, missing the goal by " + remain + "S.");
						break;
					}
				}
				
				case 's':
				{
					double tax;
					
					System.out.print("How much will you list the item? ");
					double multiplicand = input.nextInt();
					
					System.out.print("How many stacks will you sell? ");
					double multiplier = input.nextInt();
					
					System.out.print("Is there a tax? Press y if yes ");
					char taxq = input.next().toLowerCase().charAt(0);
				
					if (taxq == 'y')
					{
						System.out.println("Enter tax amount (whole number, not the percent/decimal) ");
						tax = input.nextDouble();
						tax = tax / 100;
			
						double result = (multiplicand - (multiplicand * tax)) * multiplier;
	
						System.out.println("With a tax of " + (tax * 100) + "%, you will earn " + result + "S.");
						break;
					}
		
					else
					{
						double result = multiplicand * multiplier;
		
						System.out.println("You will earn " + result + "S.");
						break;
					}
				}
				
				case 'r':
				{
					double tax;
					
					System.out.print("How much do you list the item? ");
					double multiplicand = input.nextInt();
					
					System.out.print("How many stacks do you sell? ");
					double multiplier = input.nextInt();
					
					System.out.print("For how long do you farm this item until you reach the amount you're selling?\nHours ");
					double hour = input.nextDouble();
					System.out.print("Minutes ");
					double minute = input.nextDouble();
					System.out.print("Seconds ");
					double second = input.nextDouble();
					double time = second + (minute * 60) + (hour * 60 * 60);
					
					System.out.print("Is there a tax? Press y if yes ");
					char taxq = input.next().toLowerCase().charAt(0);
					
					if (taxq == 'y')
					{
						System.out.println("Enter tax amount (whole number, not the percent/decimal) ");
						tax = input.nextDouble();
						tax = tax / 100;
						
						double result = ((multiplicand - (multiplicand * tax)) * multiplier) / time;
						double ratemin = result * 60;
						double ratehour = result * 60 * 60;
						System.out.print("With a tax of " + (tax *100) + "%, you will earn " + ratemin + "S every minute, and " + ratehour + "S every hour.");
					}
					
					else
					{
						double result = (multiplicand * multiplier) / time;
						double ratemin = result * 60;
						double ratehour = result * 60 * 60;
						System.out.print("You will earn " + ratemin + "S every minute and " + ratehour + "S every hour.");
					}
					break;
				}
			}
			System.out.print("\nRun another calculation? Press y to repeat ");
			repeat = input.next().toLowerCase().charAt(0);
			System.out.println();
		}
		while (repeat == 'y');
	}
}