import java.util.Scanner;

public class ClassWork {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		String vacationType;
		String result;
		int groupSize;
		vacationType = userInput.next();
		System.out.println("Please select a type of vacation from adventurous, musical, or tropical.");
		
		
		if (vacationType.equals("adventurous")) {
			System.out.println("Thank you for choosing a trip to the Grand Canyon!");
		}
		else if (vacationType.equals("musical")) {
			System.out.println("Thank you for choosing a trip to New Orleans!");
		}
		else if (vacationType.equals("tropical")) {
			System.out.println("Thank you for choosing a trip to the beaches of Mexico!");
		}
		else {
			System.out.println("Please choose either adventurous, musical, or tropical.");
		}
		groupSize = userInput.nextInt();	
		System.out.println("How many will be going on this vacation?");
		
		
		if ((groupSize > 0) && (groupSize <= 2)) {
			System.out.println("We recommend groups of " + groupSize + " fly first class.");
		}
		else if ((groupSize >= 3) && (groupSize <= 5)) {
			System.out.println("We recommend groups of " + groupSize + " fly in a helicopter.");
		}
		if (groupSize > 5) {
			System.out.println("We recommend groups of " + groupSize + " fly using a charter flight.");
		}
		
		System.out.println("Thank you for filling in the above information!");
		result = ("You are a group of " + groupSize + ", going on an " + vacationType + " vacation, enjoy!");
		System.out.println(result);
			
			
		
	}
		
		
		
		
		
		
		
			

	

}
