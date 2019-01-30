package scenarios;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import static io.appium.java_client.remote.MobileCapabilityType.*;

public class AppiumDemo {

    private AndroidDriver driver;

    @BeforeTest
    public void setUp() throws MalformedURLException {

        File appDir = new File("/home/dhirajsharma/Drive/Arson/Projects/Appium/FirstAppiumDemo/apps/");
        File app = new File(appDir, "test.apk");

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(DEVICE_NAME, "Android");
        capabilities.setCapability(PLATFORM_NAME, "Android");

        capabilities.setCapability(APP, app.getAbsolutePath());
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @Test
    public void testApp() {
        System.out.println("App launched");

        By addContact = By.id("addContactButton");
        driver.findElement(addContact).click();


    }

}
