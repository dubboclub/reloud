package net.dubboclub.reloud.manager;

import net.dubboclub.reloud.manager.entity.RedisNode;

import java.util.List;

/**
 * Created by bieber on 16/3/31.
 * 节点管理
 */
public interface NodeManager {

    /**
     * 创建一个新的redis节点
     * @param redisNode
     * @return
     */
    public boolean addNode(RedisNode redisNode);

    /**
     * 启用这个节点
     * @param nodeId
     * @return
     */
    public boolean enableNode(Long nodeId);

    /**
     * 禁用这个节点
     * @param nodeId
     * @return
     */
    public boolean disableNode(Long nodeId);

    /**
     * 删除这个redis节点
     * @param nodeId
     * @return
     */
    public boolean removeNode(Long nodeId);

    /**
     * 查看节点列表
     * @param offset
     * @return
     */
    public List<RedisNode> nodeList(int offset);
}
