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

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.youtapUrl)

WebUI.setText(findTestObject('Login/Input No Hp'), GlobalVariable.no_HP)

WebUI.setEncryptedText(findTestObject('Login/Input Password'), GlobalVariable.password)

WebUI.click(findTestObject('Login/Button Login'))

WebUI.verifyTextPresent('Overview', false)

WebUI.click(findTestObject('Analisis Produk/Menu_Analisis Produk'))

WebUI.verifyElementPresent(findTestObject('Analisis Produk/Verify Page'), 0)

WebUI.click(findTestObject('Filter/Filer'))

WebUI.click(findTestObject('Filter/Kontribusi Pendapatan'))

WebUI.click(findTestObject('Filter/Penjualan Terbanyak'))

