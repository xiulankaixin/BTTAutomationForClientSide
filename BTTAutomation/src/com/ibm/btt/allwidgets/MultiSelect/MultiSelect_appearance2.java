package com.ibm.btt.allwidgets.MultiSelect;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ibm.btt.allwidgets.Label.Label_PageObject;
import com.ibm.btt.util.Event;
import com.ibm.btt.util.Main_Class;
import com.ibm.btt.util.PropertiesUtil;
import com.ibm.btt.util.Tools;

public class MultiSelect_appearance2 extends Main_Class{

  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();
  private static MultiSelect_PageObject drv;
  

  @BeforeClass
  public static void setUp() throws Exception {
    
	Main_Class.setUp();
    drv=PageFactory.initElements(driver, MultiSelect_PageObject.class);
    drv.Establish();
    drv.BTT8200_tab();
    drv.MultiSelect_widget();
    drv.MultiSelect_appearance2();
  }

  @Test
  public void Appearance2_1(){
	  assertEquals("left&vertical-align: top;", drv.Appearance2_1());
  }
  
  @Test
  public void Appearance2_2(){
	  assertEquals("left&vertical-align: middle;", drv.Appearance2_2());
  }
  
  @Test
  public void Appearance2_3(){
	  assertEquals("left&vertical-align: bottom;", drv.Appearance2_3());
  }
  
  @Test
  public void Appearance2_4(){
	  assertEquals("center&vertical-align: top;", drv.Appearance2_4());
  }
  
  @Test
  public void Appearance2_5(){
	  assertEquals("center&vertical-align: middle;", drv.Appearance2_5());
  }
  
  @Test
  public void Appearance2_6(){
	  assertEquals("center&vertical-align: bottom;", drv.Appearance2_6());
  }
  
  @Test
  public void Appearance2_7(){
	  assertEquals("right&vertical-align: top;", drv.Appearance2_7());
  }
  
  @Test
  public void Appearance2_8(){
	  assertEquals("right&vertical-align: middle;", drv.Appearance2_8());
  }
  
  @Test
  public void Appearance2_9(){
	  assertEquals("right&vertical-align: bottom;", drv.Appearance2_9());
  }
  
  @Test
  public void Appearance2_10(){
	  assertEquals("padding-left: 50px; vertical-align: middle;", drv.Appearance2_10());
  }
  
  @Test
  public void Appearance2_11(){
	  assertEquals("padding-left: 10%; vertical-align: middle;", drv.Appearance2_11());
  }
 
  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, Main_Class.allwidgets,MultiSelect_appearance2.class);
	driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}