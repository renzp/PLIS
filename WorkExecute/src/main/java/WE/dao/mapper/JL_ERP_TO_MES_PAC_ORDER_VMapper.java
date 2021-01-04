package WE.dao.mapper;


import WE.dao.entity.JL_ERP_TO_MES_PAC_ORDER_V;
import WE.dao.entity.sample_test;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface JL_ERP_TO_MES_PAC_ORDER_VMapper {
    List<JL_ERP_TO_MES_PAC_ORDER_V> GetAllMesTask();
}
