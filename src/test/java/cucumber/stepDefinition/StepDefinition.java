package cucumber.stepDefinition;

import Selenium.pages.*;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import baseComponent.BaseTest;

import java.io.ByteArrayInputStream;

public class StepDefinition extends BaseTest {

    public LandingPage landingPage;


    @Given("I landed on subscribe Page")
    public void i_landed_on_subscribe_page() {
        landingPage = launchApplication();
    }

    @Given("Logged in with landing page")
    public void logged_in_with_landing_page() {

        landingPage = new LandingPage(driver);
    }

    @When("I select {string} Your Plan")
    public void i_select_your_plan(String countryName) {

        landingPage.Open_country_current(countryName);
    }



    @Then("All packages is displayed with {string} , {string} , {string}")
    public void all_packages_is_displayed_with(String package1, String package2, String package3) {


        String firstPackage = driver.findElement(By.xpath("//strong[text()='Lite']")).getText();
        Assert.assertEquals(firstPackage,package1);

        String secondPackage = driver.findElement(By.xpath("//strong[text()='Classic']")).getText();
        Assert.assertEquals(secondPackage,package2);

        String thirdPackage = driver.findElement(By.xpath("//strong[text()='Premium']")).getText();
        Assert.assertEquals(thirdPackage,package3);


    }


    @Then("All Monthly price is displayed with {string} , {string} , {string}")
    public void all_monthly_price_is_displayed_with(String liteprice, String classicprice, String premiumprice) {

        String firstmonthlyPrice = driver.findElement(By.cssSelector("#currency-lite")).getText();
        Assert.assertEquals(firstmonthlyPrice, liteprice);

        String secondmonthlyPrice = driver.findElement(By.cssSelector("#currency-classic")).getText();
        Assert.assertEquals(secondmonthlyPrice, classicprice);

        String thirdmonthlyPrice = driver.findElement(By.cssSelector("#currency-premium")).getText();
        Assert.assertEquals(thirdmonthlyPrice, premiumprice);


    }


    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()) {
            byte[] screenshot =((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            Allure.addAttachment("Failed Screenshot ....",new ByteArrayInputStream(screenshot));
        }
            driver.close();
    }




}
