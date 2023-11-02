package RestfulapiGroup.com.example.restfulwebservices.user;

import org.springframework.jdbc.support.CustomSQLErrorCodesTranslation;
import org.springframework.web.bind.annotation.*;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;

@RestController
public class UserResource {
    private UserDaoService service;
    public  UserResource(UserDaoService service)
    {
        this.service=service;
    }
    @GetMapping("/users")
    public List<User> retrieveAllUsers()
    {
return service.getUsers();
    }
    @GetMapping("/user/{id}")
    public User retrieveUserss(@PathVariable int id)
    {
        User user=service.getUser(id);
        if(user==null)
            throw new UserNotFoundException("id"+id);

        return user;
    }
@PostMapping("/users")
    public void createUser(@RequestBody User user)
{
service.save(user);
}
}
