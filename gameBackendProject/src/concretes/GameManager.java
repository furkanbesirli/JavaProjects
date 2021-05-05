package concretes;

import abstracts.GameService;
import entities.Game;

public class GameManager implements GameService{

	@Override
	public void Update(Game game) {
		System.out.println(game.getName()+" oyunu guncellenmistir. Iyi oyunlar...");
		
	}

	@Override
	public void Add(Game game) {
		System.out.println(game.getName()+" oyunu eklenmistir. Fiyat : "+game.getPrice());
		
	}
	
	public void addMultipleGame(Game[] games) {
		for(Game gameDon : games) {
			Add(gameDon);
		}
		
	}
	
	
	
}
