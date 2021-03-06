package com.ibm.btt.allwidgets.RepetitivePanel;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.ibm.btt.util.CSS;
import com.ibm.btt.util.AllWidgetsProjectMain_Class;
import com.ibm.btt.util.PropertiesUtil;
import com.ibm.btt.util.Tools;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RepetitivePanel_ECA extends AllWidgetsProjectMain_Class{
  /*public static WebDriver driver;
  private static String baseUrl = Main_Class.baseUrl;*/
  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();
  private String result_txt="Passed";
  protected java.util.List<String> checkPoint=new ArrayList<String>();
  private static RepetitivePanel_PageObject drv;

  @BeforeClass
  public static void setUp() throws Exception {
	/*driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get(baseUrl);*/
	AllWidgetsProjectMain_Class.setUp();
	drv=PageFactory.initElements(driver, RepetitivePanel_PageObject.class);
//	drv.setObject(driver);
	drv.Establish();
    drv.BTT8200_tab();
    drv.Panel_widget();
    drv.panel_ECA(); 
  }

//###############################For Label Event###################################### 
  @Test
  public void RepetitivePanel_100_Evt_onKeyDown(){
	  assertEquals("press down ok", drv.Evt_onKeyDown());
  }

  @Test
  public void RepetitivePanel_110_Evt_onKeyPress(){
	  assertEquals("test onkeypress", drv.Evt_onKeyPress());
  }

  @Test
  public void RepetitivePanel_120_Evt_onKeyUp(){
	  assertEquals("key up up up", drv.Evt_onKeyUp());
  }

  @Test
  public void RepetitivePanel_130_Evt_onKeyDown1(){
	  drv.Evt_onKeyDown1();
	  assertEquals(1, drv.Evt_StyleCSS());
  }

  @Test
  public void RepetitivePanel_140_Evt_buttonDisable(){
	  assertEquals("true", drv.Evt_buttonDisable());
  }

  @Test
  public void RepetitivePanel_150_Evt_buttonText(){
	  assertEquals("hit me", drv.Evt_buttonText());
  }
  
  @Test
  public void RepetitivePanel_160_Evt_labelFocus(){
	  assertEquals(2, drv.Evt_labelFocus());
  }
  
  @Test
  public void RepetitivePanel_170_Evt_buttonVisibility(){
	  assertEquals(true, drv.Evt_buttonVisibility());
  }
  
  @Test
  public void RepetitivePanel_180_Evt_label(){
	  assertEquals("4is ok", drv.Evt_label());
  }
//###############################For Label Event######################################
//###############################For Label Condition##################################
  @Test
  public void RepetitivePanel_190_Con_Constant(){
	  assertEquals("expression test ok", drv.Con_Constant());
  }

  @Test
  public void RepetitivePanel_200_con_Click(){
	  assertEquals("expression test ok",drv.con_Click());
  }

  @Test
  public void RepetitivePanel_210_con_Click1(){
	  assertEquals("ActionGroup test success",drv.con_Click1());
  }
//###############################For Label Condition##################################

  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, AllWidgetsProjectMain_Class.allwidgets,RepetitivePanel_ECA.class);
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