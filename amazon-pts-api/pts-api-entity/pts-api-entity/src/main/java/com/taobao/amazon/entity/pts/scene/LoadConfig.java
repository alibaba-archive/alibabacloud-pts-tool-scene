package com.taobao.amazon.entity.pts.scene;


import java.util.List;

/**
 * 场景施压配置信息
 */
public class LoadConfig {

    /**
     * 施压模式，并发模式(concurrency_mode) 和RPS模式(tps_mode)
     */
    private String testMode;

    /**
     * 场景施压量级配置信息
     */
    private Configuration configuration;

    /**
     * 施压时长，单位分钟，[1-1440]
     */
    private Integer maxRunningTime;

    /**
     * 指定机器数，并发必须大于250(RPS大于2000)才能使用，最大扩展机器数不能超过 最大并发/250(最大RPS/2000)
     */
    private Integer agentCount;

    /**
     * API的起始、最大RPS值设置，在RPS模式下使用
     */
    private List<ApiLoadConfig> apiLoadConfigList;

    /**
     * 链路的起始、最大并发值设置，在并发模式下使用
     */
    private List<RelationLoadConfig> relationLoadConfigList;

    public LoadConfig() {
    }

    public String getTestMode() {
        return testMode;
    }

    public void setTestMode(String testMode) {
        this.testMode = testMode;
    }

    public Configuration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(Configuration configuration) {
        this.configuration = configuration;
    }

    public Integer getMaxRunningTime() {
        return maxRunningTime;
    }

    public void setMaxRunningTime(Integer maxRunningTime) {
        this.maxRunningTime = maxRunningTime;
    }

    public Integer getAgentCount() {
        return agentCount;
    }

    public void setAgentCount(Integer agentCount) {
        this.agentCount = agentCount;
    }

    public List<ApiLoadConfig> getApiLoadConfigList() {
        return apiLoadConfigList;
    }

    public void setApiLoadConfigList(List<ApiLoadConfig> apiLoadConfigList) {
        this.apiLoadConfigList = apiLoadConfigList;
    }

    public List<RelationLoadConfig> getRelationLoadConfigList() {
        return relationLoadConfigList;
    }

    public void setRelationLoadConfigList(List<RelationLoadConfig> relationLoadConfigList) {
        this.relationLoadConfigList = relationLoadConfigList;
    }

    @Override
    public String toString() {
        return "LoadConfig{" +
                "testMode='" + testMode + '\'' +
                ", configuration=" + configuration +
                ", maxRunningTime=" + maxRunningTime +
                ", agentCount=" + agentCount +
                ", apiLoadConfigList=" + apiLoadConfigList +
                ", relationLoadConfigList=" + relationLoadConfigList +
                '}';
    }
}

