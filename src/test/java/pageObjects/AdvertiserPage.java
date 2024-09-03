package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdvertiserPage extends BasePage
{

	public AdvertiserPage(WebDriver driver)
	{
		super(driver);
	}
	
	private @FindBy(xpath = "//input[@placeholder='Enter a Business Name']")
	WebElement businessname_textfiels;
	
	private @FindBy(xpath = "//input[@placeholder='Enter Business VAT']")
	WebElement businessvat_textfield;
	
	private @FindBy(xpath = "//input[@placeholder='Enter Company Reg No']")
	WebElement companyregno_textfield;
	
	private @FindBy(xpath = "//input[@placeholder='Enter Postal Code']")
	WebElement postalcode_textfield;
	
	private @FindBy(xpath = "//input[@placeholder='Enter Address']")
	WebElement address_textfield;
	
	private @FindBy(xpath = "//input[@placeholder='Enter Website']")
	WebElement website_textfield;
	
	private @FindBy(xpath = "//input[@placeholder='Enter SubID']")
	WebElement subid_textfield;
	
	private @FindBy(xpath = "//h4[.='User Information']/../..//div//div//input[@placeholder='Enter Your First Name']")
	WebElement firstname_textfield;
	
	private @FindBy(xpath = "//h4[.='User Information']/../..//div//div//input[@placeholder='Enter Your Last Name']")
	WebElement lastname_textfield;
	
	private @FindBy(xpath = "//h4[.='User Information']/../..//div//div//input[@placeholder='Enter Job Title']")
	WebElement jobtitle_textfield;
	
	private @FindBy(xpath = "//h4[.='User Information']/../..//div//div//input[@placeholder='Enter Email Address']")
	WebElement email_textfield;
	
	private @FindBy(xpath = "//h4[.='User Information']/../..//div//div//input[@placeholder='Enter Telephone Number']")
	WebElement mobile_textfield;
	
	private @FindBy(xpath = "//button[contains(.,' Cancel ')]")
	WebElement cancel_button;
	
	private @FindBy(xpath = "//button[contains(.,' Add ')]")
	WebElement add_button;
	
	private @FindBy(xpath = "//div[@class='page-content']//h2")
	WebElement headingOn_updatePage;
	
	private @FindBy(xpath = "//button[.='OK']")
	WebElement okbutton_onConfirmationpopup;
	
	private @FindBy(xpath = "//button[.='Cancel']")
	WebElement cancelbutton_onConfirmationpopup;
	
	private @FindBy(xpath = "//a[.='Leads']")
	WebElement lead_tab;
//	@FindBy(xpath = "")WebElement ;
	
	
	public void setBusinessName(String businessName)
	{
		waitElementHelper(businessname_textfiels);
		businessname_textfiels.clear();
		businessname_textfiels.sendKeys(businessName);
	}
	
	public void setBusinessVat(String businessVat)
	{
		waitElementHelper(businessvat_textfield);
		businessvat_textfield.clear();
		businessvat_textfield.sendKeys(businessVat);
	}
	
	public void setCompanyRegNumber(String CompRegNumber)
	{
		waitElementHelper(companyregno_textfield);
		companyregno_textfield.clear();
		companyregno_textfield.sendKeys(CompRegNumber);
	}
	
	public void setPostalCode(String postalCode)
	{
		waitElementHelper(postalcode_textfield);
		postalcode_textfield.clear();
		postalcode_textfield.sendKeys(postalCode);
	}
	
	public void setAddress(String address)
	{
		waitElementHelper(address_textfield);
		address_textfield.clear();
		address_textfield.sendKeys(address);
	}
	
	public void setWebsite(String website)
	{
		waitElementHelper(website_textfield);
		website_textfield.clear();
		website_textfield.sendKeys(website);
	}
	
	public void setSubid(String subId)
	{
		waitElementHelper(subid_textfield);
		subid_textfield.clear();
		subid_textfield.sendKeys(subId);
	}
	
	public void setFirstName(String firstName)
	{
		waitElementHelper(firstname_textfield);
		firstname_textfield.clear();
		firstname_textfield.sendKeys(firstName);
	}
	
	public void setLastName(String lastName)
	{
		waitElementHelper(lastname_textfield);
		lastname_textfield.clear();
		lastname_textfield.sendKeys(lastName);
	}
	
	public void setJobTitle(String jobTitle)
	{
		waitElementHelper(jobtitle_textfield);
		jobtitle_textfield.clear();
		jobtitle_textfield.sendKeys(jobTitle);
	}
	
	public void setEmailAddress(String emailAddress)
	{
		waitElementHelper(email_textfield);
		email_textfield.clear();
		email_textfield.sendKeys(emailAddress);
	}
	
	public void setTelephone(String telePhone)
	{
		waitElementHelper(mobile_textfield);
		mobile_textfield.clear();
		mobile_textfield.sendKeys(telePhone);
	}
	
	public void clickOnCancelButton()
	{
		waitElementHelper(cancel_button);
		cancel_button.click();
	}
	
	public void clickOnAddButton()
	{
		scrollBottomofPage();
		waitElementHelper(add_button);
		try {
		add_button.click();
		}
		catch(org.openqa.selenium.ElementClickInterceptedException e)
		{
			add_button.click();
		}
	}
	
	public String getPageHeadingOnForm() throws InterruptedException
	{
		Thread.sleep(2000);
		waitElementHelper(headingOn_updatePage);
		return headingOn_updatePage.getText();
	}
	
	public void clicksOKbuttonOnConfirmationPopup() throws InterruptedException
	{
		waitElementHelper(okbutton_onConfirmationpopup);
		okbutton_onConfirmationpopup.click();
	}
	
	public void clicksCancelbuttonOnConfirmationPopup()
	{
		waitElementHelper(cancelbutton_onConfirmationpopup);
		cancelbutton_onConfirmationpopup.click();
	}
	
	
	//advertiser lead methods
	
	public void clickOnLeadTab()
	{
		waitElementHelper(lead_tab);
		lead_tab.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
