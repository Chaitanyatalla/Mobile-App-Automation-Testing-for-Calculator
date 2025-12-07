//import java.io.File;
//import java.net.MalformedURLException;
//import java.net.URL;
//
//import org.openqa.selenium.remote.DesiredCapabilities;
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.remote.MobileCapabilityType;
//
//public class Calculator {
//
//    public static void main(String[] args) throws MalformedURLException {
//
//        File f = new File("src/test/resources");
//        File fs = new File(f, "calculator.apk");
//
//        DesiredCapabilities cap = new DesiredCapabilities();
//        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel");
//        cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
//        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
//
//        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), cap);
//
//        cap.setCapability("adbExecTimeout", 60000);
//    }
//}