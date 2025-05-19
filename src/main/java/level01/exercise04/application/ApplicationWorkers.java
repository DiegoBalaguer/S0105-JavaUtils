package level01.exercise04.application;

import level01.exercise04.utils.ConsoleUtils;
import level01.exercise04.utils.FileUtils;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * PROGRAM: AplicationManager
 * AUTHOR: Diego Balaguer
 * DATE: 25/04/2025
 */

public class ApplicationWorkers {

    public String showReadStringFile() throws IOException {
        String message = "";
        String inputPathNameFile = inputPathNameFile();
        Path path = Paths.get(inputPathNameFile);

        message = FileUtils.readStringFile(path);

        return message;
    }

    private String inputPathNameFile() {
        return ConsoleUtils.readRequiredString("Please enter a path & file name: ");
    }
}
