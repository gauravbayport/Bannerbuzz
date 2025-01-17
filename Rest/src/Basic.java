import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import files.Payload;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;
public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// given all input details
		// when Submit the API
		// then validate the response
		RestAssured.baseURI="https://rahulshettyacademy.com";
		String response = given().log().all().queryParam("key", "qaclick123").header("Content-Type","text/plain").body(Payload.AddPlace()).when().post("maps/api/place/add/json").then().assertThat().statusCode(200).body("scope", equalTo("APP"))
		.header("Server", "Apache/2.4.52 (Ubuntu)").extract().response().asString();
		
		System.out.println(response);
		JsonPath js = new JsonPath(response);
	String placeId=	js.getString("place_id");
	System.out.println("PlaceId-"+placeId);
	
	//update place
	String newAddress ="Hon 318p";
	
		given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
		    .body("{\r\n" +
		            "  \"place_id\": \""+placeId+"\",\r\n" +
		            "  \"address\": \""+newAddress+"\",\r\n" +
		            "  \"key\": \"qaclick123\"\r\n" +
		            "}")
		.when().put("maps/api/place/update/json")
		.then().assertThat().log().all()
		    .statusCode(200)
		    .body("msg", equalTo("Address successfully updated"));
		
	String getPlaceResponse =	given().log().all().queryParam("key", "qaclick123").queryParam("place_id", placeId).
			when().get("maps/api/place/get/json").then().assertThat().log().all().statusCode(200).extract().response().asString();
	JsonPath js1 = new JsonPath(getPlaceResponse);
	String Actualaddress =js1.getString("address");
	System.out.println(Actualaddress);
	Assert.assertEquals(Actualaddress,newAddress);

	}

}
