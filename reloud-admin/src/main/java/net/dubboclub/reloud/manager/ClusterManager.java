package net.dubboclub.reloud.manager;

import net.dubboclub.reloud.manager.entity.RedisNodeCluster;

import java.util.List;

/**
 * Created by bieber on 16/3/31.
 * 整个集群管理
 */
public interface ClusterManager {

    /**
     * 创建一个集群节点信息
     * @param clusterName
     * @return
     */
    public boolean createCluster(String clusterName);

    /**
     * 激活这个集群
     * @param clusterId
     * @return
     */
    public boolean enableCluster(Long clusterId);

    /**
     * 下线这个集群
     * @param clusterId
     * @return
     */
    public boolean disableCluster(Long clusterId);

    /**
     * 删除这个集群
     * @param clusterId
     * @return
     */
    public boolean removeCluster(Long clusterId);

    /**
     * 查询集群列表
     * @param offset
     * @return
     */
    public List<RedisNodeCluster> clusterList(int offset);

    /**
     * 查看集群明细
     * @param clusterId
     * @return
     */
    public RedisNodeCluster clusterDetails(Long clusterId);


}
