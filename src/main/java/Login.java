import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public void CT001() throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
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

	public void CT005() throws Exception {

		// Passo padrão para execução
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
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
		// Passo padrão para execução

		// Funtion Take a Screenshot
		screenShotFunction.takeSaveScreenShot(count, className);
		Thread.sleep(1500);
		count++;

		WebElement LoginButton = driver.findElement(By
				.xpath("//*[@id=\"dynamic_class\"]/div[1]/div/div/div/div/div/div/div[2]/div[7]/div[2]/div[4]/div/a"));
		LoginButton.click();
		Thread.sleep(1500);

		// Funtion Take a Screenshot
		screenShotFunction.takeSaveScreenShot(count, className);
		Thread.sleep(1500);
		count++;

		WebElement RegisterButton = driver
				.findElement(By.xpath("//*[@id=\"general-login-ajax-content\"]/div/div[18]/a"));
		RegisterButton.click();
		Thread.sleep(1500);

		// Funtion Take a Screenshot
		screenShotFunction.takeSaveScreenShot(count, className);
		Thread.sleep(1500);
		count++;

		WebElement email = driver.findElement(By.id("email_lp"));
		WebElement nomeCompleto = driver.findElement(By.id("nome_lp"));
		WebElement telefone = driver.findElement(By.id("telefone_lp"));
		WebElement password = driver.findElement(By.id("senha_lp"));

		email.sendKeys("esquadraofolha@gmail.com");
		System.out.println("Email preenchido");

		nomeCompleto.sendKeys("Esquadão folha");
		System.out.println("Nome preenchido");

		telefone.sendKeys("11934563456");
		System.out.println("Telefone Preenchido");

		password.sendKeys("esquadrao123");
		System.out.println("Password Preenchido");

		// Funtion Take a Screenshot
		screenShotFunction.takeSaveScreenShot(count, className);
		Thread.sleep(1500);
		count++;

		WebElement btnRegister = driver.findElement(By.id("btnMain"));
		btnRegister.click();
		Thread.sleep(3000);
		// Funtion Take a Screenshot
		screenShotFunction.takeSaveScreenShot(count, className);
		Thread.sleep(3000);
		count++;

		driver.quit();

	}

	@Test
	public void CT016() throws Exception {

		// Passo padrão para execução
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
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
		// Passo padrão para execução

		// Funtion Take a Screenshot
		screenShotFunction.takeSaveScreenShot(count, className);
		Thread.sleep(1500);
		count++;

		Actions acao = new Actions(driver);
		acao.sendKeys(Keys.PAGE_DOWN).perform();
		screenShotFunction.takeSaveScreenShot(count, className);
		Thread.sleep(1500);
		count++;

		// Funtion Take a Screenshot
		screenShotFunction.takeSaveScreenShot(count, className);
		Thread.sleep(1500);
		count++;

		WebElement produtoSelecionado = driver
				.findElement(By.xpath("//*[@id=\"homemain\"]/div[3]/div/div[2]/div[2]/div[2]"));
		produtoSelecionado.click();
		Thread.sleep(1500);

		// Funtion Take a Screenshot
		screenShotFunction.takeSaveScreenShot(count, className);
		Thread.sleep(1500);
		count++;

		WebElement CepCompraBtn = driver.findElement(By.xpath("//*[@id=\"forbidden-parte-4\"]/a/div/div/div[1]"));
		CepCompraBtn.click();
		WebElement CepCompra = driver.findElement(By.id("searchForbiddenInput"));
		CepCompra.sendKeys("06763040");
		Thread.sleep(5000);

		// Funtion Take a Screenshot
		screenShotFunction.takeSaveScreenShot(count, className);
		Thread.sleep(1500);
		count++;

		WebElement enderecoProcurado = driver
				.findElement(By.xpath("//*[@id=\"forbidden-parte-1\"]/div[3]/div/div/div/div[2]/div/div[1]/a/div"));
		enderecoProcurado.click();
		Thread.sleep(3000);

		// Funtion Take a Screenshot
		screenShotFunction.takeSaveScreenShot(count, className);
		Thread.sleep(1500);
		count++;

		WebElement adicionarACesta = driver.findElement(By.id("botao-principal-flutuante-mob"));
		adicionarACesta.click();
		Thread.sleep(10000);
		
		WebElement addPeriodoEntrega = driver.findElement(
				By.xpath("//*[@id=\"dynamic_class\"]/div[1]/div/div/div/div/div[18]/div[2]/div/div[1]/button"));
		addPeriodoEntrega.click();
		Thread.sleep(3000);
		
		WebElement TipoDeEntrega = driver.findElement(By.xpath("//*[@id=\"periodo-ajax\"]/a[1]/div/div[1]"));
		TipoDeEntrega.click();
		Thread.sleep(3000);
		
		WebElement SalvarContinuar = driver.findElement(By.xpath("//*[@id=\"periodo-ajax\"]/div[4]/button"));
		SalvarContinuar.click();
		Thread.sleep(5000);
		
		
		WebElement email = driver.findElement(By.id("email"));
		WebElement nomeCompleto = driver.findElement(By.id("nome"));
		WebElement telefone = driver.findElement(By.id("telefone"));

		
		

	}
}
