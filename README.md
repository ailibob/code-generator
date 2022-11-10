# code-generator
## 背景
在普通的网络传输中需要对模型进行多次 convert, 不同公司、不同项目使用架构不同似乎是一种不可能的事情。但有没有一种可能,当前项目比较持久或是项目刚开始阶段,是不是可以使用一套简单的模型转化, 可以以代码自动生成的方式去提升我们的效率。

## 内容
1. 基于 freeMark 的功能生成代码模版 
2. 根据 PO 自动生成 TO、Repository、Manager、Service、Facade、Convert 分应用层、领域层
3. 自动生成视图层 Controller、Action及相应的 Request、Response
4. 可以根据指定属性生成相应的查询条件
5. TO、Request、Response 属于模型对象, 其他Repository、Manager 属于业务功能，可声明不生成对应的业务功能
6. 正向的一对多模型支持组装关系自动生成,但不支持关联模型的业务功能生成,如若需要,则在相关 PO 模型上添加注解
7. **目前功能只适配 terminus 功能, 若其他同学希望使用 freeMark 写自己的 code generate 可参考 example**

## 使用案例
官方: http://freemarker.foofun.cn/