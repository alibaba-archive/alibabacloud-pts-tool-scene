package com.taobao.amazon.entity.pts.scene;

/**
 * 检查点
 */
public class CheckPoint {

    /**
     * 检查对象 type=HEADER 时，表示header中的字段，type=EXPORTED_PARAM ，表示出参名
     */
    private String checkPoint;

    /**
     * 检查点类型 响应body(BODY_TEXT)，响应header(HEADER)， 响应状态码(STATUS_CODE) ，出参（EXPORTED_PARAM）
     */
    private String checkType;

    /**
     * 检查条件 CheckPointOperator 中
     */
    private String operator;

    /**
     * 检查内容，即期望值
     */
    private String expectValue;


    public CheckPoint() {
    }

    public String getCheckPoint() {
        return checkPoint;
    }

    public void setCheckPoint(String checkPoint) {
        this.checkPoint = checkPoint;
    }

    public String getCheckType() {
        return checkType;
    }

    public void setCheckType(String checkType) {
        this.checkType = checkType;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getExpectValue() {
        return expectValue;
    }

    public void setExpectValue(String expectValue) {
        this.expectValue = expectValue;
    }

    @Override
    public String toString() {
        return "CheckPoint{" +
                "checkPoint='" + checkPoint + '\'' +
                ", checkType='" + checkType + '\'' +
                ", operator='" + operator + '\'' +
                ", expectValue='" + expectValue + '\'' +
                '}';
    }
}
