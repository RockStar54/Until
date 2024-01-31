import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Until {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\OMEN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();



        driver.get("https://play1.automationcamp.ir/expected_conditions.html");

        WebDriverWait wait1 = new WebDriverWait(driver,10);

        driver.get("https://play1.automationcamp.ir/expected_conditions.html");
        driver.findElement(By.cssSelector("#visibility_trigger")).click();
        WebElement ClickMe = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#visibility_target")));
        ClickMe.click();

        driver.findElement(By.cssSelector("#visibility_target")).getText();
    }
}





