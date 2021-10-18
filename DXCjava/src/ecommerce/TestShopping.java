package ecommerce;

public class TestShopping {
	public static void main(String[] args) {
		Customer customerSatish = new Customer();
		customerSatish.walkin();
		Security maxSecurity = new Security();
		boolean isCustomer = maxSecurity.scan(customerSatish);
		if(isCustomer) {
			customerSatish.shop();
		}
		customerSatish.checkout();
	}
	

}
