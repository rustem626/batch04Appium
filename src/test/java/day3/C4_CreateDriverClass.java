package day3;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.Driver;

public class C4_CreateDriverClass {
// Create a package with name utils and create a class with name Driver
            // Create a class with name ConfigReader in the utils
            // Create configuration.properties under the project name

            Driver driver = new Driver();
    @BeforeTest
    public void setUp(){

        driver.getAndroidDriver();
    }

    @Test
    public void multiplicationTest(){
        driver.androidDriver.findElementByAccessibilityId("7").click();
        driver.androidDriver.findElementByAccessibilityId("5").click();
        driver.androidDriver.findElementByAccessibilityId("multiply").click();
        driver.androidDriver.findElementByAccessibilityId("8").click();
        driver.androidDriver.findElementByAccessibilityId("equals").click();
    }


    @Test
    public void additionTest(){
        driver.androidDriver.findElementByAccessibilityId("7").click();
        driver.androidDriver.findElementByAccessibilityId("5").click();
        driver.androidDriver.findElementByAccessibilityId("plus").click();
        driver.androidDriver.findElementByAccessibilityId("8").click();
        driver.androidDriver.findElementByAccessibilityId("9").click();
        driver.androidDriver.findElementByAccessibilityId("equals").click();
    }
    @Test
    public void subtractionTest(){
        driver.androidDriver.findElementByAccessibilityId("7").click();
        driver.androidDriver.findElementByAccessibilityId("5").click();
        driver.androidDriver.findElementByAccessibilityId("minus").click();
        driver.androidDriver.findElementByAccessibilityId("8").click();
        driver.androidDriver.findElementByAccessibilityId("9").click();
        driver.androidDriver.findElementByAccessibilityId("equals").click();
    }
    @Test
    public void divisionTest(){
        driver.androidDriver.findElementByAccessibilityId("7").click();
        driver.androidDriver.findElementByAccessibilityId("5").click();
        driver.androidDriver.findElementByAccessibilityId("divide").click();
        driver.androidDriver.findElementByAccessibilityId("8").click();
        driver.androidDriver.findElementByAccessibilityId("9").click();
        driver.androidDriver.findElementByAccessibilityId("equals").click();


    }
    @AfterTest
    public void tearDown(){
        driver.closeAppiumDriver();

    }
}