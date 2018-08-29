package webservice;



import jdbcbean.Score;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@WebService
public class TestWebServiceJDBC {

    public void test(){

        String url = "jdbc:mysql://localhost:3306/userandstudent";
        String user = "root";
        String pass = "333333root";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement stm = con.createStatement();

            List<Score> sls = new ArrayList<>();
            ResultSet res = stm.executeQuery("select * from score");
            while(res.next()){
                int id = res.getInt(1);
                int cid = res.getInt(2);
                int sid = res.getInt(3);
                int score = res.getInt(4);
                Score scr = new Score();
                scr.setId(id);
                scr.setCid(cid);
                scr.setSid(sid);
                scr.setScore(score);
                sls.add(scr);
            }

            for(Score s : sls){
                System.out.println(s);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
//        TestWebServiceJDBC twsj = new TestWebServiceJDBC();
//        twsj.test();
        Endpoint.publish("http://localhost:8090/service/testjdbc",new TestWebServiceJDBC());
        System.out.println("Succsess");
    }

}
