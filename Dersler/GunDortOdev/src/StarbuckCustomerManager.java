
public class StarbuckCustomerManager extends BaseCustomerManager implements IPersonCheckService{
	
	public void save(Customer customer) {
		if(CheckIfRealPerson(customer)==true) {
			
			System.out.println("Tc kimlik no do�ru.");
			System.out.println("Saved to database " + customer.getFirstName() );
		}
		else {System.out.println("Kaydedilemedi TcNo ge�ersiz.");}
	}

	@Override
	public Boolean CheckIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		return true;
	}

	

	
	

}
