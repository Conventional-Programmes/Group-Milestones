package conconnect.models.serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SerializableUser {

    private String userID;
    private String userName;
    private String userPassword;
    private ArrayList<String> userHobbies;
    private ArrayList<String> userBirthday;
    private boolean userMember;

    public boolean getUserMember() {return userMember;}
}
