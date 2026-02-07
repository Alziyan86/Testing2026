package RestAPITesting;
 
import org.testng.annotations.Test;
 
import io.restassured.RestAssured;
 
public class GET_User {
  @Test
  public void getuser() {
	  RestAssured.baseURI = "https://api.restful-api.dev";
	  RestAssured.given()
	  .when()
	  .get("/objects")
	  .then()
	  .statusCode(200)
	  .log().all();
	
  }
  @Test
  public void get2user() {
	  RestAssured.baseURI = "https://api.restful-api.dev";
	  RestAssured.given()
	  .when()
	  .get("/objects?id=3&id=5&id=10")
	  .then()
	  .statusCode(200)
	  .log().all();
	
  }
  @Test
  public void get3user() {
	  RestAssured.baseURI = "https://api.restful-api.dev/";
	  RestAssured.given()
	  .when()
	  .get("objects/7")
	  .then()
	  .statusCode(200)
	  .log().all();
	
  }
  
  
}
 