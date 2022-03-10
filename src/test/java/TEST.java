import org.testng.annotations.Test;

import common.CommonUtils;
import common.Initialize;

public class TEST extends Initialize {

    @Test( enabled = true )
    public static void allowPermisson() throws Exception
    {
        System.out.println("Show up Adds!");

        CommonUtils.clickByID("case1.skipBtn.id");

        System.out.println("Skip Adds");
    }

    @Test (dependsOnMethods = "allowPermisson")
    public void testgetir_add_to_wishlist() {

        System.out.println("Whish list steps just started!");

        CommonUtils.navigateBack();

        System.out.println("Processes are done!");
    }
}
