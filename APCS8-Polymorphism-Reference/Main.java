class Main {
  public static void main(String[] args) {
    Dog dog = new Dog("Fido", "Woof", "Bob", "Brown", 4,15);
    Poodle poodle = new Poodle("Pepe", "Boof", "Paul", "White", 2, 55);
    MiniPoodle mini = new MiniPoodle("Margaret", "BoofBoofBoof", "Mary", "Cream", 10, 6);
    Pug pug = new Pug("Peter", "WoofWoof", "Yvonne", "Brown", 7, 9);



    //Static and Dynamic Typing
    Dog p = new Pug("Paul","pewpew","Nancy","Black",4,27);
    //Static type = Dog, Dynamic type = Pug

    Poodle mPoodle = new MiniPoodle("Blake","BowWow","Brian","Pink",7,11);
    //Static type = Poodle, dynamic type = MiniPoodle

    //Lookup
    mPoodle.prance(); //Will this compile? 
    //No, because class Poodle is the static type and does not have a prance method, so lookup fails even though MiniPoodle is the dynamic type and has an appropriate method.

    //Type Casting
    Dog paul = new Poodle("Paul", "Paul", "Paul", "Purple", 10, 10);
	  //Poodle pood = paul; //compilation error
    //Fix
    Poodle pood = (Poodle) paul;
    
  }
}