package entities;

	public class Game {
		
	private int gameId;
	private String name;
	private double price;

	
		public Game() {
			
			
		}


		public Game(int gameId, String name, double price) {
			super();
			this.gameId = gameId;
			this.name = name;
			this.price = price;
		}


		public int getGameId() {
			return gameId;
		}


		public void setGameId(int gameId) {
			this.gameId = gameId;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public double getPrice() {
			return price;
		}


		public void setPrice(double price) {
			this.price = price;
		}

		
		
		
}
