class Main {
  public static void main(String[] args) {
    String str1 = "Hello World";
    String str2 = "Hello World";
    System.out.println(str1 == str2);
    System.out.println(str1.equals(str2));

    System.out.println(str1.compareTo("hello"));
    System.out.println(str1.compareTo("HELLO"));
    
    System.out.println(str1.substring(6));
    System.out.println(str1.substring(1, 5));

    System.out.println(str1.indexOf(" "));
  }
}