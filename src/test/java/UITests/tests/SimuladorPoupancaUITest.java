package UITests.tests;

import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.loader.LoaderType;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import UITests.pages.SimuladorPoupancaHomePage;
import UITests.suporte.Web;

@RunWith(DataDrivenTestRunner.class)
@DataLoader(filePaths = {"SimuladorPoupancaData.csv"}, loaderType = LoaderType.CSV)
public class SimuladorPoupancaUITest {

    private WebDriver driver;

    @Before
    public void setUp(){
        driver = Web.createChrome("https://www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/");
    }

    @Test
    public void simularInvestimentoDaPoupanca(
            @Param(name="valorInicial") String valorInicial,
            @Param(name="valorInvestir")String valorInvestir,
            @Param(name="tempo")String tempo,
            @Param(name="resultadoEsperado")String resultadoEsperado
    ){
        String message = new SimuladorPoupancaHomePage(driver)
                .informarDadosParaSimulacao(valorInicial, valorInvestir, tempo)
                .getResultado();

        Assert.assertEquals(resultadoEsperado, message);
    }

    @Test
    public void informarValorInferiorAoMinimoPermitido(){
       SimuladorPoupancaHomePage simulador = new SimuladorPoupancaHomePage(driver);
                simulador.digitarValorInicial("19,99")
                .digitarValorInvestir("19,99").digitarTempoQt("0").clicarBotaoSimular();

        Assert.assertEquals("Valor mínimo de 20.00", simulador.getErrorMessageCampoValorInicial());
        Assert.assertEquals("Valor mínimo de 20.00", simulador.getErrorMessageCampoValorInvestir());
        Assert.assertEquals("Valor esperado não confere", simulador.getErrorMessageCampoTempo());


    }

    @Test
    public void informarValorSuperiorAoMaximoPermitido(){
        SimuladorPoupancaHomePage simulador = new SimuladorPoupancaHomePage(driver);
                simulador.digitarValorInicial("9999999.01")
                .digitarValorInvestir("9999999.01").digitarTempoQt("1");

        Assert.assertEquals("Máximo de 9999999.00", simulador.getErrorMessageCampoValorInicial());
        Assert.assertEquals("Máximo de 9999999.00", simulador.getErrorMessageCampoValorInvestir());


    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
