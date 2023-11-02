package RestfulapiGroup.com.example.restfulwebservices;

public class HelloWorldBean {
    private String message1;
    public HelloWorldBean(String helloworld) {
        this.message1=helloworld;
    }
    public String getMessage()
    {
        return message1;
    }
    public void setMessage(String message1)
    {
        this.message1 = message1;
    }
    @Override
    public String toString() {
        return "HelloWorldBean{" +
                "message2='" + message1 + '\'' +
                '}';
    }
}
