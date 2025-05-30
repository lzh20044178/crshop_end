package com.zbkj.common.vo.wxvedioshop;

import com.baomidou.mybatisplus.annotation.TableField;
import com.zbkj.common.vo.wxvedioshop.aftersale.AftersaleProductInfoVo;
import lombok.Data;

import java.util.List;

/**
 * 创建售后Vo对象
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
public class ShopAftersaleVo {

    /** 发起售后的订单ID */
    @TableField(value = "order_id")
    private Integer order_id;

    /** 商家自定义订单ID */
    @TableField(value = "out_order_id")
    private String outOrderId;

    /** 商家自定义售后ID，与aftersale_id二选一 */
    @TableField(value = "out_aftersale_id")
    private String outAftersaleId;

    /** 商家小程序该售后单的页面path，不存在则使用订单path */
    private String path;

    /** 用户的openid */
    private String openid;

    /** 售后类型，1:退款,2:退款退货,3:换货 */
    private Integer type;

    /** 发起申请时间，yyyy-MM-dd HH:mm:ss */
    @TableField(value = "create_time")
    private String createTime;

    /** 0:未受理,1:用户取消,2:商家受理中,3:商家逾期未处理,4:商家拒绝退款,5:商家拒绝退货退款,6:待买家退货,7:退货退款关闭,8:待商家收货,11:商家退款中,12:商家逾期未退款,13:退款完成,14:退货退款完成 */
    private String status;

    /** 退货相关商品列表 */
    @TableField(value = "product_infos")
    private List<AftersaleProductInfoVo> product_infos;

}
