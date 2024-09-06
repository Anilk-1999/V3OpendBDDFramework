
Feature: New Recurring Creation
 
  Background:
   Given The admin launches the browser
   When Enters the url as "https://v3opend.tech-active.com/auth/manage_opend"
   Then Verify that the admin is navigated to the opend website
   When Enters the email address as "admin@opend.com" and the password as "1234"
   And  Clicks on the sign in button
   Then Verify that the admin is navigated to the dashboard page with the confirmation message
   When Clicks on recurring from the side menu bar
   Then Verify that the admin is navigated to the recurring home page
   When Clicks on add new recurring button
   Then Verify that the admin should navigate to the new recurrings page
   And Verify the whether it is first step of campaign
 
  @Smoke
  Scenario: The admin creates a new recurring
   When Select an advertiser from advertiser dropdown
   And Select a business type
   And Enter a campaign name
   And Select a advertiser and publisher cast type
   And Select a campaign mode
   And Select a country from campaign country dropdown
   And Select a audience type from audience type dropdown
   And Select a campaign sector from campaign sector popup dropdown
   And Select a publishers from publisher popup dropdown
   And Clicks on proceed button in first step of recurring
   
   #2nd step of recurring -- recurring template
   Then verify that the admin should be redirected to second step of campaign
   When Select a campaign type
   And Enters subject name into subject textfield
   And Enters template into email body area
   And Clicks on proceed button in second step of recurring
   
  #3nd step of recurring -- Choose Audience
   Then Verify that the admin should be redirected to third step of campaign
   When Select a gender
   And Select a location
   And Select a region
   And Select a town
   And Select a default email domain
   And Disable audience option
   And Enters the budget per day
   And Clicks on proceed button in third step of recurring
   
   #4nd step of recurring -- Targeting & Send
   Then Verify that the admin should be redirected to fourth step of campaign
   When Select a email deliverability
   And Select a email scheduling
   And Click on schedule campaign button
   Then The new recurring should be successfully created with confirmation message
   And The admin should be redirected to recurring home page
   When Clicks on the profile icon
   And Clicks on logout button
   Then Ensure that the admin successfully logout from admin portal with the confirmation message
   And Close the browser
   
   
  @Regression
  Scenario: The admin creates a life time recurring
   When Select an advertiser from advertiser dropdown
   And Select a business type
   And Enter a campaign name
   And Select a advertiser and publisher cast type
   And Select a campaign mode
   And Select a country from campaign country dropdown
   And Select a audience type from audience type dropdown
   And Select a campaign sector from campaign sector popup dropdown
   And Select a publishers from publisher popup dropdown
   And Clicks on proceed button in first step of recurring
   
   #2nd step of recurring -- recurring template
   Then verify that the admin should be redirected to second step of campaign
   When Select a campaign type
   And Enters subject name into subject textfield
   And Enters template into email body area
   And Clicks on proceed button in second step of recurring
   
   #3nd step of recurring -- Choose Audience
   Then Verify that the admin should be redirected to third step of campaign
   When Select a gender
   And Select a location
   And Select a region
   And Select a town
   And Select a default email domain
   And Disable audience option
   And Enters the budget per day
   And Clicks on proceed button in third step of recurring
   
   #4nd step of recurring -- Targeting & Send
   Then Verify that the admin should be redirected to fourth step of campaign
   When Select a email deliverability
   And Select a life time email scheduling
   And Select a schedule date and start time and select schedule days
   And Click on start campaign button
   Then The new recurring should be successfully created with confirmation message
   And The admin should be redirected to recurring home page
   When Clicks on the profile icon
   And Clicks on logout button
   Then Ensure that the admin successfully logout from admin portal with the confirmation message
   And Close the browser
   
   
  @Regression
  Scenario: The admin creates a life time recurring with standard domain
   When Select an advertiser from advertiser dropdown
   And Select a business type
   And Enter a campaign name
   And Select a advertiser and publisher cast type
   And Select a campaign mode
   And Select a country from campaign country dropdown
   And Select a audience type from audience type dropdown
   And Select a campaign sector from campaign sector popup dropdown
   And Select a publishers from publisher popup dropdown
   And Clicks on proceed button in first step of recurring
   
  # #2nd step of recurring -- recurring template
   Then verify that the admin should be redirected to second step of campaign
   When Select a campaign type
   And Enters subject name into subject textfield
   And Enters template into email body area
   And Clicks on proceed button in second step of recurring
   
  # #3nd step of recurring -- Choose Audience
   Then Verify that the admin should be redirected to third step of campaign
   When Select a gender
   And Select a location
   And Select a region
   And Select a town
   And Select a standard email domain
   And Disable audience option
   And Enters the budget per day
   And Clicks on proceed button in third step of recurring
   
   ##4nd step of recurring -- Targeting & Send
   Then Verify that the admin should be redirected to fourth step of campaign
   When Select a email deliverability
   And Select a life time email scheduling
   And Select a schedule date and start time and select schedule days
   And Click on start campaign button
   Then The new recurring should be successfully created with confirmation message
   And The admin should be redirected to recurring home page
   When Clicks on the profile icon
   And Clicks on logout button
   Then Ensure that the admin successfully logout from admin portal with the confirmation message
   And Close the browser 
   
   
   
   
   
   
   
   
   
   
   
   