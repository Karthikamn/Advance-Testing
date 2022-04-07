package sample;

import static org.testng.Assert.assertEquals;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static org.hamcrest.Matchers.*;

public class APITesting {
	
	@BeforeClass
	public void bf() {
		RestAssured.useRelaxedHTTPSValidation();
	}
	
	
	@Test
	public void get_method() {
		
		/*JSONObject r1=new JSONObject();
		
		r1.put("name", "morpheus");
		r1.put("job", "singer");
		
		System.out.println(r1.toJSONString());
		*/
		given().
		header("Content-Type","application/json").
		delete("https://reqres.in/api/users/2").
		then().statusCode(204);
		
		
	}


	

}
