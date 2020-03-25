package bizagi

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class BizagiBoolean {


	@Keyword
	def static void checkRadio(String xpath){
		WebUI.click(getObject(getAbsolutePathTrue(xpath)))
	}

	@Keyword
	def static void uncheckRadio(String xpath){
		WebUI.click(getObject(getAbsolutePathFalse(xpath)))
	}

	@Keyword
	def static void clickCheckBox(String xpath){
		WebUI.click(getObject(getAbsolutePathDefault(xpath)))
	}

	private static TestObject getObject(String xpath){
		TestObject to = new TestObject()
		to.addProperty("xpath", ConditionType.EQUALS, xpath)
		return to
	}

	private static String getAbsolutePathDefault(String xpath){
		String absolutePath = "/child::div/child::div/child::div/child::div/child::label";
		String path = String.format(BizagiSelectors.dynamicIdPath, xpath) + absolutePath
		return path
	}

	private static String getAbsolutePathTrue(String xpath){
		String absolutePath = "/child::div/child::div/child::div/child::div/child::div/child::label[contains(.,'Sim')]";
		String path = String.format(BizagiSelectors.dynamicIdPath, xpath) + absolutePath
		return path
	}

	private static String getAbsolutePathFalse(String xpath){
		String absolutePath = "/child::div/child::div/child::div/child::div/child::div/child::label[contains(.,'Não')]";
		String path = String.format(BizagiSelectors.dynamicIdPath, xpath) + absolutePath
		return path
	}
}
