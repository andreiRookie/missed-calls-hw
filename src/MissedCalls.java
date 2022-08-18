import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.TreeMap;

public class MissedCalls {

    private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("dd:MM:yyyy HH:mm.ss");
    private final Map<LocalDateTime, String> missedCallsList = new TreeMap<>();

    public void addMissedCall(String phoneNumber) {
        missedCallsList.put(LocalDateTime.now(), phoneNumber);
    }

    public Map<LocalDateTime, String> getMissedCallsList() {
        return missedCallsList;
    }

    public String ToString(PhoneBook phoneBook) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<LocalDateTime, String> missedCall : missedCallsList.entrySet()) {
            final Contact contact = phoneBook.findContactByPhoneNumber(missedCall.getValue());
            sb.append(DATE_FORMAT.format(missedCall.getKey()) + "\t-\t");
            sb.append(contact != null ? (contact.getName() + "(\"" + contact.getGroup() + "\")") : missedCall.getValue());
            sb.append("\n");
        }
        return sb.toString();
    }

}
