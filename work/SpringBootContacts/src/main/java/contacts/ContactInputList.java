package contacts;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ContactInputList {
    private List<ContactInput> contacts= new ArrayList<>();
    public void addContact(ContactInput contactInput){
        this.contacts.add(contactInput);
    }
}
