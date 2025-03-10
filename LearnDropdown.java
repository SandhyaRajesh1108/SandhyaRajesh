package Week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropdown {

	public static void main(String[] args) {
		
		/**
		 * steps to handle the dropdown
		 * 1)identify whether the DD element is present inside the select tag
		 * 2)if the DD is present inside the select tag then locate the element and store it ina local variable.
		 * 3)use the select class and create an object,using this object  access the methods by
		 *  a)select by visible text
		 *  b)select by index
		 *  3)select by value
		 */
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		 String title = driver.getTitle(); 
		 System.out.println(title);
		 
		 driver.findElement(By.id("username")).sendKeys("democsr");
		 
		 WebElement pwrd = driver.findElement(By.id("password"));
		 pwrd.sendKeys("crmsfa");
		 
		 //click on login
		 driver.findElement(By.className("decorativeSubmit")).click();
		 
		 driver.findElement(By.partialLinkText("CRM")).click();
		 //click on leads
		 driver.findElement(By.linkText("Leads")).click();
		 //click on createlead
		 driver.findElement(By.partialLinkText("Create")).click();
		 //enter company name
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Amazon");
		 //enter the firstName
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sandhya");
		 //enter the lastName
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajesh");
		 
		 //click source dropdown
		 WebElement sourcedd = driver.findElement(By.id("createLeadForm_dataSourceId"));
		 //instantiate my select class
		 Select sel=new Select(sourcedd);//shortcut for import the class is ctrl+shift+o
		 sel.selectByIndex(4);
		 //Click 
		 
		 //click Marketing Campaign DD
		 WebElement marketingcampaigndd = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		 //instantiate my select class
		 Select dd2=new Select(marketingcampaigndd);
		 dd2.selectByVisibleText("Automobile");
		 
		//click Ownership DD
		 WebElement Ownershipdd = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		 //instantiate my select class
		 Select dd3=new Select(Ownershipdd);
		 dd3.selectByValue("OWN_CCORP");
		
		//click Industry DD
		 WebElement industrydd = driver.findElement(By.id("createLeadForm_industryEnumId"));
		 //instantiate my select class
		 Select dd4=new Select(industrydd);
		 dd4.selectByVisibleText("General Services");
		 
		 //Close the window
		 driver.close();
		 
	}
	
	
}
