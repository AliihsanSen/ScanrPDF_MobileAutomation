package test.Android;

import base.BaseTest;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.*;
import page.Android.SubscriptionPage;
import page.Android.UpgradeToUnlimitedScanPage;
import reports.ExtentTestReports;

public class SubscriptionTest16 extends BaseTest {
    SubscriptionPage subscriptionPage;
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
        subscriptionPage = new SubscriptionPage(getAppiumDriver());
    }

    @Test
    public void SettingsTest() throws Exception {

        System.out.println("r. Kullanıcı subscription ekranı olduğunu görüntüler, " +
                "Subscription ekranında satın alma işlemi yapabileceğini görüntüler.");
        Thread.sleep(2000);

        subscriptionPage
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
                .subscriptionWidgetVisible()
                .proSubscriptionText()
                .proSubscriptionPurchase()
                .unlimitedClick()
                .unlimitedSubscriptionText()
                .unlimitedSubscriptionPurchase()
                .proScanClick()
                .continueButtonVisible()
                .scaleWidgetVisible()
                .scaleWidgetClick()
                .policyTextVisible()
                .xCloseClick()
                .finishTest();
    }

    @AfterClass
    public void after() {
        tearDown();
    }
}
