import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.*;



public class ClacT {
	@Test
	
    public static void subs() throws Exception {
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
        String actualresult=result.getText();
        System.out.println("Result: " + actualresult);
        
        
        Assert.assertEquals(actualresult, "3", "the output is doesn't match");
        
        
        driver.quit(); // close session
    }
}
