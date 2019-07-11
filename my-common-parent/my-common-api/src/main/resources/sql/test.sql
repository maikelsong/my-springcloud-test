DROP DATABASE IF EXISTS "user" ;
CREATE TABLE `user` (
  `id` INT(11) DEFAULT NULL,
  `name` VARCHAR(255) DEFAULT NULL,
  `age` INT(11) DEFAULT NULL
) ENGINE=INNODB DEFAULT CHARSET=utf8;
INSERT INTO `user` VALUES ('1', '张三', '22'), ('2', '李四', '23')，('3', '王五', '22'), ('4', '赵六', '23');
 