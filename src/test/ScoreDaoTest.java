package test;


import jdbcbean.Score;
import jdbcbean.ScoreDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class ScoreDaoTest {

    SqlSessionFactory sqlSessionFactory = null;

    @Before
    public void setUp() throws Exception {
        InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void test(){
        SqlSession session = sqlSessionFactory.openSession();
        ScoreDao sd = session.getMapper(ScoreDao.class);
        List<Score> sls = sd.getScores();
        sls.forEach(s -> System.out.println(s));
    }

}
