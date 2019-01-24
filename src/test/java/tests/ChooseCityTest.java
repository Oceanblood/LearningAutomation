package tests;

import Driverutils.SetUpTest;
import PageObjects.MainActivity;
import PageObjects.SplashScreen;
import io.appium.java_client.AppiumDriver;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class ChooseCityTest{


    public static AppiumDriver driver;
    public static SplashScreen splashScreen;
    public static MainActivity mainActivity;

    @BeforeClass
    public static void before (){
        splashScreen = new SplashScreen(driver);
        mainActivity = new MainActivity(driver);
        SetUpTest.InitiateAndroidDriver(driver);

    }

    @Test
    public void choseCityTest(){
        splashScreen.ChoseCitySpb();
    }

}
