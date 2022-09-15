/*
 Navicat Premium Data Transfer

 Source Server         : LocalMySQL
 Source Server Type    : MySQL
 Source Server Version : 80029
 Source Host           : localhost:3306
 Source Schema         : mp_demo2

 Target Server Type    : MySQL
 Target Server Version : 80029
 File Encoding         : 65001

 Date: 15/09/2022 16:56:16
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for mp_product
-- ----------------------------
DROP TABLE IF EXISTS `mp_product`;
CREATE TABLE `mp_product`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `NAME` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '商品名称',
  `price` int(0) NULL DEFAULT 0 COMMENT '价格',
  `VERSION` int(0) NULL DEFAULT 0 COMMENT '乐观锁版本号',
  `sex` int(0) NULL DEFAULT NULL COMMENT '性别',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of mp_product
-- ----------------------------
INSERT INTO `mp_product` VALUES (1, '蓝牙耳机', 188, 2, NULL);

SET FOREIGN_KEY_CHECKS = 1;
