/*
MySQL Data Transfer
Source Host: localhost
Source Database: running_person
Target Host: localhost
Target Database: running_person
Date: 2021/6/6 17:13:06
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for audit_table
-- ----------------------------
DROP TABLE IF EXISTS `audit_table`;
CREATE TABLE `audit_table` (
  `Task_id` int(4) NOT NULL,
  `Manager_id` int(4) NOT NULL,
  `Taskpublicstate` int(1) NOT NULL,
  PRIMARY KEY (`Task_id`),
  KEY `Manager_id` (`Manager_id`),
  CONSTRAINT `audit_table_ibfk_1` FOREIGN KEY (`Task_id`) REFERENCES `task_table` (`Task_id`) ON UPDATE CASCADE,
  CONSTRAINT `audit_table_ibfk_2` FOREIGN KEY (`Manager_id`) REFERENCES `manager_table` (`Manager_id`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for deal_table
-- ----------------------------
DROP TABLE IF EXISTS `deal_table`;
CREATE TABLE `deal_table` (
  `Task_id` int(4) NOT NULL,
  `Runner_id` int(4) NOT NULL,
  PRIMARY KEY (`Task_id`),
  KEY `Runner_id` (`Runner_id`),
  CONSTRAINT `deal_table_ibfk_1` FOREIGN KEY (`Task_id`) REFERENCES `task_table` (`Task_id`) ON UPDATE CASCADE,
  CONSTRAINT `deal_table_ibfk_2` FOREIGN KEY (`Runner_id`) REFERENCES `runner_table` (`Runner_id`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for manager_table
-- ----------------------------
DROP TABLE IF EXISTS `manager_table`;
CREATE TABLE `manager_table` (
  `Manager_id` int(4) NOT NULL AUTO_INCREMENT,
  `Username` char(9) NOT NULL,
  `Useraccount` int(8) NOT NULL,
  `Password` char(6) NOT NULL,
  `Contact` char(11) NOT NULL,
  PRIMARY KEY (`Manager_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for publisher_table
-- ----------------------------
DROP TABLE IF EXISTS `publisher_table`;
CREATE TABLE `publisher_table` (
  `Publisher_id` int(4) NOT NULL AUTO_INCREMENT,
  `Username` char(9) NOT NULL,
  `Useraccount` int(8) NOT NULL,
  `Password` char(6) NOT NULL,
  `Contact` char(11) NOT NULL,
  PRIMARY KEY (`Publisher_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for runner_table
-- ----------------------------
DROP TABLE IF EXISTS `runner_table`;
CREATE TABLE `runner_table` (
  `Runner_id` int(4) NOT NULL AUTO_INCREMENT,
  `Username` char(9) NOT NULL,
  `Useraccount` int(8) NOT NULL,
  `Password` char(6) NOT NULL,
  `Contact` char(11) NOT NULL,
  PRIMARY KEY (`Runner_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for task_table
-- ----------------------------
DROP TABLE IF EXISTS `task_table`;
CREATE TABLE `task_table` (
  `Task_id` int(4) NOT NULL AUTO_INCREMENT,
  `Taskprofile` varchar(20) NOT NULL,
  `Taskcontent` varchar(50) NOT NULL,
  `Taskmoney` float(3,0) NOT NULL,
  `Taskstate` int(1) NOT NULL,
  `Publisher_id` int(4) NOT NULL,
  PRIMARY KEY (`Task_id`),
  KEY `Publisher_id` (`Publisher_id`),
  CONSTRAINT `task_table_ibfk_1` FOREIGN KEY (`Publisher_id`) REFERENCES `publisher_table` (`Publisher_id`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records 
-- ----------------------------
INSERT INTO `audit_table` VALUES ('1', '1', '2');
INSERT INTO `audit_table` VALUES ('2', '1', '1');
INSERT INTO `deal_table` VALUES ('2', '1');
INSERT INTO `manager_table` VALUES ('1', '二题', '54678', '2135', 'dfa');
INSERT INTO `manager_table` VALUES ('2', '以后', '546', '8795', 'dfa');
INSERT INTO `publisher_table` VALUES ('1', '设置', '654321', '321', 'asd');
INSERT INTO `publisher_table` VALUES ('2', '他就', '456654', '111', 'asd');
INSERT INTO `publisher_table` VALUES ('3', '按时', '123456', '123', 'asd');
INSERT INTO `runner_table` VALUES ('1', '啥地方', '4561', '234', 'wer');
INSERT INTO `runner_table` VALUES ('2', '第三方', '5467', '654', 'wer');
INSERT INTO `task_table` VALUES ('1', '啊啊啊', '是是是', '5', '1', '3');
INSERT INTO `task_table` VALUES ('2', '哈健康', 'asdf', '2', '2', '1');
