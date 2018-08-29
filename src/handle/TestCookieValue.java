package handle;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("testCoolieValue")
public class TestCookieValue {

    @RequestMapping("testCookieValue")
    public String testCoolieValue(@CookieValue("JSESSIONID") String jsId){
        System.out.println("JSESSIONID: "+jsId);
        return "hello";
    }
}
