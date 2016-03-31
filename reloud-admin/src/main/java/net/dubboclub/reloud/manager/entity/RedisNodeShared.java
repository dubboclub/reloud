package net.dubboclub.reloud.manager.entity;

import java.util.List;

/**
 * Created by bieber on 16/3/31.
 */
public class RedisNodeShared {

    //分片名称
    private String shardName;

    //分片包含的节点集合
    private List<RedisNode> nodeList;

    //分片状态
    private SharedStatus sharedStatus;

    public SharedStatus getSharedStatus() {
        return sharedStatus;
    }

    public void setSharedStatus(SharedStatus sharedStatus) {
        this.sharedStatus = sharedStatus;
    }

    public String getShardName() {
        return shardName;
    }

    public void setShardName(String shardName) {
        this.shardName = shardName;
    }

    public List<RedisNode> getNodeList() {
        return nodeList;
    }

    public void setNodeList(List<RedisNode> nodeList) {
        this.nodeList = nodeList;
    }

    static enum SharedStatus{
        ENABLE,DISABLE;
    }
}
