import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Pesquisa {
	
	@Test
	public void CT029() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		TakeScreenShotFunction screenShotFunction = new TakeScreenShotFunction();
		WebDriver driver = new ChromeDriver();
		
		String url = "https://www.floresonline.com.br/";
		driver.manage().window().maximize();
		driver.get(url);
		
		String className = Thread.currentThread().getStackTrace()[1].getMethodName();
		int count = 0;
		//tirando print da tela ativa
		screenShotFunction.takeSaveScreenShot(count, className);
		Thread.sleep(1500);
		count++;
		
		Actions acao = new Actions(driver);
		WebElement menuMouseOver = driver.findElement(By.id("custom-real-mainmenu-item-0"));
		acao.moveToElement(menuMouseOver).build().perform();
		
		screenShotFunction.takeSaveScreenShot(count, className);
		Thread.sleep(1500);
		count++;
		
		driver.findElement(By.xpath("//div[@id='custom-real-mainmenu-inside-item-0']/div[2]")).click();
		
		screenShotFunction.takeSaveScreenShot(count, className);
		Thread.sleep(1500);
		count++;
		
		acao.sendKeys(Keys.PAGE_DOWN).perform();
		screenShotFunction.takeSaveScreenShot(count, className);
		Thread.sleep(1500);
		count++;
		
		driver.quit();
	}
	
	@Test
	public void CT044() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		TakeScreenShotFunction screenShotFunction = new TakeScreenShotFunction();
		WebDriver driver = new ChromeDriver();
		
		String url = "https://www.floresonline.com.br/";
		driver.manage().window().maximize();
		driver.get(url);
		
		String className = Thread.currentThread().getStackTrace()[1].getMethodName();
		int count = 0;
		//tirando print da tela ativa
		screenShotFunction.takeSaveScreenShot(count, className);
		Thread.sleep(1500);
		count++;
		
		Actions acao = new Actions(driver);
		WebElement menuMouseOver = driver.findElement(By.id("custom-real-mainmenu-item-7"));
		acao.moveToElement(menuMouseOver).build().perform();
		
		screenShotFunction.takeSaveScreenShot(count, className);
		Thread.sleep(1500);
		count++;
		
		driver.findElement(By.xpath("//div[@id='custom-real-mainmenu-inside-item-99']/div[2]")).click();
		
		screenShotFunction.takeSaveScreenShot(count, className);
		Thread.sleep(1500);
		count++;
		
		acao.sendKeys(Keys.PAGE_DOWN).perform();
		screenShotFunction.takeSaveScreenShot(count, className);
		Thread.sleep(1500);
		count++;
		
		driver.quit();
	}
	
}
