
public class StarbuckCustomerManager extends BaseCustomerManager implements IPersonCheckService{
	
	public void save(Customer customer) {
		if(CheckIfRealPerson(customer)==true) {
			
			System.out.println("Tc kimlik no doðru.");
			System.out.println("Saved to database " + customer.getFirstName() );
		}
		else {System.out.println("Kaydedilemedi TcNo geçersiz.");}
	}

	@Override
	public Boolean CheckIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		return true;
	}

	

	
	

}
