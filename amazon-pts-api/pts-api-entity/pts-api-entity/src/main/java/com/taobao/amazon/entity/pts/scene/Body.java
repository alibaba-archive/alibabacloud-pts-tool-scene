package com.taobao.amazon.entity.pts.scene;

/**
 * API的请求body
 */
public class Body {

    /**
     * body 类型，默认 application/x-www-form-urlencoded
     */
    private String contentType;

    /**
     * body 的实际内容 形式 {"key1":"value2","key2":"value2"}
     */
    private String bodyValue;


    public Body() {
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getBodyValue() {
        return bodyValue;
    }

    public void setBodyValue(String bodyValue) {
        this.bodyValue = bodyValue;
    }

    @Override
    public String toString() {
        return "Body{" +
                "contentType='" + contentType + '\'' +
                ", bodyValue='" + bodyValue + '\'' +
                '}';
    }
}
