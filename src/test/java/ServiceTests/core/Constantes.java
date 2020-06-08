package ServiceTests.core;

import io.restassured.http.ContentType;

public interface Constantes {

    String APP_BASE_URL = "http://5b847b30db24a100142dce1b.mockapi.io/";
    String APP_BASE_PATH = "api/v1";

    ContentType APP_CONTENT_TYPE = ContentType.JSON;

    Long MAX_TIMEOUT = 5000L;
}
