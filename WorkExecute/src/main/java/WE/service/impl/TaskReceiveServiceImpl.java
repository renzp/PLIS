package WE.service.impl;

import WE.dao.entity.JL_ERP_TO_MES_PAC_ORDER_V;
import WE.dao.entity.T_MES_SIM_WORKORDER_PARENT;
import WE.dao.mapper.JL_ERP_TO_MES_PAC_ORDER_VMapper;
import WE.dao.mapper.T_MES_SIM_WORKORDER_PARENTMapper;
import WE.service.TaskReceiveService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TaskReceiveServiceImpl implements TaskReceiveService {
    @Resource
    private JL_ERP_TO_MES_PAC_ORDER_VMapper MesTaskMapper;

    @Resource
    private T_MES_SIM_WORKORDER_PARENTMapper PLTaskMapper;

    @Override
    public List<JL_ERP_TO_MES_PAC_ORDER_V> GetAllMesTask() {
        return MesTaskMapper.GetAllMesTask();
    }

    @Override
    public List<T_MES_SIM_WORKORDER_PARENT> GetAllPLTaskParent() {
        return PLTaskMapper.GetAllPLTaskParent();
    }

    @Override
    public void InsertTaszkParent(T_MES_SIM_WORKORDER_PARENT plTp)
    {
        PLTaskMapper.InsertTaskParent(plTp);
    }
}
