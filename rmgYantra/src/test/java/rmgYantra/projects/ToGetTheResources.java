package rmgYantra.projects;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import java.net.http.HttpResponse.BodyHandler;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class ToGetTheResources {
	
	@Test
	public void getPojetcsTest() {
		
		Response response = get("http://localhost:8084/projects");
		System.out.println(response.asPrettyString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getContentType());
		
	}
	
	@Test
	public void getProjectWithBDDTest() {
		
		baseURI = "http://localhost:8084";
		when().get("/projects")
		
		.then().
		statusCode(200).
		body("data[0].teamSize", equalTo("0"))
		.log().all();
		
		
		
		
		
		
		
	}

}
