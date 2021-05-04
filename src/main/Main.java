package main;

import concretes.CampaingManager;
import concretes.GameManager;
import concretes.PlayerManager;
import concretes.ValidationManager;
import entities.Campaing;
import entities.Game;
import entities.Player;

public class Main {

	public static void main(String[] args) {
		PlayerManager playerManager = new PlayerManager(new ValidationManager());
		Player player1 = new Player(1, "Bahattin", "Celik", 30, "12345678901", "27.10.1987");

		CampaingManager campaingManager = new CampaingManager();
		Campaing campaing1 = new Campaing(2, "Yeni", 100);
		
		GameManager gameManager = new GameManager();
		Game game1 = new Game(3, "Futbol", 450);
		
		System.out.println("=====> HOSGELDINIZ <====");
		
		System.out.println();
		campaingManager.add(campaing1);
		System.out.println();
		playerManager.register(player1);
		System.out.println();
		playerManager.login(player1);
		System.out.println();
		playerManager.buyGame(player1, game1);
		System.out.println();
		gameManager.add(game1);
		System.out.println();
		gameManager.update(game1);
		System.out.println();
		campaingManager.use(campaing1, game1);
		
	}

}
