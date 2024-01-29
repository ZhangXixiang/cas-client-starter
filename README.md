```
cas校验的springboot-starter

搭配使用只需要在对应的spring-boot项目中@EnableCasClient注解在启动类

yml配置参考：
cas:
#定义服务端login url
server-login-url: https://server.cas.com:8443/cas/login
#casServerUrlPrefix 定义uas服务端开始部分地址
server-url-prefix: https://server.cas.com:8443/cas
client-host-url: http://app2.cas.com:8082

```