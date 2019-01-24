package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SplashScreen {



    public SplashScreen(AppiumDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public AppiumDriver driver;

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




    public void ChoseCitySpb(){
        titleText.isDisplayed();
        spbBtn.click();
    }

    public void ChoseCityMoscow(){
        titleText.isDisplayed();
        moscowBtn.click();
    }










}


