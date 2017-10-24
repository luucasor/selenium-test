import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestAutomationSelenium {

    @Test
    public void testGooglePage(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.bing.com/");

        WebElement campoDeTexto = driver.findElement(By.name("q"));
        campoDeTexto.sendKeys("Caelum");
        campoDeTexto.submit();
    }
}
