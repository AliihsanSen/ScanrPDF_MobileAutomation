package test.IOS;

import base.BaseTestIos;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import page.IOS.AddComponentiPage;
import reports.ExtentTestReports;

public class AddComponentiTest4 extends BaseTestIos {

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

        System.out.println("d. Kullanıcı home ekranındaki 'ADD COMPONENTİNİN' görünür olduğunu doğrular.");
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
