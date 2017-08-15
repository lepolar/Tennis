package match;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import exception.TennisException;

public class TennisSet {
	
	/**
	 * Définit le vainqueur
	 */
	private String winner;
	
	/**
	 * Définit les joueurs
	 */
	private String player1;
	private String player2;
	
	/**
	 * Représente les jeux du set
	 */
	private List<TennisGame> games;
	
	/**
	 * Représente l'éventuel tiebreak du set
	 */
	private TennisTieBreak tiebreak;
	
	/**
	 * Historique des score du set
	 */
	private Map<String, List<Integer>> scoreHistory;
	
	
	public TennisSet(String player1, String player2) {
		//initialisation des joueurs
		this.player1 = player1;
		this.player2 = player2;
		
		//initialisation des jeux
		games=new ArrayList<>();
		
		//initialisation des scores
		scoreHistory=new HashMap<>();	
		List<Integer> scorePalyer1=new ArrayList<>();
		scorePalyer1.add(0);
		List<Integer> scorePalyer2=new ArrayList<>();
		scorePalyer2.add(0);
		scoreHistory.put(player1, scorePalyer1);
		scoreHistory.put(player2, scorePalyer2);
	}
	
	
	/**
	 * Décrit la gain d'un jeu.
	 * @param player: Joueur vaiqueur du jeu
	 * @throws TennisException
	 */
	public void winGame(String player) throws TennisException{
		if(player==null || (!player.equals(player1) && !player.equals(player2))){
			throw new TennisException("Joueur non reconnu");
		}

		//on récupère le score score du joueur
		List<Integer> playerScoreHistory=scoreHistory.get(player);
		Integer playerScore=playerScoreHistory.get(playerScoreHistory.size()-1);
		
		//on récupère le score de l'adversaire
		String opponent=player.equals(player1)?player2:player1;
		List<Integer> opponentScoreHistory=scoreHistory.get(opponent);
		Integer opponentScore=opponentScoreHistory.get(opponentScoreHistory.size()-1);
		
		playerScore++;
			
		//on enregistre les nouveaux scores
		playerScoreHistory.add(playerScore);
		opponentScoreHistory.add(opponentScore);
		
		// si le match est terminé, on détermine le vainqueur
		if(playerScore==7|| (playerScore>=6 && playerScore-opponentScore>=2)){
			winner=player;
		}
	}
	
	/**
	 * Démarre un nouveau jeu dans le set
	 */
	public void startGame(){
		games.add(new TennisGame(this));
	}

	/**
	 * Démarre un tiebreak dans le set
	 */
	public void startTiebreak(){
		tiebreak=new TennisTieBreak(this);
	}
	
	/**
	 * Affiche le score d'un joueur
	 * @param player
	 * @return
	 * @throws TennisException
	 */
	public String getScoreToPrint(String player) throws TennisException{
		if(player==null || (!player.equals(player1) && !player.equals(player2))){
			throw new TennisException("Joueur non reconnu");
		}
		
		StringBuilder sb=new StringBuilder();
		sb.append(player).append(":");
		List<Integer> playerScoreHistory=scoreHistory.get(player);
		for(int i=0; i<playerScoreHistory.size()-1;i++){
			sb.append(playerScoreHistory.get(i));
			sb.append("->");
		}
		sb.append(playerScoreHistory.get(playerScoreHistory.size()-1));
		
		return sb.toString();
	}

	public String getWinner() {
		return winner;
	}


	public void setWinner(String winner) {
		this.winner = winner;
	}


	public String getPlayer1() {
		return player1;
	}


	public void setPlayer1(String player1) {
		this.player1 = player1;
	}


	public String getPlayer2() {
		return player2;
	}


	public void setPlayer2(String player2) {
		this.player2 = player2;
	}


	public List<TennisGame> getGames() {
		return games;
	}


	public void setGames(List<TennisGame> games) {
		this.games = games;
	}


	public TennisTieBreak getTiebreak() {
		return tiebreak;
	}


	public void setTiebreak(TennisTieBreak tiebreak) {
		this.tiebreak = tiebreak;
	}


	public Map<String, List<Integer>> getScoreHistory() {
		return scoreHistory;
	}


	public void setScoreHistory(Map<String, List<Integer>> scoreHistory) {
		this.scoreHistory = scoreHistory;
	}
	
	
	
	

}
