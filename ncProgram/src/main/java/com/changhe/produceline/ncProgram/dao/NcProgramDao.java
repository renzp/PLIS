package com.changhe.produceline.ncProgram.dao;

import com.changhe.produceline.ncProgram.entity.NcProgramEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface NcProgramDao {

    List<NcProgramEntity> getNcList(@Param("ncName") String ncName, @Param("drawCode") String drawCode, @Param("status") String status);
}
