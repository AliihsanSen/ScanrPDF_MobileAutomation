package page.Android;

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

public class SharePage extends BasePage {
    AppiumDriver driver;
    TouchAction touchAction;

    public ExtentTest startTest = extent.createTest("Scanr Share  Testi", "Share  Testi");

    public void infoLog(String str) {
        startTest.log(Status.INFO, str);
    }

    public void passLog(String str) {
        startTest.log(Status.PASS, str);
    }

    public void failLog(String str) {
        startTest.log(Status.FAIL, str);
    }

    public SharePage(AppiumDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
    }

    By searchBar = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]");
    By settingsWidget = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]");
    By myDriveText = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView");
    By settingsHeaderText = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView");
    By shareButtonText = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.TextView");
    By shareHeaderText = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.TextView");
    By scanrText = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.TextView");
    By settingsBackWidget = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView");

    public SharePage myDriveText() throws InterruptedException {
        Thread.sleep(1000);
        WebElement myDriveTextVisible = driver.findElement(myDriveText);
        Assert.assertTrue(myDriveTextVisible.isDisplayed());
        passLog("1-) Kullanıcı home ekranında 'My Drive' texti olduğunu ve tıklayabileceğini görüntüler.");
        System.out.println("1-) Kullanıcı home ekranında 'My Drive' texti olduğunu ve tıklayabileceğini görüntüler.");
        return this;
    }

    public SharePage searchBarVisible() throws InterruptedException {
        Thread.sleep(1000);
        WebElement searchBarIcon = driver.findElement(searchBar);
        Assert.assertTrue(searchBarIcon.isDisplayed());
        passLog("2-) Kullanıcı home ekranında 'Search Bar' butonu olduğunu ve butona tıklayabileceğini görüntüler.");
        System.out.println("2-) Kullanıcı home ekranında 'Search Bar' butonu olduğunu ve butona tıklayabileceğini görüntüler.");
        return this;
    }

    public SharePage settingsWidgetVisible() throws InterruptedException {
        Thread.sleep(1000);
        WebElement settingsButton = driver.findElement(settingsWidget);
        Assert.assertTrue(settingsButton.isDisplayed());
        passLog("3-) Kullanıcı home ekranında 'Settings' butonu olduğunu ve butona tıklayabileceğini görüntüler.");
        System.out.println("3-) Kullanıcı home ekranında 'Settings' butonu olduğunu ve butona tıklayabileceğini görüntüler.");
        return this;
    }

    public SharePage settingsWidgetClick() throws InterruptedException {
        Thread.sleep(1000);
        touchAction = new TouchAction(driver);
        touchAction.tap(TapOptions.tapOptions()
                        .withPosition(PointOption.point(986, 198)))
                .perform();
        Thread.sleep(2000);
        passLog("4-) Kullanıcı home ekranında 'Settings' butonuna tıklar.");
        System.out.println("4-) Kullanıcı home ekranında 'Settings' butonuna tıklar.");
        return this;
    }

    public SharePage settingsHeaderVisible() throws InterruptedException {
        Thread.sleep(2500);
        WebElement settingsHeaderTextVisible = driver.findElement(settingsHeaderText);
        Assert.assertTrue(settingsHeaderTextVisible.isDisplayed());
        passLog("5-) Kullanıcı settings ekranında 'Settings' texti olduğunu görüntüler.");
        System.out.println("5-) Kullanıcı settings ekranında 'Settings' texti olduğunu görüntüler.");
        return this;
    }

    public SharePage shareButtonText() throws InterruptedException {
        Thread.sleep(1000);
        WebElement shareButtonTextVisible = driver.findElement(shareButtonText);
        Assert.assertTrue(shareButtonTextVisible.isDisplayed());
        passLog("6-) Kullanıcı settings ekranında 'Share' text'i " +
                "olduğunu ve butona tıklayabileceğini görüntüler.");
         System.out.println("6-) Kullanıcı settings ekranında 'Share' text'i " +
                "olduğunu ve butona tıklayabileceğini görüntüler.");
        return this;
    }

    public SharePage shareButtonClick() throws InterruptedException {
        Thread.sleep(1000);
        WebElement shareButtonTextClick = driver.findElement(shareButtonText);
        shareButtonTextClick.click();
        passLog("7-) Kullanıcı settings ekranında 'Share' text'ine tıklar.");
        System.out.println("7-) Kullanıcı settings ekranında 'Share' text'ine tıklar.");
        return this;
    }

    public SharePage shareHeaderTextVisible() throws InterruptedException {
        Thread.sleep(2500);
        WebElement shareHeaderTextVisible = driver.findElement(shareHeaderText);
        Assert.assertTrue(shareHeaderTextVisible.isDisplayed());
        passLog("8-) Kullanıcı settings ekranında Share butonuna tıkladıktan sonra aşağıdan yukarıya" +
                "native 'Share' bottomSheet'i açıldığını görüntüler.");
        System.out.println("8-) Kullanıcı settings ekranında Share butonuna tıkladıktan sonra aşağıdan yukarıya" +
                "native 'Share' bottomSheet'i açıldığını görüntüler.");
        return this;
    }

    public SharePage scanrTextVisible() throws InterruptedException {
        Thread.sleep(2500);
        WebElement scanrTextTextVisible = driver.findElement(scanrText);
        Assert.assertTrue(scanrTextTextVisible.isDisplayed());
        passLog("9-) Kullanıcı settings ekranında Share butonuna tıkladıktan sonra açılan ekranda" +
                "'Try Scanr Now! Turn your device into a powerful scanner.' text'i olduğunu görüntüler.");
         System.out.println("9-) Kullanıcı settings ekranında Share butonuna tıkladıktan sonra açılan ekranda" +
                "'Try Scanr Now! Turn your device into a powerful scanner.' text'i olduğunu görüntüler.");
        return this;
    }

    public SharePage sharelist() throws InterruptedException {
        Thread.sleep(2500);
        passLog("10-) Kullanıcı settings ekranında Share butonuna tıkladıktan sonra açılan ekranda" +
                "app'in linklerini hangi platfromlardan paylaşabileceğini görüntüler.");
        System.out.println("10-) Kullanıcı settings ekranında Share butonuna tıkladıktan sonra açılan ekranda" +
                "app'in linklerini hangi platfromlardan paylaşabileceğini görüntüler.");
        for (int i = 1; i <= 4; i++) {
            String shareList = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android." +
                    "widget.FrameLayout/android.widget.ScrollView/android.widget.ListView/android.widget." +
                    "LinearLayout[3]/android.widget.LinearLayout[" + i + "]/android.widget.TextView";
            WebElement shareText = driver.findElement(By.xpath(shareList));
            System.out.println("* "+ shareText.getText());
            passLog("* "+ shareText.getText());
        }
        return this;
    }

    public SharePage shareClosed () throws InterruptedException {
        Thread.sleep(1000);
        touchAction = new TouchAction(driver);
        touchAction.tap(PointOption.point(614, 721)).release().perform();
        passLog("11-) Kullanıcı native açılan 'Share' ekranını kapattı.");
        System.out.println("11-) Kullanıcı native açılan 'Share' ekranını kapattı.");
        return this;
    }

    public SharePage backWidgetClick() throws InterruptedException {
        Thread.sleep(1000);
        WebElement backWidgetClick = driver.findElement(settingsBackWidget);
        backWidgetClick.click();
        passLog("12-) Kullanıcı Settings ekranında 'Back' butonuna tıklar ve home ekranına döndüğünü görüntüler.");
        System.out.println("12-) Kullanıcı Settings ekranında 'Back' butonuna tıklar ve home ekranına döndüğünü görüntüler.");
        return this;
    }
    public SharePage finishTest() throws InterruptedException {
        Thread.sleep(1000);
        passLog("13-) Kullanıcı yapmış olduğu bütün test adımlarının başarılı bir şekilde gerçekleştiğini görüntüler.");
        System.out.println("13-) Kullanıcı yapmış olduğu bütün test adımlarının başarılı bir şekilde gerçekleştiğini görüntüler.");
        return this;
    }
}
