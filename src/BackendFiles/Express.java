package BackendFiles;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Express {

    public static void GetProjectCode() throws  Exception {
        File file = new File("Express.ts");

        BufferedWriter writer = new BufferedWriter
                (new OutputStreamWriter(new FileOutputStream("Server.js")
                        , StandardCharsets.UTF_8));
        writer.write("import * as express from 'express'");
        writer.write("\n");
        writer.write("\n");

        writer.write("const app = express()");

        writer.close();
    }
}

