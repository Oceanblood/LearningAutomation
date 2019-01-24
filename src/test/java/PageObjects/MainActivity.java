package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainActivity {


    public MainActivity(AppiumDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public AppiumDriver driver;
    @FindBy(id = "online.sravnitseni:id/view")
    MobileElement searchInput;
    @FindBy(id = "online.sravnitseni:id/textView")
    MobileElement popularPricesText;
    @FindBy(id = "online.sravnitseni:id/menuActionSearch")
    MobileElement searchTab;


}



