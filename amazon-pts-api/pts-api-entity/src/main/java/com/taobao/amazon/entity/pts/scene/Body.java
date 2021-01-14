package com.taobao.amazon.entity.pts.scene;

/**
 * @function API的请求body
 */
public class Body {

    /**
     * body 类型，默认 application/x-www-form-urlencoded
     */
    private String bodyType;

    /**
     * body 的实际内容 形式 {"key1":"value2","key2":"value2"}
     */
    private String bodyValue;


    public Body() {
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
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
                "bodyType='" + bodyType + '\'' +
                ", bodyValue='" + bodyValue + '\'' +
                '}';
    }
}
