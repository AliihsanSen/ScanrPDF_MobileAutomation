package test.Android;

import base.BaseTest;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import page.Android.AddComponentiPage;
import reports.ExtentTestReports;

public class AddComponentiTest3 extends BaseTest {

    AddComponentiPage addComponentiPage;
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
        addComponentiPage = new AddComponentiPage(getAppiumDriver());
    }

    @Test
    public void AddComponentiTest() throws Exception {

        System.out.println("c. Kullanıcı home ekranındaki 'ADD COMPONENTİNİN' görünür olduğunu doğrular.");
        Thread.sleep(2000);
        addComponentiPage
                .addComponentiWidgetVisible()
                .addComponentiClick()
                .scanFromCameraTextVisible()
                .importFromGaleryTextVisible()
                .createFolderTextVisible()
                .addAddComponentiClosed()
                .finishTest();
    }
}
