package qa.com.baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Baseclass {
	public static WebDriver driver = null;
	public static Connection con;

	// TODO Auto-generated method stub
	@BeforeSuite
	public void setupTest() throws InterruptedException, ClassNotFoundException, SQLException {
		String ProjectPath = System.getProperty("user.dir");
		System.out.println(ProjectPath);
		System.setProperty("webdriver.chrome.driver", ProjectPath + "/drivers/chromedriver/chromedriver.exe");
		
		//driver.get("https://www.qa.moonlyte.com/");
		// Thread.sleep(2000);

		
		Class.forName("org.mariadb.jdbc.Driver");
		con = DriverManager.getConnection(
				"jdbc:mariadb://invictus-qa.cvritdilbsvf.ap-south-1.rds.amazonaws.com/invictus_qa", "invictus_qa",
				"invictus_qa");

	}
	
	
	
	
	@BeforeMethod
	public void beforeTest()
	{
		driver = new ChromeDriver();
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.qa.moonlyte.com/");
	}
	
	
	@AfterMethod
	public void afterTest()
	{
		System.out.print("suceess-------------------------------------------------");
     driver.close();
		
	}
	

	@AfterSuite
	public void tearDownTest() {
    
	//driver.quit();
	}
}
