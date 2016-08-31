# arch-skeleton
集成Spring, Spring MVC, MyBatis, Redis, Dubbox框架模板

## State of develop branch:
Under construction + demo state

## Local environment:
win7 64bit, jdk1.8, idea, maven v3.2.1, ApacheFriends XAMPP Version 1.8.2 with mysql 5.5.36, zookeeper-3.4.8 zkServer.cmd

## Building stuff:

1. Dubbox dependency

  把编译好的 dubbo-2.8.4.jar 复制到 /lib/ 下

2. dev-tools project: MyBatis Generator(MBG)

  在未增强 dev-tools/build.gradle （见 [mingt/arch-skeleton@eeb3f68](https://github.com/mingt/arch-skeleton/commit/eeb3f683fae3950e3fff5836ffbba09049841ba1) ）之前，首先执行 :dev-tools:jar 任务生成 dev-tools-1.0-SNAPSHOT.jar , 再手动复制到 /lib/dev-tools-1.0.jar，之后再执行 mybatisGenerate 任务生成各种 mapper & model entity 等

## FAQ

1. 可能运行错误：

> nested exception is java.lang.UnsupportedClassVersionError: com/argo/freemarker/directives/ExtendsDirective : Unsupported major.minor version 52.0

解决：猜测系因为 com.github.yamingd.argo:argo-freemarker:2.1 这个版本只能运行在 jdk 1.8 上，所以要求 sourceCompatibility = 1.8 使用原指定的版本编译，若改为1.7以下编译通过后运行会报以上错误
