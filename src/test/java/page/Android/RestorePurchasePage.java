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

public class RestorePurchasePage extends BasePage {
    AppiumDriver driver;
    TouchAction touchAction;

    public ExtentTest startTest = extent.createTest("Scanr Restore Purchase Testi", "Restore Purchase Testi");

    public void infoLog(String str) {
        startTest.log(Status.INFO, str);
    }

    public void passLog(String str) {
        startTest.log(Status.PASS, str);
    }

    public void failLog(String str) {
        startTest.log(Status.FAIL, str);
    }

    public RestorePurchasePage(AppiumDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
    }

    By searchBar = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]");
    By settingsWidget = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]");
    By myDriveText = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView");
    By settingsHeaderText = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView");
    By restorePurchaseButtonText = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[10]/android.view.ViewGroup[2]/android.widget.TextView");
    By lottie = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup");
    By toastMessage = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView");
    By settingsBackWidget = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView");

    public RestorePurchasePage myDriveText() throws InterruptedException {
        Thread.sleep(1000);
        WebElement myDriveTextVisible = driver.findElement(myDriveText);
        Assert.assertTrue(myDriveTextVisible.isDisplayed());
        passLog("1-) Kullanıcı home ekranında 'My Drive' texti olduğunu ve tıklayabileceğini görüntüler.");
        System.out.println("1-) Kullanıcı home ekranında 'My Drive' texti olduğunu ve tıklayabileceğini görüntüler.");
        return this;
    }

    public RestorePurchasePage searchBarVisible() throws InterruptedException {
        Thread.sleep(1000);
        WebElement searchBarIcon = driver.findElement(searchBar);
        Assert.assertTrue(searchBarIcon.isDisplayed());
        passLog("2-) Kullanıcı home ekranında 'Search Bar' butonu olduğunu ve butona tıklayabileceğini görüntüler.");
        System.out.println("2-) Kullanıcı home ekranında 'Search Bar' butonu olduğunu ve butona tıklayabileceğini görüntüler.");
        return this;
    }

    public RestorePurchasePage settingsWidgetVisible() throws InterruptedException {
        Thread.sleep(1000);
        WebElement settingsButton = driver.findElement(settingsWidget);
        Assert.assertTrue(settingsButton.isDisplayed());
        passLog("3-) Kullanıcı home ekranında 'Settings' butonu olduğunu ve butona tıklayabileceğini görüntüler.");
        System.out.println("3-) Kullanıcı home ekranında 'Settings' butonu olduğunu ve butona tıklayabileceğini görüntüler.");
        return this;
    }

    public RestorePurchasePage settingsWidgetClick() throws InterruptedException {
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

    public RestorePurchasePage settingsHeaderVisible() throws InterruptedException {
        Thread.sleep(2500);
        WebElement settingsHeaderTextVisible = driver.findElement(settingsHeaderText);
        Assert.assertTrue(settingsHeaderTextVisible.isDisplayed());
        passLog("5-) Kullanıcı settings ekranında 'Settings' texti olduğunu görüntüler.");
        System.out.println("5-) Kullanıcı settings ekranında 'Settings' texti olduğunu görüntüler.");
        return this;
    }

    public RestorePurchasePage restorePurchaseButtonText() throws InterruptedException {
        Thread.sleep(1000);
        WebElement restorePurchaseButtonTextVisible = driver.findElement(restorePurchaseButtonText);
        Assert.assertTrue(restorePurchaseButtonTextVisible.isDisplayed());
        passLog("6-) Kullanıcı settings ekranında 'Restore Purchase' text'i " +
                "olduğunu ve butona tıklayabileceğini görüntüler.");
         System.out.println("6-) Kullanıcı settings ekranında 'Restore Purchase' text'i " +
                "olduğunu ve butona tıklayabileceğini görüntüler.");
        return this;
    }

    public RestorePurchasePage restorePurchaseButtonClick() throws InterruptedException {
        Thread.sleep(1000);
        WebElement restorePurchaseButtonTextClick = driver.findElement(restorePurchaseButtonText);
        restorePurchaseButtonTextClick.click();
        passLog("7-) Kullanıcı settings ekranında 'Restore Purchase' text'ine tıklar.");
        System.out.println("7-) Kullanıcı settings ekranında 'Restore Purchase' text'ine tıklar.");
        return this;
    }
    public RestorePurchasePage lottieVisible() throws InterruptedException {
        Thread.sleep(1000);
        WebElement lottieVisible = driver.findElement(lottie);
        Assert.assertTrue(lottieVisible.isDisplayed());
        passLog("8-) Kullanıcı settings ekranında 'Restore Purchase' text'ine tıkladıktan sonra" +
                " lottie şeklinde bir modal açıldığını görüntüler.");
         System.out.println("8-) Kullanıcı settings ekranında 'Restore Purchase' text'ine tıkladıktan sonra" +
                " lottie şeklinde bir modal açıldığını görüntüler.");
        return this;
    }
    public RestorePurchasePage toastMessageVisible() throws InterruptedException {
        Thread.sleep(4000);
        WebElement toastMessageVisible = driver.findElement(toastMessage);
        Assert.assertTrue(toastMessageVisible.isDisplayed());
        passLog("9-) Kullanıcı settings ekranında 'Restore Purchase' text'ine tıkladıktan sonra" +
                " yukarıdan bir toast mesajı görünerek kullanıcının paketi uptade edildiğini görüntüler.");
        System.out.println("9-) Kullanıcı settings ekranında 'Restore Purchase' text'ine tıkladıktan sonra" +
                " yukarıdan bir toast mesajı görünerek kullanıcının paketi uptade edildiğini görüntüler.");
        return this;
    }

    public RestorePurchasePage backWidgetClick() throws InterruptedException {
        Thread.sleep(1000);
        WebElement backWidgetClick = driver.findElement(settingsBackWidget);
        backWidgetClick.click();
        passLog("12-) Kullanıcı Settings ekranında 'Back' butonuna tıklar ve home ekranına döndüğünü görüntüler.");
        System.out.println("12-) Kullanıcı Settings ekranında 'Back' butonuna tıklar ve home ekranına döndüğünü görüntüler.");
        return this;
    }

    public RestorePurchasePage finishTest() throws InterruptedException {
        Thread.sleep(1000);
        passLog("10-) Kullanıcı yapmış olduğu bütün test adımlarının başarılı bir şekilde gerçekleştiğini görüntüler.");
        System.out.println("10-) Kullanıcı yapmış olduğu bütün test adımlarının başarılı bir şekilde gerçekleştiğini görüntüler.");
        return this;
    }
}
