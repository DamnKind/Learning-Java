
public class OfferManager {
	public void add(Offer offer) {
		System.out.println(offer.offerName+" isimli kampanya veritabanına kaydedildi.");
	}
	
	public void delete(Offer offer) {
		System.out.println(offer.offerName+" isimli kampanya veritabanından silindi.");
	}
	
	public void update(Offer offer) {
		System.out.println(offer.offerName+" isimli kampanya veritabanında güncellendi.");
	}
	
}
