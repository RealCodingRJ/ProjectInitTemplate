package CreateFiesWeb;

import java.io.File;

public class CreateFiles {

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
}
