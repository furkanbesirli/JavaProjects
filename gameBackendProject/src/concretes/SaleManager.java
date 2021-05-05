package concretes;

import abstracts.SaleService;
import abstracts.VerificationService;
import entities.Campaign;
import entities.Game;
import entities.Gamer;
import entities.Sale;

public class SaleManager implements SaleService{

	
	
	VerificationService verificationService;
	public SaleManager(VerificationService verificationService) {
		this.verificationService = verificationService;
	
	}
	

	@Override
	public void Sell(Gamer gamer, Game game, Sale sale, Campaign campaign) {
		if(verificationService.confirm(gamer) && campaign != null) {
			
			double lastPrice = game.getPrice() - (game.getPrice() * campaign.getCampaignDiscount() / 100);
			
			System.out.println(gamer.getFirstName() + " "+ gamer.getLastName() +"("+ gamer.getUsername()+") kullanicisi "+ game.getName()+ " oyununu "+campaign.getCampaignName()+" kampanyasi ile "+lastPrice +" TL ye satin aldi.");
			
			
		}else if(verificationService.confirm(gamer) && campaign == null){
			
			System.out.println("Satin alma islemi basarili : "+game.getName() + " Fiyati : "+game.getPrice());
			
		}
		else {
			System.out.println(game.getName()+" oyununu satin alma islemi basarisiz oldu.");
			
		}
		
	}

	

	
	
	
}
