package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	
	@FindBy(css="div-cart_item")
	WebElement cartList;
	
	@FindAll(value= @FindBy(css="div.cart.item"))
	WebElement items;
	
	@FindBy(id="remove-sauce-labs-backpack")
	WebElement rmvBtn;
	
	@FindBy(css="button[data-test='container-shopping']")
	WebElement contBtn;
	
	@FindBy(id="checkout")
	WebElement chkoutBtn ;
	
	//Actions
	//verify element is added
	//Remove item
	//Continue Shopping
	// Checkout
	
	public CartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public boolean isItemAdded() {
		//Method1
		return cartList.isDisplayed();
	}
	
	public void checkoutItems() {
		chkoutBtn.click();
	}

}
