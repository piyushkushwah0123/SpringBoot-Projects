package my.app.piyush;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("oa")
public class A {

    @Value("Name")
    private String name;

    @Value("12")
    private Integer id;

    @Autowired(required = false)
    B ob;

    @Override
    public String toString() {
        return "A [name=" + name + ", id=" + id + ", ob=" + ob + "]";
    }
}