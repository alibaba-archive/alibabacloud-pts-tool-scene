package com.taobao.amazon.entity.pts.scene;

/**
 * API的出参类
 */
public class Exports {

    /**
     * 出参名
     */
    private String exportName;

    /**
     * 出参来源 请求体(BODY_TEXT)，请求体(BODY_JSON)，请求头(HEADER)，响应状态码(STATUS_CODE)
     */
    private String exportType;

    /**
     * 出参的解析表达式
     */
    private String exportValue;

    /**
     * 第几个匹配项，可以是数字 或 random（ BODY_TEXT情况下才需要count）
     */
    private String count;


    public Exports() {
    }

    public String getExportName() {
        return exportName;
    }

    public void setExportName(String exportName) {
        this.exportName = exportName;
    }

    public String getExportType() {
        return exportType;
    }

    public void setExportType(String exportType) {
        this.exportType = exportType;
    }

    public String getExportValue() {
        return exportValue;
    }

    public void setExportValue(String exportValue) {
        this.exportValue = exportValue;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Exports{" +
                "exportName='" + exportName + '\'' +
                ", exportType='" + exportType + '\'' +
                ", exportValue='" + exportValue + '\'' +
                ", count='" + count + '\'' +
                '}';
    }
}
