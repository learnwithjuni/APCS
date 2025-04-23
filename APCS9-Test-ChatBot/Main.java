class Main {
  public static void main(String[] args) {
    runTest("A String!", "String! A");
    runTest("Hello World", "World Hello");
    runTest("Go hang a salami, I'm a lasagna hog", "hog lasagna a I'm salami, a hang Go");
  }

  public static void runTest(String input, String expectedOutput) {
    ChatBot reverser = new Reverser(input);
    String output = reverser.chat();
    if (output.equals(expectedOutput)) {
      System.out.println("Passed the test for input: " + input + "!!");
    } else {
      System.out.println("Something went wrong :(");
    }
  }
}