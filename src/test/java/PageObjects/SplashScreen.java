package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SplashScreen {



    public SplashScreen(AppiumDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public AppiumDriver driver;

    @FindBy (id = "online.sravnitseni:id/ivIcone")
    WebElement starIcon;
    @FindBy (id = "online.sravnitseni:id/tvTitle")
    WebElement titleText;
    @FindBy (id = "online.sravnitseni:id/tvDescription")
    WebElement descriptionText;
    @FindBy (id = "online.sravnitseni:id/btnMsk")
    WebElement moscowBtn;
    @FindBy (id = "online.sravnitseni:id/btnSpb")
    WebElement spbBtn;




    public void ChoseCitySpb(){
        titleText.isDisplayed();
        spbBtn.click();
    }

    public void ChoseCityMoscow(){
        titleText.isDisplayed();
        moscowBtn.click();
    }










}


