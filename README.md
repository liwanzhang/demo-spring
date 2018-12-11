# demo-spring
Spring功能使用示例

## Maven依赖
* spring-context:4.3.21.RELEASE
```
  spring-aop
  spring-beans
  spring-context
  spring-core
  spring-expression
```
* spring-webmvc:4.3.21.RELEASE

```
  spring-aop
  spring-beans
  spring-context
  spring-core
  spring-expression
  spring-web
  spring-webmvc
```

## demo-spring-log
### slf4j集成log4j2 最小依赖（the minimal dependencies).
```
        <dependency>
            <groupId>org.slf4j</groupId>
            <artifactId>slf4j-api</artifactId>
            <version>1.7.25</version>
        </dependency>
        <dependency>
            <groupId>org.slf4j</groupId>
            <artifactId>jcl-over-slf4j</artifactId>
            <version>1.7.25</version>
            <scope>runtime</scope>
        </dependency>
        <dependency>
            <groupId>org.apache.logging.log4j</groupId>
            <artifactId>log4j-core</artifactId>
            <version>2.8.2</version>
        </dependency>
        <dependency>
            <groupId>org.apache.logging.log4j</groupId>
            <artifactId>log4j-slf4j-impl</artifactId>
            <version>2.8.2</version>
        </dependency>
```