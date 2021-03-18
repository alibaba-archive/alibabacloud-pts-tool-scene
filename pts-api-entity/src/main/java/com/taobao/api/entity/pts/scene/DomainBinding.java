package com.taobao.api.entity.pts.scene;

import java.util.List;

/**
 * 域名与IP绑定关系
 */
public class DomainBinding {

    /**
     * 域名
     */
    private String domain;

    /**
     * 对应的IP
     */
    private List<String> ips;


    public DomainBinding() {
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public List<String> getIps() {
        return ips;
    }

    public void setIps(List<String> ips) {
        this.ips = ips;
    }

    @Override
    public String toString() {
        return "DomainBinding{" +
                "domain='" + domain + '\'' +
                ", ips=" + ips +
                '}';
    }
}
