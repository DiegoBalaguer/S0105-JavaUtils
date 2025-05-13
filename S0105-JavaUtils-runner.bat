@echo off
chcp 65001 > nul
cls

echo ====================================================================================================
echo EJERCICIOS - TAREA S01.05: JAVA UTILS
echo ====================================================================================================
echo.
:: Variables de entorno
set BASE_DIR=%CD%
set SRC_DIR=%BASE_DIR%\src\main\java
set TARGET_DIR=%BASE_DIR%\outJava

echo VARIABLES DE ENTORNO
echo.
echo Directorio base:        %BASE_DIR%
echo Directorio src:         %SRC_DIR%
echo Directorio compilación: %TARGET_DIR%
echo.
echo Pulsa ENTER para continuar...
set /p tempVar=

:: Mostrar README
type README_console.txt
echo.
pause
echo.
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
echo.

echo ## Ejercicio 4
call :compile "level01\exercise04"
call :run "level01.exercise04.Main"
echo.

echo ## Ejercicio 5
call :compile "level01\exercise05"
call :run "level01.exercise05.Main"
echo.

:: NIVEL 2
echo ================================
echo # NIVEL 2
echo ================================
echo.

echo ## Ejercicio 1
call :compile "level02\exercise01"
call :run "level02.exercise01.Main"
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

:: Borrar la carpeta TARGET_DIR (out\classes) recursivamente
if exist "%TARGET_DIR%\" (
    rmdir /s /q "%TARGET_DIR%"
)
goto :eof

:: =========================
:: FUNCIONES
:: =========================

:compile
echo.
pause
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
