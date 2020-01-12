package com.api.TestScripts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.genericLib.BaseClass;

import io.restassured.response.Response;

@Listeners(com.api.genericLib.TakeListner.class)
public class PostRequestTest extends BaseClass{

	@Test
	public void createPost()
	{
		String apiData = config.getPropertyObject
									("createPost");
		Response resp = config.executeRequest(apiData);
		/*if(resp != null)
		{
logger = extent.createTest("Post Created" , "Test case pass");
		}*/
		resp.then().log().all();
	}
}
