
public class GameManager {
	public void add(Game game) {
		System.out.println(game.gameName+" isimli oyun veritabanýna kaydedildi.");
	}
	
	public void delete(Game game) {
		System.out.println(game.gameName+" isimli oyun veritabanýndan silindi.");
	}
	
	public void update(Game Game) {
		System.out.println(Game.gameName+" isimli oyun veritabanýnda güncellendi.");
	}
}
