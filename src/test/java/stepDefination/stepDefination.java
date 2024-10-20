package stepDefination;
import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import resources.ReqBodyupdate;




public class stepDefination {
	
	RequestSpecification res;
	ResponseSpecification resspec;
	String response;
	
	
	@Given("Payload with {string}  {string} {string} {string}")
	public void payload_with(String a, String b, String c, String d) {
		
		ReqBodyupdate reqBody = new ReqBodyupdate();
        reqBody.Add(a, b,c, d);
        
        
	    // Write code here that turns the phrase above into concrete actions
	
		
		
	}

	@When("user calls {string} with POST http request")
	public void user_calls_with_post_http_request(String string) {
	    // Write code here that turns the phrase above into concrete actions
		RequestSpecification req = new RequestSpecBuilder()
		        .addHeader("Content-Type", "application/json")
		        .setBaseUri("https://rahulshettyacademy.com")
		        .build();
		
		
		Response response = given()
		        .log().all() // Log all request and response details for debugging
		        .spec(req)
		        .body(ReqBodyupdate.returnadd()).expect().statusCode(200).when()// Use ReqBody object for a more structured body
		        .post(string);
		ResponseSpecification resp = new ResponseSpecBuilder()
		        .expectContentType(ContentType.JSON).expectStatusCode(200)
		        .build();
		resp.expect().statusCode(200);
		
		System.out.println(response.toString());

		// Create a ResponseSpecification for expected response content type
		
	}


}
