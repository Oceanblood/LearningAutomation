package tests;

import Driverutils.SetUpTest;
import PageObjects.MainActivity;
import PageObjects.SplashScreen;
import io.appium.java_client.AppiumDriver;
import org.apache.tools.ant.taskdefs.WaitFor;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChooseCityTest extends SetUpTest {


    public static AppiumDriver driver;
    public static SplashScreen splashScreen;
    public static MainActivity mainActivity;
    public static WebDriverWait webDriverWait;

    @BeforeClass
    public static void setUp() {
        driver = SetUpTest.InitiateAndroidDriver();
        splashScreen = new SplashScreen(driver);
        mainActivity = new MainActivity(driver);
    }

    @Test
    public void choseSpbTest() {
        splashScreen.ChoseCitySpb();
    }

    @Test
    public void choseMoscowTest(){
        splashScreen.ChoseCityMoscow();
        mainActivity.getSearchTab();


    }

       // @AfterClass
        //public static void teardown () {
        //    driver.quit();
        //}

}
