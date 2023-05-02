import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;


public class AutomatedTest {

    private WebDriver driver;

    @BeforeMethod
    public void beforeTest() {

        System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.navigate().to("http://gmail.com/");
    }

    @Test
    public void myFirstTest() throws InterruptedException {

        driver.findElement(By.id("identifierId")).click();

        driver.findElement(By.id("identifierId")).sendKeys("automatedtest699@gmail.com");

        driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();

        driver.findElement(By.name("Passwd")).click();

        driver.findElement(By.name("Passwd")).sendKeys("mypassword123!?");

        driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();

        driver.findElement(By.cssSelector("div.T-I.T-I-KE.L3")).click();

        Thread.sleep(5000);

        driver.findElement(By.cssSelector("div[role=presentation] input")).sendKeys("automatedtest699@gmail.com");

        driver.findElement(By.xpath("(.//*[@aria-label='Message Body'])[2]")).click();

        driver.findElement(By.xpath("(.//*[@aria-label='Message Body'])[2]")).sendKeys("This is an auto-generated mail");

        driver.findElement(By.name("subjectbox")).click();

        driver.findElement(By.name("subjectbox")).sendKeys("Test subject");

        driver.findElement(By.cssSelector("div[data-tooltip=\"Send \u202A(Ctrl-Enter)\u202C\"]")).click();
        
        Thread.sleep(5000);
    }

    @AfterMethod
    public void afterTest() {

        driver.close();

        driver.quit();
    }

}
