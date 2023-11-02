package RestfulapiGroup.com.example.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDaoService {
    private static int userCount=0;
    private static   List<User> users=new ArrayList<>();
    static {
        users.add(new User(++userCount,"adam", LocalDate.now().minusYears(30)));
        users.add(new User(++userCount,"adam1", LocalDate.now().minusYears(20)));
        users.add(new User(++userCount,"adam2", LocalDate.now().minusYears(40)));
    }

    public  List<User> getUsers() {
        return users;
    }
    public User getUser(int id)
    {
        Predicate<? super User> predicate=user->user.getId().equals(id);
         return  users.stream().filter(predicate).findFirst().orElse(null);
    }
    public User save(User user)
    {
       user.setId(++userCount);
        users.add(user);
        return user;
    }
}

