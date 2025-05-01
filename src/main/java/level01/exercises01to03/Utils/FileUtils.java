package level01.exercises01to03.Utils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileUtils {

    public static String readStringFile(Path pathWithFile) throws IOException {
        String textFile = "";

        textFile = Files.readString(pathWithFile, StandardCharsets.UTF_8);
        return textFile;
    }

    public static void saveStringToFile(Path pathWithFile, String content) throws IOException {
            Path parentDir = pathWithFile.getParent();
            if (parentDir != null && Files.notExists(parentDir)) {
                Files.createDirectories(parentDir);
            }
            Files.writeString(
                    pathWithFile,
                    content,
                    StandardCharsets.UTF_8,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.TRUNCATE_EXISTING
            );
       }

    public static void isCorrectPath(File fileInput) throws InvalidPathException {
        if (!fileInput.exists() && !fileInput.isDirectory()) {
            throw new InvalidPathException(fileInput.toString(), "Invalid path");
        }
    }

    public static boolean exist(Path path) {
        return path.toFile().exists();
    }
}
