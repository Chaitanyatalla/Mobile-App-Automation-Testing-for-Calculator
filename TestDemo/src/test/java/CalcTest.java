import org.openqa.selenium.By; //Locator class from Selenium (used to find elements like buttons, text, etc
import org.openqa.selenium.WebElement; //Represents a UI element in the app (like a button, textbox)
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver; //Appium’s driver class for controlling Android apps

public class CalcTest {
	@Test
	
    public static void main(String[] args) throws Exception {
        AndroidDriver driver = MobileTest.getDriver();

        WebElement one = driver.findElement(By.id("com.google.android.calculator:id/digit_1"));
        one.click();

        WebElement plus = driver.findElement(By.id("com.google.android.calculator:id/op_add"));
        plus.click();

        WebElement two = driver.findElement(By.id("com.google.android.calculator:id/digit_2"));
        two.click();

        WebElement equals = driver.findElement(By.id("com.google.android.calculator:id/eq"));
        equals.click();

        WebElement result = driver.findElement(By.id("com.google.android.calculator:id/result_final"));
        System.out.println("Result: " + result.getText());
        
        driver.quit(); // close session
    }
}
