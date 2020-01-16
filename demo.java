import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class demo {


        public static void main(String[] args) {
            //Path to chromedriver.exe
            System.setProperty("webdriver.chrome.driver","C:\\Users\\SurbhiS\\Documents\\chromedriver_win32\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();

            //Navigating to the URL and Getting table Title
            String baseUrl = "https://codepen.io/bmikhayl/pen/MWWMMWo";
            String TableTitle = "Submitted reviews";
            driver.get(baseUrl);

            // Switch to the frame
            driver.switchTo().frame("result");
            //Navigate to the element & get text
            WebElement textDemo = driver.findElement(By.xpath("//div[contains(@id,'results')]/div[1]/div"));
            String abc= textDemo.getText();

            //Verifying th presence of table & validating the testcase
            if (TableTitle.equals(abc))
                 {
                     System.out.println("Test Case Passed! Table is available");
                 }
            else
                {
                System.out.println("Test Case Failed! Table isn't available");
                }

            //close Driver
            driver.close();

        }

}

