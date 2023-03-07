package contacts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication   // <1>
public class ContactInputCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(ContactInputCloudApplication.class, args); // <2>
    }

}
