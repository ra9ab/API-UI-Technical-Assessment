package apiAutomation.Tests;

import Driver.DriverSetup;

import static io.restassured.RestAssured.*;

import io.restassured.path.json.JsonPath;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.testng.annotations.Test;


public class ApiTests extends DriverSetup {


	String getAllTitle;
	String getPostByIdTitle;
	String baseURL = "https://jsonplaceholder.typicode.com";


	@Test(priority = 1)
	void getAllPosts() {
		int sizeOfWholePosts ;
		baseURI = baseURL;
		/*assert on 200 status successful HTTP request*/

		String AllPostResponse =given().when().header("Content-Type", "application/json").get("/posts")
				.then().statusCode(200).
				extract().response().asString();
		JsonPath js= new JsonPath(AllPostResponse);

		/*geeting size of posts array*/
		List <String> titles= js.get("title");
		sizeOfWholePosts=titles.size();
		System.out.println("Size of posts "+ sizeOfWholePosts);

		/*getting title of first post to assert it with get post by id api */
		getAllTitle=js.getString("title[0]");
		System.out.println("First Post title (Get all Posts Api) " +getAllTitle);

		/*asserting that size of all posts equal 100*/
		assertEquals(sizeOfWholePosts, 100);



	}

	@Test(priority = 2) void getPostById() { 
		baseURI =baseURL;
		/*assert on 200 status successful HTTP request*/
		getPostByIdTitle =	given().when().header("Content-Type", "application/json").get("/posts/" +
				"1") .then().statusCode(200).extract().path("title");
		System.out.println("First Post title (Get posst by id api) " +getPostByIdTitle);

		/*asserting that title of the first post title equal the title of post id [1]  */
		assertEquals(getPostByIdTitle, getAllTitle);
	}

	/*Getting Post with Wrong Post ID */
	@Test(priority = 3) void getPostWrongId() {
		baseURI =baseURL; 
		/*assert on 404 status code File not found*/
		String wrongIdResponse = given().when().header("Content-Type", "application/json").get("/posts/" +
				"900") .then().statusCode(404).extract().response().asString();

		assertEquals(wrongIdResponse,"{}");
	}


	/*assert on 201 status resource successfully created*/

	@Test(priority = 4) 
	void createPost() { 
		baseURI =baseURL; 
		int PostId =given().body(ApisBody.createPostBody(90))
				.when().header("Content-Type", "application/json")
				.post("/posts").then().assertThat().statusCode(201).extract().path("id");

		/*assert that the new post id equal 101*/
		assertEquals(PostId, 101);
	}





}
