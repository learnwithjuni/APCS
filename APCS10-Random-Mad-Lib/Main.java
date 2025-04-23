import java.util.Random;

class Main {
  public static void main(String[] args) {

    Random random = new Random();

    String[] adjectives = {"slimy","crunchy","adventurous","shy","impassioned","bored","livid","sweet","electrifying","subtle","mortifying","piercing","piping"};
    String[] nouns = {"panda","sloth","burrito","blanket","porcupine","peanut butter","fridge","potted plant"};
    String[] verbs = {"dance","tickle","scream","sleep","run","dream","burst","waddle","swing", "whistle", "groan", "sing", "read", "write"};

    System.out.println();
    for(int i = 0; i < 5; i++){
      String adj1 = adjectives[random.nextInt(adjectives.length)];
      String noun1 = nouns[random.nextInt(nouns.length)];
      String verb1 = verbs[random.nextInt(verbs.length)];

      System.out.println("The " + adj1 + " " + noun1 + " began to " + verb1 + " at midnight");
    }
  
  }
}