package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SplashScreen {



    public SplashScreen(AppiumDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public AppiumDriver driver;
    public WebDriverWait webDriverWait;

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
    @FindBy(id = "online.sravnitseni:id/progressBar")
    WebElement loader;




    public void ChoseCitySpb(){
        titleText.isDisplayed();
        spbBtn.click();
       // webDriverWait.until(ExpectedConditions.elementToBeSelected(By.id("online.sravnitseni:id/menuActionSearch")));
        // need to assert element
    }

    public void ChoseCityMoscow(){
        titleText.isDisplayed();
        moscowBtn.click();
        // need to assert element


    }










}


