//package webservice;
//
//
//
//import jdbcbean.Score;
//import org.apache.axis.client.Call;
//import org.apache.axis.client.Service;
//import org.apache.axis.encoding.XMLType;
//
//import javax.jws.WebService;
//import javax.xml.namespace.QName;
//import javax.xml.rpc.ParameterMode;
//import javax.xml.rpc.ServiceException;
//import javax.xml.ws.Endpoint;
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.rmi.RemoteException;
//import java.sql.*;
//import java.util.ArrayList;
//import java.util.List;
//
//@WebService
//public class TestWebServiceJDBC {
//
//    public void test(){
//
//        String url = "jdbc:mysql://localhost:3306/userandstudent";
//        String user = "root";
//        String pass = "333333root";
//
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection(url, user, pass);
//            Statement stm = con.createStatement();
//
//            List<Score> sls = new ArrayList<>();
//            ResultSet res = stm.executeQuery("select * from score");
//            while(res.next()){
//                int id = res.getInt(1);
//                int cid = res.getInt(2);
//                int sid = res.getInt(3);
//                int score = res.getInt(4);
//                Score scr = new Score();
//                scr.setId(id);
//                scr.setCid(cid);
//                scr.setSid(sid);
//                scr.setScore(score);
//                sls.add(scr);
//            }
//
//            for(Score s : sls){
//                System.out.println(s);
//            }
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void testLocal(){
//        try {
//            Service service = new Service();
//            Call call = (Call) service.createCall();
//            call.setTargetEndpointAddress("http://localhost:8080/service/function");
//            call.setOperationName(new QName("http://webservice", "transWords"));
//            call.setUseSOAPAction(true);
//            call.addParameter(new QName("words"), XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
//            call.setReturnType(org.apache.axis.encoding.XMLType.XSD_STRING);
//            String words = (String) call.invoke(new Object[]{"Hello"});
//            System.out.println(words);
//        } catch (ServiceException e) {
//            e.printStackTrace();
//        } catch (RemoteException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public Object TestWr(String methodName, String m_strWebURL, String m_strSoapAction, Object[] PValue){
//        try {
//            Service service=new Service();
//            Call call=(Call)service.createCall();
//
//            if(methodName == null || methodName.trim().length() < 1){
//                throw new Exception("请输入方法参数!");
//            }
//            call.setTargetEndpointAddress(new URL(m_strWebURL));  //设置WEBSERVICE的地址
//            call.setOperationName(new QName(m_strSoapAction,methodName)); //设置要调用哪个方法
//            call.setUseSOAPAction(true);
//            call.addParameter(new QName("name"), XMLType.XSD_STRING, ParameterMode.IN);
//            call.setReturnType(XMLType.XSD_STRING); //要返回的数据类型
//
//            call.setSOAPActionURI(m_strSoapAction + methodName);
//
//
//            return  call.invoke(PValue);//调用方法并传递参数;
//        } catch (Exception e) {
//            e.printStackTrace();
//            return "失败";
//        }
//    }
//
//    public Object testYC(){
//        try {
////            String[] cs = {"user_id"};
////            http://api.wxfenxiao.com/Api/wsdl
//            String serURL = "http://localhost:8080/axis2/services/SimpleService?wsdl";  //地址
////            http://api.wxfenxiao.com
//            String ym = "http://ws.apache.org/axis2";       //域名
//            String met = "hello";       //方法名
//            Service service = new Service();
//            Call call = (Call)service.createCall();
//            call.setTargetEndpointAddress(new java.net.URL(serURL));        //设置地址
//            call.setOperationName(new QName(ym, met));                      //设置域名和要调用的方法名
//            call.setUseSOAPAction(true);
//            call.setReturnType(XMLType.XSD_STRING);     //返回类型
//            Object obj = call.invoke(new Object[] {});
//            return obj;
//        } catch (ServiceException e) {
//            e.printStackTrace();
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        } catch (RemoteException e) {
//            e.printStackTrace();
//        }
//        return "-";
//    }
//    public static void main(String[] args) {
//        TestWebServiceJDBC twsj = new TestWebServiceJDBC();
////        twsj.test();
////        Endpoint.publish("http://localhost:8090/service/testjdbc",new TestWebServiceJDBC());
////        System.out.println("Success");
////        twsj.testLocal();
////        System.out.println(twsj.testYC().hashCode());
//
//        String webURL = "http://erpapi.wifenxiao.com/Api/wsdl";
//        String ym = "http://erpapi.wifenxiao.com";
//        String met = "debugTest";
//        Object[] obs = {};
//        twsj.TestWr(met, webURL, ym, obs);
//        System.out.println();
//    }
//
//}
