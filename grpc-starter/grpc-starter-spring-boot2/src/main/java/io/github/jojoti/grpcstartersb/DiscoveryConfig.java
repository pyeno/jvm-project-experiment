package io.github.jojoti.grpcstartersb;

import java.util.List;

/**
 * @author JoJo Wang
 * @link github.com/jojoti
 */
public class DiscoveryConfig {
    private String vip = null;
    private Dns dns = null;
    private Etcd etcd = null;
    private Consul consul = null;

    public Consul getConsul() {
        return consul;
    }

    public void setConsul(Consul consul) {
        this.consul = consul;
    }

    public Etcd getEtcd() {
        return etcd;
    }

    public void setEtcd(Etcd etcd) {
        this.etcd = etcd;
    }

    public String getVip() {
        return vip;
    }

    public void setVip(String vip) {
        this.vip = vip;
    }

    public Dns getDns() {
        return dns;
    }

    public void setDns(Dns dns) {
        this.dns = dns;
    }

    public static final class Dns {
        // 后续还可以配置 dns 查询 ttl 等
        private List<String> ns = null;

        public List<String> getNs() {
            return ns;
        }

        public void setNs(List<String> ns) {
            this.ns = ns;
        }
    }

    public static final class Etcd {
        private List<String> endpoints = null;

        public List<String> getEndpoints() {
            return endpoints;
        }

        public void setEndpoints(List<String> endpoints) {
            this.endpoints = endpoints;
        }
    }

    public static final class Consul {
        private String agent = null;

        public String getAgent() {
            return agent;
        }

        public void setAgent(String agent) {
            this.agent = agent;
        }
    }

}


