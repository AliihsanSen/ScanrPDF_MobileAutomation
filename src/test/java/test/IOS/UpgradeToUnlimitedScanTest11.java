package test.IOS;

import base.BaseTest;
import base.BaseTestIos;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.*;
import page.IOS.UpgradeToUnlimitedScanPage;
import reports.ExtentTestReports;

public class UpgradeToUnlimitedScanTest11 extends BaseTestIos {
    UpgradeToUnlimitedScanPage upgradeToUnlimitedScanPage;
    AppiumDriver driver;

    @BeforeSuite
    public void setupSuite() {
        ExtentTestReports.beforeTest();
    }

    @AfterSuite
    public void afterSuite() {
        ExtentTestReports.afterTest();
    }

    @BeforeClass
    public void before() {
        upgradeToUnlimitedScanPage = new UpgradeToUnlimitedScanPage(getAppiumDriver());
    }

    @Test
    public void SettingsTest() throws Exception {

        System.out.println("l. Kullanıcı 'HOME' ekranında 'Settings' ıconu olduğunu" +
                " ve ıcona tıklayarak Settings'e ekranında " +
                "Upgrade To Unlimited ScanPage text'i olduğunu ve tıklayarak " +
                "Subscription ekranına yönlendirdiğini görüntüler.");
        Thread.sleep(2000);
        upgradeToUnlimitedScanPage
                .myDriveText()
                .searchBarVisible()
                .settingsWidgetVisible()
                .settingsWidgetClick()
                .settingsHeaderVisible()
                .upgradeToUnlimitedScanText()
                .upgradeToUnlimitedScanClick()
                .xCloseButton()
                .unlimitedtext()
                .proScanText()
                .xCloseClick()
                .backWidgetClick()
                .finishTest();
    }

    @AfterClass
    public void after() {
        tearDown();
    }

}
