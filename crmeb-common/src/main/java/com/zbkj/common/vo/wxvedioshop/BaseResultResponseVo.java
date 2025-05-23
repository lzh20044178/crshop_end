package com.zbkj.common.vo.wxvedioshop;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Base Result
 *  +----------------------------------------------------------------------
 *  | CRMEB [ CRMEB赋能开发者，助力企业发展 ]
 *  +----------------------------------------------------------------------
 *  | Copyright (c) 2016~2025 https://www.crmeb.com All rights reserved.
 *  +----------------------------------------------------------------------
 *  | Licensed CRMEB并不是自由软件，未经许可不能去掉CRMEB相关版权
 *  +----------------------------------------------------------------------
 *  | Author: CRMEB Team <admin@crmeb.com>
 *  +----------------------------------------------------------------------
 */
@Data
public class BaseResultResponseVo {
    @ApiModelProperty(value = "错误码", example = "")
    private Integer errcode;
    @ApiModelProperty(value = "错误信息", example = "")
    private String errmsg;
}
