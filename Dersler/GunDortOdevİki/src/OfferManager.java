
public class OfferManager {
	public void add(Offer offer) {
		System.out.println(offer.offerName+" isimli kampanya veritabanýna kaydedildi.");
	}
	
	public void delete(Offer offer) {
		System.out.println(offer.offerName+" isimli kampanya veritabanýndan silindi.");
	}
	
	public void update(Offer offer) {
		System.out.println(offer.offerName+" isimli kampanya veritabanýnda güncellendi.");
	}
	
}
