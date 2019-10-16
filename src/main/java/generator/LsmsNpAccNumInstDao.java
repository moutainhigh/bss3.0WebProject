package generator;

import generator.LsmsNpAccNumInst;
import generator.LsmsNpAccNumInstExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LsmsNpAccNumInstDao {
    long countByExample(LsmsNpAccNumInstExample example);

    int deleteByExample(LsmsNpAccNumInstExample example);

    int deleteByPrimaryKey(Long npAccNumInstId);

    int insert(LsmsNpAccNumInst record);

    int insertSelective(LsmsNpAccNumInst record);

    List<LsmsNpAccNumInst> selectByExample(LsmsNpAccNumInstExample example);

    LsmsNpAccNumInst selectByPrimaryKey(Long npAccNumInstId);

    int updateByExampleSelective(@Param("record") LsmsNpAccNumInst record, @Param("example") LsmsNpAccNumInstExample example);

    int updateByExample(@Param("record") LsmsNpAccNumInst record, @Param("example") LsmsNpAccNumInstExample example);

    int updateByPrimaryKeySelective(LsmsNpAccNumInst record);

    int updateByPrimaryKey(LsmsNpAccNumInst record);
}