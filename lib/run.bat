git clone https://github.com/Git-07/Test_NG_Repo.git Test_Repo
cd Test_Repo
set projectPath=C:\Users\mohit\.jenkins\workspace\Run_Test_NG_Git\Test_Repo
set classpath=C:\Users\mohit\workspace\Test_NG\bin;%projectPath%\lib\*;
java org.testng.TestNG testng.xml
del %projectPath%
Y
