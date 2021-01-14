package com.taobao.amazon.entity.pts.scene;

import java.util.List;

/**
 * 场景结构
 */
public class Scene {

    /**
     * 场景名
     */
    private String sceneName;

    /**
     * 链路配置
     */
    private List<Relations> relationsList;

    /**
     * 施压配置
     */
    private SceneTestConfig sceneTestConfig;

    /**
     * 高级设置
     */
    private AdvanceSetting advanceSetting;


    public Scene() {
    }

    public String getSceneName() {
        return sceneName;
    }

    public void setSceneName(String sceneName) {
        this.sceneName = sceneName;
    }

    public List<Relations> getRelationsList() {
        return relationsList;
    }

    public void setRelationsList(List<Relations> relationsList) {
        this.relationsList = relationsList;
    }

    public SceneTestConfig getSceneTestConfig() {
        return sceneTestConfig;
    }

    public void setSceneTestConfig(SceneTestConfig sceneTestConfig) {
        this.sceneTestConfig = sceneTestConfig;
    }

    public AdvanceSetting getAdvanceSetting() {
        return advanceSetting;
    }

    public void setAdvanceSetting(AdvanceSetting advanceSetting) {
        this.advanceSetting = advanceSetting;
    }

    @Override
    public String toString() {
        return "Scene{" +
                "sceneName='" + sceneName + '\'' +
                ", relationsList=" + relationsList +
                ", sceneTestConfig=" + sceneTestConfig +
                ", advanceSetting=" + advanceSetting +
                '}';
    }
}
