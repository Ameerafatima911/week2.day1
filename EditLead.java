package week2.selenium.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class EditLead {

		public static void main(String[] args) {
			
			WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("http://leaftaps.com/opentaps/control/main");
			
			driver.manage().window().maximize();
			
			String title = driver.getTitle();
			System.out.println(title);
		
			driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

			driver.findElement(By.id("password")).sendKeys("crmsfa");
		
			driver.findElement(By.className("decorativeSubmit")).click();
			
			
			driver.findElement(By.linkText("CRM/SFA")).click();
			
			
			driver.findElement(By.linkText("Create Lead")).click();
			
			
				driver.findElement(By.linkText("Create Lead")).click();
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Skillsoft");
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ameera");
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Fatima");
				driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("QA");
				driver.findElement(By.id("createLeadForm_description")).sendKeys("Create Lead Description");
				driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ameerafatima351@gmail.com");
				driver.findElement(By.name("submitButton")).click();

				
				driver.findElement(By.linkText("Edit")).click();

				
				driver.findElement(By.id("updateLeadForm_description")).clear();
				

				
				driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("This is Checking for Important Note Field");

			
				driver.findElement(By.name("submitButton")).click();

				System.out.println(driver.getTitle());
	}
	}


