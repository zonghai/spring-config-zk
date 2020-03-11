**zookeeper作为配置中心**
注意： zookeeper必须是3.5.3以后的版本。
1.使用@Value的方式，不能动态的更新
2.使用@ConfigurationProperties这种方式可以动态的更新配置。
3.操作：

    启动zk
    zkServer.sh start
    连接ZK
    /zkCli.sh -server localhost:2181
    创建节点 并赋值
    create /config-zookeeper/ftp/ip "192.168.0.1"
    查询节点值
    get /config-zookeeper/ftp/ip
    更新节点值
    set /config-zookeeper/ftp/ip "292.168.101.111:"
    其他命令 ls delete等
4.测试：

    静态不可修改     localhost:8080/statics  
    动态修改的       localhost:8080/dynamic
    
5.源码分析：

    @ConfigurationProperties注解和zookeeper的监控机制。
