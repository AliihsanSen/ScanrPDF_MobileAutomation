package test.IOS;

import base.BaseTest;
import base.BaseTestIos;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.*;
import page.IOS.RestorePurchasePage;
import reports.ExtentTestReports;

public class RestorePurchaseTest16 extends BaseTestIos {
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

        System.out.println("r. Kullanıcı 'HOME' ekranında 'Settings' ıconu olduğunu" +
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
                .backWidgetClick()
                .finishTest();
    }

    @AfterClass
    public void after() {
        tearDown();
    }
}
