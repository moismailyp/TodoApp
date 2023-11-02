package RestfulapiGroup.com.example.restfulwebservices;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
//@CrossOrigin(origins="http://localhost:3002",allowCredentials = "true")
@RestController
public class HelloworldController {
    @GetMapping("/hello-world")
    public String HelloWorld()
    {

        return "hello world gjuy";
    }
@GetMapping("/hello-world-bean")
    public HelloWorldBean helloWordBean()
{
    return new HelloWorldBean("helloworld  jjjj");
}
@GetMapping("/hello-world-path/{name}")
 public HelloWorldBean helloWorldPathVariable(@PathVariable String name)
{
    return new HelloWorldBean(String.format("hello world,%s",name));
}



}