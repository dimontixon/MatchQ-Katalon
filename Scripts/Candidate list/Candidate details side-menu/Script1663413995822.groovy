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
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.callTestCase(findTestCase('Login/Login ClientA'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MatchQ DEV/Candidate List page/button Candidate List'))

String fullCandidateName = WebUI.getText(findTestObject('MatchQ DEV/Candidate List page/Selection/button Candidate Name'))

String dateAdded = WebUI.getText(findTestObject('MatchQ DEV/Candidate List page/Selection/label Date Added'))

String position = WebUI.getText(findTestObject('MatchQ DEV/Candidate List page/Selection/label Position'))

String status = WebUI.getText(findTestObject('MatchQ DEV/Candidate List page/Selection/label Status'))

WebUI.click(findTestObject('MatchQ DEV/Candidate List page/Selection/button Candidate Name'))

WebUI.verifyElementText(findTestObject('MatchQ DEV/Candidate List page/Candidate details side-menu/Candidate information/Date Added'), 
    dateAdded)

WebUI.verifyElementText(findTestObject('MatchQ DEV/Candidate List page/Candidate details side-menu/Candidate information/Status'), 
    status)

WebUI.verifyElementText(findTestObject('MatchQ DEV/Candidate List page/Candidate details side-menu/Personal information/Full Name'), 
    fullCandidateName)

WebUI.verifyElementText(findTestObject('MatchQ DEV/Candidate List page/Candidate details side-menu/Division/Function'), 
    position)

WebUI.closeBrowser()

