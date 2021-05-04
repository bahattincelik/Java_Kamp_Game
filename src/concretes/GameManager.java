package concretes;

import entities.Game;
import interfaces.GameService;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getName()+ " isimli oyun eklendi");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName()+ " isimli oyun guncellendi");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName()+ " isimli oyun silindi");
		
	}

	@Override
	public void play(Game game) {
		System.out.println(game.getName()+ " isimli oyun oynaniyor");
		
	}

}
