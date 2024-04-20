package Framwork;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyProfilePage 
{
    @FindBy(xpath="//input[@id=\"-personName\"]")private WebElement fullname;
//    @FindBy(xpath="//input[@id=\"-mobNo\"]")private WebElement mobnum;
//    @FindBy(xpath="//input[@id=\"-personalEmail\"]")private WebElement emailId;
//    @FindBy(xpath="//input[@id=\"-personalEmail\"]")private WebElement dateOfBrith;
//    @FindBy(xpath="(//div[@id=\"outlined-secondary\"])[2]")private WebElement annualINcome;
//    @FindBy(xpath="")private WebElement materialStatus;
//    @FindBy(xpath="")private WebElement city;
//    @FindBy(xpath="")private WebElement savebtn;
      WebDriver driver;
//    
    public MyProfilePage (WebDriver driver)
    {
    	PageFactory.initElements( driver,this);
    	 this.driver=driver;
    }
    public void switchToChildWindow() 
	{
		Set<String> allIds = driver.getWindowHandles();
		ArrayList<String> al=new ArrayList(allIds);
		driver.switchTo().window(al.get(1));		
	}
    
    public String getMyProfilePageFullName() 
	{
		String actFullName = fullname.getAttribute("value");
		return actFullName;
	}
	
//    public void inpMyProfilePagemobnum()
//    {
//    	mobnum.sendKeys("9325730403");
//    }
//    public void inpMyProfilePageemailId()
//    {
//    	emailId.sendKeys("sashwini598@gmail.com");
//    }
//    public void inpMyProfilePagedateOfBrith()
//    {
//    	dateOfBrith.sendKeys("22/04/1997");
//    }
//    
    
    
   
    
	
		
	}



