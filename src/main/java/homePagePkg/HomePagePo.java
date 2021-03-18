package homePagePkg;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePagePo {

	@FindBy(className = "login")
	WebElement signInLink;

	@FindBy(xpath = "//a[@class='product_img_link']//img")
	WebElement productImg;

	@FindBy(linkText = "Add to cart")
	WebElement addToCartBtn;

	

}
