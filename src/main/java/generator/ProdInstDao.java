package generator;

import generator.ProdInst;
import generator.ProdInstExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProdInstDao {
    long countByExample(ProdInstExample example);

    int deleteByExample(ProdInstExample example);

    int insert(ProdInst record);

    int insertSelective(ProdInst record);

    List<ProdInst> selectByExample(ProdInstExample example);

    int updateByExampleSelective(@Param("record") ProdInst record, @Param("example") ProdInstExample example);

    int updateByExample(@Param("record") ProdInst record, @Param("example") ProdInstExample example);
}