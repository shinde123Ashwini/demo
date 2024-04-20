package Framwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBLoginPage 
{
	//step-1 declaration
	 @FindBy(xpath="//a[text()='Sign in']") private WebElement signIn;
	 
	 public PBLoginPage(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
		 
	 }
	  public void ClickPBLoginPagesignIn()
	  {
		  signIn.click(); 
	  }
	}


