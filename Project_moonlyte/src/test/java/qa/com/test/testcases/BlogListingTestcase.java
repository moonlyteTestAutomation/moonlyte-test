package qa.com.test.testcases;

import org.testng.annotations.Test;

import qa.com.baseclass.Baseclass;

import qa.com.test.scenarios.BlogListingScenario;

public class BlogListingTestcase  extends Baseclass{

	 @Test
		
	//BLOG LISTING	TESTCASE
	public static void BlogListingTest()
	{

		
	BlogListingScenario objBlog =new BlogListingScenario();
   objBlog.blogListingScenario();
   
  	
	}

}
