package qa.com.test.scenarios;

import qa.com.baseclass.Baseclass;
import qa.com.pages.LaunchPage;
import qa.com.pages.OnboardingPage;

public class OnboardingScenario extends Baseclass{
	
	
	LaunchPage pageObjOnboard = new LaunchPage();
	OnboardingPage PageObj2=new OnboardingPage();

	public void sellerOnboarding(String sellerName, String skill, String yearOfExperience) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		pageObjOnboard.freelancerButtonLinkClick();
		
		PageObj2.setName(sellerName);
		Thread.sleep(2000);
		PageObj2.clickOnboardProceed1();
		Thread.sleep(2000);
		PageObj2.selectSkill(skill);
		Thread.sleep(3000);
		PageObj2.clickOnboardProceed2();
		Thread.sleep(2000);
		PageObj2.getYearOfExperience(yearOfExperience);
		Thread.sleep(3000);
		PageObj2.clickOnboardProceed3();
		Thread.sleep(2000);
		PageObj2.onboardSucessClick();
		Thread.sleep(2000);
		PageObj2.clickOnboardComplete();
		Thread.sleep(2000);
		
	}
	
	

	


	
	
	
	
	
	
	
}
