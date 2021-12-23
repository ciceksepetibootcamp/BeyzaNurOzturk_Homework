import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;

public class Test1 {
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
    public void addBasket() throws InterruptedException {
        driver.get("https://www.ciceksepeti.com/");
        driver.manage().window().setSize(new Dimension(1892, 1040));
        driver.findElement(By.className("js-subheader-close")).click();
        driver.findElement(By.xpath("(//input[@placeholder=\'Ürün veya kategori ara\'])[1]")).click();
        driver.findElement(By.xpath("(//input[@placeholder=\'Ürün veya kategori ara\'])[1]")).sendKeys("kitap");
        driver.findElement(By.xpath("(//input[@placeholder=\'Ürün veya kategori ara\'])[1]")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector(".products__item:nth-child(1) .products__item-img")).click();
        driver.findElement(By.cssSelector(".product__action-button-text")).click();
    }

    @Test
    public void takeOutOfBasket() throws InterruptedException {
        driver.get("https://www.ciceksepeti.com/");
        driver.manage().window().setSize(new Dimension(1892, 1040));
        Thread.sleep(2000);
        driver.findElement(By.className("js-subheader-close")).click();
        driver.findElement(By.xpath("(//input[@placeholder=\'Ürün veya kategori ara\'])[1]")).click();
        driver.findElement(By.xpath("(//input[@placeholder=\'Ürün veya kategori ara\'])[1]")).sendKeys("kitap");
        driver.findElement(By.xpath("(//input[@placeholder=\'Ürün veya kategori ara\'])[1]")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector(".products__item:nth-child(1) .products__item-img")).click();
        driver.findElement(By.cssSelector(".product__action-button-text")).click();
        driver.findElement(By.cssSelector(".cart__item-delete")).click();
        driver.findElement(By.cssSelector(".agree-button")).click();
    }


}