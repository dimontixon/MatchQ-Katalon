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

WebUI.click(findTestObject('MatchQ DEV/Candidate List page/button User Icon'))

WebUI.click(findTestObject('MatchQ DEV/Candidate List page/User Menu/button Sign out'))

WebUI.verifyElementText(findTestObject('MatchQ DEV/Login page/login Title'), 'Hi! Welcome back.')

WebUI.verifyElementText(findTestObject('MatchQ DEV/Login page/login Details'), 'Enter your details below.')

WebUI.verifyElementText(findTestObject('MatchQ DEV/Login page/label User name'), 'User name')

WebUI.verifyElementText(findTestObject('MatchQ DEV/Login page/label Password'), 'Password:')

WebUI.verifyElementText(findTestObject('MatchQ DEV/Login page/button Log in'), 'Log in')

WebUI.verifyElementText(findTestObject('MatchQ DEV/Login page/text Dont have an account'), 'Don’t have an account? Contact us via info@matchq.nl or call us on +31 (0)88 664 64 04')

