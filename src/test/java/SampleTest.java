import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTest {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp(){
		driver = new ChromeDriver();
	}
	
	@Test
	public void testFormSubmission() {
		// Open the webpage
        driver.get("https://www.w3schools.com/html/html_forms.asp");

        //driver.findElement(By.id("fname")).sendKeys("John");
        //driver.findElement(By.id("fname")).sendKeys("Doe");
        
     // Fill out form fields
        WebElement nameField = driver.findElement(By.xpath("//input[@name='fname']"));
        nameField.sendKeys("John Doe");

        //WebElement emailField = driver.findElement(By.xpath("//input[@name='email']"));
        //emailField.sendKeys("john@example.com");

        // Submit the form
        WebElement submitButton = driver.findElement(By.xpath("/html/body/div[5]/div[1]/div[1]/div[3]/div/form/input[3]"));
        submitButton.click();

        // Verify successful submission
        //WebElement successMessage = driver.findElement(By.xpath("//div[@id='main']/h2"));
        //Assert.assertEquals(successMessage.getText(), "The form was successfully submitted!");
	}
	
	 @AfterTest
	    public void tearDown() {
	        // Close the browser
	        driver.quit();
	    }
}
