package definitions;

import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static support.TestContext.getDriver;

public class RedditStepDefs {
    @Then("client type {string} in the element {string}")
    public void clientTypeInTheElement(String arg0, String arg1) throws InterruptedException {
        new Actions(getDriver()).moveByOffset(800, 25).click().build().perform();
        WebElement searchBar = getDriver().switchTo().activeElement();
        searchBar.sendKeys("Cucumber");
        searchBar.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
    }
}
