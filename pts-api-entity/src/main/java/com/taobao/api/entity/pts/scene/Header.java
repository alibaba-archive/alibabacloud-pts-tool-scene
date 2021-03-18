package com.taobao.api.entity.pts.scene;

/**
 * API的请求Header
 */
public class Header {

    /**
     * header参数名
     */
    private String headerName;

    /**
     * 参数对应的值
     */
    private String headerValue;


    public Header() {
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
    public int hashCode() {
        return super.hashCode();
    }
}
