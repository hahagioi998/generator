##	generator(代码自动生成工具)
 自动化代码生成
###	1.项目介绍
generator是一个自动化代码生成工具，使用Maven进行项目管理。
    生成generatorConfig.xml文件
    自动运行MybatisGenerator
    自动生成service
    自动生成serviceMock
    自动生成serviceImpl

### 2.操作步骤
1、修改generator.properties中的数据库信息（密码使用AESUtil类生成）
2、修改Generator类的MODULE、DATABASE、TABLE_PREFIX、PACKAGE_NAME、LAST_INSERT_ID_TABLES属性值
    a.MODULE:项目名称
    b.DATABASE:数据名称
    c.TABLE_PREFIX数据库表名统一前缀
    d.PACKAGE_NAME:包名
    e.LAST_INSERT_ID_TABLES:需要insert后返回主键的表配置
3、创建(自定义包名).rpc.api
                       .service.impl    
