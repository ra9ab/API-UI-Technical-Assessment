package LoginPagePkg;

import java.awt.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPagePo {

	@FindBy(id="email")
	WebElement loginEmail;

	@FindBy(id="passwd")
	WebElement loginPassword;

	@FindBy(linkText = "Forgot your password?")
	WebElement forgetPasswordLink;

	@FindBy(id="SubmitLogin")
	WebElement loginButton;
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/a")
	WebElement homeButton;

}
