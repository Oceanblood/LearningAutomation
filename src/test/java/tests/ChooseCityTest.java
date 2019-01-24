package tests;

import Driverutils.SetUpTest;
import PageObjects.MainActivity;
import PageObjects.SplashScreen;
import io.appium.java_client.AppiumDriver;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ChooseCityTest extends SetUpTest {


    public static AppiumDriver driver;
    public static SplashScreen splashScreen;
    public static MainActivity mainActivity;

    @BeforeClass
    public static void setUp(){
        driver = SetUpTest.InitiateAndroidDriver();
        splashScreen = new SplashScreen(driver);
        mainActivity = new MainActivity(driver);

    }

    @Test
    public void choseCityTest(){
        splashScreen.ChoseCitySpb();
    }

}
