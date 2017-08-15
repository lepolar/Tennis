package demo;

import exception.TennisException;
import match.TennisSet;

public class DemoMain {

	public static void main(String[] args) {
		
		
		
		try {
			TennisSet set1=new TennisSet("player1","player2");
			
			System.out.println("<<<<<<start set and game>>>>>>");
			set1.startGame();
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(0).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(0).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));
			System.out.println("-------------------------------------------------------------------");
			
			//player 1 win a point
			System.out.println("<<<<<<player 1 win a point>>>>>>");
			set1.getGames().get(0).winPoint(set1.getPlayer1());
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(0).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(0).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));
			System.out.println("-------------------------------------------------------------------");
			
			//player 1 win a point
			System.out.println("<<<<<<player 1 win a point>>>>>>");
			set1.getGames().get(0).winPoint(set1.getPlayer1());
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(0).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(0).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));
			System.out.println("-------------------------------------------------------------------");
			
			//player 2 win a point
			System.out.println("<<<<<<player 2 win a point>>>>>>");
			set1.getGames().get(0).winPoint(set1.getPlayer2());
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(0).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(0).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));
			System.out.println("-------------------------------------------------------------------");
			
			//player 1 win a point
			System.out.println("<<<<<<player 1 win a point>>>>>>");
			set1.getGames().get(0).winPoint(set1.getPlayer1());
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(0).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(0).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));
			System.out.println("-------------------------------------------------------------------");
			
			//player 1 win a point
			System.out.println("<<<<<<player 1 win a point>>>>>>");
			set1.getGames().get(0).winPoint(set1.getPlayer1());
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(0).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(0).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));

			System.out.println("-------------------------------------------------------------------");
			System.out.println("-------------------------------------------------------------------");
			System.out.println("-------------------------------------------------------------------");
			System.out.println("-------------------------------------------------------------------");
			
			
			System.out.println("<<<<<<start second game>>>>>>");
			set1.startGame();
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(1).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(1).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));

			System.out.println("-------------------------------------------------------------------");
			
			//player 1 win a point
			System.out.println("<<<<<<player 1 win a point>>>>>>");
			set1.getGames().get(1).winPoint(set1.getPlayer1());
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(1).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(1).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));

			System.out.println("-------------------------------------------------------------------");
			
			//player 1 win a point
			System.out.println("<<<<<<player 1 win a point>>>>>>");
			set1.getGames().get(1).winPoint(set1.getPlayer1());
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(1).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(1).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));

			System.out.println("-------------------------------------------------------------------");
			
			//player 2 win a point
			System.out.println("<<<<<<player 2 win a point>>>>>>");
			set1.getGames().get(1).winPoint(set1.getPlayer2());
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(1).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(1).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));

			System.out.println("-------------------------------------------------------------------");
			
			//player 1 win a point
			System.out.println("<<<<<<player 1 win a point>>>>>>");
			set1.getGames().get(1).winPoint(set1.getPlayer1());
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(1).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(1).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));
			System.out.println("-------------------------------------------------------------------");
			
			//player 2 win a point
			System.out.println("<<<<<<player 2 win a point>>>>>>");
			set1.getGames().get(1).winPoint(set1.getPlayer2());
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(1).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(1).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));
			System.out.println("-------------------------------------------------------------------");
			
			//player 2 win a point
			System.out.println("<<<<<<player 2 win a point>>>>>>");
			set1.getGames().get(1).winPoint(set1.getPlayer2());
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(1).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(1).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));
			System.out.println("-------------------------------------------------------------------");
			
			//player 2 win a point
			System.out.println("<<<<<<player 2 win a point>>>>>>");
			set1.getGames().get(1).winPoint(set1.getPlayer2());
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(1).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(1).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));
			System.out.println("-------------------------------------------------------------------");
			
			//player 1 win a point
			System.out.println("<<<<<<player 1 win a point>>>>>>");
			set1.getGames().get(1).winPoint(set1.getPlayer1());
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(1).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(1).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));
			System.out.println("-------------------------------------------------------------------");
			
			//player 2 win a point
			System.out.println("<<<<<<player 2 win a point>>>>>>");
			set1.getGames().get(1).winPoint(set1.getPlayer2());
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(1).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(1).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));
			System.out.println("-------------------------------------------------------------------");
			
			//player 2 win a point
			System.out.println("<<<<<<player 2 win a point>>>>>>");
			set1.getGames().get(1).winPoint(set1.getPlayer2());
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(1).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(1).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));
			System.out.println("-------------------------------------------------------------------");
			
			System.out.println("-------------------------------------------------------------------");
			System.out.println("-------------------------------------------------------------------");
			System.out.println("-------------------------------------------------------------------");
			System.out.println("-------------------------------------------------------------------");
			
			System.out.println("<<<<<<start 3rd game>>>>>>");
			set1.startGame();
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(2).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(2).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));
			System.out.println("-------------------------------------------------------------------");
			
			//player 1 win a point
			System.out.println("<<<<<<player 1 win a point>>>>>>");
			set1.getGames().get(2).winPoint(set1.getPlayer1());
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(2).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(2).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));
			System.out.println("-------------------------------------------------------------------");
			
			//player 1 win a point
			System.out.println("<<<<<<player 1 win a point>>>>>>");
			set1.getGames().get(2).winPoint(set1.getPlayer1());
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(2).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(2).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));
			System.out.println("-------------------------------------------------------------------");
			
			//player 2 win a point
			System.out.println("<<<<<<player 2 win a point>>>>>>");
			set1.getGames().get(2).winPoint(set1.getPlayer2());
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(2).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(2).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));
			System.out.println("-------------------------------------------------------------------");
			
			//player 1 win a point
			System.out.println("<<<<<<player 1 win a point>>>>>>");
			set1.getGames().get(2).winPoint(set1.getPlayer1());
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(2).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(2).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));
			System.out.println("-------------------------------------------------------------------");
			
			//player 1 win a point
			System.out.println("<<<<<<player 1 win a point>>>>>>");
			set1.getGames().get(2).winPoint(set1.getPlayer1());
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(2).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(2).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));

			System.out.println("-------------------------------------------------------------------");
			System.out.println("-------------------------------------------------------------------");
			System.out.println("-------------------------------------------------------------------");
			System.out.println("-------------------------------------------------------------------");
			
			
			
			System.out.println("<<<<<<start 4th game>>>>>>");
			set1.startGame();
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(3).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(3).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));
			System.out.println("-------------------------------------------------------------------");
			
			//player 1 win a point
			System.out.println("<<<<<<player 1 win a point>>>>>>");
			set1.getGames().get(3).winPoint(set1.getPlayer1());
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(3).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(3).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));
			System.out.println("-------------------------------------------------------------------");
			
			//player 1 win a point
			System.out.println("<<<<<<player 1 win a point>>>>>>");
			set1.getGames().get(3).winPoint(set1.getPlayer1());
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(3).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(3).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));
			System.out.println("-------------------------------------------------------------------");
			
			//player 2 win a point
			System.out.println("<<<<<<player 2 win a point>>>>>>");
			set1.getGames().get(3).winPoint(set1.getPlayer2());
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(3).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(3).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));
			System.out.println("-------------------------------------------------------------------");
			
			//player 1 win a point
			System.out.println("<<<<<<player 1 win a point>>>>>>");
			set1.getGames().get(3).winPoint(set1.getPlayer1());
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(3).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(3).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));
			System.out.println("-------------------------------------------------------------------");
			
			//player 1 win a point
			System.out.println("<<<<<<player 1 win a point>>>>>>");
			set1.getGames().get(3).winPoint(set1.getPlayer1());
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(3).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(3).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));

			System.out.println("-------------------------------------------------------------------");
			System.out.println("-------------------------------------------------------------------");
			System.out.println("-------------------------------------------------------------------");
			System.out.println("-------------------------------------------------------------------");
			
			
			System.out.println("<<<<<<start 5th game>>>>>>");
			set1.startGame();
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(4).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(4).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));
			System.out.println("-------------------------------------------------------------------");
			
			//player 1 win a point
			System.out.println("<<<<<<player 1 win a point>>>>>>");
			set1.getGames().get(4).winPoint(set1.getPlayer1());
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(4).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(4).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));
			System.out.println("-------------------------------------------------------------------");
			
			//player 1 win a point
			System.out.println("<<<<<<player 1 win a point>>>>>>");
			set1.getGames().get(4).winPoint(set1.getPlayer1());
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(4).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(4).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));
			System.out.println("-------------------------------------------------------------------");
			
			//player 2 win a point
			System.out.println("<<<<<<player 2 win a point>>>>>>");
			set1.getGames().get(4).winPoint(set1.getPlayer2());
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(4).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(4).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));
			System.out.println("-------------------------------------------------------------------");
			
			//player 1 win a point
			System.out.println("<<<<<<player 1 win a point>>>>>>");
			set1.getGames().get(4).winPoint(set1.getPlayer1());
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(4).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(4).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));
			System.out.println("-------------------------------------------------------------------");
			
			//player 1 win a point
			System.out.println("<<<<<<player 1 win a point>>>>>>");
			set1.getGames().get(4).winPoint(set1.getPlayer1());
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(4).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(4).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));

			System.out.println("-------------------------------------------------------------------");
			System.out.println("-------------------------------------------------------------------");
			System.out.println("-------------------------------------------------------------------");
			System.out.println("-------------------------------------------------------------------");
			
			
			System.out.println("<<<<<<start 6th game>>>>>>");
			set1.startGame();
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(5).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(5).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));
			System.out.println("-------------------------------------------------------------------");
			
			//player 1 win a point
			System.out.println("<<<<<<player 1 win a point>>>>>>");
			set1.getGames().get(5).winPoint(set1.getPlayer1());
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(5).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(5).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));
			System.out.println("-------------------------------------------------------------------");
			
			//player 1 win a point
			System.out.println("<<<<<<player 1 win a point>>>>>>");
			set1.getGames().get(5).winPoint(set1.getPlayer1());
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(5).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(5).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));
			System.out.println("-------------------------------------------------------------------");
			
			//player 2 win a point
			System.out.println("<<<<<<player 2 win a point>>>>>>");
			set1.getGames().get(5).winPoint(set1.getPlayer2());
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(5).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(5).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));
			System.out.println("-------------------------------------------------------------------");
			
			//player 1 win a point
			System.out.println("<<<<<<player 1 win a point>>>>>>");
			set1.getGames().get(5).winPoint(set1.getPlayer1());
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(5).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(5).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));
			System.out.println("-------------------------------------------------------------------");
			
			//player 1 win a point
			System.out.println("<<<<<<player 1 win a point>>>>>>");
			set1.getGames().get(5).winPoint(set1.getPlayer1());
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(5).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(5).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));

			System.out.println("-------------------------------------------------------------------");
			System.out.println("-------------------------------------------------------------------");
			System.out.println("-------------------------------------------------------------------");
			System.out.println("-------------------------------------------------------------------");
			System.out.println("<<<<<<start 7th game>>>>>>");
			set1.startGame();
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(6).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(6).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));
			System.out.println("-------------------------------------------------------------------");
			
			//player 2 win a point
			System.out.println("<<<<<<player 2 win a point>>>>>>");
			set1.getGames().get(6).winPoint(set1.getPlayer2());
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(6).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(6).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));
			System.out.println("-------------------------------------------------------------------");
			
			//player 2 win a point
			System.out.println("<<<<<<player 2 win a point>>>>>>");
			set1.getGames().get(6).winPoint(set1.getPlayer2());
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(6).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(6).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));
			System.out.println("-------------------------------------------------------------------");
			
			//player 2 win a point
			System.out.println("<<<<<<player 2 win a point>>>>>>");
			set1.getGames().get(6).winPoint(set1.getPlayer2());
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(6).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(6).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));
			System.out.println("-------------------------------------------------------------------");
			
			
			//player 2 win a point
			System.out.println("<<<<<<player 2 win a point>>>>>>");
			set1.getGames().get(6).winPoint(set1.getPlayer2());
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(6).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(6).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));

			System.out.println("-------------------------------------------------------------------");
			System.out.println("-------------------------------------------------------------------");
			System.out.println("-------------------------------------------------------------------");
			System.out.println("-------------------------------------------------------------------");
			
			
			System.out.println("<<<<<<start 8th game>>>>>>");
			set1.startGame();
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(7).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(7).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));
			System.out.println("-------------------------------------------------------------------");
			
			//player 2 win a point
			System.out.println("<<<<<<player 2 win a point>>>>>>");
			set1.getGames().get(7).winPoint(set1.getPlayer2());
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(7).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(7).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));
			System.out.println("-------------------------------------------------------------------");
			
			//player 2 win a point
			System.out.println("<<<<<<player 2 win a point>>>>>>");
			set1.getGames().get(7).winPoint(set1.getPlayer2());
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(7).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(7).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));
			System.out.println("-------------------------------------------------------------------");
			
			//player 2 win a point
			System.out.println("<<<<<<player 2 win a point>>>>>>");
			set1.getGames().get(7).winPoint(set1.getPlayer2());
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(7).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(7).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));
			System.out.println("-------------------------------------------------------------------");
			
			
			//player 2 win a point
			System.out.println("<<<<<<player 2 win a point>>>>>>");
			set1.getGames().get(7).winPoint(set1.getPlayer2());
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(7).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(7).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));

			System.out.println("-------------------------------------------------------------------");
			System.out.println("-------------------------------------------------------------------");
			System.out.println("-------------------------------------------------------------------");
			System.out.println("-------------------------------------------------------------------");
			
			
			System.out.println("<<<<<<start 9th game>>>>>>");
			set1.startGame();
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(8).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(8).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));
			System.out.println("-------------------------------------------------------------------");
			
			//player 2 win a point
			System.out.println("<<<<<<player 2 win a point>>>>>>");
			set1.getGames().get(8).winPoint(set1.getPlayer2());
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(8).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(8).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));
			System.out.println("-------------------------------------------------------------------");
			
			//player 2 win a point
			System.out.println("<<<<<<player 2 win a point>>>>>>");
			set1.getGames().get(8).winPoint(set1.getPlayer2());
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(8).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(8).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));
			System.out.println("-------------------------------------------------------------------");
			
			//player 2 win a point
			System.out.println("<<<<<<player 2 win a point>>>>>>");
			set1.getGames().get(8).winPoint(set1.getPlayer2());
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(8).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(8).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));
			System.out.println("-------------------------------------------------------------------");
			
			
			//player 2 win a point
			System.out.println("<<<<<<player 2 win a point>>>>>>");
			set1.getGames().get(8).winPoint(set1.getPlayer2());
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(8).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(8).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));

			System.out.println("-------------------------------------------------------------------");
			System.out.println("-------------------------------------------------------------------");
			System.out.println("-------------------------------------------------------------------");
			System.out.println("-------------------------------------------------------------------");
			
			System.out.println("<<<<<<start 10th game>>>>>>");
			set1.startGame();
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(9).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(9).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));
			System.out.println("-------------------------------------------------------------------");
			
			//player 2 win a point
			System.out.println("<<<<<<player 2 win a point>>>>>>");
			set1.getGames().get(9).winPoint(set1.getPlayer2());
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(9).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(9).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));
			System.out.println("-------------------------------------------------------------------");
			
			//player 2 win a point
			System.out.println("<<<<<<player 2 win a point>>>>>>");
			set1.getGames().get(9).winPoint(set1.getPlayer2());
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(9).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(9).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));
			System.out.println("-------------------------------------------------------------------");
			
			//player 2 win a point
			System.out.println("<<<<<<player 2 win a point>>>>>>");
			set1.getGames().get(9).winPoint(set1.getPlayer2());
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(9).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(9).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));
			System.out.println("-------------------------------------------------------------------");
			
			
			//player 2 win a point
			System.out.println("<<<<<<player 2 win a point>>>>>>");
			set1.getGames().get(9).winPoint(set1.getPlayer2());
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(9).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(9).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));

			System.out.println("-------------------------------------------------------------------");
			System.out.println("-------------------------------------------------------------------");
			System.out.println("-------------------------------------------------------------------");
			System.out.println("-------------------------------------------------------------------");
			
			System.out.println("<<<<<<start 11th game>>>>>>");
			set1.startGame();
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(10).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(10).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));
			System.out.println("-------------------------------------------------------------------");
			
			//player 2 win a point
			System.out.println("<<<<<<player 2 win a point>>>>>>");
			set1.getGames().get(10).winPoint(set1.getPlayer2());
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(10).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(10).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));
			System.out.println("-------------------------------------------------------------------");
			
			//player 2 win a point
			System.out.println("<<<<<<player 2 win a point>>>>>>");
			set1.getGames().get(10).winPoint(set1.getPlayer2());
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(10).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(10).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));
			System.out.println("-------------------------------------------------------------------");
			
			//player 2 win a point
			System.out.println("<<<<<<player 2 win a point>>>>>>");
			set1.getGames().get(10).winPoint(set1.getPlayer2());
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(10).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(10).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));
			System.out.println("-------------------------------------------------------------------");
			
			
			//player 2 win a point
			System.out.println("<<<<<<player 2 win a point>>>>>>");
			set1.getGames().get(10).winPoint(set1.getPlayer2());
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(10).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(10).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));

			System.out.println("-------------------------------------------------------------------");
			System.out.println("-------------------------------------------------------------------");
			System.out.println("-------------------------------------------------------------------");
			System.out.println("-------------------------------------------------------------------");
			
			System.out.println("<<<<<<start 12th game>>>>>>");
			set1.startGame();
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(11).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(11).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));
			System.out.println("-------------------------------------------------------------------");
			
			//player 1 win a point
			System.out.println("<<<<<<player 1 win a point>>>>>>");
			set1.getGames().get(11).winPoint(set1.getPlayer1());
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(11).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(11).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));
			System.out.println("-------------------------------------------------------------------");
			
			//player 1 win a point
			System.out.println("<<<<<<player 1 win a point>>>>>>");
			set1.getGames().get(11).winPoint(set1.getPlayer1());
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(11).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(11).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));
			System.out.println("-------------------------------------------------------------------");
			
			//player 2 win a point
			System.out.println("<<<<<<player 2 win a point>>>>>>");
			set1.getGames().get(11).winPoint(set1.getPlayer2());
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(11).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(11).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));
			System.out.println("-------------------------------------------------------------------");
			
			//player 1 win a point
			System.out.println("<<<<<<player 1 win a point>>>>>>");
			set1.getGames().get(11).winPoint(set1.getPlayer1());
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(11).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(11).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));
			System.out.println("-------------------------------------------------------------------");
			
			//player 1 win a point
			System.out.println("<<<<<<player 1 win a point>>>>>>");
			set1.getGames().get(11).winPoint(set1.getPlayer1());
			System.out.println("   ***GAME score***");
			System.out.println("         "+set1.getGames().get(11).getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getGames().get(11).getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));

			System.out.println("-------------------------------------------------------------------");
			System.out.println("-------------------------------------------------------------------");
			System.out.println("-------------------------------------------------------------------");
			System.out.println("-------------------------------------------------------------------");
			
			System.out.println("<<<<<<start getTiebreak()>>>>>>");
			set1.startTiebreak();
			System.out.println("   ***TIEBREAK score***");
			System.out.println("         "+set1.getTiebreak().getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getTiebreak().getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));
			System.out.println("-------------------------------------------------------------------");
			
			//player 1 win a point
			System.out.println("<<<<<<player 1 win a point>>>>>>");
			set1.getTiebreak().winPoint(set1.getPlayer1());
			System.out.println("   ***TIEBREAK score***");
			System.out.println("         "+set1.getTiebreak().getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getTiebreak().getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));
			System.out.println("-------------------------------------------------------------------");
			
			//player 1 win a point
			System.out.println("<<<<<<player 1 win a point>>>>>>");
			set1.getTiebreak().winPoint(set1.getPlayer1());
			System.out.println("   ***TIEBREAK score***");
			System.out.println("         "+set1.getTiebreak().getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getTiebreak().getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));
			System.out.println("-------------------------------------------------------------------");
			
			//player 2 win a point
			System.out.println("<<<<<<player 2 win a point>>>>>>");
			set1.getTiebreak().winPoint(set1.getPlayer2());
			System.out.println("   ***TIEBREAK score***");
			System.out.println("         "+set1.getTiebreak().getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getTiebreak().getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));
			System.out.println("-------------------------------------------------------------------");
			
			//player 1 win a point
			System.out.println("<<<<<<player 1 win a point>>>>>>");
			set1.getTiebreak().winPoint(set1.getPlayer1());
			System.out.println("   ***TIEBREAK score***");
			System.out.println("         "+set1.getTiebreak().getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getTiebreak().getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));
			System.out.println("-------------------------------------------------------------------");
			
			//player 1 win a point
			System.out.println("<<<<<<player 1 win a point>>>>>>");
			set1.getTiebreak().winPoint(set1.getPlayer1());
			System.out.println("   ***TIEBREAK score***");
			System.out.println("         "+set1.getTiebreak().getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getTiebreak().getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));
			System.out.println("-------------------------------------------------------------------");
			
			//player 1 win a point
			System.out.println("<<<<<<player 1 win a point>>>>>>");
			set1.getTiebreak().winPoint(set1.getPlayer1());
			System.out.println("   ***TIEBREAK score***");
			System.out.println("         "+set1.getTiebreak().getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getTiebreak().getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));
			System.out.println("-------------------------------------------------------------------");
			
			//player 1 win a point
			System.out.println("<<<<<<player 1 win a point>>>>>>");
			set1.getTiebreak().winPoint(set1.getPlayer1());
			System.out.println("   ***TIEBREAK score***");
			System.out.println("         "+set1.getTiebreak().getScoreToPrint(set1.getPlayer1()));
			System.out.println("         "+set1.getTiebreak().getScoreToPrint(set1.getPlayer2()));
			System.out.println("   ***SET score***");
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer1()));	
			System.out.println("         "+set1.getScoreToPrint(set1.getPlayer2()));
			System.out.println("-------------------------------------------------------------------");
	
			System.out.println("Le vainqueur est "+set1.getWinner());
			
		} catch (TennisException e) {
			//Gestion basique d'exception, l'utilisation d'un Logger sera requise pour un projet d'entreprise
			e.printStackTrace();
		}
		
		
	
		
		
	}

}
