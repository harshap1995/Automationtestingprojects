package testNGpackge;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reportgeneration { 
	
	WebDriver driver=new ChromeDriver();
	//3 basic classes in testNG for report generation and declared its objects as public
	ExtentReports extend;
	ExtentTest test;
	ExtentHtmlReporter reporter;
	@BeforeTest
	public void beforetestdetails()
	{
		
		reporter=new ExtentHtmlReporter("./Reports/newreport.html");
		reporter.config().setDocumentTitle("Testing report");
		reporter.config().setReportName("demo testing");
		reporter.config().setTheme(Theme.DARK);
		
		extend=new ExtentReports();
		extend.attachReporter(reporter);
		extend.setSystemInfo("browser", "chrome");
		extend.setSystemInfo("testername", "harsha");
		
		
	}
	@BeforeMethod
	public void setup()
	{
		driver.get("http://facebook.com");
	}
	@Test
	public void fbtitleverification()
	{
		test=extend.createTest("Fbtitleverification");
		String title="facebook";
		String actual=driver.getTitle();
		Assert.assertEquals(title, actual);
	}
	@Test
	public void fbbuttonverification()
	{
		test=extend.createTest("buttontest");
		String button=driver.findElement(By.name("login")).getText();
		Assert.assertEquals(button, "Log in");
		
	}
	@AfterMethod
	public void reportdetails(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL,"test case failed is"+result.getName());
			test.log(Status.FAIL,"test case failed is"+result.getThrowable());
			String screenshotpath=Reportgeneration.screenshotMethod(driver,result.getName());
			test.addScreenCaptureFromPath(screenshotpath);
		}
		else if(result.getStatus()==ITestResult.SKIP)
		{
			test.log(Status.SKIP, "test case skipped is"+result.getName());
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, "test passed is"+result.getName());
		}
	}
	public static String screenshotMethod(WebDriver driver,String screenshotname) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String destination="./screenshot/"+screenshotname+".png";
		FileHandler.copy(src, new File(destination)); 
		return destination;
		
	}
	@AfterTest
	public void close()
	{
		extend.flush();
	}

}
