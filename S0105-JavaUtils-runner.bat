@echo off
chcp 65001 > nul
cls

:: Variables de entorno
set BASE_DIR=%HOMEPATH%\IdeaProjects\S0105-JavaUtils
set SRC_DIR=%BASE_DIR%\src\main\java
set TARGET_DIR=%BASE_DIR%\target\classes

cd %BASE_DIR%

echo Pulsa ENTER para continuar...
set /p tempVar=

:: Mostrar README
type README_console.txt
echo.
pause

:: ==================================
:: = FUNCIONES AL FINAL DEL ARCHIVO =
:: ==================================

:: NIVEL 1
echo ================================
echo # NIVEL 1 - Ejercicios
echo ================================
echo.

echo ## Ejercicio 1 a 3
call :compile "level01\exercises01to03"
call :run "level01.exercises01to03.Main" "%SRC_DIR%"
pause
echo.

echo ## Ejercicio 4
call :compile "level01\exercise04"
call :run "level01.exercise04.Main"
pause
echo.

echo ## Ejercicio 5
call :compile "level01\exercise05"
call :run "level01.exercise05.Main"
pause
echo.

:: NIVEL 2
echo ================================
echo # NIVEL 2
echo ================================
echo.

echo ## Ejercicio 1
call :compile "level02\exercise01"
call :run "level02.exercise01.Main"
pause
echo.

:: NIVEL 3
echo ================================
echo # NIVEL 3
echo ================================
echo.

echo ## Ejercicio 1
call :compile "level03\exercise01"
call :run "level03.exercise01.Main"
echo.

:: Limpieza
del sources.path > nul
goto :eof

:: =========================
:: FUNCIONES
:: =========================

:compile
echo.
echo Compilando %~1...
dir /b /s "%SRC_DIR%\%~1\*.java" > sources.path
javac -d "%TARGET_DIR%" @sources.path
echo.
goto :eof

:run
echo Ejecutando %~1 %~2
echo.
java -cp "%TARGET_DIR%" %~1 %~2
echo.
goto :eof
