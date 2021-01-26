package com.taobao.amazon.entity.pts.scene;

import java.util.List;

/**
 * 场景的高级设置
 */
public class AdvanceSetting {

    /**
     * 日志采样率，[1,50]，且是10的倍数
     */
    private Integer logRate;

    /**
     * 超时时间，单位秒
     */
    private Integer connectionTimeoutInSecond;

    /**
     * 新增成功状态码，多个用英文逗号隔开
     */
    private String successCode;

    /**
     * 域名绑定IP关系
     */
    private List<DomainBinding> domainBindingList;


    public AdvanceSetting() {
    }

    public Integer getLogRate() {
        return logRate;
    }

    public void setLogRate(Integer logRate) {
        this.logRate = logRate;
    }

    public Integer getConnectionTimeoutInSecond() {
        return connectionTimeoutInSecond;
    }

    public void setConnectionTimeoutInSecond(Integer connectionTimeoutInSecond) {
        this.connectionTimeoutInSecond = connectionTimeoutInSecond;
    }

    public String getSuccessCode() {
        return successCode;
    }

    public void setSuccessCode(String successCode) {
        this.successCode = successCode;
    }

    public List<DomainBinding> getDomainBindingList() {
        return domainBindingList;
    }

    public void setDomainBindingList(List<DomainBinding> domainBindingList) {
        this.domainBindingList = domainBindingList;
    }

    @Override
    public String toString() {
        return "AdvanceSetting{" +
                "logRate=" + logRate +
                ", connectionTimeoutInSecond=" + connectionTimeoutInSecond +
                ", successCode='" + successCode + '\'' +
                ", domainBindingList=" + domainBindingList +
                '}';
    }
}
