package com.portal.test;


import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener{
	
	
	@Override		
    public void onTestFailure(ITestResult arg0) {	
		Screenshot snap =new Screenshot();
	    // takes screenshot when the test case is failed
		snap.takescreenshot();
        // TODO Auto-generated method stub				
      
       
       
       
    }
	 @Override		
	    public void onTestSuccess(ITestResult arg0) {					
		 Screenshot snap =new Screenshot();
		    // takes screenshot when the test case is passed
			snap.takescreenshot();
	        		
	    }	
	

}
