package OrangeToolz.Pages;

import OrangeToolz.Util.BaseOrangeToolz;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThankYouPage extends BaseOrangeToolz {

    @FindBy(xpath = "//h1[contains(text(),'Thanks!')]")
    WebElement thankyoumessage;

    public ThankYouPage(){
        PageFactory.initElements(driver, this);
    }

    public boolean isThankyouPagetext(){
        return thankyoumessage.isDisplayed();
    }
}
