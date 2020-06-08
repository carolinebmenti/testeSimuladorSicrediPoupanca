package UITests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SimuladorPoupancaResultsPage extends BasePage {

    public SimuladorPoupancaResultsPage(WebDriver driver) {
        super(driver);
    }

    public String getResultado(){
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='valor']")));

        return driver.findElement(By.xpath("//*[@class='valor']")).getText();
    }
}
