package com.taobao.api.entity.pts.scene;

/**
 * 全局自定义参数
 */
public class GlobalParameter {

    /**
     * 参数名
     */
    private String paramName;

    /**
     * 全局参数值，不可参数化
     */
    private String paramValue;


    public GlobalParameter() {
    }

    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    public String getParamValue() {
        return paramValue;
    }

    public void setParamValue(String paramValue) {
        this.paramValue = paramValue;
    }

    @Override
    public String toString() {
        return "GlobalParameter{" +
                "paramName='" + paramName + '\'' +
                ", paramValue='" + paramValue + '\'' +
                '}';
    }
}
