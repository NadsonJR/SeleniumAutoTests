import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Logoff {
	
	@Test
	public void CT062() throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		TakeScreenShotFunction screenShotFunction = new TakeScreenShotFunction();
		WebDriver driver = new ChromeDriver();
		String url = "https://www.floresonline.com.br/";
		// Maximize window
		driver.manage().window().maximize();
		driver.get(url);
		String className = Thread.currentThread().getStackTrace()[1].getMethodName();
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
		password.sendKeys("Varusadc1");

		screenShotFunction.takeSaveScreenShot(count, className);
		count++;
		Thread.sleep(1500);

		WebElement btnSubmitLogin = driver.findElement(By.id("btnMain"));
		btnSubmitLogin.click();
		
		Thread.sleep(1500);
		screenShotFunction.takeSaveScreenShot(count, className);
		count++;
		Thread.sleep(1500);
		
		Actions acao = new Actions(driver);
		WebElement menuMouseOver = driver.findElement(By.linkText("Antonio"));
		acao.moveToElement(menuMouseOver).build().perform();
		
		screenShotFunction.takeSaveScreenShot(count, className);
		Thread.sleep(1500);
		count++;
		
		driver.findElement(By.linkText("SAIR")).click();;
		
		screenShotFunction.takeSaveScreenShot(count, className);
		Thread.sleep(1500);
		count++;

		driver.quit();		
	}
	

}
