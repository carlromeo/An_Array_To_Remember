import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        String[] presidents = {"Kennedy","Johnson", "Nixon", "Ford", "Carter", "Reagan", "Bush", "Clinton", "Bush", "Obama"};
        Scanner key = new Scanner(System.in);
        String choice;

        System.out.println("To see the names of the last 10 US Presidents, type the word,'History' below.");
        choice = key.nextLine();


        if ( choice.equalsIgnoreCase("History"))

            for (int i = presidents.length - 1; i >= 0; i--) {
                System.out.println(presidents[i] + "");

            }
        System.out.println("");

        {

        System.out.println("To see this list in the order they were elected, Please type 'History' again below.");
            System.out.println("");
            choice = key.nextLine();

        if ( choice.equalsIgnoreCase("History"))
        for (int i = 0; i< presidents.length ; i++) {
            System.out.println(presidents[i] + "");
        }
        }


    }
}
