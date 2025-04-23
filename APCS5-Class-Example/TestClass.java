public class TestClass {

  public String constructorArgument;

  public TestClass(String argument) {
    constructorArgument = argument;
  }

  public String printAndReturnConstructorArgument() {
    System.out.println(constructorArgument);
    return constructorArgument;
  }
}