package tests;

import PageObjects.MainActivity;
import PageObjects.SplashScreen;
import io.appium.java_client.AppiumDriver;
import junit.extensions.TestSetup;
import org.junit.Before;
import org.junit.Test;

public class ChooseCityTest {



    SplashScreen splashScreen;
    MainActivity mainActivity;

    static AppiumDriver driver;

    @Before
    public void before(){
      splashScreen = new SplashScreen(driver);
      mainActivity = new MainActivity(driver);
    }


    @Test
    public void chooseSpb(){
        chooseSpb();


}



}
