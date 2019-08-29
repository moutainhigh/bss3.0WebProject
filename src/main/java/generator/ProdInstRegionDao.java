package generator;

import generator.ProdInstRegion;
import generator.ProdInstRegionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProdInstRegionDao {
    long countByExample(ProdInstRegionExample example);

    int deleteByExample(ProdInstRegionExample example);

    int insert(ProdInstRegion record);

    int insertSelective(ProdInstRegion record);

    List<ProdInstRegion> selectByExample(ProdInstRegionExample example);

    int updateByExampleSelective(@Param("record") ProdInstRegion record, @Param("example") ProdInstRegionExample example);

    int updateByExample(@Param("record") ProdInstRegion record, @Param("example") ProdInstRegionExample example);
}