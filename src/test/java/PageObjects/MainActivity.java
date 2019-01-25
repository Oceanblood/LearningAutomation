package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class MainActivity {


    public MainActivity(AppiumDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public AppiumDriver driver;
    @AndroidFindBy (id = "online.sravnitseni:id/view")
    WebElement searchInput;
    @AndroidFindBy(id = "online.sravnitseni:id/textView")
    WebElement popularPricesText;
    @AndroidFindBy(id = "online.sravnitseni:id/menuActionSearch")
    WebElement searchTab;


}




