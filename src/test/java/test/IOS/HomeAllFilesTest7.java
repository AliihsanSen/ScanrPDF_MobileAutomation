package test.IOS;

import base.BaseTest;
import base.BaseTestIos;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.*;
import page.IOS.HomeAllFilesPage;
import reports.ExtentTestReports;

public class HomeAllFilesTest7 extends BaseTestIos {
    HomeAllFilesPage homeAllFilesPage ;
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
        homeAllFilesPage = new HomeAllFilesPage(getAppiumDriver());
    }

    @Test
    public void HomeAllFilesTest() throws Exception {

        System.out.println("g. Kullanıcı 'HOME' ekranında 'All Files' text ve ıconların görünür olduğunu doğrular.");
        Thread.sleep(2000);

        homeAllFilesPage
                .searchBarVisible()
                .settingsWidgetVisible()
                .myDriveText()
                .foldersText()
                .allFilesText()
                .allFilesClick()
                .getCloudText()
                .filesAreNotSyncedText()
                .storage()
                .modifiedDateText()
                .modifiedDateWidget()
                .onboardWidgetVisible()
                .onboardText()
                .addComponentiWidgetVisible()
                .addComponentiClick()
                .scanFromCameraTextVisible()
                .importFromGaleryTextVisible()
                .addAddComponentiClosed()
                .finishTest();
    }

    @AfterClass
    public void after() {
        tearDown();
    }

}