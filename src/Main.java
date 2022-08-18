import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();
        MissedCalls missedCalls = new MissedCalls();
        fillPhoneBookWithContacts(phoneBook);


        try (Scanner scan = new Scanner(System.in)) {
            while (true) {

                System.out.println("введите номер телефона либо 'end' для завершения");
                String input = scan.nextLine();

                if (input.equalsIgnoreCase("end")) {
                    System.out.println(missedCalls.getMissedCallsList().size() + " пропущенных:");
                    System.out.println(missedCalls.ToString(phoneBook));
                    break;
                }
                missedCalls.addMissedCall(input);
            }
        }

    }

    private static void fillPhoneBookWithContacts(PhoneBook phoneBook) {
        phoneBook.addContact(new Contact("Petya", "1111", "Family"));
        phoneBook.addContact(new Contact("Kolya", "1112", "Friends"));
        phoneBook.addContact(new Contact("Petya", "1113", "Univercity"));
        phoneBook.addContact(new Contact("Olya", "1114", "Univercity"));
        phoneBook.addContact(new Contact("Sasha", "1115", "Friends"));
    }

}


