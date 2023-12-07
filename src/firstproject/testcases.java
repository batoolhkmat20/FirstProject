package firstproject;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class testcases {
	WebDriver driver= new ChromeDriver();
	
	@BeforeTest
	public void setup(){
	
	driver.manage().window().maximize();
		
		
	}
	
	
	@Test(invocationCount = 5)
	public void mytest() throws InterruptedException 
	{driver.get("http://127.0.0.1:5500/index.html");	
	//driver.findElement(By.name("name")).sendKeys("bato=ol");
	//driver.findElement(By.name("password")).sendKeys("batool555555");
	//driver.findElement(By.name("email")).sendKeys("batoo@gmail.com");
	//Thread.sleep(3000);
	//driver.findElement(By.id("sbmit")).click();
	//driver.findElement(By.id("reset")).click()
		WebElement colorinput= driver.findElement(By.name("userColor"));
	WebElement dateinput=driver.findElement(By.name("userDate"));
	WebElement monthinput =driver.findElement(By.name("userMonth"));
	Random rand=new Random();
		String [] rendcolor= {"#47dc7a" ,"#4a412a" ,"#fa8072 ","#b0e0e6","#fff8b6"};
		String []randdat= {"10/10/1333","16,5,8888","20/52/1999","2/5/2001"};
		String[]randmonth= {"April","May","Augast","june"};
	int randomindexcolor=rand.nextInt(rendcolor.length);		
	int randomindexdate=rand.nextInt(randdat.length);		
	int randomindexmonth=rand.nextInt(randmonth.length);		
	colorinput.sendKeys(rendcolor[randomindexcolor]);
	dateinput.sendKeys(randdat[randomindexdate]);
	monthinput.sendKeys(randmonth[randomindexmonth]);
	
	WebElement passwordinput =driver.findElement(By.xpath("//input[@type='password']"));
	WebElement usernameinput =driver.findElement(By.cssSelector("input[type='text']"));
	String[] passwordt={"125fffff","keuefbhakljnf","hebvbehv","jhdgc654fh"};
	String[] username={"batool","sawsan","hikmat","zaid","hussin","lamar"};
	int passwordrand=rand.nextInt(passwordt.length);
	int userrand=rand.nextInt(username.length);
	passwordinput.sendKeys(passwordt[passwordrand]);
	
	usernameinput.sendKeys(username[userrand]);
	
	
	
	
	
			Thread.sleep(3000);
	
	}
	
	@AfterTest
	public void posttesting() {
		
	}
	
}
