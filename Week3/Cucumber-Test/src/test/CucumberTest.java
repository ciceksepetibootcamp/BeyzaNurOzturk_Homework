package qatest;

import static org.junit.Assert.assertEquals;

import java.sql.Driver;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.*;
import junit.framework.Assert;
import cucumber.api.junit.*;
import cucumber.api.CucumberOptions;
import cucumber.api.java.en.*;
import cucumber.api.junit.Cucumber;
import cucumber.api.*;
import java.util.*;

@RunWith(Cucumber.class)
@cucumber.api.CucumberOptions(
		format = {"pretty","json:target/cucumbe"},
		features = "stc/qatest/"
		)

public class CucumberTest {
	WebDriver driver = null;
		
	@Given("^I am on the youtube website$")
	public void I_am_on_the_youtube_website() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		driver = new FirefoxDriver();
	    driver.navigate().to("https://www.youtube.com/");
	}

	@When("^I press the \"([^\"]*)\" button$")
	public void I_press_the_button(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
	}

	@And("^I enter the right username and password$")
	public void I_enter_the_right_username_and_password(DataTable table) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    // For automatic conversion, change DataTable to List<YourType>
		List<List<String>> data = table.raw();
		
		System.out.println(data.get(1).get(1));
		
		driver.findElement(By.id("Email")).sendKeys(data.get(0).get(1));
		driver.findElement(By.id("Passwd")).sendKeys(data.get(1).get(1));
	}
	
	@And("^press \"([^\"]*)\" button$")
	public void press_button(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
		driver.findElement(By.id("signIn")).click();
	}

	@And("^click the profile icon$")
	public void click_the_profile_icon() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		driver.findElement(By.id("yt-masthead-account-picker")).click();
	}
	//branded-page-module-title-text

	@And("^click \"([^\"]*)\" button$")
	public void press_button2(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    driver.findElement(By.partialLinkText("Popular Films Videos")).click();
	}

	
	@Then("^it will display the name of the user$")
	public void it_will_display_the_name_of_the_user() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		assertEquals("Timothy Lks", "Timoy Lks");	  
		}
	
	@Then("^it will display the video \"([^\"]*)\"$")
	public void it_will_display_the_video(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
		//assertEquals(driver.findElement(By.className("pl-video-title-link yt-uix-tile-link yt-uix-sessionlink  spf-link")),"Disney's Frozen Fever Trailer");
	      assertEquals("Disney's Frozen Fever Trailer", driver.findElement(By.linkText("Disy's Frozen Fever Trailer")).getText());
	}
	
	@And("^close browser$")
	public void close_browser() throws Throwable {
		driver.close();
	}

}
