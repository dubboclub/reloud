package net.dubboclub.reloud.manager.entity;

/**
 * Created by bieber on 16/3/31.
 */
public class RedisNode {

    //节点地址
    private String nodeHost;

    //节点的端口
    private String nodePort;

    //节点分组,为了方便管理
    private String nodeGroup;

    //节点的状态
    private NodeStatus status;

    //检查节点的ping间隔周期
    private long pingInterval;

    //上次ping的时间戳
    private long lastPingTime;

    public long getLastPingTime() {
        return lastPingTime;
    }

    public void setLastPingTime(long lastPingTime) {
        this.lastPingTime = lastPingTime;
    }

    public long getPingInterval() {
        return pingInterval;
    }

    public void setPingInterval(long pingInterval) {
        this.pingInterval = pingInterval;
    }

    public NodeStatus getStatus() {
        return status;
    }

    public void setStatus(NodeStatus status) {
        this.status = status;
    }

    public String getNodeHost() {
        return nodeHost;
    }

    public void setNodeHost(String nodeHost) {
        this.nodeHost = nodeHost;
    }

    public String getNodePort() {
        return nodePort;
    }

    public void setNodePort(String nodePort) {
        this.nodePort = nodePort;
    }

    public String getNodeGroup() {
        return nodeGroup;
    }

    public void setNodeGroup(String nodeGroup) {
        this.nodeGroup = nodeGroup;
    }

    static enum  NodeStatus{
        ENABLE,DISABLE,NET_ERROR;
    }
}
