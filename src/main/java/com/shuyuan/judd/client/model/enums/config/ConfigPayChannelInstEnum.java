package com.shuyuan.judd.client.model.enums.config;

import java.util.stream.Stream;

/**
 * @author Boris
 * create 2018/10/27
 * 
 **/
public enum ConfigPayChannelInstEnum {

    LD("LD", "联动优势");

    //出款机构
    private String mechanism;
    //详细名称
    private String name;

    ConfigPayChannelInstEnum(String mechanism, String name) {
        this.mechanism = mechanism;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMechanism() {
        return mechanism;
    }

    public void setMechanism(String mechanism) {
        this.mechanism = mechanism;
    }

    public static String getNameByMechanism(String mechanism) {
        ConfigPayChannelInstEnum configPayChannelInstEnum = Stream.of(values()).filter(p -> mechanism.equals(p.getMechanism())).findFirst().get();

        return configPayChannelInstEnum.getName();
//        for (ConfigPayChannelInstEnum configPayChannelInstEnum : ConfigPayChannelInstEnum.values()) {
//            if (configPayChannelInstEnum.getMechanism().equals(mechanism)) {
//                return configPayChannelInstEnum.getName();
//            }
//        }
//        return null;
    }
}
