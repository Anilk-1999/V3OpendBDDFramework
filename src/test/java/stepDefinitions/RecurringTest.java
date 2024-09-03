package stepDefinitions;

import java.util.Arrays;

import org.testng.Assert;

import io.cucumber.java.en.*;
import pageObjects.CampaignsPage;
import pageObjects.SignInPage;
import testBase.BaseClass;

public class RecurringTest extends BaseClass
{
	@When("Clicks on recurring from the side menu bar")
	public void clicks_on_recurring_from_the_side_menu_bar() 
	{
	   campaignsPage=new CampaignsPage(driver);
	   campaignsPage.clickonSideMainMenuBar("Recurring");
	}

	@Then("Verify that the admin is navigated to the recurring home page")
	public void verify_that_the_admin_is_navigated_to_the_recurring_home_page() throws InterruptedException 
	{
	    signin=new SignInPage(driver);
	    Assert.assertEquals(signin.getPageHeading(), "Recurring");
	}

	@When("Clicks on add new recurring button")
	public void clicks_on_add_new_recurring_button() 
	{
	   campaignsPage.clickonAddButton();
	}

	@Then("Verify that the admin should navigate to the new recurrings page")
	public void verify_that_the_admin_should_navigate_to_the_new_recurrings_page() throws InterruptedException 
	{
	    Assert.assertEquals(signin.getPageHeading(), "New Recurring");
	}

	@When("Select a campaign sector from campaign sector popup dropdown")
	public void Select_campaign_sector_from_campaign_sector()
	{
	   options=Arrays.asList("Car Insurance");
	   campaignsPage.SelectOptionInPopupDropdown("Select Campaign Sector", options, "test");
	}
	
	@When("Clicks on proceed button in first step of recurring")
	public void Clicks_on_proceed_button_in_first_step_of_recurring()
	{
		campaignsPage.clickOnProceedButtonOnRecurring();
	}
	
	@When("Clicks on proceed button in second step of recurring")
	public void Clicks_on_proceed_button_in_second_step_of_recurring()
	{
		campaignsPage.clickOnProceedButtonOnFirststep();
	}
	
	@When("Enters the budget per day")
	public void enters_the_budget_per_day() 
	{
	    campaignsPage.setBudgetPerday("5");
	}

	@When("Clicks on proceed button in third step of recurring")
	public void Clicks_on_proceed_button_in_third_step_of_recurring()
	{
        campaignsPage.clickOnProceedButtonOnRecurringThirdStep();	
	}
	
	@Then("The new recurring should be successfully created with confirmation message")
	public void the_new_recurring_should_be_successfully_created_with_confirmation_message() throws InterruptedException 
	{
	   Assert.assertEquals(signin.getConfirmationMessge(), "Recurring Created Successfully");
	}

	@Then("The admin should be redirected to recurring home page")
	public void the_admin_should_be_redirected_to_recurring_home_page() throws InterruptedException 
	{
	   Assert.assertEquals(signin.getPageHeading(), "Recurring");
	}

	/*-----------------------------------Update recurring-------------------------------------*/
	
	@Then("The recurring updated successfully with confirmation message")
	public void The_recurring_updated_successfully_with_confirmation_message() throws InterruptedException
	{
		Assert.assertEquals(signin.getConfirmationMessge(), "Recurring Updated Successfully");
	}
	
}
