package level01.exercises01to03;

import level01.exercises01to03.application.ApplicationController;

/**
 * PROGRAM: Main
 * AUTHOR: Diego Balaguer
 * DATE: 25/04/2025
 */

public class Main {

    public static void main(String[] args) {

        ApplicationController applicationController = new ApplicationController();

        if (args.length > 0) {
            applicationController.run(args[0]);
        } else {
            System.err.println("❌ Error: Please, for the application to work, usage: java program.java <parameter>");
        }

        System.out.println("PROCESS FINISHED...");
    }
}
