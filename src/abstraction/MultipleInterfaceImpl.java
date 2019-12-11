package abstraction;
/*
 * single class implementing multiple interfaces
 * 
 * interface WebDriver(){
 * 		void get(String url);
 * 
 * }
 *
 * interface TakesScreenshot{
 * 		<OutputType> getScreenshotAs(OutputType );
 * }
 * 
 * class ChromeDriver implements WebDriver, TakesScreenshot{
 * 		void get(String url){ .............. }
 * 		getScreenshotAs(OutputType arg){ ....................... }
 * }
 * 
 * 
 * class TestClass{
 * 		main(){
 * 			WebDriver driver = new ChromeDriver();
 * 			driver.get("http://www.google.com");
 * 			// simply type cast WebDriver object reference to TakesScreenshot object refernce
 * 			TakesScreenshot ts = (TakesScreenshot) driver;
 * 			File img = ts.getScreenshotAs(OutputType.File);
 * 
 * 		}
 * }
 * 
 * 
 * 
 */

public class MultipleInterfaceImpl implements InterfaceOne, InterfaceTwo {

	@Override
	public void methodOne() {
		System.out.println("InterfaceOne method one implementation");
	}

	@Override
	public void methodTwo() {
		System.out.println("InterfaceTwo mehtod two implementation");
	}

	@Override
	public void method() {
		System.out.println("common method implementation");
	}

}
