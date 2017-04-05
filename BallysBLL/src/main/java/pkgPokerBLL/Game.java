package pkgPokerBLL;

import java.util.ArrayList;
import java.util.UUID;


public class Game extends Table{

	private UUID GameID;
	private ArrayList<Player> GamePlayers;
	
	
	public Game(UUID TableID, UUID GameID, ArrayList<Player> GamePlayers){
		super();
		this.GameID= UUID.randomUUID();
		
		
	}
	
	
	public  Game AddPlayerToGame(UUID Table, Player p){
		
		GamePlayers.add(p);
		
		return this;
	}
	
	
	public UUID getGameID() {
		return GameID;
	}
	public void setGameID(UUID gameID) {
		GameID = gameID;
	}
	
}
