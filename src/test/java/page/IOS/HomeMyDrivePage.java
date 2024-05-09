package page.IOS;

import base.BasePage;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class HomeMyDrivePage extends BasePage {
    AppiumDriver driver;
    TouchAction touchAction;

    public ExtentTest startTest = extent.createTest("Scanr Home Ekranı My Drive Testi", "Home Ekranı My Drive Testi");

    public void infoLog(String str) {
        startTest.log(Status.INFO, str);
    }

    public void passLog(String str) {
        startTest.log(Status.PASS, str);
    }

    public void failLog(String str) {
        startTest.log(Status.FAIL, str);
    }

    public HomeMyDrivePage(AppiumDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
    }

    By searchBar = By.xpath("(//XCUIElementTypeOther[@name=\"Search folder or files\"])[5]/XCUIElementTypeTextField");
    By settingsWidget = By.xpath("(//XCUIElementTypeOther[@name=\"Search folder or files\"])[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther");
    By myDriveText = By.xpath("(//XCUIElementTypeOther[@name=\"My Drive\"])[2]");
    By foldersText = By.xpath("(//XCUIElementTypeOther[@name=\"Folders\"])[2]");
    By allFilesText = By.xpath("(//XCUIElementTypeOther[@name=\"All Files\"])[2]");
    By getCloudText = By.xpath("(//XCUIElementTypeOther[@name=\"Get Cloud Files are not synced 0.00 B/50.00 MB\"])[2]");
    By filesAreNotSyncedText = By.xpath("(//XCUIElementTypeOther[@name=\"Get Cloud Files are not synced 0.00 B/50.00 MB\"])[2]");
    By storage = By.xpath("(//XCUIElementTypeOther[@name=\"Get Cloud Files are not synced 0.00 B/50.00 MB\"])[2]");
    By modifiedDateText = By.xpath("(//XCUIElementTypeOther[@name=\"Modified Date \uF062\"])[3]");
    By modifiedDateWidget = By.xpath("(//XCUIElementTypeOther[@name=\"Modified Date \uF062\"])[3]");
    By onboardWidget = By.xpath("//XCUIElementTypeOther[@name=\"You do not have a file yet.\n" +
            " Create now!\"]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[56]");
    By onboardText = By.xpath("//XCUIElementTypeStaticText[@name=\"You do not have a file yet.\n" +
            " Create now!\"]");
    By addComponentiWidget = By.xpath("//XCUIElementTypeButton[@name=\"icon-button\"]");
    By scanFromCameraText = By.xpath("//XCUIElementTypeOther[@name=\"Scan from camera\"]");
    By importFromGaleryText = By.xpath("//XCUIElementTypeOther[@name=\"Import from gallery\"]");
    By createFolderText = By.xpath("//XCUIElementTypeOther[@name=\"Create Folder\"]");

    public HomeMyDrivePage searchBarVisible() throws InterruptedException {
        Thread.sleep(1000);
        WebElement searchBarIcon = driver.findElement(searchBar);
        Assert.assertTrue(searchBarIcon.isEnabled());
        passLog("1-) Kullanıcı home ekranında 'Search Bar' butonu olduğunu ve butona tıklayabileceğini görüntüler.");
        System.out.println("1-) Kullanıcı home ekranında 'Search Bar' butonu olduğunu ve butona tıklayabileceğini görüntüler.");
        return this;
    }

    public HomeMyDrivePage settingsWidgetVisible() throws InterruptedException {
        Thread.sleep(1000);
        WebElement settingsButton = driver.findElement(settingsWidget);
        Assert.assertTrue(settingsButton.isEnabled());
        passLog("2-) Kullanıcı home ekranında 'Settings' butonu olduğunu ve butona tıklayabileceğini görüntüler.");
        System.out.println("2-) Kullanıcı home ekranında 'Settings' butonu olduğunu ve butona tıklayabileceğini görüntüler.");
        return this;
    }

    public HomeMyDrivePage myDriveText() throws InterruptedException {
        Thread.sleep(1000);
        WebElement myDriveTextVisible = driver.findElement(myDriveText);
        Assert.assertTrue(myDriveTextVisible.isDisplayed());
        passLog("3-) Kullanıcı home ekranında 'My Drive' texti olduğunu ve tıklayabileceğini görüntüler.");
        System.out.println("3-) Kullanıcı home ekranında 'My Drive' texti olduğunu ve tıklayabileceğini görüntüler.");
        return this;
    }

    public HomeMyDrivePage foldersText() throws InterruptedException {
        Thread.sleep(1000);
        WebElement foldersTextVisible = driver.findElement(foldersText);
        Assert.assertTrue(foldersTextVisible.isDisplayed());
        passLog("4-) Kullanıcı home ekranında 'Folders' texti olduğunu ve tıklayabileceğini görüntüler.");
        System.out.println("4-) Kullanıcı home ekranında 'Folders' texti olduğunu ve tıklayabileceğini görüntüler.");
        return this;
    }

    public HomeMyDrivePage allFilesText() throws InterruptedException {
        Thread.sleep(1000);
        WebElement allFilesTextVisible = driver.findElement(allFilesText);
        Assert.assertTrue(allFilesTextVisible.isDisplayed());
        passLog("5-) Kullanıcı home ekranında 'All Files' texti olduğunu ve tıklayabileceğini görüntüler.");
        System.out.println("5-) Kullanıcı home ekranında 'All Files' texti olduğunu ve tıklayabileceğini görüntüler.");
        return this;
    }

    public HomeMyDrivePage getCloudText() throws InterruptedException {
        Thread.sleep(1000);
        WebElement getCloudTextVisible = driver.findElement(getCloudText);
        Assert.assertTrue(getCloudTextVisible.isDisplayed());
        passLog("6-) Kullanıcı home ekranında My Drive sayfasında 'Get Cloud' texti olduğunu ve tıklayabileceğini görüntüler.");
        System.out.println("6-) Kullanıcı home ekranında My Drive sayfasında 'Get Cloud' texti olduğunu ve tıklayabileceğini görüntüler.");
        return this;
    }

    public HomeMyDrivePage filesAreNotSyncedText() throws InterruptedException {
        Thread.sleep(1000);
        WebElement filesAreNotSyncedTextVisible = driver.findElement(filesAreNotSyncedText);
        Assert.assertTrue(filesAreNotSyncedTextVisible.isDisplayed());
        passLog("7-) Kullanıcı home ekranında My Drive sayfasında 'Files are not synced' texti olduğunu görüntüler.");
        System.out.println("7-) Kullanıcı home ekranında My Drive sayfasında 'Files are not synced' texti olduğunu görüntüler.");
        return this;
    }

    public HomeMyDrivePage storage() throws InterruptedException {
        Thread.sleep(1000);
        WebElement storageVisible = driver.findElement(storage);
        Assert.assertTrue(storageVisible.isDisplayed());
        passLog("8-) Kullanıcı home ekranında My Drive sayfasında 'Storage' alanını görüntüleyebileceğini doğrular.");
        System.out.println("8-) Kullanıcı home ekranında My Drive sayfasında 'Storage' alanını görüntüleyebileceğini doğrular.");
        return this;
    }

    public HomeMyDrivePage modifiedDateText() throws InterruptedException {
        Thread.sleep(1000);
        WebElement modifiedDateTextVisible = driver.findElement(modifiedDateText);
        Assert.assertTrue(modifiedDateTextVisible.isEnabled());
        passLog("9-) Kullanıcı home ekranında My Drive sayfasında 'Modified Date' texti olduğunu, " +
                "tıklayabileceğini ve eklemiş olduğu dosyaları sıralayabileceğini görüntüler.");
        System.out.println("9-) Kullanıcı home ekranında My Drive sayfasında 'Modified Date' texti olduğunu, " +
                "tıklayabileceğini ve eklemiş olduğu dosyaları sıralayabileceğini görüntüler.");
        return this;
    }

    public HomeMyDrivePage modifiedDateWidget() throws InterruptedException {
        Thread.sleep(1000);
        WebElement modifiedDateIcon = driver.findElement(modifiedDateWidget);
        Assert.assertTrue(modifiedDateIcon.isDisplayed());
        passLog("10-) Kullanıcı home ekranında My Drive sayfasında 'Modified Date' ıconu olduğunu " +
                "ve 'Modified Date' textine tıkladığı zaman ıconun aşağı yukarı döndüğünü görüntüler.");
         System.out.println("10-) Kullanıcı home ekranında My Drive sayfasında 'Modified Date' ıconu olduğunu " +
                "ve 'Modified Date' textine tıkladığı zaman ıconun aşağı yukarı döndüğünü görüntüler.");
        return this;
    }

    public HomeMyDrivePage onboardWidgetVisible() throws InterruptedException {
        Thread.sleep(1000);
        WebElement onboardWidgetIcon = driver.findElement(onboardWidget);
        Assert.assertTrue(onboardWidgetIcon.isDisplayed());
        passLog("11-) Kullanıcı home ekranında My Drive sayfasında 'My Drive' ıconu olduğunu görüntüler.");
        System.out.println("11-) Kullanıcı home ekranında My Drive sayfasında 'My Drive' ıconu olduğunu görüntüler.");
        return this;
    }

    public HomeMyDrivePage onboardText() throws InterruptedException {
        Thread.sleep(1000);
        WebElement onboardTextVisible = driver.findElement(onboardText);
        Assert.assertTrue(onboardTextVisible.isDisplayed());
        passLog("12-) Kullanıcı home ekranında My Drive sayfasında 'You do not have a file yet." +
                " Create now!' texti olduğunu görüntüler.");
         System.out.println("12-) Kullanıcı home ekranında My Drive sayfasında 'You do not have a file yet." +
                " Create now!' texti olduğunu görüntüler.");
        return this;
    }

    public HomeMyDrivePage addComponentiWidgetVisible() throws InterruptedException {
        Thread.sleep(1000);
        WebElement addComponentiIcon = driver.findElement(addComponentiWidget);
        Assert.assertTrue(addComponentiIcon.isDisplayed());
        passLog("13-) Kullanıcı home ekranında My Drive sayfasında add componenti ıconu olduğunu görüntüler.");
        System.out.println("13-) Kullanıcı home ekranında My Drive sayfasında add componenti ıconu olduğunu görüntüler.");
        return this;
    }

    public HomeMyDrivePage addComponentiClick() throws InterruptedException {
        Thread.sleep(1000);
        WebElement addComponentiClick = driver.findElement(addComponentiWidget);
        addComponentiClick.click();
        passLog("14-) Kullanıcı home ekranında My Drive sayfasındaki add componenti tıklanabilir olduğunu " +
                "görüntüler ve tıklar.");
         System.out.println("14-) Kullanıcı home ekranında My Drive sayfasındaki add componenti tıklanabilir olduğunu " +
                "görüntüler ve tıklar.");
        return this;
    }

    public HomeMyDrivePage scanFromCameraTextVisible () throws InterruptedException {
        Thread.sleep(2000);
        WebElement scanFromCameraTextVisible = driver.findElement(scanFromCameraText);
        Assert.assertTrue(scanFromCameraTextVisible.isDisplayed());
        passLog("15-) Kullanıcı home ekranında My Drive sayfasında add componenti tıklar ve 'Scan From Camera' text'inin olduğunu görüntüler. ");
        System.out.println("15-) Kullanıcı home ekranındaki add componenti tıklar ve 'Scan From Camera' text'inin olduğunu görüntüler.");
        return this;
    }

    public HomeMyDrivePage importFromGaleryTextVisible () throws InterruptedException {
        Thread.sleep(2000);
        WebElement importFromGaleryTextVisible = driver.findElement(importFromGaleryText);
        Assert.assertTrue(importFromGaleryTextVisible.isDisplayed());
        passLog("16-) Kullanıcı home ekranındaki add componenti tıklar ve 'İmport From Galery' text'inin olduğunu görüntüler. ");
        System.out.println("16-) Kullanıcı home ekranındaki add componenti tıklar ve 'İmport From Galery' text'inin olduğunu görüntüler.");
        return this;
    }

    public HomeMyDrivePage createFolderTextVisible () throws InterruptedException {
        Thread.sleep(2000);
        WebElement createFolderTextVisible = driver.findElement(createFolderText);
        Assert.assertTrue(createFolderTextVisible.isDisplayed());
        passLog("17-) Kullanıcı home ekranındaki add componenti tıklar ve 'Create Folder' text'inin olduğunu görüntüler. ");
        System.out.println("17-) Kullanıcı home ekranındaki add componenti tıklar ve 'Create Folder' text'inin olduğunu görüntüler.");
        return this;
    }

    public HomeMyDrivePage addAddComponentiClosed () throws InterruptedException {
        Thread.sleep(1000);
        touchAction = new TouchAction(driver);
        touchAction.tap(PointOption.point(196, 281)).release().perform();
        passLog("18-) Kullanıcı 'Add Componentinin' bulunduğu ekranı kapattı.");
        System.out.println("18-) Kullanıcı 'Add Componentinin' bulunduğu ekranı kapattı.");
        return this;
    }

    public HomeMyDrivePage finishTest() throws InterruptedException {
        Thread.sleep(1000);
        passLog("19-) Kullanıcı yapmış olduğu bütün test adımlarının başarılı bir şekilde gerçekleştiğini görüntüler.");
        System.out.println("19-) Kullanıcı yapmış olduğu bütün test adımlarının başarılı bir şekilde gerçekleştiğini görüntüler.");
        return this;
    }
}
