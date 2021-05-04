package concretes;

import entities.Game;
import entities.Player;
import interfaces.PlayerService;
import interfaces.ValidationService;

public class PlayerManager implements PlayerService{

	ValidationService validationService;
	
	
	
	public PlayerManager(ValidationService validationService) {
		this.validationService = validationService;
	}

	@Override
	public void login(Player player) {
		if (this.validationService.confirm(player).length()<1) {
			System.out.println("sisteme giris yapildi");
		} else {
			System.out.println(this.validationService.confirm(player));
		}
		
	}

	@Override
	public void register(Player player) {
		System.out.println("Sisyteme kayit yapildi");		
	}

	@Override
	public void logout(Player player) {
		System.out.println("Sisytemden cikis yapildi");		
		
	}

	@Override
	public void buyGame(Player player, Game game) {
System.out.println(player.getFirstName()+" " +game.getName()+ "alindi");		
	}

}
