
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.IHookCallBack;
import org.testng.IHookable;
import org.testng.ITestResult;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.codoid.products.exception.FilloException;

public class TestUsingExcelSheet implements IHookable {

    private List<String> methodsToRun = new ArrayList<>();
 
  //  readAndWriteData rwData = new readAndWriteData();

	
    WebDriver driver;
    
    @BeforeTest
    public void beforeMethod() {
    	System.out.println("before method");
    //	System.setProperty("webdriver.chrome.driver", AppConstants.CHROMEDRIVER_EXE);
		
		
		//driver=new ChromeDriver();
    }

    @Factory(dataProvider = "dp")
    public TestUsingExcelSheet(List<String> methodsToRun) {
    	System.out.println("factory");
        this.methodsToRun = methodsToRun;
    }

    @Override
    public void run(IHookCallBack callBack, ITestResult testResult) {
    	System.out.println("run");
        String testMethodName = testResult.getMethod().getMethodName();
    	System.out.println(testMethodName);
        if (methodsToRun.contains(testMethodName)) {
            System.err.println("About to run " + testResult.getMethod().getMethodName());
            callBack.runTestMethod(testResult);
            
        } else {
            testResult.setStatus(ITestResult.SKIP);
        }
    }

    @Test
    public void testMethod() {
        System.err.println("testMethod()");
        driver.get("http://www.google.com");
    		
    	}
    

    @Test
    public void anotherTestMethod() {
        System.err.println("anotherTestMethod()");
        driver.get("http://www.yahoo.com");
    }

    @Test
    public void thirdTestMethod() {
        System.err.println("thirdTestMethod()");
        driver.get("http://www.yahoo.com");
    }

   @DataProvider(name = "dp")
    public static Object[][] getData() {
	   
	  List<String> list = null;
    	System.out.println("DataProvider");
    	System.out.println("list is: " + Arrays.asList("testMethod", "thirdTestMethod"));
        try {
		list	=UsingFillo.ReadExcelUsingFillo();
		} catch (FilloException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return new Object[][]{
	        {list}
	};
   }
        
       
    /*    
        @DataProvider(name = "dp")
        public static Object[] getData() throws FilloException {
        	System.out.println("DataProvider");
        	System.out.println("list is: " + Arrays.asList("testMethod", "thirdTestMethod") + UsingFillo.ReadExcelUsingFillo());
            return UsingFillo.ReadExcelUsingFillo().toArray();
            
    }
    */
    
    
}