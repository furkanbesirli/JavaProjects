package abstracts;

import entities.Campaign;
import entities.Game;
import entities.Gamer;
import entities.Sale;

public interface SaleService {
	
	void Sell(Gamer gamer, Game game, Sale sale, Campaign campaign);
	
	
}
