
public class Main {

	public static void main(String[] args) {
		
		
		BaseCustomerManager customerManager = new StarbuckCustomerManager();
		customerManager.save(new Customer(1, "Ömer", "Sarý", "25,12,2000", "12345678901"));

	}

}
