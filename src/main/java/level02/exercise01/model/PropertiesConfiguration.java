package level02.exercise01.model;

import level02.exercise01.utils.FileUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Properties;

/**
 * PROGRAM: PropertiesConfiguration
 * AUTHOR: Diego Balaguer
 * DATE: 25/04/2025
 */

public class PropertiesConfiguration {

    private Properties properties = new Properties();

    public void loadProperties() {
        try {
            Path inputPathWithFile = Path.of("src", "main", "java", "level02", "exercise01", "configuration", "configuration.ini").normalize();
            FileInputStream fileProperties = FileUtils.readFileInputStream(inputPathWithFile);
            properties.load(fileProperties);
            System.out.println("✅ File load to: " + inputPathWithFile);
        } catch (IOException e) {
            System.err.println("❌ Error loading file: " + e.getMessage());
        }
    }

    public Path getDirectoryLoad() {
        return Path.of(properties.getProperty("directoryLoad"));
    }

    public Path getPathWithFile() {
        return Path.of(properties.getProperty("pathWithFile"));
    }
}