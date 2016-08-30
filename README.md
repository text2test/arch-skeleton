# arch-skeleton
集成Spring, Spring MVC, MyBatis, Redis, Dubbox框架模板

## State of develop branch:
Under construction + demo state

## Local environment:
win7 64bit, jdk1.8, idea, maven v3.2.1, ApacheFriends XAMPP Version 1.8.2 with mysql 5.5.36, zookeeper-3.4.8 zkServer.cmd

## FAQ

1. 可能运行错误：

> nested exception is java.lang.UnsupportedClassVersionError: com/argo/freemarker/directives/ExtendsDirective : Unsupported major.minor version 52.0

解决：猜测系因为 com.github.yamingd.argo:argo-freemarker:2.1 这个版本只能运行在 jdk 1.8 上，所以要求 sourceCompatibility = 1.8 使用原指定的版本编译，若改为1.7以下编译通过后运行会报以上错误
