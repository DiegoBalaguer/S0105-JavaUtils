package level01.exercise05.application;

import level01.exercise05.model.User;

/**
 * PROGRAM: AplicationController
 * AUTHOR: Diego Balaguer
 * DATE: 27/04/2025
 */

public class ApplicationController {

    ApplicationWorkers applicationWorkers = new ApplicationWorkers();

    public void run() {
        System.out.println("* SAVE AND LOAD SERIALIZED OBJECT..........." + System.lineSeparator());

        System.out.println("** Create object User .............");
        User user = new User("Alan Turin", 41);

        System.out.println("** User: " + System.lineSeparator() + user);

        System.out.println("** Save object User .............");
        applicationWorkers.saveSerializableUser(user);

        System.out.println("** Load object User .............");

        User userLoad = (User) applicationWorkers.loadSerializableUser();
        System.out.println("** User: " + System.lineSeparator() + userLoad);

        System.out.println("✅ process completed correctly");

    }
}
