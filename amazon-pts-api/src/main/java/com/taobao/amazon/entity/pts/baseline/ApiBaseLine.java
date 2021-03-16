package com.taobao.amazon.entity.pts.baseline;

/**
 * API基线数据
 */
public class ApiBaseLine extends SceneBaseLine {

    /**
     * Api的Id
     */
    private Long id;

    /**
     * Api名称
     */
    private String apiName;

    /**
     * 最大RT
     */
    private Integer maxRt;

    /**
     * 最小RT
     */
    private Integer minRt;


    public ApiBaseLine() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public Integer getMaxRt() {
        return maxRt;
    }

    public void setMaxRt(Integer maxRt) {
        this.maxRt = maxRt;
    }

    public Integer getMinRt() {
        return minRt;
    }

    public void setMinRt(Integer minRt) {
        this.minRt = minRt;
    }

    @Override
    public String toString() {
        return "ApiBaseLine{" +
                "id=" + id +
                ", ApiName='" + apiName + '\'' +
                ", maxRt=" + maxRt +
                ", minRt=" + minRt +
                '}';
    }
}
