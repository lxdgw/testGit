package jdbcbean;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import jdbcbean.Score;

public interface ScoreDao {

    List<Score> getScores();

}
