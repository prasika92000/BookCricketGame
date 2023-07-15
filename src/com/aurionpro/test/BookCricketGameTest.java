package com.aurionpro.test;

import java.util.Scanner;
import java.util.Random;

public class BookCricketGameTest {

	public static void main(String[] args) {
		int player1Score = playGame();// player1 varible declared nd assign value by calling playGame() methon
		int player2Score = playGame();// player1 varible declared
		// BookCricketGameTest player1=new BookCricketGameTest();
		// BookCricketGameTest player2=new BookCricketGameTest();
		Scanner sc = new Scanner(System.in);

		System.out.println("Player 1 Score: " + player1Score);
		System.out.println("Player 2 Score: " + player2Score);

		if (player1Score == player2Score) {
			System.out.println("It's a tie!");

			int player1Turns = getPlayerTurns(player1Score);
			int player2Turns = getPlayerTurns(player2Score);
			if (player1Turns < player2Turns) {
				System.out.println("Player 1 wins with fewer turns.");
			} else if (player2Turns < player1Turns) {
				System.out.println("Player 2 wins with fewer turns.");
			} else {
				System.out.println("Both players have the same number of turns.");
			}
		} else if (player1Score > player2Score) {
			System.out.println("Player 1 wins!");
		} else {
			System.out.println("Player 2 wins!");
		}
	}

	private static int playGame() {
		final int BOOK_PAGES = 300;// constant variable BOOKPages =300 //final keyword in Java is used to indicate
									// that the value of a variable cannot be changed once it has been assigned.
									// When a variable is declared as final, it becomes a constant and can only be
									// assigned a value once.
		Random random = new Random();
		int score = 0;
		int turns = 0;

		while (true) {
			int pageNumber = random.nextInt(BOOK_PAGES) + 1;// random page no is generated
			int run = pageNumber % 7; // % 7 is performed on the page number to calculate the run scored on that turn.
			score += run;
			turns++;

			if (run == 0) {
				break;
			}
		}

		System.out.println("Total turns: " + turns);
		return score;
	}

	private static int getPlayerTurns(int score) {
		int turns = (score / 7) + 1;
		return turns;
	}
}
