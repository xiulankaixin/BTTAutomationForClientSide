package com.ibm.btt.allwidgets.Combo;

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
import com.ibm.btt.util.Main_Class;
import com.ibm.btt.util.PropertiesUtil;
import com.ibm.btt.util.Tools;

public class Combo_Event extends Main_Class{

  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();
  private static Combo_PageObject drv;
  

  @BeforeClass
  public static void setUp() throws Exception {
    
	Main_Class.setUp();
    drv=PageFactory.initElements(driver, Combo_PageObject.class);
    drv.Establish();
    drv.BTT8200_tab();
    drv.Combo_widget();
    drv.Combo_event();
  }

  @Test
  public void evtOnClick(){
	  assertEquals(false, drv.evtOnClick());
  }
  
  @Test
  public void evtonFocus(){
	  assertEquals("The combo has focused.", drv.evtonFocus());
  }
  
  @Test
  public void evtOnBlur(){
	  assertEquals(true, drv.evtOnBlur());
  }
  
  @Test
  public void evtOnKeyDown(){
	  assertEquals(true, drv.evtOnKeyDown());
  }
  
  @Test
  public void evtOnKeypress(){
	  assertEquals(true, drv.evtOnKeypress());
  }
  
  @Test
  public void evtOnKeyUp(){
	  assertEquals(true, drv.evtOnKeyUp());
  }
  
  @Test
  public void evtOnMouseDown(){
	  assertEquals(true, drv.evtOnMouseDown());
  }
  
  @Test
  public void evtOnMouseUp(){
	  assertEquals(true, drv.evtOnMouseUp());
  }
  
  @Test
  public void event_onMouseEnter(){
	  assertEquals(true, drv.evtOnMouseEnter());
  }
  
  @Test
  public void event_onMouseLeave(){
	  assertEquals(true, drv.evtOnMouseLeave());
  }
   
  @Test
  public void event_onMouseMove(){
	  assertEquals(true, drv.evtOnMouseMove());
  }
  
  @Test
  public void evtOnChange(){
	  assertEquals("Country1", drv.evtOnChange());
  }
 
  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, Main_Class.allwidgets,Combo_Event.class);
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
