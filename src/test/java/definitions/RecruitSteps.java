package definitions;

import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static support.TestContext.getDriver;

public class RecruitSteps {
    @Given("I perform everything in Java")
    public void iPerformEverythingInJava() throws InterruptedException {
        getDriver().get("http://3.147.62.151");
        WebElement loginButton = getDriver().findElement(By.xpath("//button[contains(text(), 'Login')]"));
        loginButton.click();
        WebElement loginField = getDriver().findElement(By.xpath("//input[@placeholder='Please enter an Email']"));
        loginField.sendKeys("student@example.com");
        WebElement passwordFiled = getDriver().findElement(By.xpath("//input[@placeholder='Please enter a Password']"));
        passwordFiled.sendKeys("welcome");
        WebElement submitButton = getDriver().findElement(By.xpath("//button[@type='submit']"));
        submitButton.click();

        Thread.sleep(3000);

        List<WebElement> positions = getDriver().findElements(By.xpath("//li"));
//        for (int i=0; i<positions.size();i++) {
//            WebElement el = positions.get(i);
//        }
        for(WebElement el : positions) {
            System.out.println(el.getText());
        }

        Thread.sleep(3000);
    }
}
