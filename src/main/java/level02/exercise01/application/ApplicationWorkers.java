package level02.exercise01.application;

import level02.exercise01.utils.FileUtils;
import level02.exercise01.utils.DirectoryUtils;
import level02.exercise01.model.PropertiesConfiguration;

import java.io.IOException;
import java.nio.file.Path;

/**
 * PROGRAM: ApplicationWorkers
 * AUTHOR: Diego Balaguer
 * DATE: 25/04/2025
 */

public class ApplicationWorkers {
    private final PropertiesConfiguration propertiesConfiguration;
    private Path pathWithFileDirectoryList;
    private Path pathWithFileDirectoryOutput;

    public ApplicationWorkers() {
        propertiesConfiguration = new PropertiesConfiguration();
     }

    public void loadProperties() {
        propertiesConfiguration.loadProperties();
        pathWithFileDirectoryList = propertiesConfiguration.getDirectoryLoad();
        pathWithFileDirectoryOutput = propertiesConfiguration.getPathWithFile();
    }

    public Path getPathWithFileDirectoryList() {
        return pathWithFileDirectoryList;
    }

    public void showSortedOneDirectory() {
        System.out.println(DirectoryUtils.getSortedOneDirectory(pathWithFileDirectoryList.toFile()));
    }

    public void showSortedDirectory() {
        System.out.println(DirectoryUtils.getSortedDirectory(pathWithFileDirectoryList.toFile()));
    }

    public void saveSortedDirectoryToFile() {
        try {
            String directoryTree = DirectoryUtils.getSortedDirectory(pathWithFileDirectoryList.toFile());
            Path outputPathFile = pathWithFileDirectoryOutput;
            FileUtils.saveStringToFile(outputPathFile, directoryTree);
            System.out.println("✅ File saved to: " + outputPathFile);
        } catch (IOException e) {
            System.err.println("❌ Error writing file: " + e.getMessage());
        }
    }

}
