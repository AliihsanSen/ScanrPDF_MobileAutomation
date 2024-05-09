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

public class SubscriptionPage extends BasePage {
    AppiumDriver driver;
    TouchAction touchAction;

    public ExtentTest startTest = extent.createTest("Scanr Subscription Testi", "Subscription Testi");

    public void infoLog(String str) {
        startTest.log(Status.INFO, str);
    }

    public void passLog(String str) {
        startTest.log(Status.PASS, str);
    }

    public void failLog(String str) {
        startTest.log(Status.FAIL, str);
    }

    public SubscriptionPage(AppiumDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
    }

    By searchBar = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]");
    By settingsWidget = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]");
    By myDriveText = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView");
    By settingsHeaderText = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView");
    By upgradeToUnlimitedScanText = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.TextView[1]");
    By xCloseButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView");
    By proScanText = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button[1]/android.widget.TextView");
    By unlimitedtext = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button[2]/android.widget.TextView");
    By subcriptionWidget = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView[80]");
    By continueButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.widget.TextView");
    By scaleWidget = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView");
    By policyText = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView");

    public SubscriptionPage myDriveText() throws InterruptedException {
        Thread.sleep(1000);
        WebElement myDriveTextVisible = driver.findElement(myDriveText);
        Assert.assertTrue(myDriveTextVisible.isDisplayed());
        passLog("1-) Kullanıcı home ekranında 'My Drive' texti olduğunu ve tıklayabileceğini görüntüler.");
        System.out.println("1-) Kullanıcı home ekranında 'My Drive' texti olduğunu ve tıklayabileceğini görüntüler.");
        return this;
    }

    public SubscriptionPage searchBarVisible() throws InterruptedException {
        Thread.sleep(1000);
        WebElement searchBarIcon = driver.findElement(searchBar);
        Assert.assertTrue(searchBarIcon.isDisplayed());
        passLog("2-) Kullanıcı home ekranında 'Search Bar' butonu olduğunu ve butona tıklayabileceğini görüntüler.");
        System.out.println("2-) Kullanıcı home ekranında 'Search Bar' butonu olduğunu ve butona tıklayabileceğini görüntüler.");
        return this;
    }

    public SubscriptionPage settingsWidgetVisible() throws InterruptedException {
        Thread.sleep(1000);
        WebElement settingsButton = driver.findElement(settingsWidget);
        Assert.assertTrue(settingsButton.isDisplayed());
        passLog("3-) Kullanıcı home ekranında 'Settings' butonu olduğunu ve butona tıklayabileceğini görüntüler.");
        System.out.println("3-) Kullanıcı home ekranında 'Settings' butonu olduğunu ve butona tıklayabileceğini görüntüler.");
        return this;
    }

    public SubscriptionPage settingsWidgetClick() throws InterruptedException {
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

    public SubscriptionPage settingsHeaderVisible() throws InterruptedException {
        Thread.sleep(2500);
        WebElement settingsHeaderTextVisible = driver.findElement(settingsHeaderText);
        Assert.assertTrue(settingsHeaderTextVisible.isDisplayed());
        passLog("5-) Kullanıcı settings ekranında 'Settings' texti olduğunu görüntüler.");
        System.out.println("5-) Kullanıcı settings ekranında 'Settings' texti olduğunu görüntüler.");
        return this;
    }

    public SubscriptionPage upgradeToUnlimitedScanText() throws InterruptedException {
        Thread.sleep(1000);
        WebElement upgradeToUnlimitedScanTextVisible = driver.findElement(upgradeToUnlimitedScanText);
        Assert.assertTrue(upgradeToUnlimitedScanTextVisible.isDisplayed());
        passLog("6-) Kullanıcı settings ekranında 'Upgrade To Unlimited Scan' text'i " +
                "olduğunu ve butona tıklayabileceğini görüntüler.");
        System.out.println("6-) Kullanıcı settings ekranında 'Upgrade To Unlimited Scan' text'i " +
                "olduğunu ve butona tıklayabileceğini görüntüler.");
        return this;
    }

    public SubscriptionPage upgradeToUnlimitedScanClick() throws InterruptedException {
        Thread.sleep(1000);
        WebElement upgradeToUnlimitedScanTextClick = driver.findElement(upgradeToUnlimitedScanText);
        upgradeToUnlimitedScanTextClick.click();
        passLog("7-) Kullanıcı settings ekranında 'Upgrade To Unlimited Scan' text'ine tıklar.");
        System.out.println("7-) Kullanıcı settings ekranında 'Upgrade To Unlimited Scan' text'ine tıklar.");
        return this;
    }

    public SubscriptionPage xCloseButton() throws InterruptedException {
        Thread.sleep(1000);
        WebElement xCloseButtonIcon = driver.findElement(xCloseButton);
        Assert.assertTrue(xCloseButtonIcon.isDisplayed());
        passLog("8-) Kullanıcı subscription ekranının sol üst tarafında '(x)' ıconu olduğunu ve tıklayabileceğini görüntüler.");
        System.out.println("8-) Kullanıcı subscription ekranının sol üst tarafında '(x)' ıconu olduğunu ve tıklayabileceğini görüntüler.");
        return this;
    }

    public SubscriptionPage unlimitedtext() throws InterruptedException {
        Thread.sleep(1000);
        WebElement unlimitedtextVisible = driver.findElement(unlimitedtext);
        Assert.assertTrue(unlimitedtextVisible.isDisplayed());
        passLog("9-) Kullanıcı subscription ekranında 'Unlimited' text'i olduğunu ve tıklayabileceğini görüntüler.");
        System.out.println("9-) Kullanıcı subscription ekranında 'Unlimited' text'i olduğunu ve tıklayabileceğini görüntüler.");
        return this;
    }

    public SubscriptionPage proScanText() throws InterruptedException {
        Thread.sleep(1000);
        WebElement proScanTextVisible = driver.findElement(proScanText);
        Assert.assertTrue(proScanTextVisible.isDisplayed());
        passLog("10-) Kullanıcı subscription ekranında 'Pro Scan' text'i olduğunu ve tıklayabileceğini görüntüler.");
        System.out.println("10-) Kullanıcı subscription ekranında 'Pro Scan' text'i olduğunu ve tıklayabileceğini görüntüler.");
        return this;
    }

    public SubscriptionPage subscriptionWidgetVisible() throws InterruptedException {
        Thread.sleep(1000);
        WebElement subcriptionWidgetIcon = driver.findElement(subcriptionWidget);
        Assert.assertTrue(subcriptionWidgetIcon.isDisplayed());
        passLog("11-) Kullanıcı subscription ekranında 'subcription' ıconu olduğunu görüntüler.");
        System.out.println("11-) Kullanıcı subscription ekranında 'subcription' ıconu olduğunu görüntüler.");
        return this;
    }

    public SubscriptionPage proSubscriptionText() throws InterruptedException {
        Thread.sleep(1000);
        passLog("12-) Kullanıcı subscription ekranında 'PRO SCAN' text'leri olduğunu görüntüler.");
        System.out.println("12-) Kullanıcı subscription ekranında 'PRO SCAN' text'leri olduğunu görüntüler.");
        for (int i = 1; i <= 6; i++) {
            String subcriptionText = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
                    "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
                    "android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android" +
                    ".view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view." +
                    "ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/" +
                    "android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android" +
                    ".view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view." +
                    "ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/" +
                    "android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android" +
                    ".widget.FrameLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview." +
                    "widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android." +
                    "view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view." +
                    "ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup" +
                    "/android.view.ViewGroup[" + i + "]/android.view.ViewGroup/android.widget.TextView";
            WebElement subcriptionTexts = driver.findElement(By.xpath(subcriptionText));
            System.out.println("* " + subcriptionTexts.getText());
            passLog("* " + subcriptionTexts.getText());
        }
        return this;
    }

    public SubscriptionPage proSubscriptionPurchase() throws InterruptedException {
        Thread.sleep(1000);
        passLog("13-) Kullanıcı subscription ekranında 'PRO SCAN' fiyatlandırmalarının olduğunu görüntüler.");
        System.out.println("13-) Kullanıcı subscription ekranında 'PRO SCAN' fiyatlandırmalarının olduğunu görüntüler.");
        for (int i = 1; i <= 4; i++) {
            String subcriptionPurchase = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android." +
                    "widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget." +
                    "FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view." +
                    "ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view." +
                    "ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget." +
                    "FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view." +
                    "ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view." +
                    "ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.FrameLayout" +
                    "/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android." +
                    "widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup" +
                    "/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view." +
                    "ViewGroup[3]/android.view.ViewGroup[" + i + "]/android.view.ViewGroup/android.view.ViewGroup" +
                    "[1]/android.widget.TextView";
            WebElement subcriptionPurchases = driver.findElement(By.xpath(subcriptionPurchase));
            System.out.println("* " + subcriptionPurchases.getText());
            passLog("* " + subcriptionPurchases.getText());
        }
        return this;
    }

    public SubscriptionPage unlimitedClick() throws InterruptedException {
        Thread.sleep(1000);
        WebElement unlimitedtextClick = driver.findElement(unlimitedtext);
        unlimitedtextClick.click();
        passLog("14-) Kullanıcı subscription ekranında 'Unlimited' text'ine tıklar.");
        System.out.println("14-) Kullanıcı subscription ekranında 'Unlimited' text'ine tıklar.");
        return this;
    }

    public SubscriptionPage unlimitedSubscriptionText() throws InterruptedException {
        Thread.sleep(1000);
        passLog("15-) Kullanıcı subscription ekranında 'UNLIMITED' text'leri olduğunu görüntüler.");
        System.out.println("15-) Kullanıcı subscription ekranında 'UNLIMITED' text'leri olduğunu görüntüler.");
        for (int i = 1; i <= 6; i++) {
            String subcriptionText = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget" +
                    ".FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/" +
                    "android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/" +
                    "android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/" +
                    "android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/" +
                    "android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/" +
                    "android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android" +
                    ".view.ViewGroup[2]/android.view.ViewGroup/android.widget.FrameLayout/androidx.viewpager.widget." +
                    "ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view." +
                    "ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view." +
                    "ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view." +
                    "ViewGroup[" + i + "]/android.view.ViewGroup/android.widget.TextView";
            WebElement subcriptionTexts = driver.findElement(By.xpath(subcriptionText));
            System.out.println("* " + subcriptionTexts.getText());
            passLog("* " + subcriptionTexts.getText());
        }
        return this;
    }

    public SubscriptionPage unlimitedSubscriptionPurchase() throws InterruptedException {
        Thread.sleep(1000);
        passLog("16-) Kullanıcı subscription ekranında 'UNLIMITED' fiyatlandırmalarının olduğunu görüntüler.");
        System.out.println("16-) Kullanıcı subscription ekranında 'UNLIMITED' fiyatlandırmalarının olduğunu görüntüler.");
        for (int i = 1; i <= 4; i++) {
            String subcriptionPurchase = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android." +
                    "widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget." +
                    "FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view." +
                    "ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view." +
                    "ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget." +
                    "FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view." +
                    "ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view." +
                    "ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.FrameLayout/androidx." +
                    "viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/" +
                    "android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/" +
                    "android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup["
                    + i + "]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView";
            WebElement subcriptionPurchases = driver.findElement(By.xpath(subcriptionPurchase));
            System.out.println("* " + subcriptionPurchases.getText());
            passLog("* " + subcriptionPurchases.getText());
        }
        return this;
    }

    public SubscriptionPage proScanClick() throws InterruptedException {
        Thread.sleep(1000);
        WebElement proScantextClick = driver.findElement(proScanText);
        proScantextClick.click();
        passLog("17-) Kullanıcı subscription ekranında 'Pro Scan' text'ine tıklar.");
        System.out.println("17-) Kullanıcı subscription ekranında 'Pro Scan' text'ine tıklar.");
        return this;
    }

    public SubscriptionPage continueButtonVisible() throws InterruptedException {
        Thread.sleep(1000);
        WebElement continueButtonVisible = driver.findElement(continueButton);
        Assert.assertTrue(continueButtonVisible.isDisplayed());
        passLog("18-) Kullanıcı subscription ekranının altında 'Continue' butonu olduğunu görüntüler.");
        System.out.println("18-) Kullanıcı subscription ekranının altında 'Continue' butonu olduğunu görüntüler.");
        return this;
    }

    public SubscriptionPage scaleWidgetVisible() throws InterruptedException {
        Thread.sleep(1000);
        WebElement scaleWidgetVisible = driver.findElement(scaleWidget);
        Assert.assertTrue(scaleWidgetVisible.isDisplayed());
        passLog("19-) Kullanıcı subscription ekranının altında 'Scale' butonu olduğunu görüntüler.");
        System.out.println("19-) Kullanıcı subscription ekranının altında 'Continue' butonu olduğunu görüntüler.");
        return this;
    }

    public SubscriptionPage scaleWidgetClick() throws InterruptedException {
        Thread.sleep(1000);
        WebElement scaleClick = driver.findElement(scaleWidget);
        scaleClick.click();
        passLog("20-) Kullanıcı subscription ekranının altında 'Scale' butonuna tıklar.");
        System.out.println("20-) Kullanıcı subscription ekranının altında 'Scale' butonuna tıklar");
        return this;
    }

    public SubscriptionPage policyTextVisible() throws InterruptedException {
        Thread.sleep(1000);
        WebElement policyTextVisible = driver.findElement(policyText);
        Assert.assertTrue(policyTextVisible.isDisplayed());
        passLog("21-) Kullanıcı subscription ekranında scale butonuna tıkladığı" +
                " zaman 'Continuing you are confirming that you have reciewed and agree to our " +
                "Terms of Service and Privacy Policy' olduğunu görüntüler.");
        System.out.println("21-) Kullanıcı subscription ekranında scale butonuna tıkladığı" +
                " zaman 'Continuing you are confirming that you have reciewed and agree to our " +
                "Terms of Service and Privacy Policy' olduğunu görüntüler.");
        return this;
    }

    public SubscriptionPage xCloseClick() throws InterruptedException {
        Thread.sleep(1000);
        WebElement xCloseClick = driver.findElement(xCloseButton);
        xCloseClick.click();
        passLog("22-) Kullanıcı subscription ekranının sol üst tarafında '(x)' ıconuna tıklar ve bir önceki ekrana dönebileceğini görüntüler.");
        System.out.println("22-) Kullanıcı subscription ekranının sol üst tarafında '(x)' ıconuna tıklar ve bir önceki ekrana dönebileceğini görüntüler.");
        return this;
    }

    public SubscriptionPage finishTest() throws InterruptedException {
        Thread.sleep(1000);
        passLog("23-) Kullanıcı yapmış olduğu bütün test adımlarının başarılı bir şekilde gerçekleştiğini görüntüler.");
        System.out.println("23-) Kullanıcı yapmış olduğu bütün test adımlarının başarılı bir şekilde gerçekleştiğini görüntüler.");
        return this;
    }
}

