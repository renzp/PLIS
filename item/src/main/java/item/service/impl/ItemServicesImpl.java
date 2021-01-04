package item.service.impl;

import item.dao.ItemDao;
import item.entity.ItemEntity;
import item.service.ItemService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ItemServicesImpl implements ItemService {

    private final static Logger logger = Logger.getLogger(ItemServicesImpl.class);
    @Resource
    private ItemDao itemDao;


    @Override
    public List<ItemEntity> getItemList(String jobId, String drawCode, String status) {

        try {
            return itemDao.getItemList(jobId,drawCode,status);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("ItemServiceImpl | method=getItemList() | 查询物料信息错误 Error！" + e.getMessage(), e);
        }
        return null;
    }


}

