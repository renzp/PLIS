package com.changhe.produceline.ncProgram.entity;

import lombok.Data;

@Data
public class NcProgramEntity {

    private int id;

    private String productLineCode;

    private String productLineName;

    private String drawCode;

    private String procedureCode;

    private String stepCode;

    private String ncCode;

    private String ncName;

    private String ncVersion;

    private String machineCode;

    private String ncPath;

    private String status;

    private String createTime;
}
