package Library;

import java.io.IOException;
import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.HasDevTools;
import org.openqa.selenium.devtools.v105.emulation.Emulation;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static void InitializeBrowser() throws IOException {

		String browser = UtilityClass.read("Browser");

		try {
			switch (browser.toLowerCase()) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				ChromeOptions chromeOptions = new ChromeOptions();
				//chromeOptions.addArguments("--incognito");
				chromeOptions.addArguments("disable-infobars", "--disable-notifications", "--disable-extensions",
						"--disable-dev-shm-usage", "--no-sandbox", "--remote-allow-origins=*",
						"--window-size=1920,1080");
				chromeOptions.addArguments("--disable-notifications");
				chromeOptions.addArguments("--disable-infobars");
				chromeOptions.addArguments("--disable-popup-blocking");
				chromeOptions.addArguments("--disable-password-manager-reauthentication");
				chromeOptions.setExperimentalOption("prefs",
						Map.of("credentials_enable_service", false, "profile.password_manager_enabled", false));

				driver = new ChromeDriver(chromeOptions);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.get(UtilityClass.read("url"));
				System.out.println("Current URL: " + driver.getCurrentUrl());
				break;

			case "firfox":
				WebDriverManager.firefoxdriver().setup();
				FirefoxOptions firfoxOptions = new FirefoxOptions();
				firfoxOptions.addArguments("disable-infobars", "--disable-notifications", "--disable-extensions",
						"--disable-dev-shm-usage", "--no-sandbox", "--remote-allow-origins=*",
						"--window-size=1920,1080");
				driver = new FirefoxDriver(firfoxOptions);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.get(UtilityClass.read("url"));
				System.out.println("Current URL: " + driver.getCurrentUrl());
				break;

			case "edge":
				WebDriverManager.edgedriver().setup();
				EdgeOptions edgeOptions = new EdgeOptions();
				edgeOptions.addArguments("disable-infobars", "--disable-notifications", "--disable-extensions",
						"--disable-dev-shm-usage", "--no-sandbox", "--remote-allow-origins=*",
						"--window-size=1920,1080");
				driver = new EdgeDriver(edgeOptions);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.get(UtilityClass.read("url"));
				System.out.println("Current URL: " + driver.getCurrentUrl());
				break;

			default:
				throw new IllegalStateException("Unsupported browser: " + browser);
			}

			driver.manage().window().maximize();
			System.out.println("Browser initialized successfully!");

		} catch (Exception e) {
			System.err.println("Error initializing browser: " + e.getMessage());
			throw e;
		}

	}

}
