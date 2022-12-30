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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Login/Login ClientA'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MatchQ DEV/Candidate List page/button Candidate List'))

WebUI.click(findTestObject('MatchQ DEV/Candidate List page/Selection/button Candidate Name'))

String candIDSideMenu = WebUI.getText(findTestObject('MatchQ DEV/Candidate List page/Candidate details side-menu/Candidate information/Candidate ID'))

String dateAddedSideMenu = WebUI.getText(findTestObject('MatchQ DEV/Candidate List page/Candidate details side-menu/Candidate information/Date Added'))

String lastActivitySideMenu = WebUI.getText(findTestObject('MatchQ DEV/Candidate List page/Candidate details side-menu/Candidate information/Last Activity'))

String statusSideMenu = WebUI.getText(findTestObject('MatchQ DEV/Candidate List page/Candidate details side-menu/Candidate information/Status'))

String fullNameSideMenu = WebUI.getText(findTestObject('MatchQ DEV/Candidate List page/Candidate details side-menu/Personal information/Full Name'))

String genderSideMenu = WebUI.getText(findTestObject('MatchQ DEV/Candidate List page/Candidate details side-menu/Personal information/Gender'))

String dateBirthSideMenu = WebUI.getText(findTestObject('MatchQ DEV/Candidate List page/Candidate details side-menu/Personal information/Date Birth'))

String emailSideMenu = WebUI.getText(findTestObject('MatchQ DEV/Candidate List page/Candidate details side-menu/Personal information/Email'))

String clientSideMenu = WebUI.getText(findTestObject('MatchQ DEV/Candidate List page/Candidate details side-menu/Division/Client'))

String unitSideMenu = WebUI.getText(findTestObject('MatchQ DEV/Candidate List page/Candidate details side-menu/Division/Unit'))

String functionSideMenu = WebUI.getText(findTestObject('MatchQ DEV/Candidate List page/Candidate details side-menu/Division/Function'))

WebUI.click(findTestObject('MatchQ DEV/Candidate List page/Candidate details side-menu/button Candidate Details'))

String firstNameCandidateDetailsPage = WebUI.getAttribute(findTestObject('MatchQ DEV/Candidate List page/Candidate details page/input First Name'), 
    'value')

String prefixNameCandidateDetailsPage = WebUI.getAttribute(findTestObject('MatchQ DEV/Candidate List page/Candidate details page/input Prefix Name'), 
    'value')

String lastNameCandidateDetailsPage = WebUI.getAttribute(findTestObject('MatchQ DEV/Candidate List page/Candidate details page/input Last Name'), 
    'value')

String fullNameCandidateDetailsPage = WebUI.concatenate(firstNameCandidateDetailsPage, prefixNameCandidateDetailsPage, lastNameCandidateDetailsPage)

WebUI.verifyEqual(fullNameCandidateDetailsPage.replaceAll('\\s', ''), fullNameSideMenu.replaceAll('\\s', ''))

WebUI.verifyElementText(findTestObject('MatchQ DEV/Candidate List page/Candidate details page/dropdown Gender'), genderSideMenu)

WebUI.verifyElementText(findTestObject('MatchQ DEV/Candidate List page/Candidate details page/button Date of birth'), dateBirthSideMenu)

String emailCandidateDetailsPage = WebUI.getAttribute(findTestObject('MatchQ DEV/Candidate List page/Candidate details page/input Email'), 
    'value')

WebUI.verifyEqual(emailCandidateDetailsPage, emailSideMenu)

String candIDCandidateDetailsPage = WebUI.getAttribute(findTestObject('MatchQ DEV/Candidate List page/Candidate details page/System information/Candidate ID'), 
    'value')

WebUI.verifyEqual(candIDCandidateDetailsPage, candIDSideMenu)

String dateAddedCandidateDetailsPage = WebUI.getAttribute(findTestObject('MatchQ DEV/Candidate List page/Candidate details page/System information/Date Added'), 
    'value')

WebUI.verifyEqual(dateAddedCandidateDetailsPage, dateAddedSideMenu)

String lastActivityCandidateDetailsPage = WebUI.getAttribute(findTestObject('MatchQ DEV/Candidate List page/Candidate details page/System information/Last activity'), 
    'value')

WebUI.verifyEqual(lastActivityCandidateDetailsPage, lastActivitySideMenu)

String statusCandidateDetailsPage = WebUI.getAttribute(findTestObject('MatchQ DEV/Candidate List page/Candidate details page/System information/Status'), 
    'value')

WebUI.verifyEqual(statusCandidateDetailsPage, statusSideMenu)

String clientCandidateDetailsPage = WebUI.getAttribute(findTestObject('MatchQ DEV/Candidate List page/Candidate details page/Division/Client'), 
    'value')

WebUI.verifyEqual(clientCandidateDetailsPage, clientSideMenu)

String unitCandidateDetailsPage = WebUI.getAttribute(findTestObject('MatchQ DEV/Candidate List page/Candidate details page/Division/Unit'), 
    'value')

WebUI.verifyEqual(unitCandidateDetailsPage, unitSideMenu)

String functionCandidateDetailsPage = WebUI.getAttribute(findTestObject('MatchQ DEV/Candidate List page/Candidate details page/Division/Function'), 
    'value')

WebUI.verifyEqual(functionCandidateDetailsPage, functionSideMenu)

WebUI.closeBrowser()

