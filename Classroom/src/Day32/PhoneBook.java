package Day32;
import java.util.*;

public class PhoneBook {
    HashMap<String, String > phonebook = new HashMap<String, String>();
    public void addContact(String name, String phoneNumber){
        //write code which will add new contact to phonebook hashmap
        //then print contact added successfully
        phonebook.put(name, phoneNumber);
        System.out.println(name +" was added successfully");
    }
    public void removeContact(String name){
        //write a code which will delete contact by either name
        //delete the contact by user provided name
        //print contact removed successfully
        if(phonebook.containsKey(name)){
            phonebook.remove(name);
            System.out.println(name + " was removed!");
        }
        else{
            System.out.println(name+" was not found!");
        }
    }

    public void updateContactsName(String oldName, String newName){
        //write a code which will update name of the contact
        if(phonebook.containsKey(oldName)){
            phonebook.put(newName, phonebook.get(oldName));
            phonebook.remove(oldName);
            System.out.println(oldName + " was updated to "+ newName);
        }
        else{
            System.out.println(oldName + " was not found!");
        }

    }

    public void updateContactsPhoneNumber(String name, String newNumber){
        //write a code which will update phone number of the contact
        phonebook.replace(name, newNumber);
    }
    public void searchForContact(String name){
        //write a code which prints the phone number of the given name
        if(phonebook.containsKey(name)){
            System.out.println(name + " is present!");
        }
        else{
            System.out.println(name + " was not found!");
        }
        //print error message if the contact doesn't exist
    }
    public void printPhoneBookMap(){
        // print with for-each all keys and values of phoneBook map
        for (Map.Entry<String, String> i: phonebook.entrySet()) {
            System.out.println(i.getKey() + " " + i.getValue());
        }
    }
    public static void main(String[] args) {
        /*
        write a code that will produce following output:
        1) Welcome to the phonebook!
        2) Create a phonebook object
        3) Using scanner read these values from keyboard
            Enter name: John
            Enter phone number: 123-456-7890
        4) Call method phonebook.addContact() give as parameters name and phoneNumber
        3) Using scanner read these values from keyboard
            Enter name: Mike
            Enter phone number: 123-654-0987
        4) Call method phonebook.addContact() give as parameters name and phoneNumber
        5) Enter name: John
        6) Call method phonebook.searchForContact() give as parameter name
        7) Call method phonebook.printPhoneBookMap()
            It must print 2 entries
        8) update name from John to Andrew
            Enter old name: John
            Enter new name: Andrew
            Call method updateContactsName() give as parameters oldName and newName
        9) Enter contact name: Andrew
            Enter new phoneNumber: 535-996-7890
            Call method updateContactsPhoneNumber() give as parameters name and newNumber
        10) Call method phonebook.printPhoneBookMap()
        One entry must be fully changed and the other should not be updated
        11) Enter name: Andrew
            Call method phoneBook.removeContact() give as parameter name
         12) Call method phonebook.printPhoneBookMap()
         There must be only one entry
         */
//        1)
        System.out.println("Welcome to the phoneBook");
//        2)
        Scanner scanner = new Scanner(System.in);
        PhoneBook phonebook = new PhoneBook();
//        3)
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter phoneNumber: ");
        String phoneNumber = scanner.nextLine();
//        4)
        phonebook.addContact(name, phoneNumber);
//        3)
        System.out.print("Enter name: ");
        String name1 = scanner.nextLine();
        System.out.print("Enter phoneNumber: ");
        String phoneNumber1 = scanner.nextLine();
//        4)
        System.out.println("===============================================");
        phonebook.addContact(name1, phoneNumber1);
//        5)
        System.out.println("===============================================");
        System.out.print("Enter name to search for contact: ");
        String searchName = scanner.nextLine();
//        6)
        System.out.println("===============================================");
        phonebook.searchForContact(searchName);
//        7)
        System.out.println("===============================================");
        phonebook.printPhoneBookMap();
//        8)
        System.out.println("===============================================");
        System.out.print("Enter old name: ");
        String oldName = scanner.nextLine();
        System.out.print("Enter new name: ");
        String newName = scanner.nextLine();
        phonebook.updateContactsName(oldName, newName);
//        9)
        System.out.println("===============================================");
        System.out.print("Enter user to update phone number: ");
        String userToUpdatePhone = scanner.nextLine();
        System.out.print("Enter new phone number: ");
        String userNewPhone = scanner.nextLine();
        phonebook.updateContactsPhoneNumber(userToUpdatePhone, userNewPhone);
//        10)
        System.out.println("===============================================");
        phonebook.printPhoneBookMap();
//        11)
        System.out.println("===============================================");
        System.out.print("Enter a name to remove from phonebook: ");
        String userToRemove = scanner.nextLine();
        phonebook.removeContact(userToRemove);
//        12)
        System.out.println("===============================================");
        phonebook.printPhoneBookMap();
    }


}