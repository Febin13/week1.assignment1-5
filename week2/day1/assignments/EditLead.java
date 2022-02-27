package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		WebElement elementUsername = driver.findElement(By.id("username"));
		elementUsername.sendKeys("Demosalesmanager");
		WebElement elementPassword = driver.findElement(By.id("password"));
		elementPassword.sendKeys("crmsfa");
		WebElement elementLoginButton = driver.findElement(By.id("decorativeSubmit"));
		elementLoginButton.click();
		WebElement elementCRMFSA = driver.findElement(By.id("CRM/SFA"));
		elementCRMFSA.click();
		driver.findElement(By.linkText("Leads")).click();
		WebElement elementCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
		elementCompanyName.sendKeys("TechM");
		WebElement elementFirstName = driver.findElement(By.id("createLeadForm_firstName"));
		elementFirstName.sendKeys("Febin");
		WebElement elementSecondName = driver.findElement(By.id("createLeadForm_lastName"));
		elementSecondName.sendKeys("John");
		WebElement elementfirstNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
    	elementfirstNameLocal.sendKeys("Febin");
   		WebElement elementdepartmentName = driver.findElement(By.id("createLeadForm_departmentName"));
    	elementdepartmentName.sendKeys("Developer");
    	WebElement elementdescription = driver.findElement(By.id("createLeadForm_description"));
	    elementdescription.sendKeys("Devlead");
		WebElement elementemailAddress = driver.findElement(By.id("createLeadForm_primaryEmail"));
    	elementemailAddress.sendKeys("febinjohn@gmail.com");
    	WebElement elementstateProvince = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
    	elementstateProvince.sendKeys("NewYork");
    	WebElement elementCreateButton = driver.findElement(By.className("smallSubmit"));
    	elementCreateButton.click();	
		WebElement elementEditLeadButton = driver.findElement(By.linkText("Edit"));
        elementEditLeadButton.click();
        driver.findElement(By.id("updateLeadForm_description")).clear();
        WebElement elementImportantNote = driver.findElement(By.id("updateLeadForm_importantNote"));
		elementImportantNote.sendKeys("Devteamlead");
		WebElement elementUpdateButton = driver.findElement(By.className("smallSubmit"));
		elementUpdateButton.click();
	}

}
