package com.taobao.amazon.entity.pts.scene;

import java.util.List;

/**
 * API结构
 */
public class Api {

    /**
     * API的ID
     */
    private String apiId;

    /**
     * API名
     */
    private String apiName;

    /**
     * 压测URL
     */
    private String url;

    /**
     * 请求方法 在 method 类中
     */
    private String method;

    /**
     * 请求body
     */
    private Body body;

    /**
     * API超时时间，单位秒，默认5s，范围[1-60]
     */
    private Integer timeoutInSecond;

    /**
     * 重定向次数
     */
    private Integer redirectCountLimit;

    /**
     * header
     */
    private List<Header> headerList;

    /**
     * 出参
     */
    private List<Export> exportList;

    /**
     * 检查点
     */
    private List<CheckPoint> checkPointList;


    public Api() {
    }

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Integer getTimeoutInSecond() {
        return timeoutInSecond;
    }

    public void setTimeoutInSecond(Integer timeoutInSecond) {
        this.timeoutInSecond = timeoutInSecond;
    }

    public Integer getRedirectCountLimit() {
        return redirectCountLimit;
    }

    public void setRedirectCountLimit(Integer redirectCountLimit) {
        this.redirectCountLimit = redirectCountLimit;
    }

    public List<Header> getHeaderList() {
        return headerList;
    }

    public void setHeaderList(List<Header> headerList) {
        this.headerList = headerList;
    }

    public String getApiId() {
        return apiId;
    }

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    public List<Export> getExportList() {
        return exportList;
    }

    public void setExportList(List<Export> exportList) {
        this.exportList = exportList;
    }

    public List<CheckPoint> getCheckPointList() {
        return checkPointList;
    }

    public void setCheckPointList(List<CheckPoint> checkPointList) {
        this.checkPointList = checkPointList;
    }

    @Override
    public String toString() {
        return "Api{" +
                "apiId='" + apiId + '\'' +
                ", apiName='" + apiName + '\'' +
                ", url='" + url + '\'' +
                ", method='" + method + '\'' +
                ", body=" + body +
                ", timeoutInSecond=" + timeoutInSecond +
                ", redirectCountLimit=" + redirectCountLimit +
                ", headerList=" + headerList +
                ", exportList=" + exportList +
                ", checkPointList=" + checkPointList +
                '}';
    }
}
