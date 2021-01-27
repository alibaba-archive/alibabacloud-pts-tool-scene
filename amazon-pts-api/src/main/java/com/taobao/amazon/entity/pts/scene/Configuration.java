package com.taobao.amazon.entity.pts.scene;

/**
 * 压测量级配置
 */
public class Configuration {

    /**
     * 所有链路的起始并发总值，均分给每个链路，在并发模式下使用，若不设置该值，则relationLoadConfig必须填写
     */
    private Integer allConcurrencyBegin;

    /**
     * 所有链路的最大并发总值，均分给每个链路，在并发模式下使用，若不设置该值，则relationLoadConfig必须填写
     */
    private Integer allConcurrencyLimit;

    /**
     * 所有API的起始RPS总值，均分给每个API，在RPS模式下使用，若不设置该值，则apiLoadConfig必须填写
     */
    private Integer allRpsBegin;

    /**
     * 所有API的最大RPS总值，均分给每个API，在RPS模式下使用，若不设置该值，则apiLoadConfig必须填写
     */
    private Integer allRpsLimit;


    public Configuration() {
    }

    public Integer getAllConcurrencyBegin() {
        return allConcurrencyBegin;
    }

    public void setAllConcurrencyBegin(Integer allConcurrencyBegin) {
        this.allConcurrencyBegin = allConcurrencyBegin;
    }

    public Integer getAllConcurrencyLimit() {
        return allConcurrencyLimit;
    }

    public void setAllConcurrencyLimit(Integer allConcurrencyLimit) {
        this.allConcurrencyLimit = allConcurrencyLimit;
    }

    public Integer getAllRpsBegin() {
        return allRpsBegin;
    }

    public void setAllRpsBegin(Integer allRpsBegin) {
        this.allRpsBegin = allRpsBegin;
    }

    public Integer getAllRpsLimit() {
        return allRpsLimit;
    }

    public void setAllRpsLimit(Integer allRpsLimit) {
        this.allRpsLimit = allRpsLimit;
    }

    @Override
    public String toString() {
        return "Configuration{" +
                "allConcurrencyBegin=" + allConcurrencyBegin +
                ", allConcurrencyLimit=" + allConcurrencyLimit +
                ", allRpsBegin=" + allRpsBegin +
                ", allRpsLimit=" + allRpsLimit +
                '}';
    }
}
