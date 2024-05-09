package test.Android;

import base.BaseTest;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.*;
import page.Android.RestorePurchasePage;
import page.Android.TermOfUseSettingsPage;
import reports.ExtentTestReports;

public class RestorePurchaseTest15 extends BaseTest {
    RestorePurchasePage restorePurchasePage;
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
        restorePurchasePage = new RestorePurchasePage(getAppiumDriver());
    }

    @Test
    public void SettingsTest() throws Exception {

        System.out.println("p. Kullanıcı 'HOME' ekranında 'Settings' ıconu olduğunu" +
                " ve ıcona tıklayarak Settings'e ekranında " +
                "'Restore Purchase' butonu olduğunu ve butona tıklayarak " +
                "subscription paketlerini güncelleyebileceğini görüntüler.");
        Thread.sleep(2000);

        restorePurchasePage
                .myDriveText()
                .searchBarVisible()
                .settingsWidgetVisible()
                .settingsWidgetClick()
                .settingsHeaderVisible()
                .restorePurchaseButtonText()
                .restorePurchaseButtonClick()
                .lottieVisible()
                .toastMessageVisible()
                .backWidgetClick()
                .finishTest();
    }

    @AfterClass
    public void after() {
        tearDown();
    }
}
