# clause-sdk-java

开源语义理解服务[Clause](https://github.com/chatopera/clause)的 Java 客户端示例程序。


## 示例程序运行

前提是已经部署了 Clause 服务，该示例程序介绍了如何在 Java 应用中，使用 Clause 服务构建聊天机器人，包括创建意图、创建说法、创建词典、引用系统词典、创建槽位、训练机器人和对话等部分。

该示例程序实现的[对话场景介绍](https://github.com/chatopera/clause/wiki/%E7%A4%BA%E4%BE%8B%E7%A8%8B%E5%BA%8F)，熟悉对话场景有助于更好的掌握程序。

```
git clone https://github.com/chatopera/clause-sdk-java.git
cd java-clause
edit src/test/java/com/chatopera/clause/ClauseClientTest.java  # 使用文本编辑器修改 CLAUSE_IP 和 CLAUSE_PORT 的值
mvn -Dtest=ClauseClientTest#testApp test
```

## API 接口详细介绍

参考[链接](https://github.com/chatopera/clause-sdk-java/wiki)。

## 开源许可协议

Copyright (2019) <a href="https://www.chatopera.com/" target="_blank">北京华夏春松科技有限公司</a>

[Apache License Version 2.0](https://github.com/chatopera/clause/blob/master/LICENSE)

[![chatoper banner][co-banner-image]][co-url]

[co-banner-image]: https://user-images.githubusercontent.com/3538629/42383104-da925942-8168-11e8-8195-868d5fcec170.png
[co-url]: https://www.chatopera.com
