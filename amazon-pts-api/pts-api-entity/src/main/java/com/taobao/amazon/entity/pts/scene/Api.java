package com.taobao.amazon.entity.pts.scene;

import java.util.List;

/**
 * @function API结构
 */
public class Api {

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
     * 起始RPS，RPS模式必须配置，并发模式不用配置
     */
    private Integer beginRps;

    /**
     * 最大RPS，RPS模式必须配置，并发模式不用配置
     */
    private Integer maxRps;

    /**
     * 重定向次数
     */
    private Integer redirectCountLimit;

    /**
     * header
     */
    private List<Headers> headerList;

    /**
     * 出参
     */
    private List<Exports> exportsList;

    /**
     * 检查点
     */
    private List<CheckPoints> checkPointsList;


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

    public Integer getBeginRps() {
        return beginRps;
    }

    public void setBeginRps(Integer beginRps) {
        this.beginRps = beginRps;
    }

    public Integer getMaxRps() {
        return maxRps;
    }

    public void setMaxRps(Integer maxRps) {
        this.maxRps = maxRps;
    }

    public Integer getRedirectCountLimit() {
        return redirectCountLimit;
    }

    public void setRedirectCountLimit(Integer redirectCountLimit) {
        this.redirectCountLimit = redirectCountLimit;
    }

    public List<Headers> getHeaderList() {
        return headerList;
    }

    public void setHeaderList(List<Headers> headerList) {
        this.headerList = headerList;
    }

    public List<Exports> getExportsList() {
        return exportsList;
    }

    public void setExportsList(List<Exports> exportsList) {
        this.exportsList = exportsList;
    }

    public List<CheckPoints> getCheckPointsList() {
        return checkPointsList;
    }

    public void setCheckPointsList(List<CheckPoints> checkPointsList) {
        this.checkPointsList = checkPointsList;
    }

    @Override
    public String toString() {
        return "Api{" +
                "apiName='" + apiName + '\'' +
                ", url='" + url + '\'' +
                ", method='" + method + '\'' +
                ", body=" + body +
                ", timeoutInSecond=" + timeoutInSecond +
                ", beginRps=" + beginRps +
                ", maxRps=" + maxRps +
                ", redirectCountLimit=" + redirectCountLimit +
                ", headerList=" + headerList +
                ", exportsList=" + exportsList +
                ", checkPointsList=" + checkPointsList +
                '}';
    }
}
