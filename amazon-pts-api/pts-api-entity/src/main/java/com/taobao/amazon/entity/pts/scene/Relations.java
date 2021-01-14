package com.taobao.amazon.entity.pts.scene;


import java.util.List;

/**
 * @function 场景的链路结构
 */
public class Relations {

    /**
     * 链路名
     */
    private String relationName;

    /**
     * 链路下的API信息
     */
    private List<Api> apiList;

    /**
     * 链路配置，并发模式下必须设置
     */
    private RelationTestConfig relationTestConfig;


    public Relations() {
    }

    public String getRelationName() {
        return relationName;
    }

    public void setRelationName(String relationName) {
        this.relationName = relationName;
    }

    public List<Api> getApiList() {
        return apiList;
    }

    public void setApiList(List<Api> apiList) {
        this.apiList = apiList;
    }

    public RelationTestConfig getRelationTestConfig() {
        return relationTestConfig;
    }

    public void setRelationTestConfig(RelationTestConfig relationTestConfig) {
        this.relationTestConfig = relationTestConfig;
    }

    @Override
    public String toString() {
        return "Relations{" +
                "relationName='" + relationName + '\'' +
                ", apiList=" + apiList +
                ", relationTestConfig=" + relationTestConfig +
                '}';
    }
}
