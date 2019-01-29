
spring-boot-dubbo demo 
编译：
mvn clean compile
打包：
mvn clean package -Dmaven.test.skip=true
运行：
nohup java -jar springboot-dubbo-server-0.0.1-SNAPSHOT >log.file 2>&1 &
访问地址：
http://localhost:9091/sayHello/nieyc