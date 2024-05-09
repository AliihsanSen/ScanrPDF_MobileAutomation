package test.IOS;

import base.BaseTest;
import base.BaseTestIos;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.*;
import page.IOS.SearchBarPage;
import reports.ExtentTestReports;

public class SearchBarTest9 extends BaseTestIos {
    SearchBarPage searchBarPage ;
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
        searchBarPage = new SearchBarPage(getAppiumDriver());
    }

    @Test
    public void SearchBarTest() throws Exception {

        System.out.println("ı. Kullanıcı 'HOME' ekranında 'Search Bar' olduğunu" +
                " ve arama yapabileceğini doğrular.");
        Thread.sleep(2000);

        searchBarPage
                .settingsWidgetVisible()
                .myDriveText()
                .searchBarVisible()
                .searchBarClick()
                .searchBarWidgetVisible()
                .searchBarText()
                .backWidgetVisible()
                .backWidgetClick()
                .finishTest();
    }

    @AfterClass
    public void after() {
        tearDown();
    }
}
