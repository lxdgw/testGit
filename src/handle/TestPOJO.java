package handle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.User;

@Controller
public class TestPOJO {

    @RequestMapping("/testPOJO")
    public String testPOJO(User user){
        System.out.println(user);
        return "hello";
    }
}
