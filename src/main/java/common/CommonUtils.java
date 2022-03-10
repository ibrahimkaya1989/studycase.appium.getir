package common;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;

public class CommonUtils extends Initialize {
    private static ProjectProperties pp = new ProjectProperties();

    public static void navigateBack() {
        driver.navigate().back();
    }

    public static void clickByAccessibilityID(String testObject) {

        MobileElement element = driver.findElementByAccessibilityId(pp.readProperty(testObject, "elements"));
        element.click();

    }

    public static void clickByID(String testObject) {

        MobileElement element = driver.findElement(By.id(pp.readProperty(testObject, "elements")));
        element.click();

    }

    public static void clickByXPath(String testObject) {

        MobileElement element = driver.findElementByXPath(pp.readProperty(testObject, "elements"));
        element.click();

    }

    public static String getTextById(String testObject) {

        String text = driver.findElementById(pp.readProperty(testObject, "elements")).getText();
        return text;

    }

    public static String getTextByXPath(String testObject) {

        String text = driver.findElementByXPath(pp.readProperty(testObject, "elements")).getText();
        return text;

    }

    public static void randomClickByXPath(String testObject) {

        Random random = new Random();
        List<MobileElement> element = driver.findElementsByXPath(pp.readProperty(testObject, "elements"));
        element.get(random.nextInt(element.size())).click();

    }

    public static void removeProductList(String testObject) throws Exception {

        List<MobileElement> element = driver.findElementsByXPath(pp.readProperty(testObject, "elements"));

        for (int i = element.size() - 1; i >= 0; i--) {
            element.get(i).click();
            Thread.sleep(1000);
        }
    }

    public static void listCategories(String testObject) throws Exception {

        List<MobileElement> element = driver.findElementsByXPath(pp.readProperty(testObject, "elements"));

        for (int i = 0 ; i < 5; i++) {
            System.out.println(i + ". " + element.get(i).getText());
        }

        Random random = new Random();
        element.get(random.nextInt(element.size())).click();
    }

    public static void randomCategory(String testObject) throws Exception {

        List<MobileElement> element = driver.findElementsByXPath(pp.readProperty(testObject, "elements"));

        Random random = new Random();
        element.get(random.nextInt(5)).click();
    }
}
