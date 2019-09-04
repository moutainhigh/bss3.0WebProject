package generator;

import generator.BussihallChargeRecord;
import generator.BussihallChargeRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BussihallChargeRecordDao {
    long countByExample(BussihallChargeRecordExample example);

    int deleteByExample(BussihallChargeRecordExample example);

    int insert(BussihallChargeRecord record);

    int insertSelective(BussihallChargeRecord record);

    List<BussihallChargeRecord> selectByExample(BussihallChargeRecordExample example);

    int updateByExampleSelective(@Param("record") BussihallChargeRecord record, @Param("example") BussihallChargeRecordExample example);

    int updateByExample(@Param("record") BussihallChargeRecord record, @Param("example") BussihallChargeRecordExample example);
}