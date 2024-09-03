package pageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ContactsPage extends BasePage
{
	
	public ContactsPage(WebDriver driver)
	{
		super(driver);
	}
	
	private @FindBy(xpath = "//input[@placeholder='Enter Business Name']")
	WebElement contactlistName_textfield;
	
	private @FindBy(xpath = "//input[@placeholder='Please Enter CPM payout price ']")
	WebElement cpmpayoutPrice_textfield;
	
	private @FindBy(xpath = "//input[@placeholder='Usage limit per day']")
	WebElement usagelimitperDay_textfield;
	
	private @FindBy(xpath = "//span[@id='basic-addon1']/img")
	WebElement uploadFile_field;
	
	private @FindBy(xpath = "//input[@placeholder='Enter default from name']")
	WebElement defaultfromName_textfield;
	
	private @FindBy(xpath = "//button[text()=' Go Back']")
	WebElement goback_button;
	
	private @FindBy(xpath = "//button[contains(.,' Add')]")
	WebElement addbutton_inform;
	
	private @FindBy(xpath = "//select[@formcontrolname='DropdownControl']")
	List<WebElement> mapping_dropdowns;
	
	
	
//	private @FindBy(xpath = "")WebElement ;
//	private @FindBy(xpath = "")WebElement ;
	
	
	public void setContactListName(String contactName)
	{
		waitElementHelper(contactlistName_textfield);
		contactlistName_textfield.clear();
		contactlistName_textfield.sendKeys(contactName);
	}
	
	public void setCpmPayoutprice(String cpmPrice)
	{
		waitElementHelper(cpmpayoutPrice_textfield);
		cpmpayoutPrice_textfield.clear();
		cpmpayoutPrice_textfield.sendKeys(cpmPrice);
	}
	
	public void setUsageLimitPerday(String usageLimit)
	{
		waitElementHelper(usagelimitperDay_textfield);
		usagelimitperDay_textfield.clear();
		usagelimitperDay_textfield.sendKeys(usageLimit);
	}
	
	public void setDefaultName(String defaultName)
	{
		waitElementHelper(defaultfromName_textfield);
		defaultfromName_textfield.clear();
		defaultfromName_textfield.sendKeys(defaultName);
	}
	
	public void clickOnGoBackButton()
	{
		waitElementHelper(goback_button);
		goback_button.click();
	}
	
	public void clickOnAddbuttonInform()
	{
		waitElementHelper(addbutton_inform);
		try {
		addbutton_inform.click();
		}catch(org.openqa.selenium.ElementClickInterceptedException e) {
			addbutton_inform.click();
		}
	}
	
	public void setFileUpload(String filePath) throws AWTException
	{
		waitElementHelper(uploadFile_field);
		uploadFile_field.click();
		
		Robot rob=new Robot();
		rob.delay(300);
		
		StringSelection copyFilepath = new StringSelection(filePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(copyFilepath, null);
		
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_V);
		
		rob.keyRelease(KeyEvent.VK_CONTROL);
		rob.keyRelease(KeyEvent.VK_V);
		
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public void setMappingDropdowns()
	{
		for(WebElement mapping:mapping_dropdowns)
		{
			Select sel=new Select(mapping);
			sel.selectByVisibleText("Email");
		}
	}
	
}
