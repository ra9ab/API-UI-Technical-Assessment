package cartCheckoutPagePkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import commonUtilis.CommonHelper;

public class CartCheckoutPageHelper  extends CartCheckoutPagePo{

	public CartCheckoutPageHelper(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickProceedToCheckoutButton1()
	{
		CommonHelper.clickWhenReady(proceedToCheckoutBtn1);

	}
	public void clickProceedToCheckoutButton2()
	{
		CommonHelper.clickWhenReady(proceedToCheckoutBtn2);

	}

	public void clickProceedToCheckoutButton3()
	{
		CommonHelper.clickWhenReady(proceedToCheckoutBtn3);

	}


	public void checkAgreeterms()
	{

		CommonHelper.clickWhenReady(agreeTermsCheckbox);
	}

	public void clickProceedToCheckoutButton4()
	{
		CommonHelper.clickWhenReady(proceedToCheckoutBtn4);

	}

	public void clickPayByCheque()
	{
		CommonHelper.clickWhenReady(payByCheque);

	}

	public void clickConfirmMyOrder()
	{
		CommonHelper.clickWhenReady(confirmMyOrderButton);
	}

	public String getSuccessMessage()
	{
		return CommonHelper.getText(successMessage);
	}

}
