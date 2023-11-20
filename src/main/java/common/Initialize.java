package common;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Initialize {
    protected static AndroidDriver<MobileElement> driver = null;

    @BeforeTest
    public void getDriver() throws Exception {
        driver = initializeDriver();
    }

    public static AndroidDriver<MobileElement> initializeDriver() throws Exception {
        driver = new AndroidDriver<MobileElement>(GetDriverInfo.getURL(), GetDriverInfo.Android());
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        return driver;
    }

    @AfterTest
    public void tearDown() {
        driver.closeApp();
    }
}
