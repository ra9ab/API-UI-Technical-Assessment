package LoginPagePkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import commonUtilis.CommonHelper;
import enums.Enums;

public class LoginPageHelper extends LoginPagePo {

	public LoginPageHelper(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void enterLoginEmail(String email) 
	{
		CommonHelper.sendText(loginEmail, email);	
	}

	public void enterLoginPassword(String password) 
	{
		CommonHelper.sendText(loginPassword, password);	
	}
	public void clickLoginButton()
	{
		CommonHelper.clickWhenReady(loginButton);
	}
	public void clickForgetPasswordlink()
	{
		CommonHelper.clickWhenReady(forgetPasswordLink);
	}

	public boolean isHomeButtonDisplayed()
	{
		return CommonHelper.isElementDisplayed(homeButton);
	}
	public void clickHomeButton()
	{
		CommonHelper.clickWhenReady(homeButton);
	}

	
}


