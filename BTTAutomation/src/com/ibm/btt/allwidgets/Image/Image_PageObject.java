package com.ibm.btt.allwidgets.Image;

import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.ibm.btt.util.CSS;
import com.ibm.btt.util.Event;
import com.ibm.btt.util.Main_Class;
import com.ibm.btt.allwidgets.*;

public class Image_PageObject extends Main_Page{
	
//###############################Image Properties##################################
	@FindBy(xpath=".//*[@id='Image_properties_Image_id']")
	private WebElement Image_properties_id;
	
	public String Image_properties_id_getId(){
		return Image_properties_id.getAttribute("id");
	}
	
	@FindBy(id="Image_properties_Image_id1")
	private WebElement Image_properties_dataNamefromImage_Data;
	
	public String Image_properties_dataNamefromImage_Data(){
		return Image_properties_dataNamefromImage_Data.getAttribute("src");
	}
	
	@FindBy(id="Image_properties_Image_id2")
	private WebElement Image_properties_Location;
	
	public String Image_properties_Location(){
		return Image_properties_Location.getAttribute("src");
	}
	
	@FindBy(id="Image_properties_image12")
	private WebElement Image_properties_visible;
	
	public Boolean Image_properties_visible(){
		return Image_properties_visible.isDisplayed();
	}
	
	@FindBy(id="Image_properties_image02")
	private WebElement Image_properties_hidden;
	
	public Boolean Image_properties_hidden(){
		return Image_properties_hidden.isDisplayed();
	}
	
	@FindBy(id="Image_properties_image01")
	private WebElement Image_properties_gone;
	
	public String Image_properties_gone(){
		return Image_properties_gone.getAttribute("style");
	}
	
	@FindBy(id="Image_properties_image")
	private WebElement Image_properties_disableTrue;
	
	public String Image_properties_disableTrue(){
		return Image_properties_disableTrue.getAttribute("disabled");
	}
	
	@FindBy(id="Image_properties_image11")
	private WebElement Image_properties_disableFalse;
	
	public String Image_properties_disableFalse(){
		return Image_properties_disableFalse.getAttribute("disabled");
	}
	
	@FindBy(id="Image_properties_image03")
	private WebElement Image_properties_alt;
	
	public String Image_properties_alt(){
		return Image_properties_alt.getAttribute("alt");
	}
	
	@FindBy(id="Image_properties_image04")
	private WebElement Image_properties_hint;
	
	public String Image_properties_hint(){
		return Image_properties_hint.getAttribute("title");
	}
	
	@FindBy(id="Image_properties_image05")
	private WebElement Image_properties_tapIndex;
	
	public String Image_properties_tapIndex(){
		return Image_properties_tapIndex.getAttribute("tabindex");
	}
	public Boolean Image_properties_isfocus(){
		return Main_Class.widget_isFocus("Image_properties_image05", "id", "img:focus");
	}
//###############################Image Properties##################################
//###############################Image CSS#########################################
	@FindBy(id="Image_css_image")
	private WebElement Image_css_style1;
	
	public String Image_css_style1_getAttribute(){
		return Image_css_style1.getAttribute("class");
	}
	
	@FindBy(id="Image_css_image01")
	private WebElement Image_css_style2;
	
	public String Image_css_style2_getAttribute(){
		return Image_css_style2.getAttribute("class");
	}
	
	@FindBy(id="Image_css_image02")
	private WebElement Image_css_style3;
	
	public String Image_css_style3_getAttribute(){
		return Image_css_style3.getAttribute("class");
	}
	
	@FindBy(id="Image_css_image04")
	private WebElement Image_css_style4;
	
	public String Image_css_style4_getAttribute(){
		return Image_css_style4.getAttribute("class");
	}
//###############################Image CSS#########################################
//###############################Image Event#######################################
	@FindBy(id="Image_event_image")
	private WebElement Image_event_onclick;
	
	@FindBy(id="Image_event_link")
	private WebElement Image_event_onclick_link;
	
	public String Image_event_onclick(){
		Image_event_onclick.click();
		return Image_event_onclick_link.getText();
	}
	
	@FindBy(id="Image_event_image01")
	private WebElement Image_event_onFocus;
	
	@FindBy(id="Image_event_label02")
	private WebElement Image_event_onFocus_label;
	
	public String Image_event_onFocus(){
		Image_event_onFocus.click();
		return Image_event_onFocus_label.getText();
	}

	@FindBy(id="Image_event_image02")
	private WebElement Image_event_onBlur;
	
	@FindBy(id="Image_event_label06")
	private WebElement Image_event_onBlur_label;
	
	public String Image_event_onBlur(){
		Image_event_onBlur.click();
		Image_event_onFocus.click();
		return Image_event_onBlur_label.getText();
	}
	
	@FindBy(id="Image_event_image03")
	private WebElement Image_event_onMouseDown;
	
	@FindBy(id="Image_event_label13")
	private WebElement Image_event_onMouseDown_label;
	
	public String Image_event_onMouseDown(){
		Image_event_onMouseDown.click();
		return Image_event_onMouseDown_label.getText();
	}
	
	@FindBy(id="Image_event_image04")
	private WebElement Image_event_onMouseUp;
	
	@FindBy(id="Image_event_label18")
	private WebElement Image_event_onMouseUp_label;
	
	public String Image_event_onMouseUp(){
		Image_event_onMouseUp.click();
		return Image_event_onMouseUp_label.getText();
	}
	
	@FindBy(id="Image_event_image05")
	private WebElement Image_event_onMouseEnter;
	
	@FindBy(id="Image_event_label19")
	private WebElement Image_event_onMouseEnter_label;
	
	public String Image_event_onMouseEnter(){
		Main_Class main_class = new Main_Class();
		main_class.widget_moveToElement("Image_event_image05");
		return Image_event_onMouseEnter_label.getText();
	}
	
	@FindBy(id="Image_event_image06")
	private WebElement Image_event_onMouseLeave;
	
	@FindBy(id="Image_event_label20")
	private WebElement Image_event_onMouseLeave_label;
	
	public String Image_event_onMouseLeave(){
		Main_Class main_class = new Main_Class();
		main_class.widget_moveToElement("Image_event_image06");
		main_class.widget_moveToElement("Image_event_label20");
		return Image_event_onMouseLeave_label.getText();
	}
	
	@FindBy(id="Image_event_image07")
	private WebElement Image_event_onMouseMove;
	
	@FindBy(id="Image_event_label21")
	private WebElement Image_event_onMouseMove_label;
	
	public String Image_event_onMouseMove(){
		Main_Class main_class = new Main_Class();
		main_class.widget_moveToElement("Image_event_image07");
		return Image_event_onMouseMove_label.getText();
	}
	
//###############################Image Event#######################################
//###############################Image Condition###################################
	@FindBy(id="Image_condition_image")
	private WebElement Image_condition_isFocusable;
	
	@FindBy(id="Image_condition_label04")
	private WebElement Image_condition_isFocusable_label;
	
	public String Image_condition_isFocusable(){
		Image_condition_isFocusable.click();
		return Image_condition_isFocusable_label.getText();
	}
	
	@FindBy(id="Image_condition_image02")
	private WebElement Image_condition_disabledTrue;
	
	@FindBy(id="Image_condition_text")
	private WebElement Image_condition_disabledTrue_label;
	
	public String Image_condition_disabledTrue(){
		Main_Class main_class = new Main_Class();
		main_class.widget_moveToElement("Image_condition_image02");
		return Image_condition_disabledTrue_label.getAttribute("value");
	}
	
	@FindBy(id="Image_condition_image01")
	private WebElement Image_condition_disabledFalse;
	
	@FindBy(id="Image_condition_label07")
	private WebElement Image_condition_disabledFalse_label;
	
	public String Image_condition_disabledFalse(){
		Main_Class main_class = new Main_Class();
		main_class.widget_moveToElement("Image_condition_image01");
		return Image_condition_disabledFalse_label.getText();
	}
	
	@FindBy(id="Image_condition_image03")
	private WebElement Image_condition_Constant;
	
	@FindBy(id="Image_condition_label17")
	private WebElement Image_condition_Constant_label;
	
	public String Image_condition_Constant(){
		Image_condition_Constant.click();
		return Image_condition_Constant_label.getText();
	}
	
	@FindBy(id="Image_condition_image04")
	private WebElement Image_condition_Constant02;
	
	@FindBy(id="Image_condition_label21")
	private WebElement Image_condition_Constant02_label;
	
	public String Image_condition_Constant02(){
		Image_condition_Constant02.click();
		return Image_condition_Constant02_label.getText();
	}
	
	@FindBy(id="Image_condition_image05")
	private WebElement Image_Expression_isFocusable;
	
	@FindBy(id="Image_condition_label25")
	private WebElement Image_Expression_isFocusable_label;
	
	public String Image_Expression_isFocusable(){
		Image_Expression_isFocusable.click();
		return Image_Expression_isFocusable_label.getText();
	}
	
	@FindBy(id="Image_condition_image06")
	private WebElement Image_Expression_id;
	
	@FindBy(id="Image_condition_label29")
	private WebElement Image_Expression_id_label;
	
	public String Image_Expression_id(){
		Image_Expression_id.click();
		return Image_Expression_id_label.getText();
	}
	
	@FindBy(id="Image_condition_image07")
	private WebElement Image_Expression_location;
	
	@FindBy(id="Image_condition_label36")
	private WebElement Image_Expression_location_label;
	
	public String Image_Expression_location(){
		Image_Expression_location.click();
		return Image_Expression_location_label.getText();
	}
	
	@FindBy(id="Image_condition_image08")
	private WebElement Image_Expression_visibility;
	
	@FindBy(id="Image_condition_label38")
	private WebElement Image_Expression_visibility_label;
	
	public Boolean Image_Expression_visibility(){
		Image_Expression_visibility.click();
		return Image_Expression_visibility_label.isDisplayed();
	}
	
	@FindBy(id="Image_condition_image09")
	private WebElement Image_Expression_disbaleFalse;
	
	@FindBy(id="Image_condition_label40")
	private WebElement Image_Expression_disbaleFalse_label;
	
	public String Image_Expression_disbaleFalse(){
		Image_Expression_disbaleFalse.click();
		return Image_Expression_disbaleFalse_label.getText();
	}
	
	@FindBy(id="Image_condition_image10")
	private WebElement Image_Expression_target;
	
	@FindBy(id="Image_condition_label42")
	private WebElement Image_Expression_target_label;
	
	public String Image_Expression_target(){
		Image_Expression_target.click();
		return Image_Expression_target_label.getText();
	}
	
	@FindBy(id="Image_condition_image11")
	private WebElement Image_Expression_tabIndex;
	
	@FindBy(id="Image_condition_label44")
	private WebElement Image_Expression_tabIndex_label;
	
	public String Image_Expression_tabIndex(){
		Image_Expression_tabIndex.click();
		return Image_Expression_tabIndex_label.getText();
	}
	
//###############################Image Condition###################################
//###############################Image Action######################################
	@FindBy(id="Image_action_image")
	private WebElement Image_Action_focus;
	
	@FindBy(id="Image_action_text")
	private WebElement Image_Action_focus_text;
	
	public String Image_Action_focus_getValue(){
		Image_Action_focus_text.click();
		return Image_Action_focus_text.getAttribute("value");
	}
	
	@FindBy(id="Image_action_image01")
	private WebElement Image_Action_styleClass;
	
	@FindBy(id="Image_action_text01")
	private WebElement Image_Action_styleClass_text;
	
	public int Image_Action_styleClass(){
		Image_Action_styleClass_text.click();
		String[] temp = {"commonStyle"};
		int num = CSS.css_query(Image_Action_styleClass.getAttribute("class"), temp);
		return num;
	}
	
	@FindBy(id="Image_action_image08")
	private WebElement Image_Action_location;
	
	@FindBy(id="Image_action_text02")
	private WebElement Image_Action_location_text;
	
	public String Image_Action_location(){
		Image_Action_location_text.click();
		return Image_Action_location.getAttribute("src");
	}
	
	@FindBy(id="Image_action_image02")
	private WebElement Image_Action_visibility;
	
	@FindBy(id="Image_action_text03")
	private WebElement Image_Action_visibility_text;
	
	public Boolean Image_Action_visibility(){
		Image_Action_visibility_text.click();
		return Image_Action_visibility.isDisplayed();
	}
	
	@FindBy(id="Image_action_image03")
	private WebElement Image_Action_disabled;
	
	@FindBy(id="Image_action_text04")
	private WebElement Image_Action_disabled_text;
	
	public String Image_Action_disabled(){
		Image_Action_disabled_text.click();
		return Image_Action_disabled_text.getAttribute("value");
	}
	
	/*@FindBy(id="Image_action_image04")
	private WebElement Image_Action_target;
	
	@FindBy(id="Image_action_text05")
	private WebElement Image_Action_target_text;
	
	public Boolean Image_Action_target(){
	}*/
	
	@FindBy(id="Image_action_image06")
	private WebElement Image_Action_alt;
	
	@FindBy(id="Image_action_text07")
	private WebElement Image_Action_alt_text;
	
	public String Image_Action_alt(){
		Image_Action_alt_text.click();
		return Image_Action_alt.getAttribute("alt");
	}
	
	public String Image_Action_alt_getvalue(){
		return Image_Action_alt_text.getAttribute("value");
	}
	
	@FindBy(id="Image_action_image07")
	private WebElement Image_Action_hint;
	
	@FindBy(id="Image_action_text08")
	private WebElement Image_Action_hint_text;
	
	public String Image_Action_hint(){
		Image_Action_hint_text.click();
		return Image_Action_hint.getAttribute("title");
	}
	
	@FindBy(id="Image_action_image05")
	private WebElement Image_Action_actionGroup;
	
	@FindBy(id="Image_action_text06")
	private WebElement Image_Action_actionGroup_text;
	
	public Boolean Image_Action_actionGroup(){
		Image_Action_actionGroup_text.click();
		return Image_Action_actionGroup.isDisplayed();
	}
//###############################Image Action######################################
//###############################Image ActionTab###################################
	
//###############################Image ActionTab###################################

}