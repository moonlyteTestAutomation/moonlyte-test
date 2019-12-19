package qa.com.test.testcases;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.Test;

import qa.com.baseclass.Baseclass;
import qa.com.test.scenarios.BuyerRegistrationScenario;
import qa.com.test.scenarios.CreateDemandScenarios;

public class CreateDemand extends Baseclass   {

	@Test
	public static void createProjectwithoutChallenge() throws InterruptedException, IOException {

		
	   BuyerRegistrationTestcase.buyerRegistrationNonasIndividual();
	    Thread.sleep(10000);

		TestData testData = new TestData();
		ArrayList<String> getCreateDemandList = testData.dataSetUp("CreateDemandwithoutChallenge", "CreateDemand ");

		String projectTitle = getCreateDemandList.get(1);
		String compensation = getCreateDemandList.get(2);
		String descriprion = getCreateDemandList.get(3);
		String yearOfExp = getCreateDemandList.get(4);
		String skill = getCreateDemandList.get(5);
		
	
		CreateDemandScenarios  project=new CreateDemandScenarios();
	        project.createDemand(projectTitle, compensation, descriprion, yearOfExp, skill);
	/*
	 * String companyName = "akarsh technology"; String sellerName = "swathi";
	 * LoginTestcase.LoginManualEmailPasswordOnboard(); Thread.sleep(5000);
	 * 
	 * 
	 * 
	 * 
	 * 
	 * BuyerRegistrationScenario buyerRegObj=new BuyerRegistrationScenario();
	 * buyerRegObj.buyerRegistrationNonasanIndividual(companyName, sellerName);
	 */

}
	
	
	
}
