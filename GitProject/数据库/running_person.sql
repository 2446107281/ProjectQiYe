/*
MySQL Data Transfer
Source Host: localhost
Source Database: running_person
Target Host: localhost
Target Database: running_person
Date: 2021/6/14 15:13:25
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for audit_table
-- ----------------------------
DROP TABLE IF EXISTS `audit_table`;
CREATE TABLE `audit_table` (
  `task_id` int(4) NOT NULL,
  `manager_id` int(4) NOT NULL,
  `audit_id` int(4) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`audit_id`),
  KEY `Manager_id` (`manager_id`),
  CONSTRAINT `audit_table_ibfk_2` FOREIGN KEY (`manager_id`) REFERENCES `manager_table` (`manager_id`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for deal_table
-- ----------------------------
DROP TABLE IF EXISTS `deal_table`;
CREATE TABLE `deal_table` (
  `task_id` int(4) NOT NULL,
  `runner_id` int(4) NOT NULL,
  `deal_id` int(4) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`deal_id`),
  KEY `runner_id` (`runner_id`),
  KEY `task_id` (`task_id`),
  CONSTRAINT `deal_table_ibfk_2` FOREIGN KEY (`runner_id`) REFERENCES `runner_table` (`runner_id`) ON UPDATE CASCADE,
  CONSTRAINT `deal_table_ibfk_3` FOREIGN KEY (`task_id`) REFERENCES `task_table` (`task_id`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for major
-- ----------------------------
DROP TABLE IF EXISTS `major`;
CREATE TABLE `major` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `majorName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for manager_table
-- ----------------------------
DROP TABLE IF EXISTS `manager_table`;
CREATE TABLE `manager_table` (
  `manager_id` int(4) NOT NULL AUTO_INCREMENT,
  `publicName` char(18) NOT NULL,
  `userName` int(16) NOT NULL,
  `password` char(12) NOT NULL,
  `contact` char(22) NOT NULL,
  PRIMARY KEY (`manager_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for publisher_table
-- ----------------------------
DROP TABLE IF EXISTS `publisher_table`;
CREATE TABLE `publisher_table` (
  `publisher_id` int(4) NOT NULL AUTO_INCREMENT,
  `publicName` char(18) NOT NULL,
  `userName` int(16) NOT NULL,
  `password` char(12) NOT NULL,
  `contact` char(22) NOT NULL,
  PRIMARY KEY (`publisher_id`),
  KEY `publicName` (`publicName`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for runner_table
-- ----------------------------
DROP TABLE IF EXISTS `runner_table`;
CREATE TABLE `runner_table` (
  `runner_id` int(4) NOT NULL AUTO_INCREMENT,
  `publicName` char(18) NOT NULL,
  `userName` int(16) NOT NULL,
  `password` char(12) NOT NULL,
  `contact` char(22) NOT NULL,
  PRIMARY KEY (`runner_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for task_table
-- ----------------------------
DROP TABLE IF EXISTS `task_table`;
CREATE TABLE `task_table` (
  `task_id` int(4) NOT NULL AUTO_INCREMENT,
  `taskProfile` varchar(20) NOT NULL DEFAULT '',
  `taskContent` varchar(50) NOT NULL DEFAULT '',
  `taskCost` float(3,0) NOT NULL,
  `taskState` int(1) NOT NULL,
  `publisher_id` int(4) NOT NULL,
  `taskPublicState` int(1) DEFAULT NULL,
  PRIMARY KEY (`task_id`),
  KEY `publisher_id` (`publisher_id`),
  CONSTRAINT `task_table_ibfk_1` FOREIGN KEY (`publisher_id`) REFERENCES `publisher_table` (`publisher_id`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `hobby` varchar(255) DEFAULT NULL,
  `intro` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `sex` int(11) DEFAULT NULL,
  `major` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_k2byfngp0bhac4aqthv7ot3vg` (`major`),
  CONSTRAINT `FK_k2byfngp0bhac4aqthv7ot3vg` FOREIGN KEY (`major`) REFERENCES `major` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records 
-- ----------------------------
INSERT INTO `audit_table` VALUES ('1', '1', '1');
INSERT INTO `audit_table` VALUES ('2', '1', '2');
INSERT INTO `audit_table` VALUES ('3', '2', '3');
INSERT INTO `deal_table` VALUES ('2', '1', '1');
INSERT INTO `deal_table` VALUES ('3', '1', '2');
INSERT INTO `manager_table` VALUES ('1', '二题', '54678', '2135', 'dfa');
INSERT INTO `manager_table` VALUES ('2', '以后', '546', '8795', 'dfa');
INSERT INTO `publisher_table` VALUES ('1', '设置', '654321', '321', 'asd');
INSERT INTO `publisher_table` VALUES ('2', '他就', '456654', '111', 'asd');
INSERT INTO `publisher_table` VALUES ('3', '按时', '123456', '123', 'asd');
INSERT INTO `publisher_table` VALUES ('4', '设置', '654321', '321', 'asd');
INSERT INTO `runner_table` VALUES ('1', '啥地方', '4561', '234', 'wer');
INSERT INTO `runner_table` VALUES ('2', '第三方', '5467', '654', 'wer');
INSERT INTO `task_table` VALUES ('1', '啊啊啊', '是是是', '5', '1', '3', '1');
INSERT INTO `task_table` VALUES ('2', '哈健康', 'asdf', '2', '2', '1', '1');
INSERT INTO `task_table` VALUES ('3', '拿快递', '到西区取快递', '5', '1', '1', '1');
INSERT INTO `task_table` VALUES ('4', '拿快递', '到东区取快递', '5', '1', '1', '2');
INSERT INTO `task_table` VALUES ('5', '购物', '到商业街购买', '8', '1', '1', '2');

-- ----------------------------
-- Trigger structure for deal_insert
-- ----------------------------
DELIMITER ;;
CREATE TRIGGER `deal_insert` AFTER INSERT ON `deal_table` FOR EACH ROW update task_table set taskState=2 where task_id=(select task_id from inserted);
DELIMITER ;
