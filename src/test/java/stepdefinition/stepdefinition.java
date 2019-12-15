package stepdefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
public class stepdefinition {
	
	public static WebDriver driver;

    @Given("^User is on landing page$")
    public void user_is_on_landing_page() throws Throwable {
     
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver.exe");
    	 driver=new ChromeDriver();
    	 driver.get("https://www.vodafone.com/");
    	
    }

    @When("^User clicks the link$")
    public void user_clicks_the_link() throws Throwable {
        
    	driver.findElement(By.linkText("Careers "));
    	Thread.sleep(2000);
    }

    @Then("^Navigates to next page$")
    public void navigates_to_next_page() throws Throwable {
      System.out.println(driver.getTitle());
        
    }

}