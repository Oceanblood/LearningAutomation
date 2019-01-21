package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class SplashScreen {

    @FindBy (id = "online.sravnitseni:id/ivIcone")
    MobileElement starIcon;
    @FindBy (id = "online.sravnitseni:id/tvTitle")
    MobileElement titleText;
    @FindBy (id = "online.sravnitseni:id/tvDescription")
    MobileElement descriptionText;
    @FindBy (id = "online.sravnitseni:id/btnMsk")
    MobileElement moscowBtn;
    @FindBy (id = "online.sravnitseni:id/btnSpb")
    MobileElement spbBtn;


    public AppiumDriver<MobileElement> driver;



    public void ChoseCitySpb(){
        titleText.isDisplayed();
        spbBtn.click();
    }

    public void ChoseCityMoscow(){
        titleText.isDisplayed();
        moscowBtn.click();
    }










}


