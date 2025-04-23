class Student {
  public String firstName;
  public String lastName;
  public int grade;
  
  public Student(String fname, String lname, int g) {
    firstName = fname;
    lastName = lname;
    grade = g;
  }

  public void printInfo() {
    System.out.println(firstName + " " + lastName + " is in grade " + grade);
  }

  public void passGrade() {
    System.out.println(firstName + " just passed a grade!");
    if(grade <= 12){
      if (grade == 12) {
        System.out.println(firstName + " graduated!");
      }
      grade++;
    }else if (grade > 12) {
      System.out.println(firstName + " is in college!");
    }
  }

  public String getSchoolType() {
    if (grade < 6) {
      return "elementary school";
    } else if (grade < 9) {
      return "middle school";
    } else if (grade < 13) {
      return "high school";
    } else {
      return "college";
    }
  }
}