package generator;

import generator.EChannlMeterPrintLog;
import generator.EChannlMeterPrintLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EChannlMeterPrintLogDao {
    long countByExample(EChannlMeterPrintLogExample example);

    int deleteByExample(EChannlMeterPrintLogExample example);

    int insert(EChannlMeterPrintLog record);

    int insertSelective(EChannlMeterPrintLog record);

    List<EChannlMeterPrintLog> selectByExample(EChannlMeterPrintLogExample example);

    int updateByExampleSelective(@Param("record") EChannlMeterPrintLog record, @Param("example") EChannlMeterPrintLogExample example);

    int updateByExample(@Param("record") EChannlMeterPrintLog record, @Param("example") EChannlMeterPrintLogExample example);
}