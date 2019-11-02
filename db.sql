/*
SQLyog Ultimate v10.00 Beta1
MySQL - 5.7.19 : Database - qin_blog
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`qin_blog` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `qin_blog`;

/*Table structure for table `article` */

DROP TABLE IF EXISTS `article`;

CREATE TABLE `article` (
  `id` int(6) NOT NULL AUTO_INCREMENT COMMENT '文章id',
  `title` varchar(80) NOT NULL COMMENT '文章标题',
  `author` varchar(30) NOT NULL COMMENT '作者',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `content` longtext NOT NULL COMMENT '文章内容',
  `tag` int(3) DEFAULT NULL COMMENT '标签',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `article` */

/*Table structure for table `diy` */

DROP TABLE IF EXISTS `diy`;

CREATE TABLE `diy` (
  `key` varchar(50) NOT NULL COMMENT '自定义key',
  `value` longtext NOT NULL COMMENT '自定义value'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `diy` */

/*Table structure for table `role` */

DROP TABLE IF EXISTS `role`;

CREATE TABLE `role` (
  `id` int(2) NOT NULL AUTO_INCREMENT COMMENT '角色id',
  `role_name` varchar(10) NOT NULL COMMENT '角色名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `role` */

insert  into `role`(`id`,`role_name`) values (1,'root'),(2,'author'),(3,'lv3'),(4,'lv2'),(5,'lv1');

/*Table structure for table `say` */

DROP TABLE IF EXISTS `say`;

CREATE TABLE `say` (
  `id` int(8) NOT NULL AUTO_INCREMENT COMMENT '说说id',
  `author` varchar(30) NOT NULL COMMENT '发布人',
  `content` text NOT NULL COMMENT '说说内容',
  `create_time` datetime NOT NULL COMMENT '发布时间',
  `status` int(1) NOT NULL COMMENT '状态. 0:审核  1:发布',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `say` */

/*Table structure for table `tag` */

DROP TABLE IF EXISTS `tag`;

CREATE TABLE `tag` (
  `id` int(3) NOT NULL AUTO_INCREMENT COMMENT '标签id',
  `tag_name` varchar(15) NOT NULL COMMENT '标签名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tag` */

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(6) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `name` varchar(20) NOT NULL COMMENT '用户名',
  `pwd` varchar(30) NOT NULL COMMENT '用户密码',
  `sex` int(1) NOT NULL DEFAULT '1' COMMENT '0:女   1：男',
  `create_time` datetime NOT NULL COMMENT '创建日期',
  `level` int(8) NOT NULL DEFAULT '0' COMMENT '1000：lv1    3500:lv2    10000：lv3',
  `role` int(1) NOT NULL DEFAULT '5' COMMENT '用户角色',
  `email` varchar(30) DEFAULT NULL COMMENT '邮箱',
  `introduce` varchar(200) DEFAULT NULL COMMENT '介绍',
  `homepage` varchar(70) DEFAULT NULL COMMENT '主页信息',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user` */

/*Table structure for table `video` */

DROP TABLE IF EXISTS `video`;

CREATE TABLE `video` (
  `id` int(5) NOT NULL AUTO_INCREMENT COMMENT '视频id',
  `title` varchar(50) NOT NULL COMMENT '视频标题',
  `author` varchar(30) NOT NULL COMMENT '发布者',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `category` int(2) NOT NULL COMMENT '视频分类',
  `url` varchar(500) NOT NULL COMMENT '视频地址',
  `cover` varchar(500) NOT NULL COMMENT '视频封面',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `video` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
