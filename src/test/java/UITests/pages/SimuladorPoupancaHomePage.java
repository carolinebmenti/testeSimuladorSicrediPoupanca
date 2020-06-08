package UITests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SimuladorPoupancaHomePage extends BasePage {

    public SimuladorPoupancaHomePage(WebDriver driver) {
        super(driver);
    }

    public SimuladorPoupancaHomePage digitarValorInicial(String valor) {
        driver.findElement(By.id("valorAplicar")).sendKeys(valor);

        return this;
    }

    public SimuladorPoupancaHomePage digitarValorInvestir(String valor) {
        driver.findElement(By.id("valorInvestir")).sendKeys(valor);

        return this;
    }

    public SimuladorPoupancaHomePage digitarTempoQt(String tempo) {
        driver.findElement(By.id("tempo")).sendKeys(tempo);

        return this;
    }

    public SimuladorPoupancaResultsPage clicarBotaoSimular() {
        driver.findElement(By.tagName("button")).click();

        return new SimuladorPoupancaResultsPage(driver);
    }

    public SimuladorPoupancaResultsPage informarDadosParaSimulacao(String valorInicial, String valorInvestir
            , String tempo) {

        return digitarValorInicial(valorInicial)
                .digitarValorInvestir(valorInvestir)
                .digitarTempoQt(tempo)
                .clicarBotaoSimular();
    }

    public String getErrorMessageCampoValorInicial() {
        return driver.findElement(By.id("valorAplicar-error")).getText();
    }

    public String getErrorMessageCampoValorInvestir() {
        return driver.findElement(By.id("valorInvestir-error")).getText();
    }

    public String getErrorMessageCampoTempo() {
        return driver.findElement(By.id("tempo-error")).getText();
    }


}
