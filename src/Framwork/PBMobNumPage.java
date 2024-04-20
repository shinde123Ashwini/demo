package Framwork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMobNumPage 
{
	@FindBy(xpath="(//input[@id=\"central-login-module-sign-mobile\"])[2]") WebElement MbNum;
	@FindBy(xpath="(//span[@id=\"central-login-sign-in-with-password-span\"])[2]") WebElement LoginWithpwd;

	public PBMobNumPage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
	
	public void inpPBMobNumPageMbNum(String string)
	{
		MbNum.sendKeys("9325730403");
	}
	
	public void Click()
	{
		LoginWithpwd.click();
	}
	//(//span[@id=\"central-login-sign-in-with-password-span\"])[2]

	
		
	

}
