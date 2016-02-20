package tests;

import cucumber.api.java.en.*;
import org.apache.log4j.Logger;
import org.junit.Assert;

/**
 * Created by ViTaLES on 20.02.2016.
 */
public class LoginDefinition extends Fixture {

    private static final Logger log = Logger.getLogger(LoginTests.class);

    @Given("^I navigate to ellos website$")
    public void i_navigate_to_ellos_website() {
        log.info("Start LoginTests");
        ellos.mainPage.openPage();
    }

    @Given("^I click Login link$")
    public void i_click_Login_link() {
        ellos.mainPage.switchToLoginPage();
    }

    @When("^I write Email address \"([^\"]*)\"$")
    public void i_write_Email_address(String arg1) {
        ellos.loginPage.fillEmailField(arg1);
    }

    @When("^I write password \"([^\"]*)\"$")
    public void i_write_password(String arg1) {
        ellos.loginPage.fillPasswordfield(arg1);
    }

    @When("^I click on button Login$")
    public void i_click_on_button_Login() {
        ellos.loginPage.pressLoginButton();
    }

    @Then("^I see that I am logged in$")
    public void i_see_that_I_am_logged_in() {
        ellos.mainPage.userLogOut();

    }

    @Then("^I logged out$")
    public void i_logged_out() {
        Assert.assertTrue(ellos.mainPage.isUserLogOut());
    }


}
