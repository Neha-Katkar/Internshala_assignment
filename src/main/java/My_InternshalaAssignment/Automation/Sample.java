package My_InternshalaAssignment.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Sample {
   
   WebDriver driver;
   
   @BeforeClass
   public void setUp() {
       // Initialize WebDriver
       driver = new ChromeDriver();
   }
   
    @Test
    public void login() {
        // Navigate to the application
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        // Perform actions
        WebElement radiobutton = driver.findElement(By.xpath("//input[@value='radio1']"));
        radiobutton.click();
        
        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("India");
            	 
     }
          

    @AfterClass
    public void quit() {
        // Close the browser
        driver.quit();
    }
}
