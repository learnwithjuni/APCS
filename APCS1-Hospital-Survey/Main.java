import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
		Scanner s = new Scanner(System.in);
		
		System.out.println("\nBasic Information");
		System.out.print("First Name: ");
		String firstName = s.nextLine();
		System.out.print("Last Name: ");
		String lastName = s.nextLine();
		System.out.println("Date of Birth");
		System.out.print("Month: ");
		int month = s.nextInt();
		System.out.print("Day: ");
		int day = s.nextInt();
		System.out.print("Year: ");
		int year = s.nextInt();
    s.nextLine(); // clear the new-line character
		System.out.print("Address: ");
		String address = s.nextLine();
		System.out.println();

		System.out.println("\nToday's Visit");
		System.out.print("What brings you in here today? ");
		String issue = s.nextLine();
		System.out.print("What symptoms have you had? ");
		String symptoms = s.nextLine();
		System.out.print("What medicines have you taken? ");
		String medicine = s.nextLine();
		System.out.println();
		
		System.out.println("\nSelect true or false for the following statements:");
		System.out.print("I exercise for 2-3 hours a week. ");
		boolean exercisesEnough = s.nextBoolean();
		System.out.print("I get 8-9 hours of sleep every night. ");
		boolean sleepsEnough = s.nextBoolean();
		System.out.print("I feel stressed about schoolwork, family, or something else. ");
		boolean stresses = s.nextBoolean();
		System.out.println();

		System.out.println("Thanks for completing this survey!");
		
  }
}