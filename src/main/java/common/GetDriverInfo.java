package common;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class GetDriverInfo {

    private static ProjectProperties pp = new ProjectProperties();

    public static AppiumDriver<MobileElement> getDriver() throws MalformedURLException{

        AppiumDriver<MobileElement> driver;

        driver = new AppiumDriver<MobileElement>(getURL(), Android());

        return driver;
    }

    public static AppiumDriver<MobileElement> getAndroidDriver() throws MalformedURLException{

        AppiumDriver<MobileElement> driver;

        driver = new AndroidDriver<MobileElement>(getURL(), Android());

        return driver;
    }

    public static AppiumDriver<MobileElement> getIOSDriver() throws MalformedURLException{

        AppiumDriver<MobileElement> driver;

        driver = new AppiumDriver<MobileElement>(getURL(), Android());

        return driver;
    }

    public static DesiredCapabilities Android() {

        DesiredCapabilities cap = new DesiredCapabilities();

        // Smartphone Infos

        cap.setCapability("deviceName", pp.readProperty("android.deviceName", "test"));
        cap.setCapability("udid", pp.readProperty("android.udid", "test"));
        //cap.setCapability("udid", pp.readProperty("android.udid.ip", "test"));
        cap.setCapability("platformName", pp.readProperty("android.platformName", "test"));
        cap.setCapability("platformVersion", pp.readProperty("android.platformVersion", "test"));

        // Application Infos

        cap.setCapability("appPackage", pp.readProperty("android.appPackage", "test"));
        cap.setCapability("appActivity", pp.readProperty("android.appActivity", "test"));

        return cap;
    }

    public static DesiredCapabilities IOS() {

        DesiredCapabilities cap = new DesiredCapabilities();

        // Smartphone Infos

        cap.setCapability("deviceName", pp.readProperty("android.deviceName", "test"));
        cap.setCapability("udid", pp.readProperty("android.udid", "test"));
        //cap.setCapability("udid", pp.readProperty("android.udid.ip", "test"));
        cap.setCapability("platformName", pp.readProperty("android.platformName", "test"));
        cap.setCapability("platformVersion", pp.readProperty("android.platformVersion", "test"));

        // Application Infos

        cap.setCapability("appPackage", pp.readProperty("android.appPackage", "test"));
        cap.setCapability("appActivity", pp.readProperty("android.appActivity", "test"));

        return cap;

    }

    public static URL getURL() throws MalformedURLException {
        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        return url;
    }
}
