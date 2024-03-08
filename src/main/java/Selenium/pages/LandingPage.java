package Selenium.pages;
import org.openqa.selenium.WebElement;
import pageBase.Pagebase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class LandingPage extends Pagebase {


   private WebDriver driver;
    public LandingPage(WebDriver driver){
        super(driver);
        this.driver=driver;
    }


    By select_country_current = By.xpath("//div[@class='country-current']");
    By country_label = By.xpath("//div[@id='country-selct']/a/span[2]");



    public void Open_country_current (String countryName){
        waitForElementToAppear(select_country_current);
        clickButton(select_country_current);
        selectCountry(countryName);
    }


    public void selectCountry(String countryName) {
        try {
            List<WebElement> elements = driver.findElements(country_label);
            System.out.println("Number of elements:" + elements.size());
            for (WebElement seleCountry : elements)
            {
                if (seleCountry.getText().trim().equals(countryName)){
                    seleCountry.click();
                }
            }
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }







}
