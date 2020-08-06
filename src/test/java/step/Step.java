package step;


import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Step {
	
	
 WebDriver driver;
 
 
 @Before
 public void main()
 {
	 System.out.println("start");
 }
 
 @After
 public void main1()
 {
	 System.out.println("end");
 }
 
 @Before("@TC_Login_page")
 public void main3()
 {
	 System.out.println("web start");
 }
 
 @After("@TC_Login_page")
 public void main4()
 {
	 System.out.println("web end");
 }
 @Before("@TC_url")
 public void main6()
 {
	 System.out.println("url start");
 }
 @After("@TC_url")
 public void main8()
 {
	 System.out.println("url end");
 }
 
 
@Given("^Open the browser and enter uri$")
public void open_the_browser_and_enter_uri() {
	System.setProperty("webdriver.chrome.driver", "D:\\Hanamant\\java\\driver\\chromedriver_win32(1) 83\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://localhost/login.do");
}

@When("^Verify the title of acti time page$")
public void verify_the_active_time_page()  {
	String st=driver.findElement(By.xpath("//p[contains(text(),'To login for')]")).getText();
    System.out.println(st);
}
@When("^Verify the acti time url$")
public void verify_the_acti_time_url()  {
	String Ac=driver.getTitle();
	System.out.println(Ac);
	String Ec="actiTIME - Login";
    Assert.assertEquals(Ec,Ac );
    System.out.println("Assert passed");
}
/*
@When("^Enter the valid credentials$")
public void enter_the_valid_credentials(DataTable arg1) throws Throwable {
	
	System.out.println(arg1);
	List<List<String>> data=arg1.raw();
	
	driver.findElement(By.name("username")).sendKeys("username");
	driver.findElement(By.name("pwd")).sendKeys("passward");
	
	//driver.findElement(By.name("username")).sendKeys(data.get(0).get(1));
	//driver.findElement(By.name("pwd")).sendKeys(data.get(1).get(1));
	driver.findElement(By.id("loginButton")).click();
	driver.findElement(By.xpath("//a[@class='content tt_selected selected']")).click();
	}
	
*/
@When("^Enter the valid \"([^\"]*)\" and \"([^\"]*)\"$")
public void enter_the_valid_and(String usre, String pass)  {
	driver.findElement(By.name("username")).sendKeys(usre);
	driver.findElement(By.name("pwd")).sendKeys(pass);
	
}

@Then("^Click on login button$")
public void click_on_login_button() {
	driver.findElement(By.id("loginButton")).click();
	driver.findElement(By.xpath("//a[@class='content tt_selected selected']")).click();
}


@Then("^close the browser$")
public void close_the_browser() throws InterruptedException  {
	Thread.sleep(2000);
   driver.close();
}




}
