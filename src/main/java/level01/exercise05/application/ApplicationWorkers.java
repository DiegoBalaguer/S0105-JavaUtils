package level01.exercise05.application;

import level01.exercise05.utils.FileUtils;
import level01.exercise05.model.User;

import java.io.IOException;
import java.nio.file.Path;

/**
 * PROGRAM: AplicationWorkers
 * AUTHOR: Diego Balaguer
 * DATE: 27/04/2025
 */

public class ApplicationWorkers {

    public void saveSerializableUser(User user) {
        String fileName = "user_serialized.ser";
        Path outputPathFile = Path.of(System.getProperty("user.dir"), "src", "main", "resources", fileName).normalize();
        try {
            FileUtils.saveObjectSerialized(outputPathFile, user);
        } catch (IOException e) {
            System.err.println("❌ Error writing file: " + e.getMessage());
        }
    }

    public Object loadSerializableUser() {
        User userLoad = null;
        try {
            String fileName = "user_serialized.ser";
            Path outputPathFile = Path.of(System.getProperty("user.dir"), "src", "main", "resources", fileName).normalize();
            userLoad = (User) FileUtils.readObjectSerialized(outputPathFile);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("❌ Error: " + e.getMessage());
        }
        return userLoad;
    }
}
