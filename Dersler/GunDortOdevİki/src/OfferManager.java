
public class OfferManager {
	public void add(Offer offer) {
		System.out.println(offer.offerName+" isimli kampanya veritaban�na kaydedildi.");
	}
	
	public void delete(Offer offer) {
		System.out.println(offer.offerName+" isimli kampanya veritaban�ndan silindi.");
	}
	
	public void update(Offer offer) {
		System.out.println(offer.offerName+" isimli kampanya veritaban�nda g�ncellendi.");
	}
	
}
