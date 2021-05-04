package concretes;

import entities.Campaing;
import interfaces.CampaingService;
import entities.Game;

public class CampaingManager implements CampaingService {

	@Override
	public void add(Campaing campaing) {
		System.out.println(campaing.getCampaingName() + " eklendi");
	}

	@Override
	public void update(Campaing campaing) {
		System.out.println(campaing.getCampaingName() + " guncellendi");
		
	}

	@Override
	public void delete(Campaing campaing) {
		System.out.println(campaing.getCampaingName() + " silindi");
		
	}

	@Override
	public void use(Campaing campaing, Game game) {
		double result =game.getPrice()-((game.getPrice()/campaing.getCampaingDiscountRate())*100);
		System.out.println("Guncel Fiyat : " + result );
		
	}

	

}
