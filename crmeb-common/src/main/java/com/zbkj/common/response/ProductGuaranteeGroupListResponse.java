package com.zbkj.common.response;

import com.zbkj.common.model.product.MerchantProductGuaranteeGroup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 商品保障服务组合列表响应对象
 * +----------------------------------------------------------------------
 * | CRMEB [ CRMEB赋能开发者，助力企业发展 ]
 * +----------------------------------------------------------------------
 * | Copyright (c) 2016~2025 https://www.crmeb.com All rights reserved.
 * +----------------------------------------------------------------------
 * | Licensed CRMEB并不是自由软件，未经许可不能去掉CRMEB相关版权
 * +----------------------------------------------------------------------
 * | Author: CRMEB Team <admin@crmeb.com>
 * +----------------------------------------------------------------------
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value = "ProductGuaranteeGroupListResponse对象", description = "商品保障服务组合列表响应对象")
public class ProductGuaranteeGroupListResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "组合id")
    private Integer id;

    @ApiModelProperty(value = "组合名称")
    private String name;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "保障服务列表")
    private List<MerchantProductGuaranteeGroup> guaranteeList;
}
