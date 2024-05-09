package test.IOS;

import base.BaseTest;
import base.BaseTestIos;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.*;
import page.IOS.TermOfUseSettingsPage;
import reports.ExtentTestReports;

public class TermOfUseSettingsTest15 extends BaseTestIos {
    TermOfUseSettingsPage termOfUseSettingsPage;
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
        termOfUseSettingsPage = new TermOfUseSettingsPage(getAppiumDriver());
    }

    @Test
    public void SettingsTest() throws Exception {

        System.out.println("p. Kullanıcı 'HOME' ekranında 'Settings' ıconu olduğunu" +
                " ve ıcona tıklayarak Settings'e ekranında " +
                "'Term Of Use' butonu olduğunu ve butona tıklayarak " +
                "sözleşmeyi açabileceğini görüntüler.");
        Thread.sleep(2000);

        termOfUseSettingsPage
                .myDriveText()
                .searchBarVisible()
                .settingsWidgetVisible()
                .settingsWidgetClick()
                .settingsHeaderVisible()
                .termOfUseButtonText()
                .termOfUseButtonClick()
                .termOfUseClosed()
                .backWidgetClick()
                .finishTest();
    }

    @AfterClass
    public void after() {
        tearDown();
    }
}
