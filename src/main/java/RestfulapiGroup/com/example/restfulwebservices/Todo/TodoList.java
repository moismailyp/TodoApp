package RestfulapiGroup.com.example.restfulwebservices.Todo;

import java.time.LocalDate;
import java.util.Date;

public class TodoList {
    Integer id;
    String username;
    String description;
    LocalDate targetdate;
    boolean isdone;

    public TodoList(Integer id, String username, String description, LocalDate targetdate, boolean isdone) {
        this.id = id;
        this.username = username;
        this.description = description;
        this.targetdate = targetdate;
        this.isdone = isdone;
    }

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getTargetdate() {
        return targetdate;
    }

    public boolean isIsdone() {
        return isdone;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTargetdate(LocalDate targetdate) {
        this.targetdate = targetdate;
    }

    public void setIsdone(boolean isdone) {
        this.isdone = isdone;
    }

    @Override
    public String toString() {
        return "TodoList{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", description='" + description + '\'' +
                ", targetdate=" + targetdate +
                ", isdone=" + isdone +
                '}';
    }
}
