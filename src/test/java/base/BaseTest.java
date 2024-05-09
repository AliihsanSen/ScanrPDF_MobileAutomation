package base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import reports.ExtentTestReports;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest extends ExtentTestReports {

    static AppiumDriver appiumDriver = null;

    public static WebDriverWait wait;

    @BeforeClass
    public void setup() {

        try {
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability("deviceName", "Pixel 4 API 29");
            cap.setCapability("platformName", "Android");
            cap.setCapability("automationName", "UiAutomator2");
            // cap.setCapability("udid", "emulator-5554");
            // cap.setCapability("platformVersion", "10.0");
            cap.setCapability("appPackage", "com.bearlabs.scanr");
            cap.setCapability("appActivity", "com.bearlabs.scanr.MainActivity");
            cap.setCapability("appium:skipUnlock", "true"); // Satıcı önekini ekledik
            cap.setCapability("noReset", "true");
            cap.setCapability("app", "/Users/tribe/Desktop/Projects/ScanrTestNG/src/test/resources/Scanr.apk");

            appiumDriver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723"), cap);
            wait = new WebDriverWait(appiumDriver, 30);

        } catch (MalformedURLException mx) {
            System.out.println("Hatalı oluşturulmuş URL İstisnası!");
        }
    }

    public static AppiumDriver getAppiumDriver() {
        return appiumDriver;
    }

    public static void setAppiumDriver(AppiumDriver appiumDriver) {
        BaseTest.appiumDriver = appiumDriver;
    }

    public void tearDown() {
        getAppiumDriver().quit();
    }

}
