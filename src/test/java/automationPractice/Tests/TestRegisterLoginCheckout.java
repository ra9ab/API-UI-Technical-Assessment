package automationPractice.Tests;

import Driver.DriverSetup;
import LoginPagePkg.LoginPageHelper;
import cartCheckoutPagePkg.CartCheckoutPageHelper;
import commonUtilis.CommonHelper;
import commonUtilis.RandomSource;
import enums.Enums;
import homePagePkg.HomePageHelper;
import registrationpagePkg.RegistrationPageHelper;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestRegisterLoginCheckout extends DriverSetup {
	
	LoginPageHelper loginPageObj ; 
	HomePageHelper homePageObj ; 
	RegistrationPageHelper registrationPageObj ; 
	CartCheckoutPageHelper cartCheckoutobj ; 


	String email = RandomSource.getValidEmail();
	String firstName = RandomSource.getValidName();
	String lastName = RandomSource.getValidName();
	String password = RandomSource.getValidName();
	String addFirstName = RandomSource.getValidName();
	String addLastName = RandomSource.getValidName();
	String company = RandomSource.getValidName();
	String address1 = RandomSource.getValidName();
	String address2 = RandomSource.getValidName();
	String city = RandomSource.getValidName();
	String postalCode = RandomSource.getValidPostalCode();
	String additionalInfo = RandomSource.getValidName();
	String homeNumber= RandomSource.getValiHomeNumber();
	String mobileNumber = RandomSource.getValidPhoneNumber();
	String aliasaddress = RandomSource.getValidName();


	@BeforeTest()
	void initiate() {
		DriverSetup.driverConf();
		driver.manage().window().maximize();
		loginPageObj= new LoginPageHelper(driver);
		homePageObj = new HomePageHelper(driver);
		registrationPageObj = new RegistrationPageHelper(driver);
		cartCheckoutobj= new CartCheckoutPageHelper(driver);

	}

	@Test(priority = 1,enabled= true)
	void registerUsingValidData() {
		CommonHelper.openWebPage("http://automationpractice.com/index.php");

		homePageObj.clickSignInButton();
		registrationPageObj.enterEmail(email);
		registrationPageObj.clickCreateAccountButton();
		registrationPageObj.enterGender(Enums.Gender.male);
		registrationPageObj.enterFirstName(firstName);
		registrationPageObj.enterLastName(lastName);
		registrationPageObj.enterPassword(password);
		registrationPageObj.enterDay("1");
		registrationPageObj.enterMonth("12");
		registrationPageObj.enterYear("1993");
		registrationPageObj.enterAddressFirstName(addFirstName);
		registrationPageObj.enterAddressLastName(addLastName);
		registrationPageObj.enterCompany(company);
		registrationPageObj.enterAddress1(address1);
		registrationPageObj.enterAddress2(address2);
		registrationPageObj.enterCity(city);
		registrationPageObj.enterState("1");
		registrationPageObj.enterPostalCode(postalCode);
		registrationPageObj.enterCountry("21");
		registrationPageObj.enterAdditionalInfo(additionalInfo);
		registrationPageObj.enterHomeNumber(homeNumber);
		registrationPageObj.enterMobileNumber(mobileNumber);
		registrationPageObj.enterAliasAddress(aliasaddress);
		registrationPageObj.clickRegisterButton();
		assertTrue(registrationPageObj.isLogoutButtonDisplayed());


	}
	@Test(priority =2 )
	public void loginUsingValidEmailAndPassword()
	{
		registrationPageObj.clickSignOutButton();
		homePageObj.clickSignInButton();
		loginPageObj.enterLoginEmail(email);
		loginPageObj.enterLoginPassword(password);
		loginPageObj.clickLoginButton();
		assertTrue(loginPageObj.isHomeButtonDisplayed());

	}

	@Test(priority =3 )
	public void cartCheckout()
	{			
		loginPageObj.clickHomeButton();
		homePageObj.hovarOnFirstProductImg();
		homePageObj.clickAddToCartButton();
		cartCheckoutobj.clickProceedToCheckoutButton1();
		cartCheckoutobj.clickProceedToCheckoutButton2();
		cartCheckoutobj.clickProceedToCheckoutButton3();
		cartCheckoutobj.checkAgreeterms();
		cartCheckoutobj.clickProceedToCheckoutButton4();
		cartCheckoutobj.clickPayByCheque();
		cartCheckoutobj.clickConfirmMyOrder();
		assertEquals(cartCheckoutobj.getSuccessMessage(), "Your order on My Store is complete.");
	}



	@AfterTest()
	void closure() {
			driver.quit();
	}
}
