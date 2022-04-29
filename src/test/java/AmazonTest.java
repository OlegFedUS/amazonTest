import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class AmazonTest {

    @Test
    public void AmazonWebTest(){

        System.setProperty("webdriver.chrome.driver", "c:\\program files\\google\\chrome\\application\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.amazon.com/");

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("dualsense\n");
        driver.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/I/61Uh8NFDzsL._AC_UY218_.jpg']")).click();
        //driver.findElement(By.xpath("//input[@aria-labelledby='color_name_4-announce']")).click();

        WebElement dropdown = driver.findElement(By.id("a-autoid-0-announce"));
        dropdown.click();
        Select select = new Select(dropdown);
        select.selectByVisibleText("3");


// //span[contains(@class,'a-dropdown-label')]

        /*
        WebElement dropdown = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(By.id("a-autoid-26")));
        dropdown.click();
         */

    }
}
