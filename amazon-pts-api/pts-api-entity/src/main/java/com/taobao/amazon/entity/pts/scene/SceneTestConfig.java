package com.taobao.amazon.entity.pts.scene;


/**
 * 场景施压配置信息
 */
public class SceneTestConfig {

    /**
     * 施压模式，并发模式(concurrency_mode) 和RPS模式(tps_mode)，默认并发模式
     */
    private String testMode;

    /**
     * 并发上限，并发模式下使用
     */
    private Integer concurrencyLimit;

    /**
     * 并发上限，RPS模式下使用
     */
    private Integer rpsLimit;

    /**
     * 施压时长，单位分钟，[1-1440]
     */
    private Integer maxDuration;

    public SceneTestConfig() {
    }

    public String getTestMode() {
        return testMode;
    }

    public void setTestMode(String testMode) {
        this.testMode = testMode;
    }

    public Integer getConcurrencyLimit() {
        return concurrencyLimit;
    }

    public void setConcurrencyLimit(Integer concurrencyLimit) {
        this.concurrencyLimit = concurrencyLimit;
    }

    public Integer getRpsLimit() {
        return rpsLimit;
    }

    public void setRpsLimit(Integer rpsLimit) {
        this.rpsLimit = rpsLimit;
    }

    public Integer getMaxDuration() {
        return maxDuration;
    }

    public void setMaxDuration(Integer maxDuration) {
        this.maxDuration = maxDuration;
    }

    @Override
    public String toString() {
        return "SceneTestConfig{" +
                "testMode='" + testMode + '\'' +
                ", concurrencyLimit=" + concurrencyLimit +
                ", rpsLimit=" + rpsLimit +
                ", maxDuration=" + maxDuration +
                '}';
    }
}

