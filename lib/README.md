## /lib/ 依赖:

见 build.gradle 里面的 file('../lib/dev-tools-1.0.jar') 等：

1. Dubbox dependency

  把编译好的 dubbo-2.8.4.jar 复制到 /lib/ 下

2. dev-tools project: MyBatis Generator(MBG)

  在未增强 dev-tools/build.gradle （见 [mingt/arch-skeleton@eeb3f68](https://github.com/mingt/arch-skeleton/commit/eeb3f683fae3950e3fff5836ffbba09049841ba1) ）之前，首先执行 :dev-tools:jar 任务生成 dev-tools-1.0-SNAPSHOT.jar , 再手动复制到 /lib/dev-tools-1.0.jar，之后再执行 mybatisGenerate 任务生成各种 mapper & model entity 等
