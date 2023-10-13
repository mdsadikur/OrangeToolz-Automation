package OrangeToolz.TestCases;

import OrangeToolz.Pages.ContactUsPage;
import OrangeToolz.Pages.ThankYouPage;
import OrangeToolz.Util.BaseOrangeToolz;
import com.thedeanda.lorem.LoremIpsum;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactusTest extends BaseOrangeToolz {

    public ContactusTest(){
        super();
    }

    @Test
    public void contactUsSubmitShouldSuccess(){
        ThankYouPage thankYouPage = new ContactUsPage()
                .firstNameFld(LoremIpsum.getInstance().getFirstName())
                .lastNameFld(LoremIpsum.getInstance().getLastName())
                .emailidFld(LoremIpsum.getInstance().getEmail())
                .phoneNumberFld(LoremIpsum.getInstance().getPhone())
                .messageWriteFld(LoremIpsum.getInstance().getTitle(10))
                .checkmarkFld()
                .rechapchaFld()
                .submitBtnFld();
        Assert.assertTrue(thankYouPage.isThankyouPagetext());

    }
}

