import java.util.*;

class Main {
  public static void main(String[] args) {
    /* -------------------------------------- */
    // VARIABLES
    /* -------------------------------------- */

    // What is a variable? Store the integer 20 in a variable called num. Store the decimal 3.14 in a variable called pi. Store the boolean true in a variable called isHot. 
    int num = 20;
    double pi = 3.14;
    boolean isHot = false;

    // Print one of the variables 
    System.out.println(num);

    // What's the difference between System.out.print and System.out.println?
    // Ans: System.out.println will add a new line after the printed output while System.out.print will not

    // How can we replicate println with print?
    System.out.print(num + "\n");

    // Store the string "food" in a variable called word. How is a string different from the other kinds of variables?
    // Ans: ints, doubles, and booleans are primitive types while strings are objects.
    String word = "food";
    
    // Ask the user to guess an animal and then guess the color of that animal. 
    Scanner in = new Scanner(System.in);
    System.out.print("Guess an animal: ");
    String animal = in.nextLine();
    System.out.print("Guess what color the animal is: ");
    String color = in.nextLine();

    // Print a statement that tells the user what animal and color they guessed (make sure there’s a space between the color and animal!)
    System.out.println("You guessed a " + color + " " + animal);

    // Write a comment describing the line of code you just wrote
    // ex. This tells the user what colored animal that they guessed

    int randomNumber = (int) (Math.random() * (199-99+1)) + 99;

    /* -------------------------------------- */
    // Conditionals
    /* -------------------------------------- */

    // Have the student explain the difference between == and .equals().
    // == compares the memory locations while .equals() is a method that checks the contents of the objects and compares them. == should be used with primitives and .equals() with objects.

    // What is a conditional statement? Can you think of a conditional statement in real life?
    // Ans: A conditional is a statement which is either true or false. 
    // ex. Am I 11?

    // Using the guesses that we asked the user for above, we want to check if the user guessed correctly! First we'll check if the user guessed a dog. If the animal they guessed was a dog, tell the user "Dogs rule!"

    if (animal.equals("Dog")) {
      System.out.println("Dogs rule!");
    }


    // Next, let’s tell the user whether they got the right answer of a black cat! Print “Correct answer!” if the animal is a black cat, print “Almost there!” if the animal is either black or a cat, and print “Incorrect answer :( ” if the user guessed neither.

    if (animal.equals("Cat") && color.equals("Black")) {
      System.out.println("Correct Answer!");
    } else if (animal.equals("Cat") || color.equals("Black")) {
      System.out.println("Almost there!");
    } else {
      System.out.println("Incorrect answer :(");
    }

    // Do you remember what a nested if statement is? How would you change part of the above problem to include a nested if statement? Print “Correct answer!” if the animal is a black cat, print “Right color! Wrong animal!” if the user guessed black as the color but the wrong animal, print “Right animal! Wrong color!” if the user guessed cat but a non-black color, print “Incorrect answer :(“ if the user guessed neither. 

    if (animal.equals("Cat")) {
      if (color.equals("Black")) {
        System.out.println("Correct answer!");
      } else {
        System.out.println("Riht animal! Wrong color!");
      }
    } else if (color.equals("Black")) {
      System.out.println("Right color! Wrong animal!");
    } else {
      System.out.println("Incorrect answer :(");
    }

    /* -------------------------------------- */
    // Loops
    /* -------------------------------------- */

    // What is a loop? What do we use loops for?
    // A loop is a way to perform the same code mulitple times. 
    // ex. printing somethinn 10 times


    // What is the difference between a for loop and a while loop? And an enhanced for loop?
    // a for loop's conditional and step behavior are predefined, while a while loops' are not. An enhanced for loop abstracts all step and conditional behavior away, offering elements one at a time.

    // Print the numbers 0 - 9 using a for loop. Print the numbers 20 to 10 using a for loop. Print all of the even numbers between 12 and 28 using a for loop.

    for (int i = 0; i <= 9; i++) {
      System.out.println(i);
    }
    for (int i = 20; i >= 10; i--) {
      System.out.println(i);
    }
    for (int i = 12; i <= 28; i+=2) {
      System.out.println(i);
    }

    // Print the numbers from 0 to 20 using a while loop. Print the even numbers from 34 to 10 using a while loop.

    int i = 0;
    while (i <= 20) {
      System.out.println(i);
      i++;
    }
    
    i = 34;
    while(i >= 10) {
      System.out.println(i);
      i-=2;
    }


  //  Print this pattern using both for and while loops.
  /*
    1 - - - - -
    - 2 - - - -
    - - 3 - - -
    - - - 4 - -
    - - - - 5 -
    - - - - - 6
    */

    for (i = 0; i < 6; i++) {
      int j = 0;
      while (j < 6) {
        if (i == j) {
          System.out.println(j);
        } else {
          System.out.println("_");
        }
        j++;
      }
    }

    // Use nested loops to print out a 5x5 multiplication table.

    for (int x = 1; x <= 5; x++) {
      for (int y = 1; y <= 5; y++) {
        System.out.print(x*y + " ");
      }
      System.out.println();
    }

    // In the previous problem's code, how many total times does the inner print statement run?
    // ans: 5*5 = 25;

    /* --------------------------------------*/
    // Exceptions
    /* --------------------------------------*/

    // What exception is thrown if you were to call the method execute(int n, String string) as execute(2.0, “Completed”); How would it be fixed?
    // Ans: Illegal argument exception. Fix by passing an int, not a double.

    // What error would arise due to this code:
    // int num = 1;
    // num--;
    // int result = 2 / num;
    // Ans: Arithmetic exception. Num is zero, which cannot be a divisor.

    // What error would arise due to this code and how could it be fixed:
    // MathClass tester;
    // tester.add(30,40);
    //Ans: null pointer exception. Tester is only declared, not initialized. 

    /* What error would arise due to the code:
    int num = 1
    num--;
    num *= 5;
    */
    // Ans: Syntax error. No semicolor after line one.
  }
} 