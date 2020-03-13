import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CT005 {
	
	public static void main() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acruzgai\\Downloads\\chromedriver_win32\\chromedriver.exe");
		TakeScreenShotFunction screenShotFunction = new TakeScreenShotFunction();
		WebDriver driver = new ChromeDriver();
		String url = "https://www.floresonline.com.br/";
		// Maximize window
		driver.manage().window().maximize();
		driver.get(url);
		System.out.println(driver.getTitle());
		int count = 0;
		
		
	}
}
