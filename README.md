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
    @ConfigurationProperties 通过实现beanPostProcessor的方式再对象初始化的时候进程获取有该注解的类；
    通过ConfigurationPropertiesRebinder进行与对象绑定，同事还实现了 ApplicationListener<EnvironmentChangeEvent>
    通过实现onApplicationEvent该方法对时间进行监听，实现的动态配置。销毁需要rebind的对象然后重新创建。
    配置部分 
    ZookeeperConfigAutoConfiguration 
    ZookeeperConfigBootstrapConfiguration
    ApplicationContextInitializer
    ZookeeperPropertySourceLocator 进行解析zookeeper上的配置（创建连接并获取数据，存储数据）。 
    watcher 监测到zookeeper变化通知后 发布 RefreshEvent，RefreshEventListener监听 RefreshEvent 然后发布 EnvironmentChangeEvent 事件，
    ConfigurationPropertiesRebinder监听了该事件；销毁需要rebind的对象然后重新创建。
    
    通过 BootstrapConfiguration 进行加载的 加载的过程涉及到spring-factories的加载机制。
    
    
    知识点：ApplicationContextInitializer  ApplicationListener spring boot 配置加载-factoryloader properties赋值。
    
    
    
    
    
