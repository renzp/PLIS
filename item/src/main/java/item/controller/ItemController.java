package item.controller;

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
public class ItemController {
    @Resource
    private ItemService itemService;
    @Resource
    private HttpServletResponse httpServletResponse;
    /**
     * 物料需求列表
     * @return
     */
    @GetMapping(value = "/getItemList", produces="application/json; charset=utf-8")
    public String getItemList(String jobId,String drawCode,String status){
        return JsonUtil.toJSON(R.ok(itemService.getItemList(jobId,drawCode,status)));
    }

    @GetMapping(value = "/exportItem")
    public void exportExcel(String jobId,String drawCode,String status) {

        List<ItemEntity> data = itemService.getItemList(jobId,drawCode,status);
        ExcelExportUtil excelExport = new ExcelExportUtil();
        String title = "物料需求表";
        String[] titleColumn = {"jobId", "drawCode","itemCode","itemName"};
        String[] titleName = {"任务编码", "图号", "物料编码","物料名称"}; //表头，列名
        int[] titleSize = {20,20,30,20};
        excelExport.writeBigExcel(httpServletResponse, title, titleColumn, titleName, titleSize, data);
    }

}
