package com.zbkj.common.vo.wxvedioshop.audit;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

/**
 * 上传品牌信息 request
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
public class ShopAuditBrandRequestVo {

    /** 上传品牌信息参数对象 */
    @TableField(value = "audit_req")
    private ShopAuditBrandRequestItemVo auditReq;
}
