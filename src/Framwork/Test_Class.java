package Framwork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_Class 
{
	int a;
	PBMobNumPage mobnum;
	PBLoginPage login;
	PBPwdPage pwd;
	HomePage home;
	PBMyaccPage myacc;
	MyProfilePage profile;
	Sheet sh;
	WebDriver driver;
	
	    
	@BeforeClass
	public void OpenBrowser() throws EncryptedDocumentException, IOException
	{
		
		FileInputStream file=new FileInputStream("C:\\Users\\sashw\\OneDrive\\Desktop\\Documents");
		WorkbookFactory.create(file).getSheet("Data");
		
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		
		
		driver=new ChromeDriver(op);
		driver.get("https://www.policybazaar.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		login=new PBLoginPage(driver);
		mobnum=new PBMobNumPage(driver);
		pwd=new PBPwdPage(driver);
		home=new HomePage(driver);
		myacc=new PBMyaccPage(driver);
		profile=new MyProfilePage(driver);
		a=20;
		
		
			
	}
	@BeforeMethod
	public void loginToApp() throws InterruptedException
	{
	 System.out.println(a);
	 login.ClickPBLoginPagesignIn();
	 Thread.sleep(1000);
	 mobnum.inpPBMobNumPageMbNum(sh.getRow(0).getCell(0).getStringCellValue());
	 mobnum.Click();
	 Thread.sleep(1000);
	 pwd.inpPBPwdPagepwd(sh.getRow(0).getCell(1).getStringCellValue());
	 pwd.clickPBPwdPagesignIn();
	 Thread.sleep(1000);
	 	
	}
	@Test
	public void verifyFristName() throws InterruptedException
	{
		home.clickPBMyaccPagemyacc();
		Thread.sleep(1000);
		myacc.PBMyaccPageprofile();
		profile.switchToChildWindow();
		  String actName = profile.getMyProfilePageFullName();
		  
		  String actFullName=profile.getMyProfilePageFullName();
			String expFullName=sh.getRow(0).getCell(2).getStringCellValue();
			
			Assert.assertEquals(actFullName, expFullName, "Failed: both results are diff");
			Thread.sleep(2000);
		
		
	}
	@AfterMethod
	public void logoutFromApp()
	{
		myacc.PBMyaccPagelogout();	
	}
	@AfterClass
	public void closeFromBrowser()
	{
		driver.quit();
	}
	
	
	
	
	
//		ChromeOptions op = new ChromeOptions();
//		op.addArguments("--disable-notifications");
//		
//		
//		WebDriver driver=new ChromeDriver(op);
//		driver.get("https://www.policybazaar.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		
//		PBLoginPage login=new PBLoginPage(driver);
//		login.ClickPBLoginPagesignIn();
//		Thread.sleep(500);
//		
//		PBMobNumPage mobnum=new PBMobNumPage(driver);
//		mobnum.inpPBMobNumPageMbNum();
//		mobnum.Click();
//		Thread.sleep(500);
//		
//		PBPwdPage pwd=new PBPwdPage(driver);
//		pwd.clickPBPwdPagesignIn();
//		Thread.sleep(1000);
//		
//		HomePage home=new HomePage(driver);
//		home.clickPBMyaccPagemyacc();
//		Thread.sleep(1000);
//
//		
//		PBMyaccPage myacc=new PBMyaccPage(driver);
//		myacc.PBMyaccPageprofile();
//		Thread.sleep(1000);
//
//		
//		MyProfilePage profile=new MyProfilePage(driver);
//		profile.inpMyProfilePagefullname();
//		profile.inpMyProfilePagemobnum();
//		profile.inpMyProfilePagedateOfBrith();
//		profile.inpMyProfilePageemailId();
//		Thread.sleep(1000);
//
//		
//	}
}
