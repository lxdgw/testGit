package handle;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/testHeader")
public class TestRequestHeader {

    @RequestMapping("/testHeader")
    public String  testHeader(@RequestHeader(value = "Accept-Language") String al,
                              @RequestHeader(value = "Accept-Encoding") String ae){
        System.out.println("Accept-Language: "+al+"\nAccept-Encoding: "+ae);
        return "hello";
    }
}
