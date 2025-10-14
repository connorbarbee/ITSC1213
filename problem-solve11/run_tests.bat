@echo off
REM Compile all Java files in this folder and run BankAccountTest
cd /d "%~dp0"
if not exist bin mkdir bin
javac -d bin *.java
if errorlevel 1 (
  echo Compilation failed.
  exit /b 1
)
java -cp bin BankAccountTest
pause
