import java.awt.Rectangle;
import java.awt.Robot;
import java.io.File;
import java.awt.AWTException; 
import java.awt.Rectangle; 
import java.awt.Toolkit; 
import java.awt.Robot; 
import java.awt.image.BufferedImage; 
import java.io.IOException; 
import java.io.File; 
import javax.imageio.ImageIO;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import com.sun.jna.platform.FileUtils;

public class TakeScreenShotFunction {

	public void takeSaveScreenShot(int count , String TestCase) throws Exception {
		
		try { 
			File diretorio = new File("C:\\Evidências\\");
			if(!diretorio.isDirectory()) {
				diretorio.mkdir();
				System.out.println("Diretório criado com sucesso!");
			}
			File diretorioTeste = new File("C:\\Evidências\\"+TestCase+"\\");
			if(!diretorioTeste.isDirectory()) {
				diretorioTeste.mkdir();
				System.out.println("Diretório criado com sucesso!");
			}
			
            Thread.sleep(120); 
            Robot r = new Robot(); 
  
            // It saves screenshot to desired path 
            String path = diretorioTeste +"\\"+ TestCase + count + ".jpg";
            System.out.println(path);
  
            // Used to get ScreenSize and capture image 
            Rectangle capture = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()); 
            BufferedImage Image = r.createScreenCapture(capture); 
            ImageIO.write(Image, "jpg", new File(path));
            System.out.println("Screenshot saved"); 
        } 
        catch ( Exception e) { 
            System.out.println(e); 
        } 
	}
}
