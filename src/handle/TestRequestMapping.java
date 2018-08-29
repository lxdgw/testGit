package handle;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestRequestMapping {


//    method 指定请求的方式
//    params 指定请求的参数
//    headers 指定请求头
    @RequestMapping(value = "/testRequestMapping" , method = RequestMethod.POST)
    public String testRequestMapping(){
        return "hello";
    }


    @RequestMapping(value = "/testParams1" , params = {"name"})
    public String testParams1(String name){
        System.out.println(name);
        return "hello";
    }


    @RequestMapping(value = "/testParams2" , params = {"name=张三" , "pwd!=123456" , "!sex"})
    public String testParams2(String name){
        System.out.println(name);
        return "hello";
    }


    @RequestMapping(value = "/testHeaders" , headers = {"Accept-Language=zh-CN,zh;q=0.9,en-US;q=0.8,en;q=0.7"})
    public String testHeaders(){
        System.out.println("headers");
        return "hello";
    }


}
