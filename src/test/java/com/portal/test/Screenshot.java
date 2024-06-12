package com.portal.test;




import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;



public class Screenshot extends Base {
	
	public void takescreenshot() {
		Date date= new Date();
		long sec =date.getTime();
	
	   TakesScreenshot scn=(TakesScreenshot)driver;
       File src= scn.getScreenshotAs(OutputType.FILE);
       
       try {
		FileHandler.copy(src,new File("C:\\Users\\lenovo\\eclipse-workspace\\SDET_saucedemo\\test-output\\pic"+sec+".png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	       
	    

}}
