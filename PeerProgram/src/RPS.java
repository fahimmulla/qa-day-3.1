import java.util.Random;

import java.util.Scanner;

public class RPS {

	Scanner scan = new Scanner(System.in);

	Random generator = new Random();

	int totalGames = 0;

	int humanWins = 0;

	int AIWins = 0;

	int numTies = 0;

	int numRock = 0;

	int numPaper = 0;

	int numScissors = 0;

	void play(String RPS) throws InterruptedException {

		switch (RPS) {

		case "r":

			System.out.println("You selected Rock");

			numRock++;

			break;

		case "s":

			System.out.println("You selected Scissors");

			numScissors++;

			break;

		case "p":

			System.out.println("You selected Paper");

			numPaper++;

			break;

		}

		int AIChoice = generator.nextInt(2);

		String AIPlay = "";

		switch (AIChoice) {

		case 0:

			AIPlay = "r";

			numRock++;

			break;

		case 1:

			AIPlay = "p";

			numPaper++;

			break;

		case 2:

			AIPlay = "s";

			numScissors++;

			break;

		}

		System.out.println("Computer is thinking...");

		Thread.sleep(1000);

		System.out.println("Computer entered: " + AIPlay);

		if (RPS.equals(AIPlay)) {

			System.out.println("Tie");

			numTies++;

		} else if (RPS.equals("p") && AIPlay.equals("r")) {

			System.out.println("You Win!!!");

			humanWins++;

		} else if (RPS.equals("r") && AIPlay.equals("s")) {

			System.out.println("You Win!!!");

			humanWins++;

		} else if (RPS.equals("s") && AIPlay.equals("p")) {

			System.out.println("You Win!!!");

			humanWins++;

		} else {

			System.out.println("Computer Wins");

			AIWins++;

		}

	}

	void run() throws InterruptedException {

		for (;;) {

			System.out.println("Enter rock(r), paper(p), scissors(s) or quit(q): ");

			String RPS = "";

			RPS = scan.next();

			while (!(RPS.equals("r") || RPS.equals("p") || RPS.equals("s") || RPS.equals("q"))) {

				System.out.println("ERROR! Enter rock(r), paper(p) or scissors(s): ");

				RPS = scan.next();

			}

			if (RPS.equals("q")) {

				System.out.println("Ending Game");

				break;

			}

			play(RPS);

			totalGames++;

		}

		System.out.println("Total Games: " + totalGames);

		if (totalGames > 0) {

			int computerPercentage = (100 / totalGames) * AIWins;

			System.out.println("Computer Wins: " + AIWins + " with " + computerPercentage + "%");

			int humanPercentage = (100 / totalGames) * humanWins;

			System.out.println("Human Wins: " + humanWins + " with " + humanPercentage + "%");

			int tiesPercentage = (100 / totalGames) * numTies;

			System.out.println("Ties: " + numTies + " with " + tiesPercentage + "%");

			int max = Math.max(Math.max(numRock, numPaper), numScissors);

			String biggest = "";

			if (numRock == max)

				biggest += "Rock";

			if (numPaper == max)

				biggest += "Paper";

			if (numScissors == max)

				biggest += "Scissors";

			int pickPercentage = (100 / (2 * totalGames) * max);

			System.out.println("Most Common Pick(s): " + biggest + " with " + (max) + " picks"
					+ " with a percentage of: " + pickPercentage + "%");

		}

	}

}
