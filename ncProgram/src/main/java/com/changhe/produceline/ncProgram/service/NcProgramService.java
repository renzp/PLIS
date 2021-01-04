package com.changhe.produceline.ncProgram.service;

import com.changhe.produceline.ncProgram.entity.NcProgramEntity;

import java.util.List;

public interface NcProgramService {

    List<NcProgramEntity> getNcList(String ncName, String drawCode, String status);
}
