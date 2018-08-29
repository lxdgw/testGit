package handle;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pojo.User;
import pojo.UserList;

@Controller
@RequestMapping("/TestRequestParam")
public class TestRequestParam {

    @RequestMapping("/testValue")
    public String testValue(@RequestParam(value = "username") String username,
                            @RequestParam(value = "password") String pass){
        System.out.println(username);
        System.out.println(pass);
        return "hello";
    }

    @RequestMapping("/testRequired")
    public String testRequired(@RequestParam(value = "username") String username,
                               @RequestParam(value = "password", required = false) String pass){
        System.out.println(username);
        System.out.println(pass);
        return "hello";
    }

    @RequestMapping("/testDefaultValue")
    public String testDefaultValue(@RequestParam(value = "username") String username,
                                   @RequestParam(value = "password", required = false, defaultValue = "000000") String pass){
        System.out.println(username);
        System.out.println(pass);
        return "hello";
    }

    /**
     * 一次传递多个User的方法
     * @param us
     * @return
     */
    @RequestMapping("testUsers")
    public String testUsers(UserList us){
        us.getUserList().forEach(u -> System.out.println(u));
        return "hello";
    }
}
