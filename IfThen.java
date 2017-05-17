import java.util.Scanner;

public class IfThen {

    public static void main(String[] args) {
        // initialize user input scanner
        String messageFromUser;

        ////////////////////////////////////////////
        sendMessageToUser("What is your name?");
        messageFromUser = getMessageFromUser();
        sendMessageToUser(messageFromUser);
        if (messageFromUser.equals("Gavin")) {
            sendMessageToUser("Hey, Gavin, how are you?");
        } else if (messageFromUser.equals("Tyler")) {
            sendMessageToUser("What up, Tyler?");
        } else {
            sendMessageToUser("It's good to meet you!");
        }
        ///////////////////////////////////////////////////////



    }



// IGNORE
    private static String getMessageFromUser() {
        Scanner scanner = new Scanner(System.in);
        // read input
        return scanner.nextLine();
    }

    private static void sendMessageToUser(String message) {
        System.out.println(message);
    }

}