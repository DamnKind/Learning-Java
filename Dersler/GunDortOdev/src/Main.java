
public class Main {

	public static void main(String[] args) {
		
		
		BaseCustomerManager customerManager = new StarbuckCustomerManager();
		customerManager.save(new Customer(1, "�mer", "Sar�", "25,12,2000", "12345678901"));

	}

}
