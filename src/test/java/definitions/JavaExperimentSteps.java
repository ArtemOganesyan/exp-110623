package definitions;

import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static support.TestContext.getDriver;
import static org.assertj.core.api.Assertions.*;

public class JavaExperimentSteps {
    @Given("we test our web application")
    public void weTestOurWebApplication() throws InterruptedException {
        getDriver().get("https://google.com");
        getDriver().manage().window().setSize(new Dimension(800, 600));
        String windowTitle = getDriver().getTitle();
        assertThat(windowTitle).isEqualTo("Google");
        System.out.println(windowTitle);
        Thread.sleep(2000);
    }
}
