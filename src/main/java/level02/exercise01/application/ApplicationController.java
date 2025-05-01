package level02.exercise01.application;

import level02.exercise01.Utils.FileUtils;

import java.nio.file.InvalidPathException;

/**
 * PROGRAM: ApplicationController
 * AUTHOR: Diego Balaguer
 * DATE: 25/04/2025
 */

public class ApplicationController {

    public void run() {

        ApplicationWorkers ApplicationWorkers = new ApplicationWorkers();
        ApplicationWorkers.loadProperties();

        System.out.println("* STARTING UTILS PROCESS..........." + System.lineSeparator());

        System.out.println("** Load Java Properties configuration............." + System.lineSeparator());

        try {
            FileUtils.isCorrectPath(ApplicationWorkers.getPathWithFileDirectoryList().toFile());
            System.out.println("** List one directory sorted............." + System.lineSeparator());
            ApplicationWorkers.showSortedOneDirectory();

            System.out.println("** List tree directory's sorted............." + System.lineSeparator());
            ApplicationWorkers.showSortedDirectory();

            System.out.println("** Save in .TXT list tree directory's sorted............." + System.lineSeparator());
            ApplicationWorkers.saveSortedDirectoryToFile();
            System.out.println("✅ process completed correctly");

        } catch (InvalidPathException e) {
            System.err.println("❌ Error: " + e.getMessage());
        }
    }
}
