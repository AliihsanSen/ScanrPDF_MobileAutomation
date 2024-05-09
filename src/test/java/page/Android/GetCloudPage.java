package page.Android;

import base.BasePage;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class GetCloudPage extends BasePage {

    AppiumDriver driver;
    TouchAction touchAction;

    public ExtentTest startTest = extent.createTest("Scanr Home Ekranı Get Cloud Testi", "Home Ekranı Get Cloud Testi");

    public void infoLog(String str) {
        startTest.log(Status.INFO, str);
    }

    public void passLog(String str) {
        startTest.log(Status.PASS, str);
    }

    public void failLog(String str) {
        startTest.log(Status.FAIL, str);
    }

    public GetCloudPage(AppiumDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
    }

    By getCloudText = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView");
    By xCloseButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView");
    By restoreText = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView");
    By proScanText = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button[1]/android.widget.TextView");
    By unlimitedtext = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button[2]/android.widget.TextView");
    By subcriptionWidget = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView[80]");
    By continueButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.widget.TextView");
    By scaleWidget = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView");
    By policyText = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView");

    public GetCloudPage getCloudText() throws InterruptedException {
        Thread.sleep(1000);
        WebElement getCloudTextVisible = driver.findElement(getCloudText);
        Assert.assertTrue(getCloudTextVisible.isDisplayed());
        passLog("1-) Kullanıcı home ekranında 'Get Cloud' texti olduğunu ve tıklayabileceğini görüntüler.");
        System.out.println("1-) Kullanıcı home ekranında 'Get Cloud' texti olduğunu ve tıklayabileceğini görüntüler.");
        return this;
    }

    public GetCloudPage getCloudClick() throws InterruptedException {
        Thread.sleep(1000);
        WebElement getCloudClick = driver.findElement(getCloudText);
        getCloudClick.click();
        passLog("2-) Kullanıcı home ekranında 'Get Cloud' texti'ne tıklar ve subscription ekranının açıldığını görüntüler.");
        System.out.println("2-) Kullanıcı home ekranında 'Get Cloud' texti'ne tıklar ve subscription ekranının açıldığını görüntüler.");
        return this;
    }

    public GetCloudPage xCloseButton() throws InterruptedException {
        Thread.sleep(1000);
        WebElement xCloseButtonIcon = driver.findElement(xCloseButton);
        Assert.assertTrue(xCloseButtonIcon.isDisplayed());
        passLog("3-) Kullanıcı subscription ekranının sol üst tarafında '(x)' ıconu olduğunu ve tıklayabileceğini görüntüler.");
        System.out.println("3-) Kullanıcı subscription ekranının sol üst tarafında '(x)' ıconu olduğunu ve tıklayabileceğini görüntüler.");
        return this;
    }

    public GetCloudPage restoreText() throws InterruptedException {
        Thread.sleep(1000);
        WebElement restoreTextVisible = driver.findElement(restoreText);
        Assert.assertTrue(restoreTextVisible.isDisplayed());
        passLog("4-) Kullanıcı subscription ekranının sağ üst tarafında 'restore' text'i olduğunu ve tıklayabileceğini görüntüler.");
        System.out.println("4-) Kullanıcı subscription ekranının sağ üst tarafında 'restore' text'i olduğunu ve tıklayabileceğini görüntüler.");
        return this;
    }

    public GetCloudPage unlimitedtext() throws InterruptedException {
        Thread.sleep(1000);
        WebElement unlimitedtextVisible = driver.findElement(unlimitedtext);
        Assert.assertTrue(unlimitedtextVisible.isDisplayed());
        passLog("5-) Kullanıcı subscription ekranında 'Unlimited' text'i olduğunu ve tıklayabileceğini görüntüler.");
        System.out.println("5-) Kullanıcı subscription ekranında 'Unlimited' text'i olduğunu ve tıklayabileceğini görüntüler.");
        return this;
    }

    public GetCloudPage proScanText() throws InterruptedException {
        Thread.sleep(1000);
        WebElement proScanTextVisible = driver.findElement(proScanText);
        Assert.assertTrue(proScanTextVisible.isDisplayed());
        passLog("6-) Kullanıcı subscription ekranında 'Pro Scan' text'i olduğunu ve tıklayabileceğini görüntüler.");
        System.out.println("6-) Kullanıcı subscription ekranında 'Pro Scan' text'i olduğunu ve tıklayabileceğini görüntüler.");
        return this;
    }

    public GetCloudPage subcriptionWidgetVisible() throws InterruptedException {
        Thread.sleep(1000);
        WebElement subcriptionWidgetIcon = driver.findElement(subcriptionWidget);
        Assert.assertTrue(subcriptionWidgetIcon.isDisplayed());
        passLog("7-) Kullanıcı subscription ekranında 'subcription' ıconu olduğunu görüntüler.");
        System.out.println("7-) Kullanıcı subscription ekranında 'subcription' ıconu olduğunu görüntüler.");
        return this;
    }

    public GetCloudPage subcriptionText() throws InterruptedException {
        Thread.sleep(1000);
        passLog("8-) Kullanıcı subscription ekranında subcription text'leri olduğunu görüntüler.");
        System.out.println("8-) Kullanıcı subscription ekranında subcription text'leri olduğunu görüntüler.");
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

    public GetCloudPage subcriptionPurchase() throws InterruptedException {
        Thread.sleep(1000);
        passLog("9-) Kullanıcı subscription ekranında subcription fiyatlandırmaların olduğunu görüntüler.");
        System.out.println("9-) Kullanıcı subscription ekranında subcription fiyatlandırmaların olduğunu görüntüler.");
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

    public GetCloudPage continueButtonVisible() throws InterruptedException {
        Thread.sleep(1000);
        WebElement continueButtonVisible = driver.findElement(continueButton);
        Assert.assertTrue(continueButtonVisible.isDisplayed());
        passLog("10-) Kullanıcı subscription ekranının altında 'Continue' butonu olduğunu görüntüler.");
        System.out.println("10-) Kullanıcı subscription ekranının altında 'Continue' butonu olduğunu görüntüler.");
        return this;
    }

    public GetCloudPage scaleWidgetVisible() throws InterruptedException {
        Thread.sleep(1000);
        WebElement scaleWidgetVisible = driver.findElement(scaleWidget);
        Assert.assertTrue(scaleWidgetVisible.isDisplayed());
        passLog("11-) Kullanıcı subscription ekranının altında 'Scale' butonu olduğunu görüntüler.");
        System.out.println("11-) Kullanıcı subscription ekranının altında 'Continue' butonu olduğunu görüntüler.");
        return this;
    }

    public GetCloudPage scaleWidgetClick() throws InterruptedException {
        Thread.sleep(1000);
        WebElement scaleClick = driver.findElement(scaleWidget);
        scaleClick.click();
        passLog("12-) Kullanıcı subscription ekranının altında 'Scale' butonuna tıklar.");
        System.out.println("12-) Kullanıcı subscription ekranının altında 'Scale' butonuna tıklar");
        return this;
    }

    public GetCloudPage policyTextVisible() throws InterruptedException {
        Thread.sleep(1000);
        WebElement policyTextVisible = driver.findElement(policyText);
        Assert.assertTrue(policyTextVisible.isDisplayed());
        passLog("13-) Kullanıcı subscription ekranında scale butonuna tıkladığı" +
                " zaman 'Continuing you are confirming that you have reciewed and agree to our " +
                "Terms of Service and Privacy Policy' olduğunu görüntüler.");
         System.out.println("13-) Kullanıcı subscription ekranında scale butonuna tıkladığı" +
                " zaman 'Continuing you are confirming that you have reciewed and agree to our " +
                "Terms of Service and Privacy Policy' olduğunu görüntüler.");
        return this;
    }

    public GetCloudPage xCloseClick() throws InterruptedException {
        Thread.sleep(1000);
        WebElement xCloseClick = driver.findElement(xCloseButton);
        xCloseClick.click();
        passLog("14-) Kullanıcı subscription ekranının sol üst tarafında '(x)' ıconuna tıklar ve bir önceki ekrana dönebileceğini görüntüler.");
        System.out.println("14-) Kullanıcı subscription ekranının sol üst tarafında '(x)' ıconuna tıklar ve bir önceki ekrana dönebileceğini görüntüler.");
        return this;
    }

    public GetCloudPage finishTest() throws InterruptedException {
        Thread.sleep(1000);
        passLog("15-) Kullanıcı yapmış olduğu bütün test adımlarının başarılı bir şekilde gerçekleştiğini görüntüler.");
        System.out.println("15-) Kullanıcı yapmış olduğu bütün test adımlarının başarılı bir şekilde gerçekleştiğini görüntüler.");
        return this;
    }

}
