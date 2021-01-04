package PLIS.Common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="返回值实体类",description="返回值实体类")
public class ResponseResult {
    private static final long serialVersionUID = 1L;
    //正常：1，异常：0
    @ApiModelProperty(value = "状态值")
    private Integer status;
    @ApiModelProperty(value = "报错信息")
    private String errorMsg;
    @ApiModelProperty(value = "返回值")
    private Object result;

}
