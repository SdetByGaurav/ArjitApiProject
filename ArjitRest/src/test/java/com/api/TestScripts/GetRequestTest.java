package com.api.TestScripts;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.genericLib.BaseClass;
import com.aventstack.extentreports.Status;

import io.restassured.response.Response;

@Listeners(com.api.genericLib.TakeListner.class)
public class GetRequestTest extends BaseClass{

	@Test
	public void fetchCountry()
	{
		String apidata = config.getPropertyObject
							("getAllCountries");
		Response resp = config.executeRequest(apidata);
		/*if(resp != null)
		{
			logger = extent.createTest
			("Fetch country" , "Test case pass");
		}*/	
		resp.then().assertThat().statusCode(200);
		resp.then().log().all();
	}
}
