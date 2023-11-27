package day04;

import io.appium.java_client.TouchAction;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.AndroidTestPage;
import utils.Driver;
import utils.ReusableMethods;

import static io.appium.java_client.touch.offset.PointOption.point;
public class C05_AndroidTestApk {


    Driver driver = new Driver();
    AndroidTestPage androidTestPage = new AndroidTestPage();
    ReusableMethods reusableMethods = new ReusableMethods();

    @BeforeTest
    public void setUp() {

        Driver.getAndroidDriver();
    }

    @Test
    public void tabOnThePointwithTouchAction() {
        // TouchAction class i Selenium daki Action class ina benzer ozellikler tasir
        // Note: aldigimiz point ler kullandigimiz device a gore degisiklik gosterebilir, bu konuda dikkatli olalim
        TouchAction action = new TouchAction(driver.getAndroidDriver()) ;
        action.tap(point(88,50)).perform();
        reusableMethods.waitFor(3);
        action.tap(point(80,1378)).perform();
        reusableMethods.waitFor(3);
        action.tap(point(90,694)).perform();
        action.tap(point(120,948)).perform();


    }
    @Test
    public void dynamicTabMethodUsing(){
        reusableMethods.tabOnThePoints(88,50);
        reusableMethods.waitFor(3);
    }



    @AfterTest
    public void tearDown() {
        // driver.closeAppiumDriver();
    }
}