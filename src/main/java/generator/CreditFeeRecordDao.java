package generator;

import generator.CreditFeeRecord;
import generator.CreditFeeRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CreditFeeRecordDao {
    long countByExample(CreditFeeRecordExample example);

    int deleteByExample(CreditFeeRecordExample example);

    int insert(CreditFeeRecord record);

    int insertSelective(CreditFeeRecord record);

    List<CreditFeeRecord> selectByExample(CreditFeeRecordExample example);

    int updateByExampleSelective(@Param("record") CreditFeeRecord record, @Param("example") CreditFeeRecordExample example);

    int updateByExample(@Param("record") CreditFeeRecord record, @Param("example") CreditFeeRecordExample example);
}