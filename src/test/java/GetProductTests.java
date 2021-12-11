import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.when;

public class GetProductTests {
    @Test
    void getProductPositiveTest() {
        when()
                .get("http://80.78.248.82:8189/market/api/v1/products/17856")
                .prettyPeek()
                .then()
                .statusCode(404);
    }
}