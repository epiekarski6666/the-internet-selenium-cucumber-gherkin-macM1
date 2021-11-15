package helperMethods;

import locators.DynamicLoadingLocators;
import org.junit.jupiter.api.Assertions;
import stringVariables.DynamicLoadingStringVariables;
import static setup.Setup.driver;

public class DynamicLoadingHelper {


    public void goToDynamicLoading(){
        driver.findElement(DynamicLoadingLocators.dynamicLoadingLink).click();
    }

    public void clickLinkExample2(){
        driver.findElement(DynamicLoadingLocators.dynamicLink2).click();
    }

    public void startExample2(){
        driver.findElement(DynamicLoadingLocators.startButton).click();
    }

    public void verifyResult(){
        Assertions.assertEquals(DynamicLoadingStringVariables.expected, driver.findElement(DynamicLoadingLocators.finishDivId).getText());
    }
}
