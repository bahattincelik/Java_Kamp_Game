package concretes;

import entities.Player;
import interfaces.ValidationService;

public class ValidationManager implements ValidationService {

	@Override
	public String confirm(Player player) {
		
		if (player.getTcNo().length()<1) {
			return "Bos birakmayiniz";
		} else {
			return "";
		}
		
		
		
		
	}

}
