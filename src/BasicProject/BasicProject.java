package BasicProject;

import static CreateFiesWeb.CreateFiles.*;
import static MainApp.Main.*;

public class BasicProject {

    public static void StartProject() {
        try {

            CreateHTML();
            CreateCSS();
            CreateJS();

        } catch(Exception ce) {

            System.out.printf("%s", ce.getMessage());
        }


    }

}
