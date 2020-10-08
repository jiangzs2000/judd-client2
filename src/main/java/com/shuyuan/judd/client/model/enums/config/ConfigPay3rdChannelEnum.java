package com.shuyuan.judd.client.model.enums.config;

import java.util.stream.Stream;


/**
 * @author Sting
 * create 2018/10/18

 **/
@Deprecated
public enum ConfigPay3rdChannelEnum {
    WX_TL_04("TL", "WX_TL_04", "", ""),
    CARD_LL_01("LL", "CARD_LL_01", "", ""),
    WX_PA_04("PA", "WX_PA_04", "", ""),
    //联动微信H5
    WX_LD_01("LD", "WX_LD_01", "4", ""),
    //联动微信app支付
    WX_LD_02("LD", "WX_LD_02", "28", ""),
    //联动微信小程序支付
    WX_LD_03("LD", "WX_LD_03", "29", ""),
    //联动微信公众号支付
    WX_LD_04("LD", "WX_LD_04", "18", "WX"),
    //联动微信主扫
    WX_LD_05("LD", "WX_LD_05", "6", ""),
    //联动微信被扫
    WX_LD_06("LD", "WX_LD_06", "8", ""),
    //联动支付宝H5
    ALI_LD_01("LD", "ALI_LD_01", "5", ""),
    //联动支付宝主扫
    ALI_LD_02("LD", "ALI_LD_02", "7", ""),
    //联动支付宝被扫
    ALI_LD_03("LD", "ALI_LD_03", "9", ""),
    //联动支付宝公众号
    ALI_LD_04("LD", "ALI_LD_04", "7", ""),
    //联动借记卡快捷支付
    CARD_LD_01("LD", "CARD_LD_01", "16", ""),
    //联动借记卡商业委托
    CARD_LD_02("LD", "CARD_LD_02", "26", ""),
    //联动贷记卡快捷支付
    CARD_LD_03("LD", "CARD_LD_03", "17", ""),
    //联动贷记卡商业委托
    CARD_LD_04("LD", "CARD_LD_04", "27", ""),
    //惠商联动通道  小程序
    WX_LDHS_03("LD", "WX_LDHS_03", "99", "WX"),
    //惠商联动支付宝服务窗
    AL_LDHS_03("LD", "AL_LDHS_03", "99", "AL"),
    DEFAULT_CODE("LD", "", "", "");

    //渠道方
    private String channel;
    //详细通道
    private String channelDetail;
    //联动通道编码
    private String threed;
    //联动惠商编码
    private String fourth;


    ConfigPay3rdChannelEnum(String channel, String channelDetail, String fourth) {
        this.channel = channel;
        this.channelDetail = channelDetail;
        this.fourth = fourth;
    }

    ConfigPay3rdChannelEnum(String channel, String channelDetail, String threed, String fourth) {
        this.channel = channel;
        this.channelDetail = channelDetail;
        this.threed = threed;
        this.fourth = fourth;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getChannelDetail() {
        return channelDetail;
    }

    public void setChannelDetail(String channelDetail) {
        this.channelDetail = channelDetail;
    }

    public String getThreed() {
        return threed;
    }

    public void setThreed(String threed) {
        this.channelDetail = threed;
    }

    public String getFourth() {
        return fourth;
    }

    public void setFourth(String fourth) {
        this.fourth = fourth;
    }

    public static String getChannelByChannelDetailCode(String code) {
        for (ConfigPay3rdChannelEnum configPay3rdChannelEnum : ConfigPay3rdChannelEnum.values()) {
            if (configPay3rdChannelEnum.getChannelDetail().equals(code)) {
                return configPay3rdChannelEnum.getChannel();
            }
        }
        return null;
    }

    public static String getchannelDetailByThredd(String threed) {
        return Stream.of(values()).filter(p -> threed.equals(p.getThreed())).findFirst().get().channelDetail;
    }

    public static String getFouthchannelCodeBychannelDetail(String channelDetail) {
        return Stream.of(values()).filter(p -> channelDetail.equals(p.getChannelDetail())).findFirst().get().fourth;
    }
}
