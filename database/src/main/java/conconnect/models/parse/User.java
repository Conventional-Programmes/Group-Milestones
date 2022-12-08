package conconnect.models.parse;

import conconnect.models.serializable.SerializableUser;
import org.json.JSONArray;
import org.parse4j.ParseClassName;
import org.parse4j.ParseObject;

import java.util.ArrayList;

@ParseClassName("User")
public class User extends ParseObject {

    private final String USERID = "userID";
    private final String USERNAME = "userName";
    private final String PASSWORD = "userPassword";
    private final String HOBBIES = "userHobbies";
    private final String BIRTHDAY = "userBirthday";
    private final String MEMBER = "userMember";

    public String getUserID(){
        return getString(USERID);
    }

    public void setUserID(String userID){
        put(USERID, userID);
    }

    public String getUserName(){
        return getString(USERNAME);
    }

    public void setUserName(String userName){
        put(USERNAME, userName);
    }

    public String getUserPassword(){
        return getString(PASSWORD);
    }

    public void serUserPassword(String userPassword){
        put(PASSWORD, userPassword);
    }

    public ArrayList<String> getUserHobbies(){
        return (ArrayList<String>) get(HOBBIES);
    }

    public void setUserHobbies(ArrayList<String> userHobbies){
        put("HOBBIES", createJSONArray(userHobbies));
    }

    public ArrayList<String> getUserBirth(){
        return (ArrayList<String>) get(BIRTHDAY);
    }

    public void setUserBirth(ArrayList<String> userBirthday){
        put("BIRTHDAY", createJSONArray(userBirthday));
    }

    public boolean getUserMember(){
        return getBoolean(MEMBER);
    }

    public void setUserMember(boolean userMember){
        put(MEMBER, userMember);
    }


    private JSONArray createJSONArray(ArrayList<?> arr) {

        JSONArray     list = new JSONArray();

        for(Object u: arr)
            list.put(u);
        return list;
    }

    public SerializableUser getSerializable(){
        return new SerializableUser(
                getUserID(), getUserName(), getUserPassword(),
                getUserHobbies(), getUserBirth(), getUserMember()
        );
    }
}
