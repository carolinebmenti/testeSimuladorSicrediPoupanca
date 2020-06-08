package UITests.suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Web {

    public static WebDriver createChrome(String url) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        navegador.get(url);

        return navegador;
    }
}
