
public class GameManager {
	public void add(Game game) {
		System.out.println(game.gameName+" isimli oyun veritabanına kaydedildi.");
	}
	
	public void delete(Game game) {
		System.out.println(game.gameName+" isimli oyun veritabanından silindi.");
	}
	
	public void update(Game Game) {
		System.out.println(Game.gameName+" isimli oyun veritabanında güncellendi.");
	}
}
