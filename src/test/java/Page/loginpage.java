package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BaseClass;


public class loginpage extends BaseClass  {
//	public static WebDriver driver; 


//	public void i_open_the_chrome_browser() throws InterruptedException {
//		
//		setUp();
		
//		WebDriverManager.edgedriver().setup();
//
//		EdgeOptions options = new EdgeOptions();
//		options.addArguments("--remote-allow-origins=*");
//
//		driver = new EdgeDriver(options);
//		//	driver.get("http://adbc4806fc81c4f3a980a0aedb189b77-2042542790.us-east-1.elb.amazonaws.com/#/");
//		driver.get("https://www.saucedemo.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//
//		Thread.sleep(600);

//}




	
	
	public void enter_username() throws InterruptedException {
		Thread.sleep(3000);

		//driver.findElement(By.xpath("/html/body/app-root/body/app-sign-in/div/form/div/div/div[2]/div/div[1]/div/input")).sendKeys("alok@gmail.com");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Aquib");

	}

	public void Enter_Password()throws InterruptedException {
		Thread.sleep(3000);
		//	driver.findElement(By.xpath("/html/body/app-root/body/app-sign-in/div/form/div/div/div[2]/div/div[2]/div/input")).sendKeys("aaaaaa");

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Aquib$25");

	}
	
	
public void Select_Stops() throws InterruptedException {
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class='w-full p-2 bg-white text-black rounded cursor-pointer']")).click();
	}

public void Select_checkbox() throws InterruptedException {
	Thread.sleep(3000);
	driver.findElement(By.xpath("//label[contains(text(),'Exit 14 Park & Ride Lot')]//input[@type='checkbox']")).click();
	}

	

	public void click_on_login_button()throws InterruptedException {
		Thread.sleep(3000);
		//driver.findElement(By.xpath("/html/body/app-root/body/app-sign-in/div/form/div/div/div[2]/div/div[4]/button")).click();

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//driver.close();
	}



}



