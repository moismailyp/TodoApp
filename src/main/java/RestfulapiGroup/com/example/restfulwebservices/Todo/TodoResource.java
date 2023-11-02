package RestfulapiGroup.com.example.restfulwebservices.Todo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TodoResource {
    private TodoService todoService;
    public TodoResource (TodoService todoService)
    {
        this.todoService=todoService;
    }
    @GetMapping("/todolist")
    public List <TodoList> retrieveAllTodos()
    {
        return todoService.retrieveAllTodos();
    }
    @GetMapping("/users/{username}/todos")
    public List<TodoList> retrieveTodosByUserName(@PathVariable String username)
    {
        return todoService.findByUsername(username);
    }
    @GetMapping("/users/{username}/todos/{id}")
    public List<TodoList> retrieveTodosByd(@PathVariable String username)
    {
        return todoService.findByUsername(username);
    }
}
