package match;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import exception.TennisException;

public class TennisGame {
	
	//constantes
	private static final String ZERO="0";
	private static final String QUINZE="15";
	private static final String TRENTE="30";
	private static final String QUARANTE="40";
	private static final String ADV="ADV";
	private static final String DEUCE="DEUCE";
	private static final String WIN_GAME="Win game";
	
	/**
	 * Représente l'historique des score dans le jeu
	 */
	private Map<String, List<String>> scoreHistory;
	
	/**
	 * Set auquel appartient le jeu
	 */
	private TennisSet set;
	
	public TennisGame(TennisSet set) {		
		this.set=set;
		//initialisation des scores
		scoreHistory=new HashMap<>();	
		List<String> scorePalyer1=new ArrayList<>();
		scorePalyer1.add(ZERO);
		List<String> scorePalyer2=new ArrayList<>();
		scorePalyer2.add(ZERO);
		scoreHistory.put(set.getPlayer1(), scorePalyer1);
		scoreHistory.put(set.getPlayer2(), scorePalyer2);
		
	}

	
	/**
	 * Décrit la gain d'un point dans le jeu.
	 * @param player: Joueur vaiqueur du point
	 * @throws TennisException
	 */
	public void winPoint(String player) throws TennisException{
		if(player==null || (!player.equals(set.getPlayer1()) && !player.equals(set.getPlayer2()))){
			throw new TennisException("Joueur non reconnu");
		}

		List<String> playerScoreHistory=scoreHistory.get(player);
		String playerScore=playerScoreHistory.get(playerScoreHistory.size()-1);
		
		String opponent=player.equals(set.getPlayer1())?set.getPlayer2():set.getPlayer1();
		List<String> opponentScoreHistory=scoreHistory.get(opponent);
		String opponentScore=opponentScoreHistory.get(opponentScoreHistory.size()-1);
		
		switch (playerScore) {
		case ZERO: 
			playerScore=QUINZE;			
			break;

		case QUINZE: 
			playerScore=TRENTE;			
			break;
			
		case TRENTE: 
			playerScore=QUARANTE;			
			break;
			
		case QUARANTE: 
			if(QUARANTE.equals(opponentScore)){
				playerScore=ADV;
			}else{ 
				if(ADV.equals(opponentScore)){
					playerScore=DEUCE;
					opponentScore=DEUCE;
				}else{
					playerScore=WIN_GAME;
					//on inscrit le résultat du jeu dans le set
					set.winGame(player);
				}	
			}
			break;
			
		case ADV: 	
				playerScore=WIN_GAME;
				//on inscrit le résultat du jeu dans le set
				set.winGame(player);
			break;
		case DEUCE:
			playerScore=ADV;
			opponentScore=QUARANTE;
			break;
		default:
			
			throw new TennisException("cas impossible");
		}
		
		//on inscrit les score du jeu dans les historiques des scores
		playerScoreHistory.add(playerScore);
		opponentScoreHistory.add(opponentScore);
		
		
	}


	/**
	 * Affiche le score d'un joueur
	 * @param player
	 * @return
	 * @throws TennisException
	 */
	public String getScoreToPrint(String player) throws TennisException{
		if(player==null || (!player.equals(set.getPlayer1()) && !player.equals(set.getPlayer2()))){
			throw new TennisException("Joueur non reconnu");
		}
		
		StringBuilder sb=new StringBuilder();
		sb.append(player).append(":");
		List<String> playerScoreHistory=scoreHistory.get(player);
		for(int i=0; i<playerScoreHistory.size()-1;i++){
			sb.append(playerScoreHistory.get(i));
			sb.append("->");
		}
		sb.append(playerScoreHistory.get(playerScoreHistory.size()-1));
		
		return sb.toString();
	}
	
	public Map<String, List<String>> getScoreHistory() {
		return scoreHistory;
	}


	public void setScoreHistory(Map<String, List<String>> scoreHistory) {
		this.scoreHistory = scoreHistory;
	}


	public TennisSet getSet() {
		return set;
	}


	public void setSet(TennisSet set) {
		this.set = set;
	}
	
	

	
	
	
	

}
