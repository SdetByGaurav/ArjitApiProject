package PraticeRest;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
public class FetchData {

	@Test
	public void fetch()
	{
		Response resp = get
		("https://restcountries.eu/rest/v2/all");
		
		Object obj = resp.jsonPath().get
							("currencies.code");
		
		System.out.println(obj);
		System.out.println("Hello");
	}
}
