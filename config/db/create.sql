create database test DEFAULT character set utf8 COLLATE utf8_general_ci;

DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `username` varchar(50) NOT NULL COMMENT '用户名',
  `age` int(11) NOT NULL COMMENT '年龄',
  `ctm` datetime NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `test`.`tb_user` (`username`, `age`, `ctm`) VALUES('张三', '18', NOW()) ;
INSERT INTO `test`.`tb_user` (`username`, `age`, `ctm`) VALUES('李四', '20', NOW()) ;
INSERT INTO `test`.`tb_user` (`username`, `age`, `ctm`) VALUES('王五', '19', NOW()) ;