package com.taobao.api.entity.pts.scene;

/**
 * 链路的并发信息
 */

public class RelationLoadConfig {

    /**
     * 起始并发
     */
    private Integer concurrencyBegin;

    /**
     * 最大并发
     */
    private Integer concurrencyLimit;


    public RelationLoadConfig() {
    }

    public Integer getConcurrencyBegin() {
        return concurrencyBegin;
    }

    public void setConcurrencyBegin(Integer concurrencyBegin) {
        this.concurrencyBegin = concurrencyBegin;
    }

    public Integer getConcurrencyLimit() {
        return concurrencyLimit;
    }

    public void setConcurrencyLimit(Integer concurrencyLimit) {
        this.concurrencyLimit = concurrencyLimit;
    }

    @Override
    public String toString() {
        return "RelationLoadConfig{" +
                "concurrencyBegin=" + concurrencyBegin +
                ", concurrencyLimit=" + concurrencyLimit +
                '}';
    }
}
