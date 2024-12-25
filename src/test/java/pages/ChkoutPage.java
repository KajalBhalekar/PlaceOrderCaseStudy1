package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChkoutPage {
	
	@FindBy(id="first-name")
	WebElement fname;
	
	@FindBy(id="last-name")
	WebElement lname;
	
	@FindBy(id="postal-code")
	WebElement zipcode;
	
	@FindBy(id="continue")
	WebElement conBtn;
	
	@FindBy(css="button[data-test='finish']")
	WebElement finishBtn;
	
	@FindBy(css="h2.complete-header")
	WebElement successMsg;
	
	
	
	
	public ChkoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
//	public void provideDeatils() {
//		fname.sendKeys("ABC");
//		lname.sendKeys("XZY");
//		zipcode.sendKeys("441001");
//		
//	}
	
	public void provideDeatils(String strfName, String strlName,String pCode) {
		fname.sendKeys(strfName);
		lname.sendKeys(strlName);
		zipcode.sendKeys(pCode);
		conBtn.click();
		
	}
	
	public void checkoutOrder() {
		finishBtn.click();
	}
	
	public boolean isOrderSuccess() {
		return successMsg.isDisplayed();
	}
}
