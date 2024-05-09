package test.IOS;

import base.BaseTest;
import base.BaseTestIos;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.*;
import page.IOS.SubscriptionPage;
import reports.ExtentTestReports;

public class SubscriptionTest17 extends BaseTestIos {
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

        System.out.println("t. Kullanıcı subscription ekranı olduğunu görüntüler, " +
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
