package com.taobao.amazon.entity.pts.scene;


/**
 * @function 链路施压配置信息，在并发模式下使用
 */
public class RelationTestConfig {

    /**
     * 开始并发
     */
    private Integer beginConcurrency;

    /**
     * 最大并发
     */
    private Integer maxConcurrency;


    public RelationTestConfig() {
    }

    public Integer getBeginConcurrency() {
        return beginConcurrency;
    }

    public void setBeginConcurrency(Integer beginConcurrency) {
        this.beginConcurrency = beginConcurrency;
    }

    public Integer getMaxConcurrency() {
        return maxConcurrency;
    }

    public void setMaxConcurrency(Integer maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
    }

    @Override
    public String toString() {
        return "RelationTestConfig{" +
                "beginConcurrency=" + beginConcurrency +
                ", maxConcurrency=" + maxConcurrency +
                '}';
    }
}

