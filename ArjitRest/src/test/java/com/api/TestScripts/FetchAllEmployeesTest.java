package com.api.TestScripts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.genericLib.BaseClass;

import io.restassured.response.Response;

@Listeners(com.api.genericLib.TakeListner.class)
public class FetchAllEmployeesTest extends BaseClass{

	@Test
	public void getAllEmp()
	{
		String apiData = config.getPropertyObject("AllEmp");
		Response resp = config.executeRequest(apiData);
		/*if(resp != null)
		{
logger = extent.createTest("Fetch all employee test" , "Test case pass");
		}*/
		resp.then().log().all();
	}
}
