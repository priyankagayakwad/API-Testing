package Demopkg;
import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Test {	
		public static void main(String[] args) throws InterruptedException, AWTException {
			System.setProperty("webdriver.chrome.driver","C:/Users/Administrator/Desktop/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml5_draganddrop");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			WebElement frame=driver.findElement(By.id("iframeResult"));
			driver.switchTo().frame(frame);
	 		System.out.println("Inside frame");
			Actions builder = new Actions(driver);
			
			 WebElement from = driver.findElement(By.cssSelector("img#drag1"));
			 WebElement to = driver.findElement(By.cssSelector("div#div1")); 
			
			 
			 final String java_script =
					 "var src=arguments[0],tgt=arguments[1];var dataTransfer={dropEffe" +
					                 "ct:'',effectAllowed:'all',files:[],items:{},types:[],setData:fun" +
					                 "ction(format,data){this.items[format]=data;this.types.append(for" +
					                 "mat);},getData:function(format){return this.items[format];},clea" +
					                 "rData:function(format){}};var emit=function(event,target){var ev" +
					                 "t=document.createEvent('Event');evt.initEvent(event,true,false);" +
					                 "evt.dataTransfer=dataTransfer;target.dispatchEvent(evt);};emit('" +
					                 "dragstart',src);emit('dragenter',tgt);emit('dragover',tgt);emit(" +
					                 "'drop',tgt);emit('dragend',src);";

					         ((JavascriptExecutor)driver).executeScript(java_script, from, to);
					         Thread.sleep(2000);		
	 if(from.isEnabled())
			 {
				 System.out.println("Element is enabled");
			 }
			 else {
				System.out.println("Elment is not displayed");
			}
			 
			 } 
		
			}


