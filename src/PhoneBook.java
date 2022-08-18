import java.util.HashSet;

public class PhoneBook {

    private final HashSet<Contact> phoneBook = new HashSet<>();


    public boolean addContact(Contact contact) {
        if (!phoneBook.add(contact)) {
            System.out.println("Такой контакт уже есть.");
            return false;
        }
        phoneBook.add(contact);
        return true;
    }

    public Contact findContactByPhoneNumber(String phoneNumber) {
        for (Contact contact : phoneBook) {
            if (contact.getPhoneNumber().equals(phoneNumber)) {
                return contact;
            }
        }
        return null;
    }

    public String phoneBookToString() {
        StringBuilder sb = new StringBuilder();
        for (Contact contact : phoneBook) {
            sb.append(contact.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

}
