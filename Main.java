package DZ5;


public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact("Иван", "+3752066");
        phoneBook.addContact("Иван", "+37520661");
        phoneBook.addContact("Петр", "+37520662");
        phoneBook.addContact("Алексей", "+37533661");
        phoneBook.addContact("Петр", "+37520667");
        phoneBook.addContact("Иван", "+3752566");
        var contacts = phoneBook.getContacts();
        for (var contact:
                contacts) {
            System.out.printf("Имя - %s: %s\n", contact.getKey(), contact.getValue());
        }
    }
}
