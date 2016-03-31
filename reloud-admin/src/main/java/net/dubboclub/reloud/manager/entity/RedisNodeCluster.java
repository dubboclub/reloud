package net.dubboclub.reloud.manager.entity;

import java.util.List;

/**
 * Created by bieber on 16/3/31.
 */
public class RedisNodeCluster {


    //集群节点名称
    private String clusterName;

    //集群包含的分片
    private List<RedisNodeShared> sharedList;

    //集群的状态
    private ClusterStatus clusterStatus;

    public ClusterStatus getClusterStatus() {
        return clusterStatus;
    }

    public void setClusterStatus(ClusterStatus clusterStatus) {
        this.clusterStatus = clusterStatus;
    }

    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public List<RedisNodeShared> getSharedList() {
        return sharedList;
    }

    public void setSharedList(List<RedisNodeShared> sharedList) {
        this.sharedList = sharedList;
    }

    static enum ClusterStatus{
        ENABLE,DISABLE;
    }
}
