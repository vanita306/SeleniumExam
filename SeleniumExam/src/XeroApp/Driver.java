package XeroApp;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Driver {
	static String dtTablePath;
	static String[][] recData;

	static WebDriver driver;
	public static void main(String[] args) throws IOException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {

		 dtTablePath = "C:/Vanita/Training/Selenium/Selenium Exam/Xero_Framework/TestData/TestSuit1.xls";
  		recData = ReUsableMethods.readExcel(dtTablePath, "Sheet1");
  		
		String testCase, flag, firefox, chrome,IE;
		for(int i = 1; i <recData.length; i++){
			
			flag = recData[i][1];
			
			if(flag.equalsIgnoreCase("Y")){
				firefox = recData[i][3];
				
			//This is my new commit
					if(firefox.equalsIgnoreCase("Y")){
					testCase = recData[i][2];
					ReUsableMethods.startReport(testCase, "C:/Vanita/Training/Selenium/Selenium Exam/Xero_Framework/Reports/");
					System.setProperty("webdriver.gecko.driver", "C:/Vanita/Training/Selenium/Selenium Exam/Xero_Framework/Lib/geckodriver.exe");
					driver = new FirefoxDriver();
					Method tc = AutomationScripts.class.getMethod(testCase);
					tc.invoke(tc);
					driver.quit();

					ReUsableMethods.bw.close();
				}
				
				chrome = recData[i][4];
				if(chrome.equalsIgnoreCase("Y")){
					testCase = recData[i][2];
					ReUsableMethods.startReport(testCase,  "C:/Vanita/Training/Selenium/Selenium Exam/Xero_Framework/Reports/");
					System.setProperty("webdriver.chrome.driver", "C:/Vanita/Training/Selenium/Selenium Exam/Xero_Framework/Lib/chromedriver.exe");
					driver = new ChromeDriver();
					Method tc = AutomationScripts.class.getMethod(testCase);
					tc.invoke(tc);
					driver.quit();

					ReUsableMethods.bw.close();
				}
				
				IE = recData[i][5];
				if(IE.equalsIgnoreCase("Y")){
					testCase = recData[i][2];
					ReUsableMethods.startReport(testCase,  "C:/Vanita/Training/Selenium/Selenium Exam/Xero_Framework/Reports/");
					System.setProperty("webdriver.IE.driver", "C:/Vanita/Training/Selenium/Selenium Exam/Xero_Framework/Lib/IEDriverServer.exe");
					driver = new InternetExplorerDriver();
					Method tc = AutomationScripts.class.getMethod(testCase);
					tc.invoke(tc);
					driver.quit();

					ReUsableMethods.bw.close();
				}
				
				
				
			}
			


		}
		






		/*Method testCase = AutomationScripts.class.getMethod(tc);
		testCase.invoke(testCase); */


	}
}
