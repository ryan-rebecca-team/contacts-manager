public class Contacts {

    private String names;

    private String number;

    public Contacts(String firstName, String lastName, String number){
        this.names = firstName+" "+lastName;
        this.number = number;
    }

    public String getNames() {
        return names;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "names='" + names + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
