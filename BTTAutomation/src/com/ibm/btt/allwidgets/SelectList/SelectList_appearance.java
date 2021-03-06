package com.ibm.btt.allwidgets.SelectList;

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
import com.ibm.btt.util.AllWidgetsProjectMain_Class;
import com.ibm.btt.util.PropertiesUtil;
import com.ibm.btt.util.Tools;

public class SelectList_appearance extends AllWidgetsProjectMain_Class{

  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();
  private static SelectList_PageObject drv;
  

  @BeforeClass
  public static void setUp() throws Exception {
    
	AllWidgetsProjectMain_Class.setUp();
    drv=PageFactory.initElements(driver, SelectList_PageObject.class);
    drv.Establish();
    drv.BTT8200_tab();
    drv.SelectList_widget();
    drv.SelectList_appearance();
  }

  @Test
  public void Appearance_1(){
	  assertEquals("left&top", drv.Appearance_1());
  }
  
  @Test
  public void Appearance_2(){
	  assertEquals("left&middle", drv.Appearance_2());
  }
  
  @Test
  public void Appearance_3(){
	  assertEquals("left&bottom", drv.Appearance_3());
  }
  
  @Test
  public void Appearance_4(){
	  assertEquals("center&top", drv.Appearance_4());
  }
  
  @Test
  public void Appearance_5(){
	  assertEquals("center&middle", drv.Appearance_5());
  }
  
  @Test
  public void Appearance_6(){
	  assertEquals("center&bottom", drv.Appearance_6());
  }
  
  @Test
  public void Appearance_7(){
	  assertEquals("right&top", drv.Appearance_7());
  }
  
  @Test
  public void Appearance_8(){
	  assertEquals("right&middle", drv.Appearance_8());
  }
  
  @Test
  public void Appearance_9(){
	  assertEquals("right&bottom", drv.Appearance_9());
  }
  
  @Test
  public void Appearance_10(){
	  assertEquals(1, drv.Appearance_10());
  }
  
  @Test
  public void Appearance_11(){
	  assertEquals(1, drv.Appearance_11());
  }
  
  @Test
  public void Appearance_12(){
	  assertEquals(0, drv.Appearance_12());
  }
  
  @Test
  public void Appearance_13(){
	  assertEquals(1, drv.Appearance_13());
  }
  
  @Test
  public void Appearance_14(){
	  assertEquals(1, drv.Appearance_14());
  }
  
  @Test
  public void Appearance_15(){
	  assertEquals(1, drv.Appearance_15());
  }
  
  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, AllWidgetsProjectMain_Class.allwidgets,SelectList_appearance.class);
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
