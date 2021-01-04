package WE.controller;

import PLIS.Common.ResponseResult;
import WE.dao.entity.JL_ERP_TO_MES_PAC_ORDER_V;
import WE.dao.entity.T_MES_SIM_WORKORDER_PARENT;
import WE.dao.entity.sample_test;
import WE.service.TaskReceiveService;
import WE.service.sample_testService;
import com.cloud.common.utils.AppUserUtil;
import com.cloud.model.user.LoginAppUser;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class WEController {
    private static final Logger logger = LoggerFactory.getLogger(WEController.class);

    @Autowired
    private sample_testService collectService;

    @Autowired
    private TaskReceiveService trService;

    @GetMapping("/mes-test")
    public String mes_test() {
        return "hellow world！";
    }

    @GetMapping("/mes-user")
    public String findUsers() {
        //获取用户信息后，返回
        LoginAppUser LoginAppUser = AppUserUtil.getLoginAppUser();
        return LoginAppUser.getUsername();
    }

    @GetMapping("/dbaaa")
    public List<sample_test> dbaaa() {
        List<sample_test> list = collectService.getAllCollect();

        logger.info("dbaaa");
        return list;
    }

    @ApiOperation("获取MES发送过来的任务")
    @GetMapping("/GetAllMesTask")
    public ResponseResult GetAllMesTask() {
        ResponseResult result = new ResponseResult();
        List<JL_ERP_TO_MES_PAC_ORDER_V> list = trService.GetAllMesTask();

        logger.info("info GetAllMesTask");
        logger.debug("debug GetAllMesTask");

        result.setStatus(1);
        result.setErrorMsg("成功");
        result.setResult(list);

        return result;
    }

    @ApiOperation("获取产线接收之后的主任务")
    @GetMapping("/GetAllPLTaskParent")
    public ResponseResult GetAllPLTaskParent() {
        ResponseResult result = new ResponseResult();
        List<T_MES_SIM_WORKORDER_PARENT> list = trService.GetAllPLTaskParent();

        result.setStatus(1);
        result.setErrorMsg("成功");
        result.setResult(list);

        return result;
    }

    @ApiOperation("获取产线接收之后的主任务")
    @GetMapping("/InsertTaszkParent")
    public ResponseResult InsertTaszkParent() {
        ResponseResult result = new ResponseResult();
        T_MES_SIM_WORKORDER_PARENT plTp = new T_MES_SIM_WORKORDER_PARENT();

//        plTp.company_code = "CH001";
//        plTp.workordercode = "T-21-002";
//        plTp.materielcode = "WS001.01.01";
//        plTp.quantity = 30;
//        plTp.registercode = "registercode";
//        plTp.registername = "registername";
//        plTp.registerorgcode = "registerorgcode";
//        plTp.registerorgname = "registerorgname";

        plTp.setCompany_code("CH001");
        plTp.setWorkordercode("T-21-002");
        plTp.setMaterielcode("WS001.01.01");
        plTp.setQuantity(30);
        plTp.setRegistercode("registercode");
        plTp.setRegistername("registername");
        plTp.setRegisterorgcode("registerorgcode");
        plTp.setRegisterorgname("registerorgname");

        result.setStatus(1);
        result.setErrorMsg("成功");
        trService.InsertTaszkParent(plTp);

        return result;
    }
}
