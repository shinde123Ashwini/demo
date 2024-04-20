package Framwork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	@FindBy(xpath="//div[text()=\"My Account\"]")private WebElement myacc;
	 WebDriver driver;
	 public HomePage(WebDriver driver)
	 {
		 PageFactory.initElements( driver,this);
		 this.driver=driver;

	}
	 public void clickPBMyaccPagemyacc()
	 {
		 Actions actioin=new Actions(driver);
		 actioin.moveToElement(myacc).perform();
	 }
	 
		 

}
