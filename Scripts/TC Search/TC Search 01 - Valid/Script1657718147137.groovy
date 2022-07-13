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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://kotakoki.wijaysali.my.id/')

WebUI.setText(findTestObject('Object Repository/Search/input_Featured products_s'), 'Frozen Tempe Furai Original 400 g')

WebUI.sendKeys(findTestObject('Object Repository/Search/input_Featured products_s'), Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('Search/Page_Frozen Tempe Furai Original 400 g  Kotakoki/h1_Frozen Tempe Furai Original 400 g'), 
    0)

WebUI.verifyElementPresent(findTestObject('Search/Page_Frozen Tempe Furai Original 400 g  Kotakoki/img_Search_wp-post-image'), 
    0)

WebUI.verifyElementPresent(findTestObject('Search/Page_Frozen Tempe Furai Original 400 g  Kotakoki/bdi_Rp56.200'), 0)

WebUI.verifyElementPresent(findTestObject('Search/Page_Frozen Tempe Furai Original 400 g  Kotakoki/p_If you like spicy food, we recommend you _498c9d'), 
    0)

WebUI.verifyElementPresent(findTestObject('Search/Page_Frozen Tempe Furai Original 400 g  Kotakoki/p_It is now available in kotakoki as a read_f133d2'), 
    0)

WebUI.closeBrowser()
