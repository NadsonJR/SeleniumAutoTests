import static org.junit.Assert.assertEquals;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	@Test
	public void CT001_teste() throws Exception {

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		TakeScreenShotFunction screenShotFunction = new TakeScreenShotFunction();
		WebDriver driver = new ChromeDriver();
		String url = "https://www.floresonline.com.br/";
		// Maximize window
		driver.manage().window().maximize();
		driver.get(url);
		String className = this.getClass().getName();
		System.out.println(className);
		System.out.println(driver.getTitle());
		int count = 0;

		// Funtion Take a Screenshot
		screenShotFunction.takeSaveScreenShot(count, className);
		Thread.sleep(1500);
		count++;

		WebElement LoginButton = driver.findElement(By
				.xpath("//*[@id=\"dynamic_class\"]/div[1]/div/div/div/div/div/div/div[2]/div[7]/div[2]/div[4]/div/a"));
		LoginButton.click();

		WebElement email = driver.findElement(By.id("email_lp"));
		WebElement password = driver.findElement(By.id("senha_lp"));

		email.sendKeys("nadsonjunior@live.com");
		System.out.println("Email preenchido");

		password.sendKeys("Varusadc1");
		System.out.println("Password Preenchido");

		// Funtion Take a Screenshot
		screenShotFunction.takeSaveScreenShot(count, className);
		count++;
		Thread.sleep(1500);

		WebElement btnSubmitLogin = driver.findElement(By.id("btnMain"));
		btnSubmitLogin.click();
		
		Thread.sleep(1500);
		// Funtion Take a Screenshot
		screenShotFunction.takeSaveScreenShot(count, className);
		count++;
		Thread.sleep(1500);

		driver.quit();

	}
}
