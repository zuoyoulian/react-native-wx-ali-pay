package com.timson.react_native_wx_ali_pay;

/**
 * 支付监听器
 * @author Timson
 */
public interface RNWxAliPayListener{

    /**
     * 支付成功
     * @param resultInfo 支付结果相关信息 9000
     */
    void onPaySuccess(String resultInfo);
    /**
     * 支付失败
     * @param resultInfo 支付结果相关信息
     */
    void onPayFail(String code, String resultInfo);
    /**
     * 订单创建等待用户支付
     * @param resultInfo 支付确认中
     */
    void onPayConfirm(String resultInfo);
}
