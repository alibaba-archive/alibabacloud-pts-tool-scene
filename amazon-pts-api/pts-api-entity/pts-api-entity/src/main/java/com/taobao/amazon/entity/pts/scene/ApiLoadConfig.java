package com.taobao.amazon.entity.pts.scene;

/**
 * API的RPS信息
 */
public class ApiLoadConfig {

    /**
     * 起始RPS值
     */
    private Integer rpsBegin;

    /**
     * 最大RPS值
     */
    private Integer rpsLimit;


    public ApiLoadConfig() {
    }

    public Integer getRpsBegin() {
        return rpsBegin;
    }

    public void setRpsBegin(Integer rpsBegin) {
        this.rpsBegin = rpsBegin;
    }

    public Integer getRpsLimit() {
        return rpsLimit;
    }

    public void setRpsLimit(Integer rpsLimit) {
        this.rpsLimit = rpsLimit;
    }

    @Override
    public String toString() {
        return "ApiLoadConfig{" +
                "rpsBegin=" + rpsBegin +
                ", rpsLimit=" + rpsLimit +
                '}';
    }
}
