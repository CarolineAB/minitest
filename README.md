# minitest

运行并测试的步骤:

1.将项目克隆到本地，进入项目目录，并运行命令窗口(可在文件夹目录路径输入"cmd")

命令窗口输入：“mvn package”,打包成jar包，可以查看到target目录下生成的jar包 EnNinePalaceInputMethod-0.0.1-SNAPSHOT.jar


2.命令窗口进入target 目录 可直接输入命令"cd target"进入

命令窗口输入 "java -jar EnNinePalaceInputMethod-0.0.1-SNAPSHOT.jar"，运行该项目

![命令](https://github.com/CarolineAB/currencyConverter/blob/master/images/%E4%B9%9D%E8%BC%B8.jpg)

![运行](https://github.com/CarolineAB/currencyConverter/blob/master/images/1581680657(1).png)
运行结果输出如下图

![结果输出](https://github.com/CarolineAB/currencyConverter/blob/master/images/1581680281.jpg)

异常说明:

1.非法数据，提示 “输入数据中，存在非法数据！请输入0-99之间的数据”

2.未输入/操作频繁 提示“请输入数字！”



单元测试结果如下图：

![junit 测试结果](https://github.com/CarolineAB/currencyConverter/blob/master/images/1581680339(1).jpg)
