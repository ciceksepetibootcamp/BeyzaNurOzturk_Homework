import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.HashMap;
import java.util.Map;
public class Test2{
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/BeyzaOZTURK/Downloads/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @After
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void forgotPassword() {
        driver.get("https://www.ciceksepeti.com/uye-girisi");
        driver.manage().window().setSize(new Dimension(1892, 1040));
        driver.findElement(By.linkText("Şifremi Unuttum")).click();
        driver.findElement(By.id("Mail")).click();
        driver.findElement(By.id("Mail")).sendKeys("byztrkk@gmail.com");
        driver.findElement(By.cssSelector(".form-password-recovery__btn")).click();
    }
    @Test
    public void filterProduct() throws InterruptedException {
        driver.get("https://www.ciceksepeti.com/");
        driver.manage().window().setSize(new Dimension(1892, 1040));
        Thread.sleep(2000);
        driver.findElement(By.className("js-subheader-close")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("ÇİÇEK")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".dropdown:nth-child(2) .icon-right-arrow")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".dropdown:nth-child(2) .filter__dropdown-list:nth-child(7) > .filter__dropdown-label")).click();
        driver.findElement(By.cssSelector(".open .js-apply-filter-group-button")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Renk")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".dropdown:nth-child(4) .filter__dropdown-list:nth-child(2) > .filter__dropdown-label")).click();
        driver.findElement(By.cssSelector(".open .js-apply-filter-group-button")).click();
        Thread.sleep(2000);

    }
}

