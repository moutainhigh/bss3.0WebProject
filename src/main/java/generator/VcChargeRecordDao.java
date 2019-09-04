package generator;

import generator.VcChargeRecord;
import generator.VcChargeRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VcChargeRecordDao {
    long countByExample(VcChargeRecordExample example);

    int deleteByExample(VcChargeRecordExample example);

    int insert(VcChargeRecord record);

    int insertSelective(VcChargeRecord record);

    List<VcChargeRecord> selectByExample(VcChargeRecordExample example);

    int updateByExampleSelective(@Param("record") VcChargeRecord record, @Param("example") VcChargeRecordExample example);

    int updateByExample(@Param("record") VcChargeRecord record, @Param("example") VcChargeRecordExample example);
}