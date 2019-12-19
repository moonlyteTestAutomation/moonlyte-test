package qa.com.test.scenarios;

import qa.com.baseclass.Baseclass;
import qa.com.pages.BuyerRegistrationPage;
import qa.com.pages.LaunchPage;

public class BuyerRegistrationScenario extends Baseclass {

	LaunchPage pageObjBuyer = new LaunchPage();
	BuyerRegistrationPage pageObjBuyer1=new BuyerRegistrationPage();
	

	public void buyerRegistration(String companyName, String sellerName) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		pageObjBuyer.BusinessButtonLinkClick();
		
		pageObjBuyer1.setCompanyName(companyName);
		Thread.sleep(2000);
		//pageObjBuyer1.setSellerName(sellerName);
		pageObjBuyer1.clickProceed();
		Thread.sleep(10000);
		
			
	}
	
	
	
	
	
	
}
