import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import io.restassured.RestAssured;

public class Test {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://rahulshettyacademy.com";

        String jsonBody = "{\n" +
                            "  \"place_id\": \"9e1f4f147054f943949f788fe7ea7e7f\",\n" +
                            "  \"address\": \"71 Summer walk, USA\",\n" +
                            "  \"key\": \"qaclick123\"\n" +
                            "}";

        given().log().all()
            .queryParam("key", "qaclick123")
            .header("Content-Type", "application/json")
            .body(jsonBody)
        .when().put("maps/api/place/add/json")
        .then().assertThat().log().all()
            .statusCode(200)
            .body("msg", equalTo("Address successfully updated"));
    }
}
