package Utility;
import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Driverclass {
	public static WebDriver driver;
	public static String baseURL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"; // URL
	private static Scanner sc;

	public static WebDriver open() {
		sc = new Scanner(System.in);
		System.out.println("Choose 1)Chrome\n       2)Edge to run \nEnter 1 or 2:");
		String browser = sc.nextLine();
		// string "browser" is taken where either "Chrome"or "Edge" is to be written for
		// opening Chromedriver or edgedriver respectively
		if (browser.equalsIgnoreCase("1")) {
			// chrome Driver
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\2318465\\Downloads\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("2")) {
			// Edge driver
			System.setProperty("webdriver.edge.driver", "C:\\Users\\2318465\\Downloads\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		driver.get(baseURL);
		driver.manage().window().maximize();
		return driver;

	}

	public static void driverQuit() {
		driver.quit();
	}

}
