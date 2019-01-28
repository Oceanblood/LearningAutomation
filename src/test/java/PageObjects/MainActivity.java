package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;


public class MainActivity {


    public MainActivity(AppiumDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public AppiumDriver driver;
    public WebDriverWait webDriverWait;
    @FindBy (id = "online.sravnitseni:id/view")
    WebElement searchInput;
    @FindBy(id = "online.sravnitseni:id/textView")
    WebElement popularPricesText;
    @FindBy(id = "online.sravnitseni:id/menuActionSearch")
    WebElement searchTab;


    public void getSearchTab(){
        webDriverWait.until(ExpectedConditions.elementToBeSelected(By.id("online.sravnitseni:id/menuActionSearch")));
        searchTab.isDisplayed();
        searchTab.isSelected();
    }


}




