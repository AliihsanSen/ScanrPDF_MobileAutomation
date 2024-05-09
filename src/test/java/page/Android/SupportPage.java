package page.Android;

import base.BasePage;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class SupportPage extends BasePage {
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

    public SupportPage(AppiumDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
    }

    By searchBar = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]");
    By settingsWidget = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]");
    By myDriveText = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView");
    By settingsHeaderText = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView");
    By supportButtonText = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup[2]/android.widget.TextView");
    By supportHeaderText = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView");
    By backButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView");
    By whatCanText = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView");
    By supportSearchBar = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText");
    By frequentlyText = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView");
    By contactText = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]");
    By contactButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup");
    By contactHeader = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView");
    By sendButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView");
    By contactBack = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView");
    By settingsBackWidget = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView");

    public SupportPage myDriveText() throws InterruptedException {
        Thread.sleep(1000);
        WebElement myDriveTextVisible = driver.findElement(myDriveText);
        Assert.assertTrue(myDriveTextVisible.isDisplayed());
        passLog("1-) Kullanıcı home ekranında 'My Drive' texti olduğunu ve tıklayabileceğini görüntüler.");
        System.out.println("1-) Kullanıcı home ekranında 'My Drive' texti olduğunu ve tıklayabileceğini görüntüler.");
        return this;
    }

    public SupportPage searchBarVisible() throws InterruptedException {
        Thread.sleep(1000);
        WebElement searchBarIcon = driver.findElement(searchBar);
        Assert.assertTrue(searchBarIcon.isDisplayed());
        passLog("2-) Kullanıcı home ekranında 'Search Bar' butonu olduğunu ve butona tıklayabileceğini görüntüler.");
        System.out.println("2-) Kullanıcı home ekranında 'Search Bar' butonu olduğunu ve butona tıklayabileceğini görüntüler.");
        return this;
    }

    public SupportPage settingsWidgetVisible() throws InterruptedException {
        Thread.sleep(1000);
        WebElement settingsButton = driver.findElement(settingsWidget);
        Assert.assertTrue(settingsButton.isDisplayed());
        passLog("3-) Kullanıcı home ekranında 'Settings' butonu olduğunu ve butona tıklayabileceğini görüntüler.");
        System.out.println("3-) Kullanıcı home ekranında 'Settings' butonu olduğunu ve butona tıklayabileceğini görüntüler.");
        return this;
    }

    public SupportPage settingsWidgetClick() throws InterruptedException {
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

    public SupportPage settingsHeaderVisible() throws InterruptedException {
        Thread.sleep(2500);
        WebElement settingsHeaderTextVisible = driver.findElement(settingsHeaderText);
        Assert.assertTrue(settingsHeaderTextVisible.isDisplayed());
        passLog("5-) Kullanıcı settings ekranında 'Settings' texti olduğunu görüntüler.");
        System.out.println("5-) Kullanıcı settings ekranında 'Settings' texti olduğunu görüntüler.");
        return this;
    }

    public SupportPage supportButtonText() throws InterruptedException {
        Thread.sleep(1000);
        WebElement supportButtonTextTextVisible = driver.findElement(supportButtonText);
        Assert.assertTrue(supportButtonTextTextVisible.isDisplayed());
        passLog("6-) Kullanıcı settings ekranında 'Support' text'i " +
                "olduğunu ve butona tıklayabileceğini görüntüler.");
         System.out.println("6-) Kullanıcı settings ekranında 'Support' text'i " +
                "olduğunu ve butona tıklayabileceğini görüntüler.");
        return this;
    }

    public SupportPage supportClick() throws InterruptedException {
        Thread.sleep(1000);
        WebElement supportTextClick = driver.findElement(supportButtonText);
        supportTextClick.click();
        passLog("7-) Kullanıcı settings ekranında 'Support' text'ine tıklar.");
        System.out.println("7-) Kullanıcı settings ekranında 'Support' text'ine tıklar.");
        return this;
    }

    public SupportPage supportHeaderTextVisible() throws InterruptedException {
        Thread.sleep(2500);
        WebElement supportHeaderTextVisible = driver.findElement(supportHeaderText);
        Assert.assertTrue(supportHeaderTextVisible.isDisplayed());
        passLog("8-) Kullanıcı settings ekranında Support butonuna tıkladıktan sonra sağdan sola" +
                "'Support' ekranı açıldığını görüntüler.");
        System.out.println("8-) Kullanıcı settings ekranında Support butonuna tıkladıktan sonra sağdan sola" +
                "'Support' ekranı açıldığını görüntüler.");
        return this;
    }

    public SupportPage whatCanTextVisible() throws InterruptedException {
        Thread.sleep(2500);
        WebElement whatCanTextVisible = driver.findElement(whatCanText);
        Assert.assertTrue(whatCanTextVisible.isDisplayed());
        passLog("9-) Kullanıcı settings ekranında Support butonuna tıkladıktan sonra açılan ekranda" +
                "'What can we help you with?' text'i olduğunu görüntüler.");
         System.out.println("9-) Kullanıcı settings ekranında Support butonuna tıkladıktan sonra açılan ekranda" +
                "'What can we help you with?' text'i olduğunu görüntüler.");
        return this;
    }

    public SupportPage supportSearchBarVisible() throws InterruptedException {
        Thread.sleep(1000);
        WebElement supportSearchBarIcon = driver.findElement(supportSearchBar);
        Assert.assertTrue(supportSearchBarIcon.isDisplayed());
        passLog("10-) Kullanıcı settings ekranında Support butonuna tıkladıktan sonra açılan ekranda" +
                "search bar olduğunu görüntüler.");
         System.out.println("10-) Kullanıcı settings ekranında Support butonuna tıkladıktan sonra açılan ekranda" +
                "search bar olduğunu görüntüler.");
        return this;
    }

    public SupportPage frequentlyTextVisible() throws InterruptedException {
        Thread.sleep(2500);
        WebElement frequentlyTextVisible = driver.findElement(frequentlyText);
        Assert.assertTrue(frequentlyTextVisible.isDisplayed());
        passLog("11-) Kullanıcı settings ekranında Support butonuna tıkladıktan sonra açılan ekranda" +
                "'Frequently asked' text'i olduğunu görüntüler.");
        System.out.println("11-) Kullanıcı settings ekranında Support butonuna tıkladıktan sonra açılan ekranda" +
                "'Frequently asked' text'i olduğunu görüntüler.");
        return this;
    }

    public SupportPage supportText() throws InterruptedException {
        Thread.sleep(2500);
        passLog("12-) Kullanıcı settings ekranında Support butonuna tıkladıktan sonra açılan ekranda" +
                "app'i nasıl kullanacağına dair support text'leri olduğunu görüntüler.");
        System.out.println("12-) Kullanıcı settings ekranında Support butonuna tıkladıktan sonra açılan ekranda" +
                "app'i nasıl kullanacağına dair support text'leri olduğunu görüntüler.");
        for (int i = 1; i <= 3; i++) {
            String supportText = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup["
                    + i + "]/android.widget.TextView[1]";
            WebElement supportTexts = driver.findElement(By.xpath(supportText));
            System.out.println("* " + supportTexts.getText());
            passLog("* " + supportTexts.getText());
        }
        touchAction = new TouchAction(driver);
        touchAction.press(PointOption.point(490, 2106))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).
                moveTo(PointOption.point(560, 674)).release().perform();
        Thread.sleep(2000);
      /*  for (int i = 1; i <= 4; i++) {
            String supportText2 = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup["
                    + i + "]/android.widget.TextView[1]";
            WebElement supportTexts2 = driver.findElement(By.xpath(supportText2));
            System.out.println("* " + supportTexts2.getText());
            passLog("* " + supportTexts2.getText());
        }*/
        Thread.sleep(2000);
        touchAction.press(PointOption.point(490, 2106))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).
                moveTo(PointOption.point(560, 674)).release().perform();
        Thread.sleep(2000);
       /* for (int i = 1; i <= 4; i++) {
            String supportText3 = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup["
                    + i + "]/android.widget.TextView[1]";
            WebElement supportTexts3 = driver.findElement(By.xpath(supportText3));
            System.out.println("* " + supportTexts3.getText());
            passLog("* " + supportTexts3.getText());
        }*/
        Thread.sleep(2000);
        touchAction.press(PointOption.point(533, 2039))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).
                moveTo(PointOption.point(567, 751)).release().perform();
        Thread.sleep(2000);
        return this;
    }

    public SupportPage contactText() throws InterruptedException {
        Thread.sleep(1000);
        touchAction = new TouchAction(driver);
        touchAction.press(PointOption.point(533, 2039))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(100))).
                moveTo(PointOption.point(567, 751)).release().perform();
        Thread.sleep(2000);
        WebElement contactTextVisible = driver.findElement(contactText);
        Assert.assertTrue(contactTextVisible.isDisplayed());
        passLog("13-) Kullanıcı settings ekranında Support butonuna tıkladıktan sonra açılan ekranda" +
        "app'i nasıl kullanacağını anlamadığı zaman contact ile bağlantı kurababileceğini ve contact butonu olduğunu görüntüler.");
        System.out.println("13-) Kullanıcı settings ekranında Support butonuna tıkladıktan sonra açılan ekranda" +
                "app'i nasıl kullanacağını anlamadığı zaman contact ile bağlantı kurababileceğini ve contact butonu olduğunu görüntüler.");
        return this;
    }

    public SupportPage contactClick() throws InterruptedException {
        Thread.sleep(1000);
        WebElement contactButtonClick = driver.findElement(contactButton);
        contactButtonClick.click();
        passLog("14-) Kullanıcı settings ekranında Support butonuna tıkladıktan sonra açılan ekranda" +
                "app'i nasıl kullanacağını anlamadığı zaman contact butonuna tıklar.");
         System.out.println("14-) Kullanıcı settings ekranında Support butonuna tıkladıktan sonra açılan ekranda" +
                "app'i nasıl kullanacağını anlamadığı zaman contact butonuna tıklar.");
        return this;
    }
    public SupportPage contactHeaderTextVisible() throws InterruptedException {
        Thread.sleep(2500);
        WebElement contactHeaderTextVisible = driver.findElement(contactHeader);
        Assert.assertTrue(contactHeaderTextVisible.isDisplayed());
        passLog("15-) Kullanıcı Support ekranında contact butonuna tıkladıktan sonra sağdan sola" +
                "'Contact' ekranı açıldığını görüntüler.");
         System.out.println("15-) Kullanıcı Support ekranında contact butonuna tıkladıktan sonra sağdan sola" +
                "'Contact' ekranı açıldığını görüntüler.");
        return this;
    }

    public SupportPage sendButtonVisible() throws InterruptedException {
        Thread.sleep(1000);
        WebElement sendButtonVisible = driver.findElement(sendButton);
        Assert.assertTrue(sendButtonVisible.isDisplayed());
        passLog("16-) Kullanıcı Support ekranında contact butonuna tıkladıktan sonra sağdan sola" +
                "'Contact' ekranı açıldığını ve açılan ekranda 'Send' butonu olduğunu görüntüler.");
         System.out.println("16-) Kullanıcı Support ekranında contact butonuna tıkladıktan sonra sağdan sola" +
                "'Contact' ekranı açıldığını ve açılan ekranda 'Send' butonu olduğunu görüntüler.");
        return this;
    }

    public SupportPage contactBackVisible() throws InterruptedException {
        Thread.sleep(1000);
        WebElement contactBackIcon = driver.findElement(contactBack);
        Assert.assertTrue(contactBackIcon.isEnabled());
        passLog("17-) Kullanıcı Contact ekranında sol üst köşede back ıconu olduğunu ve tıklayabileceğini görüntüler.");
        System.out.println("17-) Kullanıcı Contact ekranında sol üst köşede back ıconu olduğunu ve tıklayabileceğini görüntüler.");
        return this;
    }

    public SupportPage contactBackClick() throws InterruptedException {
        Thread.sleep(1000);
        WebElement contactBackClick = driver.findElement(contactBack);
        contactBackClick.click();
        passLog("18-) Kullanıcı Contact ekranında sol üst köşede bulunan back ıconuna tıklar ve support ekranına döner.");
        System.out.println("18-) Kullanıcı Contact ekranında sol üst köşede bulunan back ıconuna tıklar ve support ekranına döner.");
        return this;
    }

    public SupportPage supportBackVisible() throws InterruptedException {
        Thread.sleep(1000);
        WebElement contactBackIcon = driver.findElement(contactBack);
        Assert.assertTrue(contactBackIcon.isEnabled());
        passLog("19-) Kullanıcı Support ekranında sol üst köşede back ıconu olduğunu ve tıklayabileceğini görüntüler.");
        System.out.println("19-) Kullanıcı Support ekranında sol üst köşede back ıconu olduğunu ve tıklayabileceğini görüntüler.");
        return this;
    }

    public SupportPage supportBackClick() throws InterruptedException {
        Thread.sleep(1000);
        WebElement BackClick = driver.findElement(backButton);
        BackClick.click();
        passLog("20-) Kullanıcı Support ekranında sol üst köşede bulunan back ıconuna tıklar ve support ekranına döner.");
        System.out.println("20-) Kullanıcı Support ekranında sol üst köşede bulunan back ıconuna tıklar ve support ekranına döner.");
        return this;
    }

    public SupportPage backWidgetClick() throws InterruptedException {
        Thread.sleep(1000);
        WebElement backWidgetClick = driver.findElement(settingsBackWidget);
        backWidgetClick.click();
        passLog("21-) Kullanıcı Settings ekranında 'Back' butonuna tıklar ve home ekranına döndüğünü görüntüler.");
        System.out.println("21-) Kullanıcı Settings ekranında 'Back' butonuna tıklar ve home ekranına döndüğünü görüntüler.");
        return this;
    }

    public SupportPage finishTest() throws InterruptedException {
        Thread.sleep(1000);
        passLog("22-) Kullanıcı yapmış olduğu bütün test adımlarının başarılı bir şekilde gerçekleştiğini görüntüler.");
        System.out.println("22-) Kullanıcı yapmış olduğu bütün test adımlarının başarılı bir şekilde gerçekleştiğini görüntüler.");
        return this;
    }
}
