package net.dubboclub.reloud.manager;

import java.util.List;

/**
 * Created by bieber on 16/3/31.
 * 分片信息管理
 */
public interface ShardManager {

    /**
     * 添加一个新的分片
     * @param shardName
     * @param clusterId
     * @return
     */
    public boolean addShard(String shardName,Long clusterId);

    /**
     * 启动这个分片
     * @param shardId
     * @return
     */
    public boolean enableShard(Long shardId);

    /**
     * 警用这个分片
     * @param shardId
     * @return
     */
    public boolean disableShard(Long shardId);

    /**
     * 删除这个分片
     * @param shardId
     * @return
     */
    public boolean removeShard(Long shardId);

    /**
     * 将节点绑定到某个分片上
     * @param shardId
     * @param nodeIds
     * @return
     */
    public boolean bindNode(Long shardId,List<Long> nodeIds);

}
