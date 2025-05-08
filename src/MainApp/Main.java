package MainApp;

import BackendFiles.Express;
import BasicProject.BasicProject;
import NextJSProject.NextJS;
import ReactJS.ReactJSProject;
import SpringBootInit.SpringBoot;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Command: ");
        String command = scan.nextLine();

        switch (command) {

            case "/React":
                ReactJSProject.CreateProject();
                break;


            case "/Next":
                NextJS.CreateProject();
                break;

            case "/Spring":

                SpringBoot.Project();
                break;

            case "/Basic":

                BasicProject.StartProject();
                break;


            case "Express":
                Express.GetProjectCode();
                break;

        }


    }

}