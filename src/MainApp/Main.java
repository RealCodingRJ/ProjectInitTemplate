package MainApp;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void CreateLibraryCommand(String cmd) throws Exception{
        Runtime.getRuntime().exec(cmd);
    }

    public static void CreateHTML() throws Exception{

        File fileHTML = new File("index.html");
        fileHTML.createNewFile();
    }

    public static void CreateCSS() throws Exception{

        File fileCSS = new File("App.css");
        fileCSS.createNewFile();
    }

    public static void CreateJS() throws Exception{

        File fileJS = new File("App.js");
        fileJS.createNewFile();
    }


    public static void main(String[] args) throws Exception {

        int length = 4;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Command: ");
        String command = scan.nextLine();

        switch (command) {

            case "/React" -> {
                CreateLibraryCommand("npx nano-react-app myapp");
                System.out.println("Would You Like to Run App");
                String option = scan.nextLine();
                if (option == "y") {

                    CreateLibraryCommand("cd myapp");
                    CreateLibraryCommand("npm install");
                    CreateLibraryCommand("npm run dev");
                }
            }

            case "/Next" -> {
               CreateLibraryCommand("npx create-next-app myapp");
                System.out.println("Would You Like to Run App");
                String option = scan.nextLine();
                if (option == "y") {

                    CreateLibraryCommand("cd myapp");
                    CreateLibraryCommand("npm install");
                    CreateLibraryCommand("npm run dev");
                }

            }

            case "/Spring" -> {
                CreateLibraryCommand("spring boot new app");

                System.out.println("Would You Like to Run App");
                String option = scan.nextLine();
                if (option == "y") {

                    CreateLibraryCommand("cd app");
                    CreateLibraryCommand("mvn spring:run");
                }

            }

            case "/Basic" -> {

                try {

                    CreateHTML();
                    CreateCSS();
                    CreateJS();

                } catch(Exception ce) {

                    System.out.printf("%s", ce.getMessage());
                }

            }


        }


    }

}