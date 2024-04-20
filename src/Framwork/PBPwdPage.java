package Framwork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBPwdPage 
{
	@FindBy(xpath="input[@id=\"central-login-password\"]") private WebElement pwd;
	@FindBy(xpath="a[text()=\"Sign in\"]") private WebElement signIn;
	
	public PBPwdPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void inpPBPwdPagepwd(String string)
	{
		pwd.sendKeys("Ashwini123@");
		
	}
	public void clickPBPwdPagesignIn()
	{
		signIn.click();
	}
	
	
	
}
