package NextJSProject;

import java.util.Scanner;

import static MainApp.Main.CreateLibraryCommand;

public class NextJS {

    public static void CreateProject() throws Exception {
        Scanner scan = new Scanner(System.in);

        CreateLibraryCommand("npx create-next-app myapp");
        System.out.println("Would You Like to Run App");
        String option = scan.nextLine();
        if (option == "y") {

            CreateLibraryCommand("cd myapp");
            CreateLibraryCommand("npm install");
            CreateLibraryCommand("npm run dev");
        }

    }
}
