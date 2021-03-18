package homePagePkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import commonUtilis.CommonHelper;

public class HomePageHelper extends HomePagePo{

	public HomePageHelper(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public void clickSignInButton()
	{
		CommonHelper.clickWhenReady(signInLink);
	}
	public void hovarOnFirstProductImg()
	{
		CommonHelper.hoverOverElement(productImg);
	}

	public void clickAddToCartButton()
	{
		CommonHelper.clickWhenReady(addToCartBtn);

	}

}
