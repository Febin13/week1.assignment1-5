package week2.day1.assignments;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumBasics {

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
		driver.findElement(By.className("smallSubmit")).click();

		// WebElement elementDropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		// elementDropdown.sendKeys("Employee");
		// Select dd = new Select(WebElement);
		// dd.selectByVisibleText("Employee");
		// WebElement elementSelectedOption = dd.getFirstSelectedOption();
		// System.out.println(elementSelectedOption.getText());

		// List<WebElement> options = dd.getOptions();
		//for(int i=0;i<options.size();i++){
			// options.get(i).getText();
		//}

		// dd.selectByIndex(2);
		// dd.selectByValue("LEAD_PR");
	}

}
