package registrationpagePkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import commonUtilis.CommonHelper;
import enums.Enums;

public class RegistrationPageHelper extends RegistrationPagePo{
	public RegistrationPageHelper(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickSignOutButton()
	{
		CommonHelper.clickWhenReady(logOutButton);
	}



	/* sign in screen elements*/	

	public void clickCreateAccountButton()
	{
		CommonHelper.clickWhenReady(createAccountButton);
	}


	public void enterEmail(String email) 
	{
		CommonHelper.sendText(emailAddressField, email);	
	}



	
	/* register screen elements*/	

	public void enterGender(Enums.Gender sex) {
		if (sex == Enums.Gender.male) {
			CommonHelper.clickWhenReady(maleRadioButton);
		} else if (sex == Enums.Gender.female) {
			CommonHelper.clickWhenReady(femaleRadioButton);
		}
	}

	public void enterFirstName(String name) 
	{
		CommonHelper.sendText(firstname, name);	
	}

	public void enterLastName(String name) 
	{
		CommonHelper.sendText(lastName, name);	
	}

	public void enterPersonalEmail(String email) 
	{
		CommonHelper.sendText(emailField, email);	
	}

	public void enterPassword(String pass) 
	{
		CommonHelper.sendText(password, pass);	
	}

	public void enterDay(String dobDay) 
	{
		Select day = new Select(dobDayDropDown);
		day.selectByValue(dobDay);
	}
	public void enterMonth(String dobMonth) 
	{
		Select day = new Select(dobMonthDropDown);
		day.selectByValue(dobMonth);
	}
	public void enterYear(String dobYear) 
	{
		Select day = new Select(dobYearsDropDown);
		day.selectByValue(dobYear);
	}

	public void enterAddressFirstName(String name) 
	{
		CommonHelper.sendText(addressFirstName, name);	
	}

	public void enterAddressLastName(String name) 
	{
		CommonHelper.sendText(addressLastName, name);	
	}

	public void enterCompany(String companyName) {
		CommonHelper.sendText(addressCompany, companyName);	

	}

	public void enterAddress1(String address) {
		CommonHelper.sendText(address1, address);	

	}

	public void enterAddress2(String address) {
		CommonHelper.sendText(address2, address);	

	}

	public void enterCity(String addressCity) {
		CommonHelper.sendText(city, addressCity);	

	}

	public void enterState(String addressState) 
	{
		Select stateobj = new Select(state);
		stateobj.selectByValue(addressState);
	}


	public void enterPostalCode(String zipCode) {
		CommonHelper.sendText(postalCode, zipCode);	

	}

	public void enterCountry(String addressCountry) 
	{
		Select countryObj = new Select(country);
		countryObj.selectByValue(addressCountry);
	}

	public void enterAdditionalInfo(String info) {
		CommonHelper.sendText(addotionalInfo, info);	

	}

	public void enterHomeNumber(String homeNumber) {
		CommonHelper.sendText(homePhone, homeNumber);	

	}

	public void enterMobileNumber(String mobileNumber) {
		CommonHelper.sendText(mobilePhone, mobileNumber);	

	}

	public void enterAliasAddress(String aliasAdd) {
		CommonHelper.sendText(aliasAddress, aliasAdd);	

	}

	public void clickRegisterButton()
	{
		CommonHelper.clickWhenReady(registerButton);

	}


	public boolean isLogoutButtonDisplayed()
	{
		return CommonHelper.isElementDisplayed(logOutButton);
	}



}
