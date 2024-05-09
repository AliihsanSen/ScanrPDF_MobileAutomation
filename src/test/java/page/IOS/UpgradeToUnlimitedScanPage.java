package page.IOS;

import base.BasePage;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class UpgradeToUnlimitedScanPage extends BasePage {
    AppiumDriver driver;
    TouchAction touchAction;

    public ExtentTest startTest = extent.createTest("Scanr Upgrade To Unlimited Scan Testi", "Upgrade To Unlimited Scan Testi");

    public void infoLog(String str) {
        startTest.log(Status.INFO, str);
    }

    public void passLog(String str) {
        startTest.log(Status.PASS, str);
    }

    public void failLog(String str) {
        startTest.log(Status.FAIL, str);
    }

    public UpgradeToUnlimitedScanPage(AppiumDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
    }

    By searchBar = By.xpath("(//XCUIElementTypeOther[@name=\"Search folder or files\"])[5]/XCUIElementTypeTextField");
    By settingsWidget = By.xpath("(//XCUIElementTypeOther[@name=\"Search folder or files\"])[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther");
    By myDriveText = By.xpath("(//XCUIElementTypeOther[@name=\"My Drive\"])[2]");
    By settingsHeaderText = By.xpath("//XCUIElementTypeStaticText[@name=\"Settings\"]");
    By upgradeToUnlimitedScanText = By.xpath("//XCUIElementTypeOther[@name=\"Upgrade to Unlimited Scan Access All Features\"]");
    By xCloseButton = By.xpath("(//XCUIElementTypeOther[@name=\"Restore\"])[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    By proScanText = By.xpath("//XCUIElementTypeButton[@name=\"PRO SCAN\"]");
    By unlimitedtext = By.xpath("//XCUIElementTypeButton[@name=\"UNLIMITED\"]");
    By settingsBackWidget = By.xpath("(//XCUIElementTypeOther[@name=\"Settings\"])[4]/XCUIElementTypeOther[1]/XCUIElementTypeOther");

    public UpgradeToUnlimitedScanPage myDriveText() throws InterruptedException {
        Thread.sleep(1000);
        WebElement myDriveTextVisible = driver.findElement(myDriveText);
        Assert.assertTrue(myDriveTextVisible.isDisplayed());
        passLog("1-) Kullanıcı home ekranında 'My Drive' texti olduğunu ve tıklayabileceğini görüntüler.");
        System.out.println("1-) Kullanıcı home ekranında 'My Drive' texti olduğunu ve tıklayabileceğini görüntüler.");
        return this;
    }

    public UpgradeToUnlimitedScanPage searchBarVisible() throws InterruptedException {
        Thread.sleep(1000);
        WebElement searchBarIcon = driver.findElement(searchBar);
        Assert.assertTrue(searchBarIcon.isDisplayed());
        passLog("2-) Kullanıcı home ekranında 'Search Bar' butonu olduğunu ve butona tıklayabileceğini görüntüler.");
        System.out.println("2-) Kullanıcı home ekranında 'Search Bar' butonu olduğunu ve butona tıklayabileceğini görüntüler.");
        return this;
    }

    public UpgradeToUnlimitedScanPage settingsWidgetVisible() throws InterruptedException {
        Thread.sleep(1000);
        WebElement settingsButton = driver.findElement(settingsWidget);
        Assert.assertTrue(settingsButton.isDisplayed());
        passLog("3-) Kullanıcı home ekranında 'Settings' butonu olduğunu ve butona tıklayabileceğini görüntüler.");
        System.out.println("3-) Kullanıcı home ekranında 'Settings' butonu olduğunu ve butona tıklayabileceğini görüntüler.");
        return this;
    }

    public UpgradeToUnlimitedScanPage settingsWidgetClick() throws InterruptedException {
        Thread.sleep(1000);
        WebElement settingsClick = driver.findElement(settingsWidget);
        settingsClick.click();
        Thread.sleep(2000);
        passLog("4-) Kullanıcı home ekranında 'Settings' butonuna tıklar.");
        System.out.println("4-) Kullanıcı home ekranında 'Settings' butonuna tıklar.");
        return this;
    }

    public UpgradeToUnlimitedScanPage settingsHeaderVisible() throws InterruptedException {
        Thread.sleep(2500);
        WebElement settingsHeaderTextVisible = driver.findElement(settingsHeaderText);
        Assert.assertTrue(settingsHeaderTextVisible.isDisplayed());
        passLog("5-) Kullanıcı settings ekranında 'Settings' texti olduğunu görüntüler.");
        System.out.println("5-) Kullanıcı settings ekranında 'Settings' texti olduğunu görüntüler.");
        return this;
    }

    public UpgradeToUnlimitedScanPage upgradeToUnlimitedScanText() throws InterruptedException {
        Thread.sleep(1000);
        WebElement upgradeToUnlimitedScanTextVisible = driver.findElement(upgradeToUnlimitedScanText);
        Assert.assertTrue(upgradeToUnlimitedScanTextVisible.isDisplayed());
        passLog("6-) Kullanıcı settings ekranında 'Upgrade To Unlimited Scan' text'i " +
                "olduğunu ve butona tıklayabileceğini görüntüler.");
         System.out.println("6-) Kullanıcı settings ekranında 'Upgrade To Unlimited Scan' text'i " +
                "olduğunu ve butona tıklayabileceğini görüntüler.");
        return this;
    }

    public UpgradeToUnlimitedScanPage upgradeToUnlimitedScanClick() throws InterruptedException {
        Thread.sleep(1000);
        WebElement upgradeToUnlimitedScanTextClick = driver.findElement(upgradeToUnlimitedScanText);
        upgradeToUnlimitedScanTextClick.click();
        passLog("7-) Kullanıcı settings ekranında 'Upgrade To Unlimited Scan' text'ine tıklar.");
        System.out.println("7-) Kullanıcı settings ekranında 'Upgrade To Unlimited Scan' text'ine tıklar.");
        return this;
    }

    public UpgradeToUnlimitedScanPage xCloseButton() throws InterruptedException {
        Thread.sleep(1000);
        WebElement xCloseButtonIcon = driver.findElement(xCloseButton);
        Assert.assertTrue(xCloseButtonIcon.isDisplayed());
        passLog("8-) Kullanıcı subscription ekranının sol üst tarafında '(x)' ıconu olduğunu ve tıklayabileceğini görüntüler.");
        System.out.println("8-) Kullanıcı subscription ekranının sol üst tarafında '(x)' ıconu olduğunu ve tıklayabileceğini görüntüler.");
        return this;
    }

    public UpgradeToUnlimitedScanPage unlimitedtext() throws InterruptedException {
        Thread.sleep(1000);
        WebElement unlimitedtextVisible = driver.findElement(unlimitedtext);
        Assert.assertTrue(unlimitedtextVisible.isDisplayed());
        passLog("9-) Kullanıcı subscription ekranında 'Unlimited' text'i olduğunu ve tıklayabileceğini görüntüler.");
        System.out.println("9-) Kullanıcı subscription ekranında 'Unlimited' text'i olduğunu ve tıklayabileceğini görüntüler.");
        return this;
    }

    public UpgradeToUnlimitedScanPage proScanText() throws InterruptedException {
        Thread.sleep(1000);
        WebElement proScanTextVisible = driver.findElement(proScanText);
        Assert.assertTrue(proScanTextVisible.isDisplayed());
        passLog("10-) Kullanıcı subscription ekranında 'Pro Scan' text'i olduğunu ve tıklayabileceğini görüntüler.");
        System.out.println("10-) Kullanıcı subscription ekranında 'Pro Scan' text'i olduğunu ve tıklayabileceğini görüntüler.");
        return this;
    }

    public UpgradeToUnlimitedScanPage xCloseClick() throws InterruptedException {
        Thread.sleep(1000);
        WebElement xCloseClick = driver.findElement(xCloseButton);
        xCloseClick.click();
        passLog("11-) Kullanıcı subscription ekranının sol üst tarafında '(x)' ıconuna tıklar ve bir önceki ekrana dönebileceğini görüntüler.");
        System.out.println("11-) Kullanıcı subscription ekranının sol üst tarafında '(x)' ıconuna tıklar ve bir önceki ekrana dönebileceğini görüntüler.");
        return this;
    }

    public UpgradeToUnlimitedScanPage backWidgetClick() throws InterruptedException {
        Thread.sleep(1000);
        WebElement backWidgetClick = driver.findElement(settingsBackWidget);
        backWidgetClick.click();
        passLog("12-) Kullanıcı Settings ekranında 'Back' butonuna tıklar ve home ekranına döndüğünü görüntüler.");
        System.out.println("12-) Kullanıcı Settings ekranında 'Back' butonuna tıklar ve home ekranına döndüğünü görüntüler.");
        return this;
    }

    public UpgradeToUnlimitedScanPage finishTest() throws InterruptedException {
        Thread.sleep(1000);
        passLog("13-) Kullanıcı yapmış olduğu bütün test adımlarının başarılı bir şekilde gerçekleştiğini görüntüler.");
        System.out.println("13-) Kullanıcı yapmış olduğu bütün test adımlarının başarılı bir şekilde gerçekleştiğini görüntüler.");
        return this;
    }
}
