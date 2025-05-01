package level01.exercise05.Utils;

import java.io.*;
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

    public static void isCorrectPath(File path) throws InvalidPathException {
        if (!path.exists() && !path.isDirectory()) {
            throw new InvalidPathException(path.toString(), "Invalid path");
        }
    }

    public static boolean exist(Path path) {
        return path.toFile().exists();
    }

    public static Object readObjectSerialized(Path pathWithFile) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(pathWithFile.toFile()));
        return objectInputStream.readObject();
    }

    public static void saveObjectSerialized(Path pathWithFile, Object objectSave) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(pathWithFile.toFile()));
        objectOutputStream.writeObject(objectSave);
    }
}
