> SpringCloud结构

![add image](https://github.com/wds--moon/cloud/raw/master/screenshots/image-20200924170754179.png)

>配置文件全部放在github -->https://github.com/wds--moon/spring-cloud-config.git


>本地配置hosts文件

```bash
127.0.0.1       eureke7001.com
127.0.0.1       eureke7002.com
127.0.0.1       eureke7000.com
127.0.0.1       www.moon.com
```

>访问地址

| 说明         | 请求地址                                                     |
| ------------ | ------------------------------------------------------------ |
| 服务请求调用 | http://www.moon.com/api/data/dept/dept/get/8 **api/data**是配置的默认root地址,**dept**是服务地址,**dept/get/8**业务地址 |

>数据库脚本(数据库分别为db1,db2,db3)数据一致

```sql
SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for dept
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept` (
  `deptNo` bigint NOT NULL AUTO_INCREMENT,
  `dbSource` varchar(100) DEFAULT '',
  `name` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`deptNo`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COMMENT='员工表';

-- ----------------------------
-- Records of dept
-- ----------------------------
INSERT INTO `dept` VALUES ('6', 'db1', '李杰');
INSERT INTO `dept` VALUES ('7', 'db1', '万物');
INSERT INTO `dept` VALUES ('8', 'db1', '李四');
INSERT INTO `dept` VALUES ('9', 'db1', '大魔王');
```

