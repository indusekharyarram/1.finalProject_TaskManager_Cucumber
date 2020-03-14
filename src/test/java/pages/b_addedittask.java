package pages;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class b_addedittask {
	protected WebDriver driver;
	public void abcd() {
		By Username=By.name("login");
		By Password=By.name("password");
		By Login=By.name("DoLogin");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT0199\\eclipse-workspace\\1.finalProject_TaskManager_Cucumber\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		driver.get("http://examples.codecharge.com/TaskManager/Login.php?Logout=True");
		driver.findElement(Username).sendKeys("admin");
		driver.findElement(Password).sendKeys("admin");
		driver.findElement(Login).click();
	}
	public void Add_Task()
	{
	By AddTask=By.xpath("/html/body/table[1]/tbody/tr[2]/td[2]/a/img");
	driver.findElement(AddTask).click();
	}
	public void Add_Details()
	{
		By Task=By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[1]/td/input");
		driver.findElement(Task).sendKeys("TaskManagement");
		By Description=By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[2]/td/textarea");
		driver.findElement(Description).sendKeys("TaskManagement Website");
		By Project=By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[3]/td/select/option[2]");
		driver.findElement(Project).click();
		By Priority=By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[4]/td/select/option[2]");
		driver.findElement(Priority).click();
		By Status=By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[5]/td/select/option[2]");
		driver.findElement(Status).click();
		By Type=By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[6]/td/select/option[2]");
		driver.findElement(Type).click();
		By AssignedTo=By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[7]/td/select/option[5]");
		driver.findElement(AssignedTo).click();
	}
	public void StarDate() 
	{
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[8]/td/a/img"))).click().build().perform();
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		Set<String>allWindows=driver.getWindowHandles();
		for(String Window:allWindows)
		{
			System.out.println(Window);
			if(!parent.equalsIgnoreCase(Window))
			{
				driver.switchTo().window(Window);
			}
			
		}
		Actions actions=new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("/html/body/center/table/tbody/tr/td/table/tbody/tr[4]/td[3]/a"))).click().build().perform();
		driver.switchTo().window(parent);
	}
	
	/*Actions at=new Actions(driver);
		at.sendKeys(Keys.TAB);	
		at.sendKeys(Keys.TAB);	*/
	public void EndDate()
	{
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[9]/td/a/img"))).click().build().perform();
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		Set<String>allWindows=driver.getWindowHandles();
		for(String Window:allWindows)
		{
			System.out.println(Window);
			if(!parent.equalsIgnoreCase(Window))
			{
				driver.switchTo().window(Window);
			}
		}
		Actions actions=new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("/html/body/center/table/tbody/tr/td/table/tbody/tr[5]/td[6]/a"))).click().build().perform();
		driver.switchTo().window(parent);
	}
	public void Send()
	{
		By Add=By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[10]/td/input[1]");
		driver.findElement(Add).click();
		
	}
}
