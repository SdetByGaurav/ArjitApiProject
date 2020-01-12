package com.api.genericLib;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

import static io.restassured.RestAssured.*;

import java.util.Date;

public class BaseClass {

	public APIConfig config =  new APIConfig();
	/*public ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest logger;
	@BeforeSuite
	public void configBaseContent()
	{
		baseURI = "http://dummy.restapiexample.com/";
		basePath = "api/v1/";
		Date d = new Date();
		String timeStamp = d.toString();
		timeStamp = timeStamp.replaceAll(" ", "").replaceAll(":", "");
		htmlReporter = new ExtentHtmlReporter
				("./Report/test-report" + timeStamp + ".html");
		
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		extent.setSystemInfo("Environment", "Windows");
		extent.setSystemInfo("user", "gaurav");
		
		htmlReporter.config().setChartVisibilityOnOpen
											(true);
        htmlReporter.config().setDocumentTitle
        					("Extent Report Demo");
        htmlReporter.config().setReportName
        							("Test Report2");
        htmlReporter.config().setTestViewChartLocation
        						(ChartLocation.TOP);
        htmlReporter.config().setTheme(Theme.STANDARD);
        htmlReporter.config().setTimeStampFormat
        ("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
	}
	@AfterMethod
	public void getResult(ITestResult result)
	{
	if(result.getStatus() == ITestResult.FAILURE) {
            logger.log(Status.FAIL, MarkupHelper
           .createLabel(result.getName()+" FAILED ", 
        		   ExtentColor.RED));
            logger.fail(result.getThrowable());
        }
   else if(result.getStatus() == ITestResult.SUCCESS) {
        	logger.log(Status.PASS, MarkupHelper
        	.createLabel(result.getName()+" PASSED ",
        			ExtentColor.GREEN));
        }
        else {
        	logger.log(Status.SKIP, MarkupHelper
        	.createLabel(result.getName()+" SKIPPED ", 
        			ExtentColor.ORANGE));
        	logger.skip(result.getThrowable());
        }
	}
	@AfterSuite
	public void configAfterSuite()
	{
		extent.flush();
	}*/
}
