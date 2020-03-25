import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.verifyElementPresent(CustomKeywords.'bizagi.BizagiTable.getCollection'(GlobalVariable.HistoricodeOcorrencias), GlobalVariable.MinValueWait)

CustomKeywords.'bizagi.BizagiTable.selectRow'(GlobalVariable.HistoricodeOcorrencias, 'Data', GlobalVariable.VALData)

CustomKeywords.'bizagi.BizagiTable.editRowInSubForm'(GlobalVariable.HistoricodeOcorrencias)

CustomKeywords.'bizagi.BizagiTable.addRowInSubForm'(GlobalVariable.HistoricodeOcorrencias)

WebUI.click(CustomKeywords.'bizagi.BizagiFile.getTestObject'(GlobalVariable.BINArquivo))

CustomKeywords.'bizagi.BizagiFile.attachFile'(GlobalVariable.VALArquivoEvidencia)

WebUI.click(findTestObject('Object Repository/bizagi/Page_Bizagi BPM/btn_guardar'))

