package generator;

import generator.MobileDataEvent043111801;
import generator.MobileDataEvent043111801Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MobileDataEvent043111801Dao {
    long countByExample(MobileDataEvent043111801Example example);

    int deleteByExample(MobileDataEvent043111801Example example);

    int insert(MobileDataEvent043111801 record);

    int insertSelective(MobileDataEvent043111801 record);

    List<MobileDataEvent043111801> selectByExample(MobileDataEvent043111801Example example);

    int updateByExampleSelective(@Param("record") MobileDataEvent043111801 record, @Param("example") MobileDataEvent043111801Example example);

    int updateByExample(@Param("record") MobileDataEvent043111801 record, @Param("example") MobileDataEvent043111801Example example);
}