package inftastructure;

import java.io.IOException;

/**
 * Created by karunya on 7/4/2017.
 */
public class Application {

    public static void main(String args[])throws IOException{

        System.out.println("Welcoming to Rashtriya Vidyalaya");

        welcomeNote();
        classes std = new classes();
        std.standards();
    }

    private static void welcomeNote() {
        System.out.println("I feel previledged to welcome you all in the 10 years anniversary of our school");
        System.out.println("School has a various dynamic subjects to study and huge set of scope in sports for students");
        System.out.println("There are number of teachers for various subjects");
    }
}
