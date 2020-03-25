
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String


def static "bizagi.BizagiFile.getTestObject"(
    	String xpath	) {
    (new bizagi.BizagiFile()).getTestObject(
        	xpath)
}

def static "bizagi.BizagiFile.attachFile"(
    	String src	) {
    (new bizagi.BizagiFile()).attachFile(
        	src)
}

def static "bizagi.BizagiTable.getCollection"(
    	String xpath	) {
    (new bizagi.BizagiTable()).getCollection(
        	xpath)
}

def static "bizagi.BizagiTable.selectRow"(
    	String xpath	
     , 	String headerCriteria	
     , 	String valueCriteria	) {
    (new bizagi.BizagiTable()).selectRow(
        	xpath
         , 	headerCriteria
         , 	valueCriteria)
}

def static "bizagi.BizagiTable.editRowInSubForm"(
    	String xpath	) {
    (new bizagi.BizagiTable()).editRowInSubForm(
        	xpath)
}

def static "bizagi.BizagiTable.addRowInSubForm"(
    	String xpath	) {
    (new bizagi.BizagiTable()).addRowInSubForm(
        	xpath)
}

def static "bizagi.BizagiBoolean.checkRadio"(
    	String xpath	) {
    (new bizagi.BizagiBoolean()).checkRadio(
        	xpath)
}

def static "bizagi.BizagiBoolean.uncheckRadio"(
    	String xpath	) {
    (new bizagi.BizagiBoolean()).uncheckRadio(
        	xpath)
}

def static "bizagi.BizagiBoolean.clickCheckBox"(
    	String xpath	) {
    (new bizagi.BizagiBoolean()).clickCheckBox(
        	xpath)
}

def static "bizagi.BizagiExtendedText.getTestObject"(
    	String xpath	) {
    (new bizagi.BizagiExtendedText()).getTestObject(
        	xpath)
}

def static "bizagi.BizagiExtendedText.getValue"(
    	String xpath	) {
    (new bizagi.BizagiExtendedText()).getValue(
        	xpath)
}

def static "bizagi.BizagiDropDownMenu.getTestObject"(
    	String xpath	
     , 	String tag	) {
    (new bizagi.BizagiDropDownMenu()).getTestObject(
        	xpath
         , 	tag)
}

def static "bizagi.BizagiDropDownMenu.selectOption"(
    	String xpath	
     , 	String value	) {
    (new bizagi.BizagiDropDownMenu()).selectOption(
        	xpath
         , 	value)
}

def static "bizagi.BizagiDropDownMenu.getValue"(
    	String xpath	) {
    (new bizagi.BizagiDropDownMenu()).getValue(
        	xpath)
}

def static "bizagi.BizagiNewCaseWindow.getTestObject"(
    	String bizagiClass	) {
    (new bizagi.BizagiNewCaseWindow()).getTestObject(
        	bizagiClass)
}

def static "bizagi.BizagiNewCaseWindow.createCase"() {
    (new bizagi.BizagiNewCaseWindow()).createCase()
}

def static "bizagi.BizagiWorkPortal.openBizagiPortal"(
    	String url	) {
    (new bizagi.BizagiWorkPortal()).openBizagiPortal(
        	url)
}

def static "bizagi.BizagiWorkPortal.CreateNewCase"(
    	String process	) {
    (new bizagi.BizagiWorkPortal()).CreateNewCase(
        	process)
}

def static "bizagi.BizagiWorkPortal.selectCase"(
    	int caso	) {
    (new bizagi.BizagiWorkPortal()).selectCase(
        	caso)
}
