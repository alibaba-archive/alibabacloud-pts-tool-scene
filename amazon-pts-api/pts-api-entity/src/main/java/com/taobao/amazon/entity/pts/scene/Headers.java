package com.taobao.amazon.entity.pts.scene;

/**
 * @function API的请求Header
 */
public class Headers {

    /**
     * 类型
     */
    private Integer headerType;

    /**
     * header参数名
     */
    private String headerName;

    /**
     * 参数对应的值
     */
    private String headerValue;

    public Headers() {
    }

    public Integer getHeaderType() {
        return headerType;
    }

    public void setHeaderType(Integer headerType) {
        this.headerType = headerType;
    }

    public String getHeaderName() {
        return headerName;
    }

    public void setHeaderName(String headerName) {
        this.headerName = headerName;
    }

    public String getHeaderValue() {
        return headerValue;
    }

    public void setHeaderValue(String headerValue) {
        this.headerValue = headerValue;
    }

    @Override
    public String toString() {
        return "Headers{" +
                "headerType=" + headerType +
                ", headerName='" + headerName + '\'' +
                ", headerValue='" + headerValue + '\'' +
                '}';
    }
}
