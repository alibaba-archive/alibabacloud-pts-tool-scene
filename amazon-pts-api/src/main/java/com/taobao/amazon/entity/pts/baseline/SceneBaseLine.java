package com.taobao.amazon.entity.pts.baseline;

/**
 * 场景基线数据
 */
public class SceneBaseLine {

    /**
     * 平均TPS
     */
    private Double avgTps;

    /**
     * 平均RT
     */
    private Double avgRt;

    /**
     * 90分位RT
     */
    private Double seg90Rt;

    /**
     * 99分位RT
     */
    private Double seg99Rt;

    /**
     * 请求成功率
     */
    private Double successRateReq;

    /**
     * 业务成功率
     */
    private Double successRateBiz;

    /**
     * 请求失败次数
     */
    private Long failCountReq;

    /**
     * 业务失败次数
     */
    private Long failCountBiz;


    public SceneBaseLine() {
    }

    public Double getAvgTps() {
        return avgTps;
    }

    public void setAvgTps(Double avgTps) {
        this.avgTps = avgTps;
    }

    public Double getAvgRt() {
        return avgRt;
    }

    public void setAvgRt(Double avgRt) {
        this.avgRt = avgRt;
    }

    public Double getSeg90Rt() {
        return seg90Rt;
    }

    public void setSeg90Rt(Double seg90Rt) {
        this.seg90Rt = seg90Rt;
    }

    public Double getSeg99Rt() {
        return seg99Rt;
    }

    public void setSeg99Rt(Double seg99Rt) {
        this.seg99Rt = seg99Rt;
    }

    public Double getSuccessRateReq() {
        return successRateReq;
    }

    public void setSuccessRateReq(Double successRateReq) {
        this.successRateReq = successRateReq;
    }

    public Double getSuccessRateBiz() {
        return successRateBiz;
    }

    public void setSuccessRateBiz(Double successRateBiz) {
        this.successRateBiz = successRateBiz;
    }

    public Long getFailCountReq() {
        return failCountReq;
    }

    public void setFailCountReq(Long failCountReq) {
        this.failCountReq = failCountReq;
    }

    public Long getFailCountBiz() {
        return failCountBiz;
    }

    public void setFailCountBiz(Long failCountBiz) {
        this.failCountBiz = failCountBiz;
    }

    @Override
    public String toString() {
        return "SceneBaseLine{" +
                "avgTps=" + avgTps +
                ", avgRt=" + avgRt +
                ", seg90Rt=" + seg90Rt +
                ", seg99Rt=" + seg99Rt +
                ", successRateReq=" + successRateReq +
                ", successRateBiz=" + successRateBiz +
                ", failCountReq=" + failCountReq +
                ", failCountBiz=" + failCountBiz +
                '}';
    }
}
