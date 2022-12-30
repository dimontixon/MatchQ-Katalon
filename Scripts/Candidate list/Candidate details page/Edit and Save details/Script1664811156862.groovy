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

WebUI.click(findTestObject('MatchQ DEV/Candidate List page/Selection/button Candidate Name'))

WebUI.click(findTestObject('MatchQ DEV/Candidate List page/Candidate details side-menu/button Candidate Details'))

WebUI.click(findTestObject('MatchQ DEV/Candidate List page/Candidate details page/button Edit'))

int randomInt = new Random().nextInt((999 - 100) + 1) + 100

String editedFirstName = 'edited test' + randomInt.toString()

WebUI.setText(findTestObject('MatchQ DEV/Candidate List page/Candidate details page/input First Name'), editedFirstName)

randomInt = (new Random().nextInt((999 - 100) + 1) + 100)

String editedLastName = 'edited abc ' + randomInt.toString()

WebUI.setText(findTestObject('MatchQ DEV/Candidate List page/Candidate details page/input Last Name'), editedLastName)

WebUI.click(findTestObject('MatchQ DEV/Candidate List page/Candidate details page/button Save'))

WebUI.verifyElementText(findTestObject('MatchQ DEV/Candidate List page/Candidate details page/notification Successfully edited'), 
    'Information was updated.')

WebUI.delay(3)

WebUI.closeBrowser()




