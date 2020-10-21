学习笔记

1.Java 是一种面向对象、静态类型、编译执行，有 VM/GC 和运行时、跨平台的高级语言。

2.类的生命周期
1. 加载（Loading）：找 Class 文件
2. 验证（Verification）：验证格式、依赖
3. 准备（Preparation）：静态字段、方法表
4. 解析（Resolution）：符号解析为引用
5. 初始化（Initialization）：构造器、静态变量赋值、静态代码块
6. 使用（Using）
7. 卸载（Unloading）

3.类加载
1. 启动类加载器（BootstrapClassLoader）
2. 扩展类加载器（ExtClassLoader）
3. 应用类加载器（AppClassLoader）

4.启动参数
-Xmx, 指定最大堆内存。
-Xms, 指定堆内存空间的初始大小。
-Xmn, 等价于 -XX:NewSize，新生代大小
-XX：MaxPermSize=size, 永久代最大大小
-XX：MaxMetaspaceSize=size, 元数据区最大大小
-XX：MaxDirectMemorySize=size，系统可以使用的最大堆外内存，这个参
数跟 -Dsun.nio.MaxDirectMemorySize 效果相同。
-Xss, 设置每个线程栈的字节数。

5.命令行工具
1. jps/jinfo 查看 java 进程
2. jstat 查看 JVM 内部 gc 相关信息
3. jmap 查看 heap 或类占用空间统计
4. jstack 查看线程信息
5. jcmd 执行 JVM 相关分析命令（整合命令）
6.jrunscript/jjs 执行 js 命令

6.图形化工具
1. jsonsole
2. jvisualvm
3. visualGC
4. jmc
