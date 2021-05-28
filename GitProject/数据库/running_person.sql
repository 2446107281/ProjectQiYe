/*
MySQL Data Transfer
Source Host: localhost
Source Database: running_person
Target Host: localhost
Target Database: running_person
Date: 2021/5/28 11:32:47
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
  KEY `2` (`Manager_id`),
  CONSTRAINT `1` FOREIGN KEY (`Task_id`) REFERENCES `task_table` (`Task_id`) ON UPDATE CASCADE,
  CONSTRAINT `2` FOREIGN KEY (`Manager_id`) REFERENCES `manager_table` (`Manager_id`) ON UPDATE CASCADE
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
  CONSTRAINT `deal_table_ibfk_2` FOREIGN KEY (`Runner_id`) REFERENCES `runner_table` (`Runner_id`) ON UPDATE CASCADE,
  CONSTRAINT `deal_table_ibfk_3` FOREIGN KEY (`Task_id`) REFERENCES `task_table` (`Task_id`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for manager_table
-- ----------------------------
DROP TABLE IF EXISTS `manager_table`;
CREATE TABLE `manager_table` (
  `Manager_id` int(4) NOT NULL,
  `Username` char(9) NOT NULL,
  `Useraccount` int(8) NOT NULL,
  `Password` char(6) NOT NULL,
  `Contact` char(11) NOT NULL,
  PRIMARY KEY (`Manager_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for publisher_table
-- ----------------------------
DROP TABLE IF EXISTS `publisher_table`;
CREATE TABLE `publisher_table` (
  `Publisher_id` int(4) NOT NULL,
  `Username` char(9) NOT NULL,
  `Useraccount` int(8) NOT NULL,
  `Password` char(6) NOT NULL,
  `Contact` char(11) NOT NULL,
  PRIMARY KEY (`Publisher_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for runner_table
-- ----------------------------
DROP TABLE IF EXISTS `runner_table`;
CREATE TABLE `runner_table` (
  `Runner_id` int(4) NOT NULL,
  `Username` char(9) NOT NULL,
  `Useraccount` int(8) NOT NULL,
  `Password` char(6) NOT NULL,
  `Contact` char(11) NOT NULL,
  PRIMARY KEY (`Runner_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for task_table
-- ----------------------------
DROP TABLE IF EXISTS `task_table`;
CREATE TABLE `task_table` (
  `Task_id` int(4) NOT NULL,
  `Taskprofile` varchar(20) NOT NULL,
  `Taskcontent` varchar(50) NOT NULL,
  `Taskmoney` float(3,0) NOT NULL,
  `Taskstate` int(1) NOT NULL,
  `Publisher_id` int(4) NOT NULL,
  PRIMARY KEY (`Task_id`),
  KEY `Publisher_id` (`Publisher_id`),
  CONSTRAINT `Publisher_id` FOREIGN KEY (`Publisher_id`) REFERENCES `publisher_table` (`Publisher_id`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records 
-- ----------------------------
