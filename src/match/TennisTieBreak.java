package match;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import exception.TennisException;

public class TennisTieBreak {

	private Map<String, List<Integer>> scoreHistory;
	private TennisSet set;
	
	public TennisTieBreak(TennisSet set) {
		
		this.set=set;
		//initialisation des scores
		scoreHistory=new HashMap<>();	
		
		List<Integer> scorePalyer1=new ArrayList<>();
		scorePalyer1.add(0);
		List<Integer> scorePalyer2=new ArrayList<>();
		scorePalyer2.add(0);
		scoreHistory.put(set.getPlayer1(), scorePalyer1);
		scoreHistory.put(set.getPlayer2(), scorePalyer2);
	}
	

	/**
	 * Décrit la gain d'un point dans le Tie break.
	 * @param player: Joueur vaiqueur du point
	 * @throws TennisException
	 */
	public void winPoint(String player) throws TennisException{
		if(player==null || (!player.equals(set.getPlayer1()) && !player.equals(set.getPlayer2()))){
			throw new TennisException("Joueur non reconnu");
		}

		List<Integer> playerScoreHistory=scoreHistory.get(player);
		Integer playerScore=playerScoreHistory.get(playerScoreHistory.size()-1);
		
		String opponent=player.equals(set.getPlayer1())?set.getPlayer2():set.getPlayer1();
		List<Integer> opponentScoreHistory=scoreHistory.get(opponent);
		Integer opponentScore=opponentScoreHistory.get(opponentScoreHistory.size()-1);
		
		
		playerScore++;
		//on enregistre les nouveaux scores
		playerScoreHistory.add(playerScore);
		opponentScoreHistory.add(opponentScore);
		
		//si le tiebreak est terminé, on inscrit le résultat dans le set
		if(playerScore>=6 && playerScore-opponentScore>=2){
			set.winGame(player);
		}
		
	
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
		List<Integer> playerScoreHistory=scoreHistory.get(player);
		for(int i=0; i<playerScoreHistory.size()-1;i++){
			sb.append(playerScoreHistory.get(i));
			sb.append("->");
		}
		sb.append(playerScoreHistory.get(playerScoreHistory.size()-1));
		
		return sb.toString();
	}
	
	
}
