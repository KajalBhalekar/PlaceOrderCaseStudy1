package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	
	@FindBy(css=".cart_list[data-test='cart-list']")
	WebElement cartList;
	
	@FindAll(value= @FindBy(css="div.cart.item"))
	WebElement items;
	
	@FindBy(xpath ="//button[@data-test='remove-sauce-labs-backpack']")
	WebElement rmvBtn;
	
	@FindBy(css="button[data-test='container-shopping']")
	WebElement contBtn;
	
	@FindBy(id="checkout")
	WebElement chkoutBtn ;
	
	
	
	public CartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public boolean isItemAdded() {
		
		return cartList.isDisplayed();
	}
	
	public void RmvItem() {
		rmvBtn.click();
	}
	
	public void checkoutItems() {
		chkoutBtn.click();
	}


}
