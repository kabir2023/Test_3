import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation3 {
	WebDriver driver;
	@Before
	public void init(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kamra_0b9xx0w\\Desktop\\SELENIUM FILE\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://techfios.com/test/101/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void toggleon() throws InterruptedException {
		driver.findElement(By.name("allbox")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("submit")).click();
	}

}
