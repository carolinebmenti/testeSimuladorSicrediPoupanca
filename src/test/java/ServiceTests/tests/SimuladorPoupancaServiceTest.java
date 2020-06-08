package ServiceTests.tests;

import ServiceTests.core.BaseTest;
import static org.hamcrest.Matchers.*;

import org.hamcrest.Matchers;
import org.junit.Test;
import static io.restassured.RestAssured.*;

public class SimuladorPoupancaServiceTest extends BaseTest {

    @Test
    public void consultarDadosSimulacao() {

        given()
                .when()
                .get("/simulador")
                .then()
                .statusCode(200)
                .body("meses", hasSize(4))
                .body("valor",hasSize(4))
                .body("id", equalTo(1))
                .body("meses", contains("112", "124", "136", "148"))
                .body("valor", contains("2.802", "3.174", "3.564", "3.971"))
        ;
    }

    @Test
    public void consultarRecursoInexistente(){

        given()
                .when()
                .get("/simulador/1")
                .then()
                .statusCode(404)
                .body(Matchers.containsString("Not found"))
        ;
    }

    @Test
    public void tentarDeletarDadosSimulador(){

        given()
                .when()
                .delete("/simulador")
                .then()
                .statusCode(400)
                .body("msg", is("Invalid request"))
        ;
    }


}