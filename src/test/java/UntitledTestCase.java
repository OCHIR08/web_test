import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.*;

public class UntitledTestCase {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "https://www.google.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testUntitledTestCase() throws Exception {
        driver.get("https://sochi.hh.ru/account/login?backurl=%2F");
        driver.findElement(By.xpath("/html/body/div[6]/div/div[1]/div[3]/div/div/div/div/div/form/div[1]/input")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div/div[1]/div[3]/div/div/div/div/div/form/div[1]/input")).clear();
        driver.findElement(By.xpath("/html/body/div[6]/div/div[1]/div[3]/div/div/div/div/div/form/div[1]/input")).sendKeys("79268101242");

        driver.findElement(By.xpath("/html/body/div[6]/div/div[1]/div[3]/div/div/div/div/div/form/div[2]/span/input")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div/div[1]/div[3]/div/div/div/div/div/form/div[2]/span/input")).clear();
        driver.findElement(By.xpath("/html/body/div[6]/div/div[1]/div[3]/div/div/div/div/div/form/div[2]/span/input")).sendKeys("SxJ^8kTf7tpPdm!jgVz@");

        driver.findElement(By.xpath("/html/body/div[6]/div/div[1]/div[3]/div/div/div/div/div/form/div[4]/button")).click();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

}
