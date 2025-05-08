package SpringBootInit;

import java.util.Scanner;
import static MainApp.Main.CreateLibraryCommand;

public class SpringBoot {

    public static Scanner scan = new Scanner(System.in);
    public static void Project() throws Exception {

        CreateLibraryCommand("spring boot new app");

        System.out.println("Would You Like to Run App");
        String option = scan.nextLine();
        if (option == "y") {

            CreateLibraryCommand("cd app");
            CreateLibraryCommand("mvn spring:run");
        }


    }

}
