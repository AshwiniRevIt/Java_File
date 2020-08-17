package testing;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;


	public class CrossBrowserTesting {


	 
	WebDriver driver;
	String driverPath="C:\\Users\\Lotus\\eclipse-workspace\\demo\\src\\test\\resources\\drivers\\";
		public void method(String browserName) {
			switch(browserName)
				{
				case "Chrome":
					
					System.setProperty("webdriver.chrome.driver",driverPath+"chromedriver.exe");
					driver=new ChromeDriver();
					break;
				case "edge":
					
					System.setProperty("webdriver.edge.driver",driverPath+"msedgedriver.exe");
					driver=new EdgeDriver();
					break;
				default :
					
					System.setProperty("webdriver.edge.driver",driverPath+"msedgedriver.exe");
					driver=new EdgeDriver();
					break;
			}
	}
		
		public static void main(String[] args) {
		CrossBrowserTesting set=new CrossBrowserTesting();
		set.method( "edge");
		
		}
		}



