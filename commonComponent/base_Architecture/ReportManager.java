package base_Architecture;

import com.relevantcodes.extentreports.ExtentReports;

//OB: ExtentReports extent instance created here. That instance can be reachable by getReporter() method.

public class ReportManager {

  private static ExtentReports extent;

  public synchronized static ExtentReports getReporter(){
      if(extent == null){
          //Set HTML reporting file location
          String workingDir = System.getProperty("user.dir");
          extent = new ExtentReports(workingDir+"\\Graphical_Report\\OpenMRS\\OpenMRSReportSummary.html", true);
      }
      return extent;
  }
}