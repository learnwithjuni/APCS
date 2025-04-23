class Main {
  int variable;
  int otherVariable;

  public Main(int var) {
    variable = var; //last module
  }

  public Main(int variable, int otherVariable) {
    this.variable = variable; //this module
    this.otherVariable = otherVariable;
  }
}