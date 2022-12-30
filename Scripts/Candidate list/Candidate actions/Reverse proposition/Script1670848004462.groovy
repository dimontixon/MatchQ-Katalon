import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Login/Login ClientA'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MatchQ DEV/Candidate List page/button Candidate List'))

WebUI.click(findTestObject('MatchQ DEV/Candidate List page/button Filters'))

WebUI.click(findTestObject('MatchQ DEV/Candidate List page/Filters/dropdown Filter Status'))

WebUI.click(findTestObject('MatchQ DEV/Candidate List page/Filters/Filters Statuses/Status Proposed'))

WebUI.click(findTestObject('MatchQ DEV/Candidate List page/Filters/button Apply'))

int oldNumberCandidates = WebUI.getText(findTestObject('MatchQ DEV/Candidate List page/number Candidates')).toInteger()

WebUI.click(findTestObject('MatchQ DEV/Candidate List page/Selection/button Actions'))

WebUI.click(findTestObject('MatchQ DEV/Candidate List page/Single Actions/Action Reverse proposition'))

WebUI.click(findTestObject('MatchQ DEV/Candidate List page/Single Actions/Reverse proposition/button Reverse proposition'))

WebUI.verifyElementText(findTestObject('MatchQ DEV/Candidate List page/Single Actions/Reverse proposition/notification Successfully reverse proposition'), 
    'The candidate has been returned to it\'s previous status.')

if(oldNumberCandidates > 1) {
	int newNumberCandidates = WebUI.getText(findTestObject('MatchQ DEV/Candidate List page/number Candidates')).toInteger()
	WebUI.verifyEqual(newNumberCandidates, oldNumberCandidates - 1)
}


