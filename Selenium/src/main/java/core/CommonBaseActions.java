package core;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Browser;

import java.util.concurrent.TimeUnit;

public class CommonBaseActions {

    /**
     * Types in an element based on a locator
     *
     * @param elementLocator the element in which you wanna type(sendKeys)
     * @param whatToType what you would like to type in the found by the locator element
     */
    protected static void type(By elementLocator, String whatToType) {
        Browser.driver.findElement(elementLocator).sendKeys(whatToType);
    }


    /**
     * Clicks on an element based on a provided locator
     *
     * @param elementLocator the locator of the element you would like to click on
     */
    protected static void click(By elementLocator) {

        Browser.driver.findElement(elementLocator).click();
    }


    /**
     * Get the element with this locator
     * @param elementLocator The locator of the element you want to use
     */
    protected static void getElement(By elementLocator){
        Browser.driver.findElement(elementLocator);
    }


    /**
     * Get text from this locator
     * @param elementLocator the locator of the element
     * @return get text with this param
     */
    protected static String getText(By elementLocator) {

        return Browser.driver.findElement(elementLocator).getText();
    }


    /**
     * With implementation of explicit wait you are able to wait for visibility Of Element Located by locator
     * @param locator the locator of the element you would like to wait
     * @param timeout how long to wait
     */
    protected static void elementToBeVisibleWithExplicitWait(By locator, int timeout){
        Browser.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS); // nullify implicitlyWait
        new WebDriverWait(Browser.driver, timeout).until(ExpectedConditions.visibilityOfElementLocated(locator));
        Browser.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // reset implicitlyWait
    }


    /**
     * With implementation of explicit wait you are able to wait for element To Be Clickable by locator
     * @param locator the locator of the element you would like to wait
     * @param timeout how long to wait
     */
    protected static void elementToBeClickableWithExplicitWait(By locator, int timeout){
        Browser.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS); // nullify implicitlyWait
        new WebDriverWait(Browser.driver, timeout).until(ExpectedConditions.elementToBeClickable(locator));
        Browser.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // reset implicitlyWait
    }



    /**
     * Checks if part of the text is present in the element.
     *
     * @param by selector to find the element that should contain text
     * @param text The Text element you are looking for
     * @return true or false
     *
     *TAKE_AWAY_ASSERT - locator
     *Capricciosa [large] - the text that is present
     *
     *     public static void assertForRestaurant(){
     *         Assert.assertTrue(isTextPresent(TAKE_AWAY_ASSERT, "Уепешна регистрация"));
     *     }
     */
    protected static boolean isTextPresent(By by, String text) {
        boolean check = Browser.driver.findElement(by).getText().contains(text);
        return check;
    }

}
