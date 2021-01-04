package WE.service;


import WE.dao.entity.JL_ERP_TO_MES_PAC_ORDER_V;
import WE.dao.entity.T_MES_SIM_WORKORDER_PARENT;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TaskReceiveService {
    List<JL_ERP_TO_MES_PAC_ORDER_V> GetAllMesTask();

    List<T_MES_SIM_WORKORDER_PARENT> GetAllPLTaskParent();

    void InsertTaszkParent(@Param("pltp") T_MES_SIM_WORKORDER_PARENT plTp);
}
