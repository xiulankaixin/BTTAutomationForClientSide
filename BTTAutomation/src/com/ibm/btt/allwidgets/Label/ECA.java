package com.ibm.btt.allwidgets.Label;

import java.awt.Robot;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DriverCommand;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import bsh.util.Util;
import com.ibm.btt.allwidgets.Index_Page;
import com.ibm.btt.allwidgets.Main_Page;
import com.ibm.btt.util.*;

import com.gargoylesoftware.htmlunit.javascript.host.Element;
import com.opera.core.systems.internal.input.KeyEvent;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import org.openqa.selenium.remote.server.handler.WebDriverHandler;
import org.openqa.selenium.remote.server.handler.interactions.MouseUp;
import java.util.*;

public class ECA {
  public static WebDriver driver;
  private static String baseUrl;
  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();
  private String result_txt="Passed";
  protected java.util.List<String> checkPoint=new ArrayList<String>();
  private static Label_PageObject drv;

  @BeforeClass
  public static void setUp() throws Exception {
	driver = new FirefoxDriver();
	baseUrl = "http://localhost:8080/InternetBankTestWeb/";
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get(baseUrl);
	drv=PageFactory.initElements(driver, Label_PageObject.class);
	drv.Establish();
    drv.BTT8200_tab();
    drv.Label_widget();
    drv.label_ECA(); 
  }

//###############################For Label Event######################################  
  @Test
  public void Evt_onclick(){
	  drv.Evt_onclick();
	  assertEquals("click ok", drv.Evt_onclick_getText());
	  By.className("");
  }

  @Test
  public void Evt_onMouseup(){
	  drv.Evt_onMouseup();
	  assertEquals("'onMouseup ok'", drv.Evt_onMouseup_getText());
  }

  @Test
  public void Evt_onMouseLeave(){
	  drv.Evt_onMouseLeave();
	  assertEquals("'onMouseLeave ok'", drv.Evt_onMouseLeave_getText());
  }

  @Test
  public void Evt_onMouseMove(){
	  drv.Evt_onMouseMove();
	  assertEquals("onMouseMove ok", drv.Evt_onMouseMove_getText());
  }

  @Test
  public void Evt_onMouseEnter(){
	  drv.Evt_onMouseEnter();
	  assertEquals("onMouseEnter ok", drv.Evt_onMouseEnter_getText());
  }

  @Test
  public void Evt_onMousedown(){
	  drv.Evt_onMousedown();
	  assertEquals("onMouseDown ok", drv.Evt_onMousedown_getText());
  }
//###############################For Label Event######################################
//###############################For Label Condition##################################
  @Test
  public void ID_exp(){
	  drv.ID_exp();
	  assertEquals("ok", drv.ID_exp_getText());
  }

  @Test
  public void Text_exp(){
	  drv.Text_exp();
	  assertEquals("ok",drv.Text_exp_getText());
  }

  @Test
  public void ID_false(){
	  drv.ID_false();
	  assertEquals("false",drv.ID_false_getText());
  }

  @Test
  public void ID_visibility(){
	  drv.ID_visibility();
	  assertEquals("ok",drv.ID_visibility_getText());
  }
//###############################For Label Condition##################################
//###############################For Label Action#####################################
  @Test
  public void label_action_hidden(){
	  drv.label_action_hiddenClick();
	  assertEquals(false, drv.label_action_hidden());
  }

  @Test
  public void label_action_gone(){
	  drv.label_action_goneClick();
	  assertEquals(false, drv.label_action_gone());
  }

  @Test
  public void label_action_show(){
	  drv.label_action_showClick();
	  assertEquals(true, drv.label_action_show());
  }

  @Test
  public void label_action_change(){
	  drv.label_action_changeClick();
	  assertEquals("text ok", drv.label_action_change());
  }

  @Test
  public void css_check() throws InterruptedException{
	  drv.Label_Evt_Click();
	  String[] temp={"pointer_down"};
	  assertEquals(1,CSS.css_query(drv.css_getAttribute(), temp));
  }

//###############################For Label Action#####################################
  @AfterClass
  public static void tearDown() throws Exception {
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