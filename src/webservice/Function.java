package webservice;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class Function {

    public String transWords(String words){
        String res = "";
        for(char c : words.toCharArray()){
            res += c+",";
        }
        return res;
    }

//        public String transWords(String words){
//        String res = "";
//        for(char ch : words.toCharArray()){
//            res += ch+",";
//        }
//        return res;
//    }
//
//    public static void main(String[] args) {
//        // 使用Endpoint(终端)类发布webservice
//        Endpoint.publish("http://localhost:8089/service/function", new Function());
//        System.out.println("Publish Success");
//    }

    public static void main(String[] args){
        Endpoint.publish("http://localhost:8089/service/function", new Function());
        System.out.println("Publish Success");
    }
}
