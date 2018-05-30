package qspiders;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class CaptureScreenshot_ActiTIMEPage extends BaseClass {
	public static void main(String[] args) throws IOException {
		// Date d = new Date();
		// String date1 = d.toString();
		// System.out.println(date1);
		// String date2 = d.toString();
		// System.out.println(date2);
		driver.get("http://localhost/login.do;jsessionid=3oq1kk91io1ql");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File destfile = new File(".//Screenshot//ActiTime.png");
		FileUtils.copyFile(srcFile, destfile);

	}

}
