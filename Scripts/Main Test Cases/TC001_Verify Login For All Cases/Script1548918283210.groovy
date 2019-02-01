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

@com.kms.katalon.core.annotation.SetUp
def Setup() {
	WebUI.openBrowser(var_url)
}

'Click Sign in Masuk/Daftar'
WebUI.click(findTestObject('Object Repository/Login Web/Page_Alfacart - Belanja Online Jadi/a_MasukDaftar'))

'Call Login function'
WebUI.callTestCase(findTestCase('Common Test Case/Login'), [('var_username') : var_email, ('var_password') : var_password], 
    FailureHandling.STOP_ON_FAILURE)

'Get Status expected test case result'
switch (var_statusExpectedResult.toString()) {
    case 'email_is_empty':
        'Verify when expected test case login with email is empty'
        String errorMess = WebUI.getText(findTestObject('Object Repository/ErorMessLogin/ErorMessage/emailKosong'))
        WebUI.verifyEqual(errorMess.contains('This field is required.'), true)
        break
	CustomKeywords.'excel.writeExcel.demoKey'(1, errorMess)
    case 'email_isnot_correct':
        'Verify when expected test case login fail with email is not correct'
        String errorMess = WebUI.getText(findTestObject('Object Repository/ErorMessLogin/ErorMessage/akunInvalid'))

        WebUI.verifyEqual(errorMess.contains('Invalid email/phone number or password'), true)
        break
}


@com.kms.katalon.core.annotation.TearDown
def Teardown() {
    WebUI.closeBrowser()
}

