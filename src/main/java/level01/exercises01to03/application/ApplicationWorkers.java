package level01.exercises01to03.application;

import level01.exercises01to03.Utils.DirectoryUtils;
import level01.exercises01to03.Utils.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

/**
 * PROGRAM: ApplicationWorkers
 * AUTHOR: Diego Balaguer
 * DATE: 25/04/2025
 */

public class ApplicationWorkers {
    private File file;

    public ApplicationWorkers(File file) {
        this.file = file;
    }

    public void showSortedOneDirectory() {
        System.out.println(DirectoryUtils.getSortedOneDirectory(file));
    }

    public void showSortedDirectory() {
        System.out.println(DirectoryUtils.getSortedDirectory(file));
    }

    public void saveSortedDirectoryToFile() {
        try {
            String directoryTree = DirectoryUtils.getSortedDirectory(file);
            String fileName = file.getName() + "_structure.txt";
            //Path outputPathFile = Path.of(System.getProperty("user.dir"), "src", "main", "resources", fileName).normalize();
            Path outputPathFile = Path.of("src", "main", "resources", fileName).normalize();
            FileUtils.saveStringToFile(outputPathFile, directoryTree);
            System.out.println("✅ File saved to: " + outputPathFile);
        } catch (IOException e) {
            System.err.println("❌ Error writing file: " + e.getMessage());
        }
    }

}
