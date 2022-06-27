
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;
public class Loginautomation {
	private static final String user = null;
	private static final String pass = null;
	WebDriver driver;

		public static WebDriver webdriver(String Url)

		{
			System.setProperty(
		            "webdriver.chrome.driver",
		            "C:\\Users\\gopik\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		        WebDriver driver = new ChromeDriver();
		  
		        // URL of the login website that is tested
		        driver.get(Url);
		  
		        // Maximize window size of browser
		        driver.manage().window().maximize();
		        return driver;

		}	
	public static void Testing() {
		// TODO Auto-generated method stub
		System.out.println("------- Testing Intiatied -------");  
			// testing for valid user credentials
		    try {
		    	Test1();
		  // testing for valid user credentials
		    	Test2();
		    	Test3();
		    	/*Test4();
		    	Test5();
		    	Test6();
		    	Test7();
		    	Test8();
		    	Test9();
		    	Test10();
		    	//logininput("test1", "aaaa");
			/*
		 // testing for Default admin user credentials
		    logininput("admin", "admin");
		 // testing for Null user credentials
		    logininput("", "");
		 // testing for Null user credentials
		    logininput("test'", "or 2=2");
		 // Sign-up for valid user credentials
		    reginput("test1", "qqqq");
		 // Sign-up for same created user credentials
		    reginput("test1", "aaaa");
		 // validating for same created user credentials
		    logininput("test1", "aaaa");
		    // validating for Setting Page  
		loginsettinginput("test1", "aaaa","test1", "01-01-1990", "9876543210","test1234");
		// validating for Setting Page with no limit Fullname
		loginsettinginput("test1", "aaaa","test11234567890-123456789", "01-01-1990", "9876543210","test1234");
		// validating for Setting Page Year value
		loginsettinginput("test1", "aaaa","test1", "01-01-3990", "9876543210","test1234");
	
		loginsettinginput("test1", "aaaa","test1", "01-14-3990", "9876543210","test1234");
		// validating for Setting Page mobile value string
		loginsettinginput("test1", "aaaa","test1", "01-01-1990", "sdds","test1234");

		loginsettinginput("test1", "aaaa","test1", "01-01-1990", "sdds","test12343253w53wreesdfdgdgdg8900&((*^");
		 Thread.sleep(5000);   */
		
		    } catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}
	@Test
	public static void Test1() {
	    // Sign-up for same created user credentials
	    			try {
						reginput("test1", "aaaa");
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	    	}
	@Test
	public static void Test2() {
	    			try {
	    				// testing for valid user credentials
	    		    	logininput("test1", "aaaa1");
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	    	}
	
	@Test
	public static void Test3() {
	    			try {
	    				// testing for Default admin user credentials
	    			    logininput("admin", "admin");
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	    	}
	@Test
	public static void Test4() {
	    			try {
	    				// testing for Null user credentials
	    			    logininput("", "");
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	    	}
	@Test
	public static void Test5() {
	    			try {
	    				// Sign-up for same created user credentials
	    			    reginput("test1", "aaaa");
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	    	}
	@Test
	public static void Test6() {
	    			try {
	    				// validating for Setting Page  
	    				loginsettinginput("test1", "aaaa","test1", "01-01-1990", "9876543210","test1234");
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	    	}
	@Test
	public static void Test7() {
	    			try {
	    				// validating for Setting Page with no limit Fullname
	    				loginsettinginput("test1", "aaaa","test11234567890-123456789", "01-01-1990", "9876543210","test1234");
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	    	}
	@Test
	public static void Test8() {
	    			try {
	    				// validating for Setting Page Year value
	    				loginsettinginput("test1", "aaaa","test1", "01-01-3990", "9876543210","test1234");
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	    	}
	@Test
	public static void Test9() {
	    			try {
	    				// validating for Setting Page mobile value string
	    				loginsettinginput("test1", "aaaa","test1", "01-01-1990", "sdds","test1234");
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	    	}
	@Test
	public static void Test10() {
	    			try {
	    				loginsettinginput("test1", "aaaa","test1", "01-01-1990", "sdds","test12343253w53wreesdfdgdgdg8900&((*^");
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	    	}

	public static void logininput(String user, String pass) throws Exception
	
	{
		WebDriver driver;
		String UrlL = "https://testing-assessment-foh15kew9-edvora.vercel.app";
		driver=webdriver(UrlL);
        // Maximize window size of browser
        driver.manage().window().maximize();
        System.out.println("Login page and input sending");
        WebElement username=driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/div[1]/div/input"));
        WebElement password=driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/div[2]/div/input"));
        WebElement login=driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/button"));
        username.sendKeys(user);
        password.sendKeys(pass);
        login.click();
        Thread.sleep(5000);
        System.out.println("Login page and input sent");
        String actualUrl="https://testing-assessment-foh15kew9-edvora.vercel.app/s";
        String expectedUrl= driver.getCurrentUrl();
        System.out.println(driver.getTitle());
        System.out.println("TestNG checking");
        System.out.println(driver.getTitle());
        Assert.assertEquals(expectedUrl, actualUrl,"Valid input");
        //Assert.assertNotEquals(expectedUrl, actualUrl, "Not Validinput");
        
	}

public static void loginsettinginput(String user, String pass, String Fname,String Dob, String Mobile,String addr)throws Exception
	
	{
		WebDriver driver;
		String UrlL = "https://testing-assessment-foh15kew9-edvora.vercel.app";
		driver=webdriver(UrlL);
        // Maximize window size of browser
        driver.manage().window().maximize();
        //System.out.println(driver);
        WebElement username=driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/div[1]/div/input"));
        WebElement password=driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/div[2]/div/input"));
        WebElement login=driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/button"));
        username.sendKeys(user);
        password.sendKeys(pass);
        login.click();
        try {
			Thread.sleep(5000);
			settinginput(driver,Fname, Dob, Mobile,addr);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}

public static void reginput(String user, String pass) throws Exception
	
	{
		WebDriver driver;
		String UrlR = "https://testing-assessment-foh15kew9-edvora.vercel.app/r";
		driver=webdriver(UrlR);
        // Maximize window size of browser
        driver.manage().window().maximize();
        //System.out.println(driver);
        WebElement username=driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/div[1]/div/input"));
        WebElement password=driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/div[2]/div/input"));
        WebElement login=driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/button"));
        username.sendKeys(user);
        password.sendKeys(pass);
        login.click();
        Thread.sleep(5000);
        String actualUrl="https://testing-assessment-foh15kew9-edvora.vercel.app/r";
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl, "Valid input");
        Assert.assertNotEquals(expectedUrl, actualUrl, "Not Validinput");
	}

public static void settinginput(WebDriver driver, String Fname,String Dob, String Mobile,String addr) throws Exception

{
    WebElement editbutton=driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div[1]/div[1]/div/div/button"));
    try { 
    editbutton.click();
    Thread.sleep(5000);
    WebElement Firstname=driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div[1]/div[2]/div/div[1]/div[1]/div[1]/div/input"));
    WebElement DOB=driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div[1]/div[2]/div/div[1]/div[2]/div[1]/div/input"));
    WebElement MNO=driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div[1]/div[2]/div/div[1]/div[1]/div[3]/div/input"));
    WebElement address=driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div[1]/div[2]/div/div[1]/div[2]/div[3]/div/input"));
    WebElement save=driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div[1]/div[1]/div/div/button[2]"));
    DOB.clear();
    Firstname.sendKeys(Fname);
    DOB.sendKeys(Dob);
    MNO.sendKeys(Mobile);
    address.sendKeys(addr);
    Thread.sleep(5000);
    address.clear();
    address.sendKeys(addr);
    //password.sendKeys(pass);
    Thread.sleep(5000);
    save.click();
    //savepass.click();
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
}