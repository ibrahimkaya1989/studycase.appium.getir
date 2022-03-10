import org.testng.annotations.Test;

import common.CommonUtils;
import common.Initialize;

public class TEST extends Initialize {

    @Test
    public static void allowPermisson() {
        System.out.println("Show up Adds!");
        CommonUtils.clickByID("case1.skipBtn.id");
        System.out.println("Skip Adds");
    }

    @Test(dependsOnMethods = "allowPermisson")
    public void openMenu() {
        CommonUtils.getTextByXPath("case1.mainPageTitle.XPath");
        System.out.println("Mainpage title is found!");
        CommonUtils.clickByXPath("case1.menu.XPath");
        System.out.println("Menu button is clicked!");
    }
}
