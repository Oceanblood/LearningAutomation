package Driverutils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

import static io.appium.java_client.remote.MobileCapabilityType.*;
import static io.appium.java_client.remote.MobileCapabilityType.APP;

public class SetUpTest {

    private static AppiumDriver<MobileElement> Appium;

    public static void InitiateAndroidDriver() throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(NEW_COMMAND_TIMEOUT, 500);
        caps.setCapability(PLATFORM_NAME, "ANDROID");
        caps.setCapability(PLATFORM_VERSION, "7.0");
        caps.setCapability(DEVICE_NAME, "06157df61d35cc27");
        caps.setCapability(APP, "/Users/ilyabelchenko/StudioProjects/sravnitseni-android/app/build/outputs" +
                "/apk/debug/online-sravnitseni2-debug-1.0.7-SNAPSHOT.apk");
        caps.setCapability(FULL_RESET,true);



        Appium = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
    }


}


