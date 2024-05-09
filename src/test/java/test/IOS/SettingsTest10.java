package test.IOS;

import base.BaseTest;
import base.BaseTestIos;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.*;
import page.IOS.SettingsPage;
import reports.ExtentTestReports;

public class SettingsTest10 extends BaseTestIos {
    SettingsPage settingsPage;
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
        settingsPage = new SettingsPage(getAppiumDriver());
    }

    @Test
    public void SettingsTest() throws Exception {

        System.out.println("k. Kullanıcı 'HOME' ekranında 'Settings' ıconu olduğunu" +
                " ve ıcona tıklayarak Settings'e gidebileceğini görüntüler");
        Thread.sleep(2000);
        settingsPage
                .myDriveText()
                .searchBarVisible()
                .settingsWidgetVisible()
                .settingsWidgetClick()
                .settingsHeaderVisible()
                .settingsBackWidgetVisible()
                .versionInfoText()
                .backWidgetClick()
                .finishTest();
    }

    @AfterClass
    public void after() {
        tearDown();
    }

}
