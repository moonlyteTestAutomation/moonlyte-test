package qa.com.test.scenarios;

import qa.com.baseclass.Baseclass;
import qa.com.pages.BlogsLanding;
import qa.com.pages.LaunchPage;

public class BlogListingScenario extends Baseclass {

	LaunchPage pageObjLogin = new LaunchPage();
	BlogsLanding blogObj =new BlogsLanding();
	
//BLOG LISTING SCENARIOS
	public void blogListingScenario() {
		// TODO Auto-generated method stub
		
	pageObjLogin.blogButtonClick();
    blogObj.clickActionBlog();
		
			
	}
}