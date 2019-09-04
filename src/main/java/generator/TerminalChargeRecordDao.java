package generator;

import generator.TerminalChargeRecord;
import generator.TerminalChargeRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TerminalChargeRecordDao {
    long countByExample(TerminalChargeRecordExample example);

    int deleteByExample(TerminalChargeRecordExample example);

    int insert(TerminalChargeRecord record);

    int insertSelective(TerminalChargeRecord record);

    List<TerminalChargeRecord> selectByExample(TerminalChargeRecordExample example);

    int updateByExampleSelective(@Param("record") TerminalChargeRecord record, @Param("example") TerminalChargeRecordExample example);

    int updateByExample(@Param("record") TerminalChargeRecord record, @Param("example") TerminalChargeRecordExample example);
}