package contacts;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import lombok.Data;

/**
 * 录入通讯录
 */
@Data
public class ContactInput {

    @NotBlank(message="The first name is required")
    private String FirstName;

    @NotBlank(message="The last name is required")
    private String LastName;

    @NotNull
    @Pattern(regexp="1[3|4|5|7|8][0-9]{9}",
            message="Must be formatted 1+(3/4/5/7/8)+(0/1/2/3/4/5/6/7/8/9)+(eight digit number)")
    private String Phone;

    @Pattern(regexp = "^\\w+((-\\w+)|(\\.\\w+))*\\@[A-Za-z0-9]+((\\.|-)[A-Za-z0-9]+)*\\.[A-Za-z0-9]+$",
            message="Incorrect email format")
    private String Email;

}
