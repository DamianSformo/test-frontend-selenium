package selenium.Reports;

import com.aventstack.extentreports.ExtentReports;

public class ExtenseFactory {

     public static ExtentReports getInstance() {
          ExtentReports extent = new ExtentReports();
          extent.setSystemInfo("Selenium Version", "4.0.0");
          extent.setSystemInfo("OS", "Windows");
          return extent;
     }
}