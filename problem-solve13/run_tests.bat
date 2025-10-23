@echo off
cd /d "%~dp0"
if not exist bin mkdir bin
javac -d bin *.java
if errorlevel 1 (
  echo Compilation failed
  pause
  exit /b 1
)
java -cp bin TestStudent
pause