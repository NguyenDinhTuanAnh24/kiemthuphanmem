@echo off
if not exist out\classes mkdir out\classes
if not exist out\test-classes mkdir out\test-classes
echo Compiling source...
javac -d out\classes -encoding UTF-8 src\StudentAnalyzer.java
if %errorlevel% neq 0 (
    echo Error compiling source
    exit /b %errorlevel%
)
echo Compiling tests...
javac -d out\test-classes -encoding UTF-8 -cp "out\classes;junit-platform-console-standalone-1.10.0.jar" test\StudentAnalyzerTest.java
if %errorlevel% neq 0 (
    echo Error compiling tests
    exit /b %errorlevel%
)
echo Running tests...
java -jar junit-platform-console-standalone-1.10.0.jar --class-path "out\classes;out\test-classes" --select-class StudentAnalyzerTest
