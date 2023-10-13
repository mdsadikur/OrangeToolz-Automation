package OrangeToolz.Pages;

import OrangeToolz.Util.BaseOrangeToolz;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage extends BaseOrangeToolz {

    @FindBy(name = "first_name")
    WebElement firstName;

    @FindBy(id = "last_name")
    WebElement LastName;

    @FindBy(name = "email")
    WebElement emailid;

    @FindBy(id = "phone")
    WebElement phoneNumber;

    @FindBy(name = "QV0zFa1WIyWmN9o7s7Zz")
    WebElement messageWrite;

    @FindBy(name = "vvlxDNsOemfHZS3tHnak")
    WebElement checkmark;

    @FindBy(xpath = "//div[@class=\"recaptcha-checkbox-border\"]")
    WebElement rechapcha;

    @FindBy(xpath = "//*[@id=\"_builder-form\"]/div/div[8]/div/div/div/button/div")
    WebElement submitBtn;

    public ContactUsPage(){
        PageFactory.initElements(driver, this);
    }

    public ContactUsPage firstNameFld(String FirstName){
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
        javascriptExecutor.executeScript("window.scroll(0,900)");
        firstName.isDisplayed();
        firstName.clear();
        firstName.sendKeys(FirstName);
        return this;
    }
    public ContactUsPage lastNameFld(String LastNAme){
        LastName.isDisplayed();
        LastName.clear();
        LastName.sendKeys(LastNAme);
        return this;
    }
    public ContactUsPage emailidFld(String EmailID){
        emailid.isDisplayed();
        emailid.clear();
        emailid.sendKeys(EmailID);
        return this;
    }

    public ContactUsPage phoneNumberFld(String MobileNumber){
        phoneNumber.isDisplayed();
        phoneNumber.clear();
        phoneNumber.sendKeys(MobileNumber);
        return this;
    }

    public ContactUsPage messageWriteFld(String Message){
        messageWrite.isDisplayed();
        messageWrite.clear();
        messageWrite.sendKeys(Message);
        return this;
    }

    public ContactUsPage checkmarkFld(){
        checkmark.isDisplayed();
        checkmark.click();
        return this;
    }

    public ContactUsPage rechapchaFld(){
        rechapcha.isDisplayed();
        rechapcha.click();
        return this;
    }

    public ThankYouPage submitBtnFld(){
        submitBtn.isDisplayed();
        submitBtn.isDisplayed();
        submitBtn.click();
        return new ThankYouPage();
    }



}
