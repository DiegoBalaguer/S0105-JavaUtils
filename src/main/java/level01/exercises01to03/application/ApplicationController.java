package level01.exercises01to03.application;

import level01.exercises01to03.Utils.FileUtils;

import java.io.File;
import java.nio.file.InvalidPathException;

/**
 * PROGRAM: ApplicationController
 * AUTHOR: Diego Balaguer
 * DATE: 25/04/2025
 */

public class ApplicationController {

      public void run(String pathLoad) {
        System.out.println("* STARTING UTILS PROCESS..........." + System.lineSeparator());
        File path = new File(pathLoad);
        try {
            FileUtils.isCorrectPath(path);
            ApplicationWorkers applicationWorkers = new ApplicationWorkers(path);
            System.out.println("** List one directory sorted............." + System.lineSeparator());
            applicationWorkers.showSortedOneDirectory();

            System.out.println("** List tree directory's sorted............." + System.lineSeparator());
            applicationWorkers.showSortedDirectory();

            System.out.println("** Save in .TXT list tree directory's sorted............." + System.lineSeparator());
            applicationWorkers.saveSortedDirectoryToFile();
            System.out.println("✅ process completed correctly");

        } catch (InvalidPathException e) {
              System.err.println("❌ Error: " + e.getMessage());
          }
    }
}
