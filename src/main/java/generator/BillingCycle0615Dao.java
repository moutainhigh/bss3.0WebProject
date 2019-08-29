package generator;

import generator.BillingCycle0615;
import generator.BillingCycle0615Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BillingCycle0615Dao {
    long countByExample(BillingCycle0615Example example);

    int deleteByExample(BillingCycle0615Example example);

    int insert(BillingCycle0615 record);

    int insertSelective(BillingCycle0615 record);

    List<BillingCycle0615> selectByExample(BillingCycle0615Example example);

    int updateByExampleSelective(@Param("record") BillingCycle0615 record, @Param("example") BillingCycle0615Example example);

    int updateByExample(@Param("record") BillingCycle0615 record, @Param("example") BillingCycle0615Example example);
}