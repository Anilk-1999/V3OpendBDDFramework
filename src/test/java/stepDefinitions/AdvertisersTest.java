package stepDefinitions;

import java.util.Arrays;
import org.testng.Assert;
import io.cucumber.java.en.*;
import pageObjects.AdvertiserPage;
import pageObjects.CampaignsPage;
import pageObjects.SignInPage;
import testBase.BaseClass;

public class AdvertisersTest extends BaseClass
{

	@When("Clicks on advertisers from the side menu bar")
	public void clicks_on_advertisers_from_the_side_menu_bar()
	{
	   
			campaignsPage=new CampaignsPage(driver);
			signin=new SignInPage(driver);
			advertiserPage=new AdvertiserPage(driver);
		    campaignsPage.clickonSideMainMenuBar("Advertisers");
	}

	@Then("Verify that the admin is navigated to the advertisers home page")
	public void verify_that_the_admin_is_navigated_to_the_advertisers_home_page() throws InterruptedException 
	{
	    Assert.assertEquals(signin.getPageHeading(),"Manage Advertisers");
	}

	@When("Clicks on add new advertiser button")
	public void clicks_on_add_new_advertiser_button()
	{
	    campaignsPage.clickonAddButton();
	}

	@Then("Verify that the admin should navigate to the add advertiser page")
	public void verify_that_the_admin_should_navigate_to_the_add_advertiser_page() throws InterruptedException 
	{
	   Assert.assertEquals(advertiserPage.getPageHeadingOnForm(),"Add Advertiser");
	}

	@When("Enters a business name into business name textfield")
	public void enters_a_business_name_into_business_name_textfield() 
	{
		if(advertiserPage==null)
		{
			advertiserPage=new AdvertiserPage(driver);
		}
	   
	   advertiserPage.setBusinessName(setRandomBusinessName());
	}

	@When("Enter a business vat into business vat textfild")
	public void enter_a_business_vat_into_business_vat_textfild() 
	{
		advertiserPage.setBusinessVat("2");
	}

	@When("Select a country from country dropdown")
	public void select_a_country_from_country_dropdown()
	{
		if(campaignsPage==null)
		{
			campaignsPage=new CampaignsPage(driver);
		}
	    campaignsPage.selectOptionInDropdown("Select Your Country", "United Kingdom");
	}

	@When("Select a city from city dropdown")
	public void select_a_city_from_city_dropdown() 
	{
		 campaignsPage.selectOptionInDropdown("Select Your City", "London");
	}

	@When("Enters a subid into subid textfield")
	public void enters_a_subid_into_subid_textfield()
	{
	    advertiserPage.setSubid("GG78");
	}

	@When("Select a functional area from functional area dropdown")
	public void select_a_functional_area_from_functional_area_dropdown()
	{
	    campaignsPage.selectOptionInDropdown("Select Functional Area", "Billing");
	}

	@When("Select a industry from industry dropdown popup")
	public void select_a_industry_from_industry_dropdown_popup() 
	{
		options=Arrays.asList("Test industry","Agency");
	    campaignsPage.SelectOptionInPopupDropdown("Select Industry", options, "test");
	}

	@When("Select a timezone from timezone dropdown")
	public void select_a_timezone_from_timezone_dropdown() throws InterruptedException 
	{
		if (advertiserPage.getPageHeadingOnForm().equalsIgnoreCase("Add Advertiser")) {
			campaignsPage.selectOptionInDropdown("Enter TimeZone", "Europe/London");
		} else if (advertiserPage.getPageHeadingOnForm().equalsIgnoreCase("Add Publisher")) {
			campaignsPage.selectOptionInDropdown("Select Your timezone", "Europe/London");
		} else {
			campaignsPage.selectOptionInDropdown("Select TimeZone", "Europe/London");
		}
	    
	}

	@When("Enters the first name")
	public void enters_the_first_name()
	{
		advertiserPage.setFirstName(setRandomFirstName());
	}
	
	@When("Enters the last name")
	public void enters_the_last_name()
	{
		advertiserPage.setLastName(setRandomLastName());
	}
	
	@When("Enters the email address")
	public void enters_the_email_address()
	{
		advertiserPage.setEmailAddress(setRandomEmail());
	}
	
	@When("Clicks on Add button")
	public void clicks_on_add_button() 
	{
	    advertiserPage.clickOnAddButton();
	}
	
	@When("Clicks on ok button on confirmation popup")
	public void clicks_on_ok_button_on_confirmation_popup() throws InterruptedException
	{
		if(advertiserPage==null)
		{
			advertiserPage=new AdvertiserPage(driver);
		}
		advertiserPage.clicksOKbuttonOnConfirmationPopup();
	}

	@Then("Verify that the new advertiser successfully created with the confirmation message")
	public void verify_that_the_new_advertiser_successfully_created_with_the_confirmation_message() throws InterruptedException 
	{
//	   Assert.assertEquals(signin.getConfirmationMessge(), "Advertiser added successfully");
	}

	@Then("Verify that the admin is redirected to advertiser home page")
	public void verify_that_the_admin_is_redirected_to_advertiser_home_page() throws InterruptedException 
	{
		Assert.assertEquals(signin.getPageHeading(), "Manage Advertisers");
	}

	@Then("Ensure that the newly created advertiser is displayed on the advertiser home page")
	public void ensure_that_the_newly_created_advertiser_is_displayed_on_the_advertiser_home_page() 
	{
	    
	}
	
	@Then("Verify the table should display only advertisers with the status {string} from {string} column")
	public void verify_the_table_should_display_only_advertisers_with_the_status_from_column(String expectedData, String columnName) throws InterruptedException
    {
		campaignsPage.verifyDynomicTableWithPagination(columnName, expectedData);
	}
	
	
}
