
public class BuyManager {
	public void buy(Member member, Offer offer, Game game) {
		System.out.println(member.getFirstName()+" "+member.getLastName()+" "+game.gameName+" isimli oyunu "+offer.offerName+" kampanyasından faydalanıp "+offer.offerDesc+" aldı.");
	}
}
