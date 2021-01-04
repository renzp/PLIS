package com.changhe.produceline.ncProgram.controller;

import com.changhe.produceline.ncProgram.entity.NcProgramEntity;
import com.changhe.produceline.ncProgram.service.NcProgramService;
import commons.dto.R;
import commons.utils.ExcelExportUtil;
import commons.utils.JsonUtil;
import item.entity.ItemEntity;
import item.service.ItemService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


/**
 *
 */
@RestController
public class NcProgramController {
    @Resource
    private NcProgramService ncProgramService;
    @Resource
    private HttpServletResponse httpServletResponse;
    /**
     * NC程序列表
     * @return
     */
    @GetMapping(value = "/getNcList", produces="application/json; charset=utf-8")
    public String getNcList(String ncName,String drawCode,String status){
        return JsonUtil.toJSON(R.ok(ncProgramService.getNcList(ncName,drawCode,status)));
    }

    /**
     *
     * @param ncName
     * @param drawCode
     * @param status
     */
    @GetMapping(value = "/exportNc")
    public void exportExcel(String ncName,String drawCode,String status) {

        List<NcProgramEntity> data = ncProgramService.getNcList(ncName,drawCode,status);
        ExcelExportUtil excelExport = new ExcelExportUtil();
        String title = "NC程序推送表";
        String[] titleColumn = {"ncName", "drawCode"};
        String[] titleName = {"NC名称", "图号"}; //表头，列名
        int[] titleSize = {20,20};
        excelExport.writeBigExcel(httpServletResponse, title, titleColumn, titleName, titleSize, data);
    }

}
