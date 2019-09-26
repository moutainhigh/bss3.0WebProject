package generator;

import generator.VMobileHead;
import generator.VMobileHeadExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VMobileHeadDao {
    long countByExample(VMobileHeadExample example);

    int deleteByExample(VMobileHeadExample example);

    int insert(VMobileHead record);

    int insertSelective(VMobileHead record);

    List<VMobileHead> selectByExample(VMobileHeadExample example);

    int updateByExampleSelective(@Param("record") VMobileHead record, @Param("example") VMobileHeadExample example);

    int updateByExample(@Param("record") VMobileHead record, @Param("example") VMobileHeadExample example);
}