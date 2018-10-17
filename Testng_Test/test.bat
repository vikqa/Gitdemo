set projectLocation=D:\Vikas_Automation_Project\Testng_Test
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml
pause