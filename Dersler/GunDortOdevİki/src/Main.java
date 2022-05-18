
public class Main {

	public static void main(String[] args) {
		Member member1 = new Member("Ömer", "Sarı", "25/12/2000", "12345678901");
		MemberManager memberManager = new MemberManager();
		memberManager.add(member1);
		
		Game game1 = new Game("God of War", 150);
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		
		Offer offer1 = new Offer("yenigelen10", "yüzde 10 daha ucuza");
		OfferManager offerManager = new OfferManager();
		offerManager.add(offer1);
		
		BuyManager buyManager = new BuyManager();
		buyManager.buy(member1, offer1, game1);
		
	}

}
