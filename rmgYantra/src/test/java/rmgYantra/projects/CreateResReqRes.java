package rmgYantra.projects;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateResReqRes {

	@Test
	public void createResTest() {
		baseURI= "https://reqres.in/";
		
		JSONObject json=new JSONObject();
		json.put( "name", "morpheus");
		json.put("job", "leader");
		
		given().
			body(json.toJSONString()).
			contentType(ContentType.JSON).
		
		when().
			post("api/users").
		
		then().statusCode(201).
		
		
		log().all();
			
	}

}
