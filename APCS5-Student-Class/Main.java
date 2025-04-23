class Main {
  public static void main(String[] args) {
    
    System.out.println();
    Student stu1 = new Student("Billy", "Bob", 8);
    stu1.printInfo();
    System.out.println("He's in " + stu1.getSchoolType());
    stu1.passGrade();
    System.out.println("He's in " + stu1.getSchoolType());

    System.out.println();
    Student stu2 = new Student("Jill", "Jacobs", 5);
    stu2.printInfo();
    System.out.println("She's in " + stu2.getSchoolType());
    stu2.passGrade();
    System.out.println("She's in " + stu2.getSchoolType());

    System.out.println();
    Student stu3 = new Student("Sam", "Smith", 12);
    stu3.printInfo();
    System.out.println("He's in " + stu3.getSchoolType());
    stu3.passGrade();
    System.out.println("He's in " + stu3.getSchoolType());
  }
}