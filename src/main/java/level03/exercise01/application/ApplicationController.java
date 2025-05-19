package level03.exercise01.application;


import level03.exercise01.utils.FileEncryptorUtils;

import javax.crypto.SecretKey;
import java.nio.file.Path;

/**
 * PROGRAM: ApplicationController
 * AUTHOR: Diego Balaguer
 * DATE: 25/04/2025
 */

public class ApplicationController {

    public void run() {
        System.out.println("* STARTING PROCESS..........." + System.lineSeparator());

        Path inputFile = Path.of("src/main/resources/directoryEstructure.txt");
        Path encryptedFile = Path.of("src/main/resources/directoryEstructure.encrypted");
        Path decryptedFile = Path.of("src/main/resources/directoryEstructure.decrypted");
        System.out.println("** Load y encrypt ..........." + System.lineSeparator());
        try {
            SecretKey key = FileEncryptorUtils.generateSecretKey();
            FileEncryptorUtils.encryptFile(inputFile, encryptedFile, key);

            FileEncryptorUtils.decryptFile(encryptedFile, decryptedFile, key);
            System.out.println("✅ process completed correctly");
        } catch (Exception e) {
            System.err.println("❌ Error: " + e.getMessage());
        }
    }
}
