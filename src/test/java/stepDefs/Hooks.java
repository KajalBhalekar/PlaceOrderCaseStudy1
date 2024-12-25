package stepDefs;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;

public class Hooks {
	
	
  @BeforeAll
  public static void setupDriver() {
	  TestBase.initDriver();
  }
  
  @After
  public void tearDown(Scenario scenario) {
	  if(scenario.isFailed()) {
		  TakesScreenshot screen =(TakesScreenshot) TestBase.GetDriver();
		  byte[] imgBytes=screen.getScreenshotAs(OutputType.BYTES);
		  scenario.attach(imgBytes,"image/png","ScreenImage");
	  }
  }
  
}
