package org.domeos.framework.api.model.global;

import org.apache.commons.lang3.StringUtils;
import org.domeos.util.CommonUtil;

/**
 * Created by feiliu206363 on 2015/12/4.
 */

public class CiCluster {

    private int id;
    private String namespace;
    private String host;
    private int clusterId;
    private String clusterName;
    private long createTime;
    private long lastUpdate;

    public CiCluster() {
    }

    public CiCluster(int id, String namespace, String host, int clusterId, String clusterName, long createTime, long lastUpdate) {
        this.id = id;
        this.namespace = namespace;
        this.host = host;
        this.clusterId = clusterId;
        this.clusterName = clusterName;
        this.createTime = createTime;
        this.lastUpdate = lastUpdate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getClusterId() {
        return clusterId;
    }

    public void setClusterId(int clusterId) {
        this.clusterId = clusterId;
    }

    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public long getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(long lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String checkLegality() {

        if (StringUtils.isBlank(namespace)) {
            return "namespace is null";
        } else if (StringUtils.isBlank(host)) {
            return "host is null";
        } else if (StringUtils.isBlank(clusterName)) {
            return "cluster name is null";
        }
        // for k8s, we don't need http or https
        host = CommonUtil.domainUrl(host);
        return null;
    }
}
