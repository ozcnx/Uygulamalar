package Day_0105;

import java.util.Scanner;

public class Scrable {
	

	public static void main(String[] args) {

		/*
		 * Write a Scrabble Game for two person Rules
		 * 
		 * OK== 1- At the beginning Ask to first Player enter a word for starting game
		 * OK 2- Then change the player ask to new player if given word is valid or not
		 * OK i) If new player accepts the given word add number of letters in the word
		 * as points to player who wrote the word And go to step 3 OK ii) If new player
		 * does not accept the word as valid then print
		 * "Invalid word, player X(Current player) won the game" and finish the game
		 * 
		 * OK 3- Ask to users if user want to continue game or not OK i) If player want
		 * to continue, OK ask to user a letter to add to word OK and ask to user side
		 * to add (beginning or end) OK then add letter to word and run step 2
		 * 
		 * OK ii) If player does not want to continue then print "Game Finished" and
		 * print points and winner
		 */

		Manager manager = new Manager();
		manager.oyunuBaslat();

		Manager gecerli =new Manager();
		gecerli.gecerliMi();
		
		Manager harf=new Manager();
		harf.harfEkle();
		
}
}
