package RestfulapiGroup.com.example.restfulwebservices.Todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service
public class TodoService
{
    public static List<TodoList> todo=new ArrayList<>();
    static{
        todo.add(new TodoList(1,"ismail","learn spring boot", LocalDate.now().plusYears(1),false));
        todo.add(new TodoList(1,"ismail1","learn spring boot2", LocalDate.now().plusYears(1),true));
        todo.add(new TodoList(1,"ismail2","learn spring boot3", LocalDate.now().plusYears(1),false));
          }
    public List<TodoList> retrieveAllTodos()
    {
        return todo;
    }
    public List<TodoList> findByUsername(String username)
    {
        Predicate<TodoList> userPredicate=todosuser->todosuser.getUsername().equals(username);
        List <TodoList> userTodos=todo.stream().filter(userPredicate).collect(Collectors.toList());

        return userTodos;
    }
    public void addTodo(int id,String username,String description,LocalDate date,Boolean Completed)
    {

    }
}
