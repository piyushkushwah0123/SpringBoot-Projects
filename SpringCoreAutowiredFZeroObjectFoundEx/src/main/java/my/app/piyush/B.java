package my.app.piyush;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class B {

    @Value("101")
    private Integer roll;

    @Override
    public String toString() {
        return "B [roll=" + roll + "]";
    }
}