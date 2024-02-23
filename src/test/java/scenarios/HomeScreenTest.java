package scenarios;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomeScreenTest extends BaseTest {

    @Test
    public void testProgressBarIsDisplayedAtStart() {
        By progressBarLocator = By.id("progressBar");
        boolean isDisplayed = driver.findElement(progressBarLocator).isDisplayed();
        Assert.assertTrue(isDisplayed, "Progress bar is not displayed at start");
    }

    @Test
    public void testRecyclerViewIsShownAfterProgressBarHides() {
        By progressBarLocator = By.id("progressBar");
        By recyclerViewLocator = By.id("recyclerViewCurrencies");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(progressBarLocator));

        boolean isDisplayed = driver.findElement(recyclerViewLocator).isDisplayed();
        Assert.assertTrue(isDisplayed, "RecyclerView is not displayed after the progress bar hides");
    }

}
