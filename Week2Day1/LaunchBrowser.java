package Week2Day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		//Launch the browser
		
		ChromeDriver driver=new ChromeDriver();
		
		//EdgeDriver driver1=new EdgeDriver();
		
		//Load the URL
		
		driver.get("https://www.facebook.com/login.php/");

		//maximize the window
		
		driver.manage().window().maximize();
		
		//get the title
		
		//String title = driver.getTitle();
		//System.out.println(title);
		
		driver.close();
	}

}
