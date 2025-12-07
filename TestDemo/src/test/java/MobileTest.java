import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

//import org.junit.Assert;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
//import junit.framework.TestCase;


			
public class MobileTest{

	private static AndroidDriver driver;

    public static AndroidDriver getDriver() throws MalformedURLException{
				
		
		File f = new File("src/test/resources");
		//File fs= new File(f,"Android-MyDemoAppRN.1.3.0.build-244.apk");
		
		File fs= new File(f,"calculator.apk");
		//File fs= new File(f,"Casa Sport_3.41.2_APKPure.apk");
		DesiredCapabilities cap= new DesiredCapabilities();
	//cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 3a API 33");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		AndroidDriver driver=new AndroidDriver (new URL("http://127.0.0.1:4723"),cap);
		//cap.setCapability("chromedriverExecutable", "C:\\Users\\DELL\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	//	System.setProperty("webdriver.chrome.driver" , "C:\\Users\\DELL\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
      //  cap.setCapability("chromedriverExecutable", "C:\\Users\\DELL\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		cap.setCapability("adbExecTimeout", 60000);     
    return driver;}
}