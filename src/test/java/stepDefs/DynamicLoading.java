package stepDefs;

import helperMethods.DynamicLoadingHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import setup.Setup;

public class DynamicLoading extends Setup{

    DynamicLoadingHelper dynamicLoadingHelper = new DynamicLoadingHelper();

    @Given("dynamic loading link 2 clicked")
    public void dynamicLoadingLink2(){
        setup();
        dynamicLoadingHelper.goToDynamicLoading();
    }

    @When("I click start")
    public void clickStart(){
        dynamicLoadingHelper.clickLinkExample2();
        dynamicLoadingHelper.startExample2();

    }

    @Then("I expect the result")
    public void haveResult(){
        dynamicLoadingHelper.verifyResult();
    }

                                                                                         //CLOSE BROWSER
}
