package frontend.pages;

import core.CommonBaseActions;
import utils.Browser;

public class HomePage extends CommonBaseActions {

    /**
     * Opens the login page of customer site http://shop.pragmatic.bg/index.php?route=common/home
     */
    public static void open() {
        Browser.driver.get("http://shop.pragmatic.bg/index.php?route=common/home");
    }
}
