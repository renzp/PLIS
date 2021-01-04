package WE.dao.entity;

import lombok.Data;

import java.util.Date;

@Data
public class T_MES_SIM_WORKORDER_PARENT {
    public String id;
    public String company_code;
    public String workordercode;
    public String pprid;
    public String workordername;
    public String materielcode;
    public String materielname;
    public String workordernumber;
    public String promodel;
    public String procode;
    public String proname;
    public Date actualstartdate;
    public Date actualenddate;
    public Integer workorderstate;
    public Integer implemenstate;
    public String pdtworkshopcode;
    public String pdtworkshopname;
    public String productionteam;
    public String productionteamcode;
    public String personliablecode;
    public String personliablename;
    public Integer quantity;
    public String unitcode;
    public String unit;
    public String figurenum;
    public Date implementstartdate;
    public Date implementenddate;
    public String implementusercode;
    public String implementusername;
    public String boxcode;
    public String plancode;
    public Integer generationtype;
    public Integer isconfirm;
    public Integer schedulingstate;
    public Integer checkupstatus;
    public Integer schedulingamount;
    public Date recematerialdate;
    public String recematerialuserid;
    public String workbenchname;
    public String workbenchnumber;
    public Integer iscreateppr;
    public Integer assemblytype;
    public Integer state;
    public String delusercode;
    public Date deldate;
    public Integer splitstate;
    public String registercode;
    public String registername;
    public String registerorgcode;
    public String registerorgname;
    public Date createdate;
    public String modifycode;
    public String modifyname;
    public String modifyorgcode;
    public String modifyorgname;
    public Date updatedate;
}
