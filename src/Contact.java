import java.util.Objects;

public class Contact {

    private final String name;
    private final String phoneNumber;
    private final String group;

    public Contact(String name, String phoneNumber, String group) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.group = group;
    }

    @Override
    public String toString() {
        return name + "(\"" + group + "\"): " + phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getGroup() { return group;}

    @Override
    public boolean equals(Object obj) {
        if (this == obj) { return true;}

        if (obj == null || !obj.getClass().equals(this.getClass())) {
            return false;
        }

        final Contact newObj = (Contact) obj;
        return (((this.getName() == newObj.getName() ||
                this.getName().equals(newObj.getName())) &&
                (newObj.getName() != null)) &&

                ((this.getGroup() == newObj.getGroup() ||
                        this.getGroup().equals(newObj.getGroup())) &&
                        (newObj.getGroup() != null)) &&

                ((this.getPhoneNumber() == newObj.getPhoneNumber() ||
                        this.getPhoneNumber().equals(newObj.getPhoneNumber())) &&
                        (newObj.getPhoneNumber() != null)));
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phoneNumber, group);
    }

}
