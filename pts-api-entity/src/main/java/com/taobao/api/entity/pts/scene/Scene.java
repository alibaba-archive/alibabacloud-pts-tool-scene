package com.taobao.api.entity.pts.scene;

import java.util.List;

/**
 * 场景结构
 */
public class Scene {

    /**
     * 场景ID
     */
    private String sceneId;

    /**
     * 场景名
     */
    private String sceneName;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 最后一次修改时间
     */
    private String modifiedTime;

    /**
     * 场景状态
     */
    private String status;

    /**
     * 链路配置
     */
    private List<Relation> relationList;

    /**
     * 施压配置
     */
    private LoadConfig loadConfig;

    /**
     * 高级设置
     */
    private AdvanceSetting advanceSetting;

    /**
     * 文件参数
     */
    private List<FileParameter> fileParameterList;

    /**
     * 全局自定义参数
     */
    private List<GlobalParameter> globalParameterList;


    public Scene() {
    }

    public String getSceneName() {
        return sceneName;
    }

    public void setSceneName(String sceneName) {
        this.sceneName = sceneName;
    }

    public LoadConfig getLoadConfig() {
        return loadConfig;
    }

    public void setLoadConfig(LoadConfig loadConfig) {
        this.loadConfig = loadConfig;
    }

    public AdvanceSetting getAdvanceSetting() {
        return advanceSetting;
    }

    public void setAdvanceSetting(AdvanceSetting advanceSetting) {
        this.advanceSetting = advanceSetting;
    }

    public String getSceneId() {
        return sceneId;
    }

    public void setSceneId(String sceneId) {
        this.sceneId = sceneId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<FileParameter> getFileList() {
        return fileParameterList;
    }

    public void setFileList(List<FileParameter> fileParameterList) {
        this.fileParameterList = fileParameterList;
    }

    public List<GlobalParameter> getGlobalParameterList() {
        return globalParameterList;
    }

    public void setGlobalParameterList(List<GlobalParameter> globalParameterList) {
        this.globalParameterList = globalParameterList;
    }

    public List<FileParameter> getFileParameterList() {
        return fileParameterList;
    }

    public void setFileParameterList(List<FileParameter> fileParameterList) {
        this.fileParameterList = fileParameterList;
    }

    public List<Relation> getRelationList() {
        return relationList;
    }

    public void setRelationList(List<Relation> relationList) {
        this.relationList = relationList;
    }

    @Override
    public String toString() {
        return "Scene{" +
                "sceneId='" + sceneId + '\'' +
                ", sceneName='" + sceneName + '\'' +
                ", createTime='" + createTime + '\'' +
                ", modifiedTime='" + modifiedTime + '\'' +
                ", status='" + status + '\'' +
                ", relationList=" + relationList +
                ", loadConfig=" + loadConfig +
                ", advanceSetting=" + advanceSetting +
                ", fileParameterList=" + fileParameterList +
                ", globalParameterList=" + globalParameterList +
                '}';
    }
}
