import concretes.CampaignManager;
import concretes.GameManager;
import concretes.GamerManager;
import concretes.SaleManager;
import concretes.VerificationManager;
import entities.Campaign;
import entities.Game;
import entities.Gamer;
import entities.Sale;


public class Main {

	public static void main(String[] args) {
		
		Game game = new Game(1, "Mafia 1", 28);
		Game game2 = new Game(2, "Mafia 2", 99.50);
		Game game3 = new Game(3, "Mafia 3", 125);
		
		Game[] games = {game, game2, game3};
	
		GameManager gameManager = new GameManager();
		gameManager.Add(game2);
		gameManager.Add(game3);
		gameManager.Update(game);

		
		Gamer gamer1 = new Gamer(5, "Furkan", "", "frknnnbesirli@gmail.com", "36784669941", "Jaime", "dadestroyerjaim12", "2002/1/29");
		Gamer gamer2 = new Gamer(12, "Sena", "Kotankiran", "srskk12@gmail.com", "12214664945", "sena", "senos12", "2002/2/12");
		
		System.out.println("********-********");
		
		GamerManager gamerManager = new GamerManager();
		gamerManager.Add(gamer1);
		gamerManager.Delete(gamer1);
		gamerManager.Update(gamer2);
		
		CampaignManager campaignManager = new CampaignManager();
		
		Campaign campaign = new Campaign(7, " ABC indirim kampanyasi", 10);
		Campaign campaign2 = new Campaign(13, "Mafia ndirim kampanyasi", 5);
		Campaign campaign3 = new Campaign(70, "Taleworlds indirim kampanyasi", 15);
		
		
		Sale sale1 = new Sale(100);
		Sale sale2 = new Sale(101);
		Sale sale3 = new Sale(103);
		
		System.out.println("********_********");

		SaleManager saleManager = new SaleManager(new VerificationManager());
		saleManager.Sell(gamer2, game3, sale1, campaign);
		SaleManager saleManager2 = new SaleManager(new VerificationManager());
		saleManager2.Sell(gamer1, game, sale2, campaign3);
		SaleManager saleManager3 = new SaleManager(new VerificationManager());
		saleManager3.Sell(gamer2, game2, sale3, null);
		
		
	}

}
