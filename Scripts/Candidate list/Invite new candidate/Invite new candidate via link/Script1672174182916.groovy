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

WebUI.callTestCase(findTestCase('Login/Login ClientA'), [:], FailureHandling.STOP_ON_FAILURE)

// open Candidate List page
WebUI.click(findTestObject('MatchQ DEV/Candidate List page/button Candidate List'))

// click Invite new candidate button
WebUI.click(findTestObject('MatchQ DEV/Candidate List page/button Invite new candidate'))

// click Invite via link button
WebUI.click(findTestObject('MatchQ DEV/Candidate List page/Invite New Candidate/button Invite via link'))

// select first Unit
WebUI.click(findTestObject('MatchQ DEV/Candidate List page/Invite New Candidate/Invite via link/dropdown Unit'))

WebUI.click(findTestObject('MatchQ DEV/Candidate List page/Invite New Candidate/Invite via link/dropdown Item'))

// select Behaviour sequence
WebUI.click(findTestObject('MatchQ DEV/Candidate List page/Invite New Candidate/Invite via link/dropdown Function'))

TestObject dropdownFunction = findTestObject('MatchQ DEV/Candidate List page/Invite New Candidate/Personal invite via email/Step 1 - Choose the assessment/dropdown Item')

List<WebElement> listFunctions = WebUI.findWebElements(dropdownFunction, 10)

for (int i = 0; i < listFunctions.size(); ++i) {
    String nameFunction = listFunctions.get(i).getText()

    if (nameFunction == 'Behaviour') {
        WebUI.click(WebUI.convertWebElementToTestObject(listFunctions.get(i)))

        break
    }
}

//click Open link in new window button
WebUI.click(findTestObject('MatchQ DEV/Candidate List page/Invite New Candidate/Invite via link/button Open link in new window'))

// get index of current tab
int tabNewUI = WebUI.getWindowIndex()

// set active new opened tab
WebUI.switchToWindowIndex(tabNewUI + 1)

// go Next
WebUI.click(findTestObject('MatchQ DEV/Candidate List page/Invite New Candidate/Invite via link/Registration/button Next'))

// confirm Privacy
WebUI.check(findTestObject('MatchQ DEV/Candidate List page/Invite New Candidate/Invite via link/Registration/checkbox Privacy'))

// go Next
WebUI.click(findTestObject('MatchQ DEV/Candidate List page/Invite New Candidate/Invite via link/Registration/button Next'))

// set First Name
int randomInt = new Random().nextInt((999 - 100) + 1) + 100

String firstName = 'test' + randomInt.toString()

WebUI.setText(findTestObject('MatchQ DEV/Candidate List page/Invite New Candidate/Invite via link/Registration/Form/input First Name'), 
    firstName)

// set Last Name
randomInt = (new Random().nextInt((999 - 100) + 1) + 100)

String lastName = 'abc' + randomInt.toString()

WebUI.setText(findTestObject('MatchQ DEV/Candidate List page/Invite New Candidate/Invite via link/Registration/Form/input Last Name'), 
    lastName)

// set Day of birth
WebUI.click(findTestObject('MatchQ DEV/Candidate List page/Invite New Candidate/Invite via link/Registration/Form/dropdown Day'))

TestObject dropdownDay = findTestObject('MatchQ DEV/Candidate List page/Invite New Candidate/Invite via link/Registration/Form/dropdown Item')

List<WebElement> listDays = WebUI.findWebElements(dropdownDay, 10)

int dayNumber = new Random().nextInt((27 - 0) + 1) + 0

WebUI.click(WebUI.convertWebElementToTestObject(listDays.get(dayNumber)))

// set Month of birth
WebUI.click(findTestObject('MatchQ DEV/Candidate List page/Invite New Candidate/Invite via link/Registration/Form/dropdown Month'))

TestObject dropdownMonth = findTestObject('MatchQ DEV/Candidate List page/Invite New Candidate/Invite via link/Registration/Form/dropdown Item')

List<WebElement> listMonth = WebUI.findWebElements(dropdownMonth, 10)

int monthNumber = new Random().nextInt((11 - 0) + 1) + 0

WebUI.click(WebUI.convertWebElementToTestObject(listMonth.get(monthNumber)))

// set Year of birth
WebUI.click(findTestObject('MatchQ DEV/Candidate List page/Invite New Candidate/Invite via link/Registration/Form/dropdown Year'))

TestObject dropdownYear = findTestObject('MatchQ DEV/Candidate List page/Invite New Candidate/Invite via link/Registration/Form/dropdown Item')

List<WebElement> listYear = WebUI.findWebElements(dropdownYear, 10)

int yearNumber = new Random().nextInt((30 - 1) + 1) + 1

WebUI.click(WebUI.convertWebElementToTestObject(listYear.get(yearNumber)))

// set Gender
WebUI.click(findTestObject('MatchQ DEV/Candidate List page/Invite New Candidate/Invite via link/Registration/Form/gender Male'))

// set Email
String email = firstName + '@test.com'

WebUI.setText(findTestObject('MatchQ DEV/Candidate List page/Invite New Candidate/Invite via link/Registration/Form/input Email'), 
    email)

// set Confirm email
WebUI.setText(findTestObject('MatchQ DEV/Candidate List page/Invite New Candidate/Invite via link/Registration/Form/input Confirm email'), 
    email)

// set Phone number
WebUI.setText(findTestObject('MatchQ DEV/Candidate List page/Invite New Candidate/Invite via link/Registration/Form/input Phone number'), 
    '12345')

// set Education
WebUI.click(findTestObject('MatchQ DEV/Candidate List page/Invite New Candidate/Invite via link/Registration/Form/dropdown Education'))

TestObject dropdownEducation = findTestObject('MatchQ DEV/Candidate List page/Invite New Candidate/Invite via link/Registration/Form/dropdown Item')

List<WebElement> listEducation = WebUI.findWebElements(dropdownEducation, 10)

int educationNumber = new Random().nextInt((6 - 2) + 1) + 2

WebUI.click(WebUI.convertWebElementToTestObject(listEducation.get(educationNumber)))

// click Next and create a candidate
WebUI.click(findTestObject('MatchQ DEV/Candidate List page/Invite New Candidate/Invite via link/Registration/button Next'))

// go back to the NEW UI
WebUI.switchToWindowIndex(tabNewUI)

// refresh Candidate List
WebUI.click(findTestObject('MatchQ DEV/Candidate List page/button Candidate List'))

// checking whether a new candidate has been created
String newCandidateFullName = firstName + ' ' + lastName

WebUI.verifyElementText(findTestObject('MatchQ DEV/Candidate List page/Selection/button Candidate Name'), newCandidateFullName)

