package Framwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMyaccPage 
{
	 @FindBy(xpath="//span[text()=' My profile ']")private WebElement profile;
	 @FindBy(xpath="//span[text()='span[text()='Sign out']")private WebElement logout ;

	 WebDriver driver;
	 public PBMyaccPage(WebDriver driver)
	 {
		 PageFactory.initElements( driver,this);

	}
	 
	 public void PBMyaccPageprofile()
	 {
		 profile.click();
	 }
	 public void PBMyaccPagelogout()
	 {
		logout.click();
	 }

	

}
