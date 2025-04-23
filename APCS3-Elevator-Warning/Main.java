import java.lang.Math;

class Main {
  public static void main(String[] args) {
		int weightLimit = 1500;

		int elevatorWeight = (int) (Math.random() * 3000) + 1;

    System.out.println("\nThe final weight of the elevator is: " + elevatorWeight);
		if (elevatorWeight > weightLimit) {
			System.out.println("WARNING! The elevator is " + (elevatorWeight - weightLimit) + " pounds overweight!");
		} else {
			System.out.println("The elevator is good to go! It is " + (weightLimit - elevatorWeight) + " pounds under the weight limit.");
		}
  }
}