package contacts.web;
import javax.validation.Valid;

import contacts.ContactInput;
import contacts.ContactInputList;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/InputForm")
@SessionAttributes("contactInputList")
public class ContactInputController {

    @ModelAttribute(name = "contactInput")
    public ContactInput contactInput() {
        return new ContactInput();
    }

    @ModelAttribute(name = "contactInputList")
    public ContactInputList contactInputList(){
        return new ContactInputList();
    }

    @GetMapping
    public String InputForm() {
        return "InputForm";
    }

    @PostMapping
    public String processInput(
            @Valid ContactInput contactInput, Errors errors,
            @ModelAttribute ContactInputList contactInputList, SessionStatus sessionStatus) {

        if (errors.hasErrors()) {
            System.out.printf("process error");
            return "InputForm";
        }
        //log.info("Input submitted: {}", contactInput);
        //sessionStatus.setComplete();
        System.out.println(contactInput.getFirstName());
        contactInputList.addContact(contactInput);
        System.out.println(contactInputList.getContacts().size());

        return "redirect:/InputForm";
    }
}
