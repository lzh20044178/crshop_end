package com.zbkj.common.model.bill;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 平台月帐单表
 * </p>
 *
 * @author HZW
 * @since 2022-07-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("eb_platform_month_statement")
@ApiModel(value="PlatformMonthStatement对象", description="平台月帐单表")
public class PlatformMonthStatement implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "帐单id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "订单支付总金额")
    private BigDecimal orderPayAmount;

    @ApiModelProperty(value = "订单支付笔数")
    private Integer totalOrderNum;

    @ApiModelProperty(value = "月手续费收入")
    private BigDecimal handlingFee;

    @ApiModelProperty(value = "商户分账金额")
    private BigDecimal merchantTransferAmount;

    @ApiModelProperty(value = "商户分账笔数")
    private Integer merchantTransferNum;

    @ApiModelProperty(value = "一级佣金金额")
    private BigDecimal firstBrokerage;

    @ApiModelProperty(value = "二级佣金金额")
    private BigDecimal secondBrokerage;

    @ApiModelProperty(value = "订单积分抵扣金额")
    private BigDecimal integralPrice;

    @ApiModelProperty(value = "支出总金额")
    private BigDecimal payoutAmount;

    @ApiModelProperty(value = "支出笔数")
    private Integer payoutNum;

    @ApiModelProperty(value = "平台退款金额")
    private BigDecimal refundAmount;

    @ApiModelProperty(value = "平台代扣佣金金额")
    private BigDecimal refundReplaceBrokerage;

    @ApiModelProperty(value = "退款平台积分抵扣金额")
    private BigDecimal refundReplaceIntegralPrice;

    @ApiModelProperty(value = "退款笔数")
    private Integer refundNum;

    @ApiModelProperty(value = "充值笔数")
    private Integer rechargeNum;

    @ApiModelProperty(value = "充值金额")
    private BigDecimal rechargeAmount;

    @ApiModelProperty(value = "平台月收支")
    private BigDecimal incomeExpenditure;

    @ApiModelProperty(value = "日期：年-月")
    private String dataDate;

    @ApiModelProperty(value = "平台优惠券补贴金额")
    private BigDecimal platCouponPrice;

    @ApiModelProperty(value = "订单实际退款金额")
    private BigDecimal orderRefundPrice;

    @ApiModelProperty(value = "退还平台优惠券补贴金额")
    private BigDecimal refundPlatCouponPrice;

    @ApiModelProperty(value = "退还手续费金额")
    private BigDecimal refundHandlingFee;

    @ApiModelProperty(value = "分佣")
    private BigDecimal brokeragePrice;

    @ApiModelProperty(value = "退还佣金")
    private BigDecimal refundBrokeragePrice;

    @ApiModelProperty(value = "退还商户分账金额")
    private BigDecimal refundMerchantTransferAmount;

    @ApiModelProperty(value = "运费金额")
    private BigDecimal freightFee;

    @ApiModelProperty(value = "退运费金额")
    private BigDecimal refundFreightFee;
}
