package registrationpagePkg;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPagePo {
	@FindBy(id = "email_create")
	WebElement emailAddressField;

	@FindBy(id = "SubmitCreate")
	WebElement createAccountButton;

	@FindBy(id = "id_gender1")
	WebElement maleRadioButton;

	@FindBy(id = "id_gender2")
	WebElement femaleRadioButton;



	@FindBy(id = "customer_firstname")
	WebElement firstname;


	@FindBy(id = "customer_lastname")
	WebElement lastName ;

	@FindBy(id = "email")
	WebElement emailField;

	@FindBy(id = "passwd")
	WebElement password ;

	@FindBy(id = "days")
	WebElement dobDayDropDown ;

	@FindBy(id = "months")
	WebElement dobMonthDropDown ;

	@FindBy(id = "years")
	WebElement dobYearsDropDown ;

	@FindBy(id = "firstname")
	WebElement addressFirstName  ;

	@FindBy(id = "lastname")
	WebElement addressLastName ;

	@FindBy(id = "company")
	WebElement addressCompany ;

	@FindBy(id = "address1")
	WebElement address1;

	@FindBy(id = "address2")
	WebElement address2;

	@FindBy(id = "city")
	WebElement city;

	@FindBy(id = "id_state")
	WebElement state ;

	@FindBy(id = "postcode")
	WebElement postalCode ;

	@FindBy(id = "id_country")
	WebElement country;

	@FindBy(id = "other")
	WebElement addotionalInfo ;

	@FindBy(id = "phone")
	WebElement homePhone ;

	@FindBy(id = "phone_mobile")
	WebElement mobilePhone ;

	@FindBy(id = "alias")
	WebElement aliasAddress ;

	@FindBy(id = "submitAccount")
	WebElement registerButton ;

	@FindBy(className = "logout")
	WebElement logOutButton;





}
