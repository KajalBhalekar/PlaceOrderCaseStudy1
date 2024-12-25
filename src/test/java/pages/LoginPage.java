package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//PageFactory pattern
	@FindBy(id = "user-name")
	WebElement username;
	
	@FindBy(id = "password")
	WebElement pwd;
	
	@FindBy(id = "login-button")
	WebElement loginBtn;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void validLogin(String strUser, String strPwd) {
		username.sendKeys(strUser);
		pwd.sendKeys(strPwd);
		loginBtn.click();
		
	}
}
