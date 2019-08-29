package generator;

import generator.IfUserMeter;
import generator.IfUserMeterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IfUserMeterDao {
    long countByExample(IfUserMeterExample example);

    int deleteByExample(IfUserMeterExample example);

    int insert(IfUserMeter record);

    int insertSelective(IfUserMeter record);

    List<IfUserMeter> selectByExample(IfUserMeterExample example);

    int updateByExampleSelective(@Param("record") IfUserMeter record, @Param("example") IfUserMeterExample example);

    int updateByExample(@Param("record") IfUserMeter record, @Param("example") IfUserMeterExample example);
}