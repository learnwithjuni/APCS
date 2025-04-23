class Main {
  public static void main(String[] args) {
    /* Spec:
    This is a specification for the project Decks.
    This project will allow users to play card games. A user should be able to instantiate a deck of cards. These cards should follow their natural ordering, meaning King is bigger than 2 and Diamonds is bigger than Hearts, which is bigger than Spades, which is bigger than Clubs.
    Make sure you can print a card clearly. The internal representation does not matter so long as it is consistent and can be printed in a human readable way, eg Ace of Diamonds or 2 of Clubs.
    Once you have implemented the cards and the deck, implement a game. A suggested game is a random luck game:
    Pick a random card from each user's deck. Whichever card is larger wins! Make sure the cards picked do not remain in the deck (as they have been drawn)!

    Finally, implement a dealer who can monitor each player's hand. The dealer should know how many cards each player has left and how many times they have won!

    */

    /* Approach:

    First, we will implement Suit. Each Suit should know which suits are greater and less than themselves.
    Then, we will implement Card such that each Card has a Suit. Card should have a compareTo method to ensure that we can order the cards correctly. 
    Then, we will implement Deck that will hold a collection of cards. Decks should be able to remove card(s), shuffle, and deal (return) a specific number of cards.

    We will then implement a game that maintains two decks (one for each player) and routinly uses the remove and deal methods to isolate specific cards for the game.

    Finally, we will have a dealer that manages all of the current games. Dealers should be able to view the deck of cards for any current game player, so we need to ensure that the game has public accessor methods.
    
    */
  }
}