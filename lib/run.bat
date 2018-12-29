git clone https://github.com/Git-07/MyRepo.git Test_Repo
set projectPath=C:\Users\mohit\Test_Repo
cd\
cd %projectPath%
set classpath=%projectPath%\bin;%projectPath%\lib\*;
java org.testng.TestNG testng.xml
