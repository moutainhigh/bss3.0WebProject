package generator;

import generator.InfoHdUserFee;
import generator.InfoHdUserFeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InfoHdUserFeeDao {
    long countByExample(InfoHdUserFeeExample example);

    int deleteByExample(InfoHdUserFeeExample example);

    int insert(InfoHdUserFee record);

    int insertSelective(InfoHdUserFee record);

    List<InfoHdUserFee> selectByExample(InfoHdUserFeeExample example);

    int updateByExampleSelective(@Param("record") InfoHdUserFee record, @Param("example") InfoHdUserFeeExample example);

    int updateByExample(@Param("record") InfoHdUserFee record, @Param("example") InfoHdUserFeeExample example);
}