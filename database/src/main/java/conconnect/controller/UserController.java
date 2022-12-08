package conconnect.controller;

import conconnect.models.parse.User;
import conconnect.models.serializable.SerializableUser;
import conconnect.services.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/User")

public class UserController {

    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/")
    public ArrayList<SerializableUser> getUsers() {
        ArrayList<SerializableUser> users = new ArrayList<>();

        ArrayList<User> list = userService.retrieveUsers();
        for(User u : list)
        {
            users.add(u.getSerializable());
        }
        return users;
    }

    @GetMapping("/find/{id}")
    public SerializableUser getUserById(@PathVariable String id){
        return userService.getUserById(id).getSerializable();
    }
}
