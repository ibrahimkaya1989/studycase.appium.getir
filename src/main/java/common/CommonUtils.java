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
        try {
            MobileElement element = driver.findElementByAccessibilityId(pp.readProperty(testObject, "elements"));
            element.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void clickByID(String testObject) {
        try {
            MobileElement element = driver.findElement(By.id(pp.readProperty(testObject, "elements")));
            element.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void clickByXPath(String testObject) {
        try {
            MobileElement element = driver.findElementByXPath(pp.readProperty(testObject, "elements"));
            element.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
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
        try {
            Random random = new Random();
            List<MobileElement> element = driver.findElementsByXPath(pp.readProperty(testObject, "elements"));
            element.get(random.nextInt(element.size())).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void removeProductList(String testObject) {
        try {
            List<MobileElement> element = driver.findElementsByXPath(pp.readProperty(testObject, "elements"));
            for (int i = element.size() - 1; i >= 0; i--) {
                element.get(i).click();
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void listCategories(String testObject) throws Exception {
        try {
            List<MobileElement> element = driver.findElementsByXPath(pp.readProperty(testObject, "elements"));

            for (int i = 0; i < 5; i++) {
                System.out.println(i + ". " + element.get(i).getText());
            }

            Random random = new Random();
            element.get(random.nextInt(element.size())).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void randomCategory(String testObject) throws Exception {
        try {
            List<MobileElement> element = driver.findElementsByXPath(pp.readProperty(testObject, "elements"));

            Random random = new Random();
            element.get(random.nextInt(5)).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
