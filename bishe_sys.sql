# Host: 127.0.0.1  (Version: 5.5.15)
# Date: 2020-04-16 20:29:33
# Generator: MySQL-Front 5.3  (Build 4.269)

/*!40101 SET NAMES gb2312 */;

#
# Structure for table "goods"
#

DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `goodsid` varchar(30) DEFAULT NULL,
  `goodsname` varchar(30) DEFAULT NULL,
  `unit` varchar(20) DEFAULT NULL,
  `price` decimal(5,2) DEFAULT NULL,
  `supliername` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

#
# Data for table "goods"
#

INSERT INTO `goods` VALUES (1,'20200414ama','螺丝','个',2.20,'第一有限公司');

#
# Structure for table "supplier"
#

DROP TABLE IF EXISTS `supplier`;
CREATE TABLE `supplier` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `coname` varchar(255) DEFAULT NULL,
  `cophone` varchar(11) DEFAULT NULL,
  `coaddress` varchar(255) DEFAULT NULL,
  `cocredibility` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;

#
# Data for table "supplier"
#

INSERT INTO `supplier` VALUES (1,'第一有限公司1','13103212342','浙江省杭州市','良好'),(2,'第二有限公司','22222222222','浙江省嘉兴市','优秀'),(3,'第三有限公司','33333333333','浙江省湖州市','及格'),(5,'去问去问我去饿','额外全额完全','恶趣味我去','恶趣味我去'),(6,'的撒旦撒旦','撒大苏打as打算','大苏打sa','sa撒旦a\'s'),(7,'公司111','1111111','11111','11111'),(8,'公司2','232323','2323','3232'),(9,'公司三','4124234','2535235','325235235'),(10,'公司4','5555555','55555','55'),(12,'犬瘟热犬瘟热完全','人犬瘟热未确认请问','让我去让未确认犬瘟热','r\'q\'w\'r\'w\'q');

#
# Structure for table "user"
#

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

#
# Data for table "user"
#

INSERT INTO `user` VALUES (1,'admin','123');
