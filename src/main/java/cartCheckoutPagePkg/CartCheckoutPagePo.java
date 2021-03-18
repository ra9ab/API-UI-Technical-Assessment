package cartCheckoutPagePkg;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartCheckoutPagePo {

	@FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
	WebElement proceedToCheckoutBtn1;

	@FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]")
	WebElement proceedToCheckoutBtn2;

	@FindBy(name = "processAddress")
	WebElement proceedToCheckoutBtn3;

	@FindBy(id = "uniform-cgv")
	WebElement agreeTermsCheckbox;

	@FindBy(name = "processCarrier")
	WebElement proceedToCheckoutBtn4;

	@FindBy(className = "cheque")
	WebElement payByCheque;

	@FindBy(xpath = "//button//span[contains(text(),'confirm')]")
	WebElement confirmMyOrderButton;

	@FindBy(xpath =  "//div[@id='center_column']//p[@class ='alert alert-success']")
	WebElement successMessage;


}
