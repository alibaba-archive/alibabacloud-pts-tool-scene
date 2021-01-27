package com.taobao.amazon.entity.pts.scene;


import java.util.List;

/**
 * 场景的链路结构
 */
public class Relation {

    /**
     * 链路ID
     */
    private String relationId;

    /**
     * 链路名
     */
    private String relationName;

    /**
     * 链路下的API信息
     */
    private List<Api> apiList;

    /**
     * 链路中的文件参数配置信息
     */
    private List<FileParameterExplain> fileParameterExplainList;


    public Relation() {
    }

    public String getRelationId() {
        return relationId;
    }

    public void setRelationId(String relationId) {
        this.relationId = relationId;
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

    public List<FileParameterExplain> getFileParameterExplainList() {
        return fileParameterExplainList;
    }

    public void setFileParameterExplainList(List<FileParameterExplain> fileParameterExplainList) {
        this.fileParameterExplainList = fileParameterExplainList;
    }

    @Override
    public String toString() {
        return "Relation{" +
                "relationId='" + relationId + '\'' +
                ", relationName='" + relationName + '\'' +
                ", apiList=" + apiList +
                ", fileParameterExplainList=" + fileParameterExplainList +
                '}';
    }
}
