package WE.dao.mapper;


import WE.dao.entity.JL_ERP_TO_MES_PAC_ORDER_V;
import WE.dao.entity.T_MES_SIM_WORKORDER_PARENT;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface T_MES_SIM_WORKORDER_PARENTMapper {
    List<T_MES_SIM_WORKORDER_PARENT> GetAllPLTaskParent();

    int InsertTaskParent(T_MES_SIM_WORKORDER_PARENT plTp);
}
