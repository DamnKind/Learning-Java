
public class GameManager {
	public void add(Game game) {
		System.out.println(game.gameName+" isimli oyun veritaban�na kaydedildi.");
	}
	
	public void delete(Game game) {
		System.out.println(game.gameName+" isimli oyun veritaban�ndan silindi.");
	}
	
	public void update(Game Game) {
		System.out.println(Game.gameName+" isimli oyun veritaban�nda g�ncellendi.");
	}
}
