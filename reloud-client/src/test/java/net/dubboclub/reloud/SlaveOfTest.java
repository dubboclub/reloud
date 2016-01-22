package net.dubboclub.reloud;

import org.junit.Test;
import redis.clients.jedis.Jedis;

/**
 * @date: 2016/1/22.
 * @author:bieber.
 * @project:reloud.
 * @package:net.dubboclub.reloud.
 * @version:1.0.0
 * @fix:
 * @description: 描述功能
 */
public class SlaveOfTest {

   /* @Test
    public void createMaster(){
        Jedis jedis = new Jedis("localhost",6380);
        jedis.slaveofNoOne();
        jedis.quit();
    }

    @Test
    public void createSlave(){
        Jedis jedis = new Jedis("localhost",6379);
        jedis.slaveof("localhost",6380);
        jedis.quit();
    }*/

    @Test
    public void setDataOnMaster(){
        Jedis jedis = new Jedis("localhost",6380);
        jedis.set("hello","hello");
        jedis.quit();
    }

    @Test
    public void setDataOnSlave(){
        Jedis jedis = new Jedis("localhost",6379);
        jedis.set("hello1","hello1");
        jedis.quit();
    }

    @Test
    public void getDataFromMaster(){
        Jedis jedis = new Jedis("localhost",6380);
        System.out.println(jedis.get("hello"));
        jedis.quit();
    }

    @Test
    public void getDataFromSlave(){
        Jedis jedis = new Jedis("localhost",6379);
        System.out.println(jedis.get("hello"));
        jedis.quit();
    }
}
