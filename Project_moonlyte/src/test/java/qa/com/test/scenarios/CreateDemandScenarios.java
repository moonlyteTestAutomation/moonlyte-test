package qa.com.test.scenarios;

import org.testng.annotations.Test;

import qa.com.pages.BuyerRegistrationPage;
import qa.com.pages.CreateDemandPage;

public class CreateDemandScenarios {

	
	CreateDemandPage demand =new CreateDemandPage();
	
	
	
	
	public void createDemand(String projectTitle, String compensation, String descriprion, String yearOfExp, String skillString ) throws InterruptedException
	{
		// TODO Auto-generated method stub
		{
		
	
	demand.hamburgerCreateProjectClick();
	Thread.sleep(2000);
    demand.getProjectTitle(projectTitle);
    Thread.sleep(1000);
		
	}
	
	
	}
}
