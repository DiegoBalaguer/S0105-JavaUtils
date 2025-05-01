package level01.exercise04.application;

import java.io.IOException;

/**
 * PROGRAM: AplicationController
 * AUTHOR: Diego Balaguer
 * DATE: 25/04/2025
 */

public class ApplicationController {
    ApplicationWorkers applicationWorkers = new ApplicationWorkers();

    public void run() {
        System.out.println("* LOAD .TXT AND VIEW IN CONSOLE..........." + System.lineSeparator());

        try {
            System.out.println(applicationWorkers.showReadStringFile());
            System.out.println("✅ process completed correctly");
        } catch (IOException e) {
            System.err.println("❌ Error reading file: " + e.getMessage());
        }
    }
}
