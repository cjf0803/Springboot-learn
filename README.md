## SpringBoot项目大概分为四层：

（1）DAO层：包括XxxMapper.java(数据库访问接口类)，XxxMapper.xml(数据库链接实现)；（这个命名，有人喜欢用Dao命名，有人喜欢用Mapper，看个人习惯了吧）

（2）Bean层：也叫model层，模型层，entity层，实体层，就是数据库表的映射实体类，存放POJO对象；

（3）Service层：也叫服务层，业务层，包括XxxService.java(业务接口类)，XxxServiceImpl.java（业务实现类）；（可以在service文件夹下新建impl文件放业务实现类，也可以把业务实现类单独放一个文件夹下，更清晰）

（4）Web层：就是Controller层，实现与web前端的交互。
