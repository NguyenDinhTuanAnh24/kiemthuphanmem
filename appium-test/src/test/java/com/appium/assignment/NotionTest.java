package com.appium.assignment;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

/**
 * Appium Automation Test cho ứng dụng Notion (Quản lý ghi chú/học tập)
 * MSSV giả định: ...24 -> 24 % 5 = 4 -> Ứng dụng quản lý học tập.
 * 
 * LƯU Ý QUAN TRỌNG:
 * Do không có thiết bị thật/emulator và file APK gốc để inspect ID,
 * các ID (như "com.notion.android:id/...") dưới đây là GIẢ ĐỊNH (PLACEHOLDER).
 * Bạn cần sử dụng Appium Inspector trên máy của mình để lấy ID chính xác và cập
 * nhật vào code.
 */
public class NotionTest {

    private AndroidDriver driver;
    private WebDriverWait wait;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setAutomationName("UiAutomator2");
        options.setDeviceName("emulator-5554"); // Thay đổi nếu dùng thiết bị khác
        options.setAppPackage("com.notion.android"); // Package ID của Notion
        options.setAppActivity(".MainActivity"); // Main Activity của Notion
        options.setNoReset(true); // Không reset app state để giữ đăng nhập nếu đã login

        // Đảm bảo Appium Server đang chạy ở port 4723
        driver = new AndroidDriver(new URL("http://localhost:4723"), options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test(priority = 1)
    public void testCreateNewPage() {
        // Test Case 1: Tạo một trang ghi chú mới
        // 1. Nhấn nút tạo mới (+)
        WebElement addButton = wait.until(ExpectedConditions.elementToBeClickable(
                AppiumBy.id("com.notion.android:id/fab_add") // CẦN CẬP NHẬT ID
        ));
        addButton.click();

        // 2. Nhập tiêu đề trang
        WebElement titleInput = wait.until(ExpectedConditions.visibilityOfElementLocated(
                AppiumBy.id("com.notion.android:id/title_input") // CẦN CẬP NHẬT ID
        ));
        titleInput.sendKeys("Bài tập Appium Tuần 5");

        // 3. Nhập nội dung
        WebElement contentInput = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='Empty page']")); // XPath
                                                                                                                       // giả
                                                                                                                       // định
        contentInput.click();
        contentInput.sendKeys("Đây là nội dung test tự động.");

        // 4. Verify tiêu đề đã được nhập
        Assert.assertEquals(titleInput.getText(), "Bài tập Appium Tuần 5");
    }

    @Test(priority = 2)
    public void testSearchFeature() {
        // Test Case 2: Tìm kiếm trang vừa tạo
        // Quay lại màn hình chính (nếu cần)
        driver.navigate().back();

        // 1. Nhấn nút tìm kiếm
        WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(
                AppiumBy.accessibilityId("Search") // Accessibility ID giả định
        ));
        searchButton.click();

        // 2. Nhập từ khóa
        WebElement searchInput = wait.until(ExpectedConditions.visibilityOfElementLocated(
                AppiumBy.id("com.notion.android:id/search_src_text") // CẦN CẬP NHẬT ID
        ));
        searchInput.sendKeys("Bài tập Appium");

        // 3. Chọn kết quả đầu tiên
        // Đợi kết quả xuất hiện
        WebElement firstResult = wait.until(ExpectedConditions.visibilityOfElementLocated(
                AppiumBy.xpath("//android.widget.TextView[contains(@text, 'Bài tập Appium Tuần 5')]")));

        Assert.assertTrue(firstResult.isDisplayed(), "Kết quả tìm kiếm không hiển thị trang vừa tạo");
    }

    @Test(priority = 3)
    public void testInterfaceNavigation() {
        // Test Case 3: Chuyển đổi tab/màn hình (ví dụ sang tab Settings hoặc
        // Notification)

        // 1. Mở menu
        WebElement menuButton = wait.until(ExpectedConditions.elementToBeClickable(
                AppiumBy.className("android.widget.ImageButton") // Class giả định cho nút menu
        ));
        menuButton.click();

        // 2. Chọn mục Settings
        WebElement settingsOption = wait.until(ExpectedConditions.visibilityOfElementLocated(
                AppiumBy.xpath("//android.widget.TextView[@text='Settings']")));
        settingsOption.click();

        // 3. Verify đang ở màn hình Settings
        WebElement settingsTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(
                AppiumBy.xpath("//android.widget.TextView[@text='Settings' or @text='Cài đặt']")));
        Assert.assertTrue(settingsTitle.isDisplayed());
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
