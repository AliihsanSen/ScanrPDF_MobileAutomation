package test.Android;

import base.BaseTest;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.*;
import page.Android.PrivacyPolicyPage;
import page.Android.SharePage;
import reports.ExtentTestReports;

public class PrivacyPolicyTest13 extends BaseTest {
    PrivacyPolicyPage privacyPolicyPage;
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
        privacyPolicyPage = new PrivacyPolicyPage(getAppiumDriver());
    }

    @Test
    public void SettingsTest() throws Exception {

        System.out.println("n. Kullanıcı 'HOME' ekranında 'Settings' ıconu olduğunu" +
                " ve ıcona tıklayarak Settings'e ekranında " +
                "'Privacy Policiy' butonu olduğunu ve butona tıklayarak " +
                "sözleşmeyi açabileceğini görüntüler.");
        Thread.sleep(2000);

        privacyPolicyPage
                .myDriveText()
                .searchBarVisible()
                .settingsWidgetVisible()
                .settingsWidgetClick()
                .settingsHeaderVisible()
                .privacyPolicyButtonText()
                .privacyPolicyButtonClick()
                .privacyPolicyClosed()
                .backWidgetClick()
                .finishTest();
    }

    @AfterClass
    public void after() {
        tearDown();
    }
}
