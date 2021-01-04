package com.changhe.produceline.ncProgram.service.impl;

import com.changhe.produceline.ncProgram.dao.NcProgramDao;
import com.changhe.produceline.ncProgram.entity.NcProgramEntity;
import com.changhe.produceline.ncProgram.service.NcProgramService;
import item.dao.ItemDao;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class NcProgramServicesImpl implements NcProgramService {

    private final static Logger logger = Logger.getLogger(NcProgramServicesImpl.class);
    @Resource
    private NcProgramDao ncProgramDao;


    @Override
    public List<NcProgramEntity> getNcList(String ncName, String drawCode, String status) {

        try {
            return ncProgramDao.getNcList(ncName,drawCode,status);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("查询NC信息错误 Error！" + e.getMessage(), e);
        }
        return null;
    }


}

