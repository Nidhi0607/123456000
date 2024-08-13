package com.qsp.genericutility;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listenerutility extends Baseclass implements ITestListener
{
	public void onTestFailure(ITestResult result)//source select ontestfailure ok
	{
		String methodName = result.getName();//it will give running method
		javaLib = new JavaUtility();
		String time = javaLib.getSystemTime();//this is for current time
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new  File("./Screenshot/"+methodName+time+".png");
		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
}
/*here we extends baseclass why coz webdriver and we implements itestlistener coz it is a inbuilt method and we take
we ovveride ontestfailure to anthing get failure it will identify it takes screenshot*/