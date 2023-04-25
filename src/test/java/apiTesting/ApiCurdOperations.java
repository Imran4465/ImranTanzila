package apiTesting;

 
	import static io.restassured.RestAssured.given;
	import static org.hamcrest.Matchers.equalTo;
	import java.util.HashMap;
	import org.json.simple.JSONObject;
	import org.testng.Assert;
	import org.testng.annotations.Test;
	import io.restassured.RestAssured;
	import io.restassured.http.Header;
	import io.restassured.http.Headers;
	import io.restassured.http.Method;
	import io.restassured.response.Response;
	import io.restassured.specification.RequestSpecification;

	// https://jsonplaceholder.typicode.com/
	public class ApiCurdOperations {

		String domin = "https://jsonplaceholder.typicode.com";

		// @Test(priority = 1)
		public void GetMethodRestAssured() {
			// Request object
			RequestSpecification httpRequest = RestAssured.given();
			// Response object
			Response response = httpRequest.request(Method.GET, domin + "/posts");

			// print response in console window
			String responseBody = response.getBody().asString();
			System.out.println("Response Body is:" + responseBody);

			// status code validation
			int statusCode = response.getStatusCode();
			System.out.println("Status code is: " + statusCode);
			Assert.assertEquals(statusCode, 200);

			// validating headers
			String contentType = response.header("Content-Type"); // capture details of Content-Type header
			System.out.println("Content Type is:" + contentType);
			Assert.assertEquals(contentType, "application/json; charset=utf-8");

			// Content-Encoding validation
			String contentEncoding = response.header("Content-Encoding");// capture details of Content-Encoding header
			System.out.println("Content Encoding is:" + contentEncoding);
			Assert.assertEquals(contentEncoding, "gzip");

			// body as string validation
			String title = response.jsonPath().get("[1].title");
			Assert.assertEquals(title, "qui est esse");

		}

		// @Test(priority =2)
		public void GetMethodRestAssuredBDD() {
			given().param("Content-Type", "application/json; charset=utf-8").when().get(domin + "/posts").then()
					.statusCode(200).statusLine("HTTP/1.1 200 OK").body("[1].title", equalTo("qui est esse"))
					.header("Content-Encoding", "gzip").log().all();
		}
		
		
		

		@Test(priority =2)
		@SuppressWarnings("unchecked")
		public void POSTMethodRestAssured() {
			// Specify base URI
			RestAssured.baseURI = domin;
			// Request object
			RequestSpecification httpRequest = RestAssured.given();

			// Request pay laod sending along with post request
			JSONObject requestParams = new JSONObject();
			requestParams.put("batch-no", "27");
			requestParams.put("first_name", "Mohammed");
			requestParams.put("last_name", "Alam");
			requestParams.put("company_name", "Smart-Tech");
			requestParams.put("course", "Automation");
			requestParams.put("Email", "smarttech@gmail.com");
		
			
			
			httpRequest.header("Content-Type", "application/json; charset=utf-8");

			httpRequest.body(requestParams.toJSONString()); // attach above data to the request

			Response response = httpRequest.request(Method.POST, "/posts");
			// print response in console window

			String responseBody = response.getBody().asString();
			System.out.println("Response Body is:" + responseBody);

			// status code validation
			int statusCode = response.getStatusCode();
			System.out.println("Status code is: " + statusCode);
			Assert.assertEquals(statusCode, 201);

			String statusLine = response.getStatusLine();
			System.out.println("Status line is:" + statusLine);
			Assert.assertEquals(statusLine, "HTTP/1.1 201 Created");

			// success code validation
			String emailVerify = response.jsonPath().get("Email");
			Assert.assertEquals(emailVerify, "smarttech@gmail.com");
			System.out.println("My email is : " + emailVerify);

		}

		// @Test(priority =7)
		public void POSTMethodRestAssuredBDD() {
			HashMap<String, String> data = new HashMap<String, String>();
			data.put("batch-no", "101");
			data.put("first_name", "Mohammed");
			data.put("last_name", "Alam");
			data.put("company_name", "Smart-Tech");
			data.put("course", "Automation");
			data.put("Email", "smarttech@gmail.com");
			RestAssured.baseURI = domin;
			given().contentType("application/json").body(data).when().post("/posts").then().statusCode(201).and()
			.body("batch-no",equalTo("101")).and().body("Email", equalTo("smarttech@gmail.com")).log().all();
		}

		@SuppressWarnings("unchecked")
		// @Test(priority =3)
		public void PUTMethodRestAssured() {
			RestAssured.baseURI = domin;
			RequestSpecification httpRequest = RestAssured.given();
			JSONObject requestParams = new JSONObject();
			requestParams.put("batch-no", "101");
			requestParams.put("first_name", "Saroware");
			requestParams.put("last_name", "Ahmed");
			requestParams.put("company_name", "Smart-Tech-IT");
			requestParams.put("course", "Automation-Engineer");
			requestParams.put("Email", "smarttech@gmail.com");

			// Add a header stating the Request body is a JSON
			httpRequest.header("Content-Type", "application/json");

			// Add the J-son to the body of the request
			httpRequest.body(requestParams.toJSONString());

			Response response = httpRequest.request(Method.PUT, "/posts/1");
			String responseBody = response.getBody().asString();
			System.out.println(responseBody);

			Assert.assertEquals(responseBody.contains("Saroware"), true);
			Assert.assertEquals(responseBody.contains("Automation-Engineer"), true);
			Assert.assertEquals(responseBody.contains("smarttech@gmail.com"), true);
		}

		// @Test(priority =8)
		public void PUTMethodRestAssuredBDD() {
			HashMap<String, String> data = new HashMap<String, String>();
			data.put("batch-no", "101");
			data.put("first_name", "Rohul");
			data.put("last_name", "Amin");
			data.put("company_name", "Smart-Tech");
			data.put("Role", "QA-Manager");
			data.put("Email", "smarttech@gmail.com");
			RestAssured.baseURI = domin;
			given().contentType("application/json").body(data).when().put("/posts/2").then().statusCode(200).and()
			.body("batch-no", equalTo("101")).and().body("Email", equalTo("smarttech@gmail.com")).and()
			.body("Role", equalTo("QA-Manager")).and().body("company_name", equalTo("Smart-Tech")).and().log()
					.all();
}
		}
