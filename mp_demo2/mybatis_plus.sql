/*
 Navicat Premium Data Transfer

 Source Server         : LocalMySQL
 Source Server Type    : MySQL
 Source Server Version : 80029
 Source Host           : localhost:3306
 Source Schema         : mybatis_plus

 Target Server Type    : MySQL
 Target Server Version : 80029
 File Encoding         : 65001

 Date: 15/09/2022 21:35:31
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
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of mp_product
-- ----------------------------
INSERT INTO `mp_product` VALUES (1, '蓝牙耳机', 188, 2);

-- ----------------------------
-- Table structure for mp_user
-- ----------------------------
DROP TABLE IF EXISTS `mp_user`;
CREATE TABLE `mp_user`  (
  `uid` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `user_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '姓名',
  `age` int(0) NULL DEFAULT NULL COMMENT '年龄',
  `email` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `sex` int(0) NULL DEFAULT NULL COMMENT '性别',
  PRIMARY KEY (`uid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of mp_user
-- ----------------------------
INSERT INTO `mp_user` VALUES (1, '张三', 17, NULL, NULL);
INSERT INTO `mp_user` VALUES (2, '李四', 16, '123456@163.net', NULL);
INSERT INTO `mp_user` VALUES (3, '王五', 15, '352641@qq.com', NULL);
INSERT INTO `mp_user` VALUES (4, '赵六', 14, NULL, NULL);
INSERT INTO `mp_user` VALUES (5, '陈七', 13, '951463@263.net', NULL);
INSERT INTO `mp_user` VALUES (6, '王重阳', 39, NULL, 1);

-- ----------------------------
-- Table structure for my_books
-- ----------------------------
DROP TABLE IF EXISTS `my_books`;
CREATE TABLE `my_books`  (
  `id` int(0) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `type` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '书籍类型',
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '书籍名称',
  `description` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '书籍描述',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 27 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '书籍表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of my_books
-- ----------------------------
INSERT INTO `my_books` VALUES (1, '科幻', '地球往事', '《三体》三部曲第一部，作品讲述了地球人类文明和三体文明的信息交流、生死搏杀及两个文明在宇宙中的兴衰历程。');
INSERT INTO `my_books` VALUES (2, '科幻', '黑暗森林', '《三体》三部曲第二部，作品讲述了地球人类文明和三体文明的信息交流、生死搏杀及两个文明在宇宙中的兴衰历程。');
INSERT INTO `my_books` VALUES (3, '科幻', '死神永生', '《三体》三部曲第三部，作品讲述了地球人类文明和三体文明的信息交流、生死搏杀及两个文明在宇宙中的兴衰历程。');
INSERT INTO `my_books` VALUES (4, '仙侠', '将夜', '这本小说讲述的是一段可歌可泣可笑可爱的草根崛起史，一个物质要求宁滥勿缺的开朗少年行。小说基于修真世界，却又胜于修真，讲述了人定胜天，花开彼岸天的历史，引人深思。');
INSERT INTO `my_books` VALUES (5, '仙侠', '雪中悍刀行', '该小说讲述一个关于庙堂权争与刀剑交错的时代，一个暗潮涌动粉墨登场的江湖。');
INSERT INTO `my_books` VALUES (6, '都市', '大国重工', '国家重大装备办处长冯啸辰穿越到了1980年，看他如何与同代人一道，用汗水和智慧，铸就大国重工。');
INSERT INTO `my_books` VALUES (7, '架空', '赘婿', '本书主要讲述了主角从现代金融界巨头的身份回到了古代，进入一个商贾之家最没地位的赘婿身体后，涉及到一系列家国天下事的故事。');
INSERT INTO `my_books` VALUES (8, '科幻', '北京折叠', '该小说讲述北京在未来按照社会阶层被分成三个空间，生活在第三空间的垃圾工老刀穿越三层空间送信的故事。');
INSERT INTO `my_books` VALUES (9, '鬼怪', '地煞七十二变', '地煞七十二般变化，每一般变化，就是一项神通。一本神奇的黄壳书将李长安送回古代世界，每斩杀一个妖魔，就获得一项神通。');
INSERT INTO `my_books` VALUES (10, '魔幻', '诡秘之主', '作品融汇了克苏鲁风格、西方魔幻元素、第一次工业革命时代风情和蒸汽朋克情怀。这是一个蒸汽与机械的世界，这是一段“愚者”的传说。');
INSERT INTO `my_books` VALUES (11, '幻想', '第一序列', '作品讲述了主角任小粟通过吸收正能量一步步崛起，同时逐渐改变了世界的故事。');
INSERT INTO `my_books` VALUES (12, '人文', '明朝那些事儿', '作品主要讲述的是从1344年到1644年这三百年间关于明朝的一些故事 。');
INSERT INTO `my_books` VALUES (13, '人文', '三国那些事儿', '本书分为上下两篇，上篇为读者介绍了三国里的著名人物，下篇讲述了发生在这些人物身上的经典故事。');
INSERT INTO `my_books` VALUES (14, '都市', '余罪', '警校学生余罪从一场特殊的选拔开始，进入了生活和社会矛盾之中，成为一个卧底，是一种挑战，也是一种难以想象的痛苦生活的开始。');
INSERT INTO `my_books` VALUES (15, '科幻', '安德的游戏', '第三次虫族入侵已迫在眉睫，而地球舰队尚未找到任何抵抗的可能。世界即将毁灭。人类最后的救世主 ，是一个六岁的儿童——安德。');
INSERT INTO `my_books` VALUES (16, '科幻', '死者代言人', '安德遭遇了一起残忍而离奇的虐杀事件。安德隐匿身份，再次踏入一个异生物星球。随着调查的深入，他一步步走向异种生物的圈套，而真相，居然与他童年的那段回忆有千丝万缕的联系……');
INSERT INTO `my_books` VALUES (17, '科幻', '安德的影子', '当安德和队员们全力以赴挑战最后的难关时，只有一人早已知晓这背后残酷的真相。他是影子，在英雄如阳光照射大地之时，只有影子能承接必然尾随而至的黑暗。');
INSERT INTO `my_books` VALUES (18, '惊悚', '我有一座冒险屋', '作该作品讲述主人公陈歌在翻旧物时寻得黑色手机，在手机的指引下探寻世界的另一面。');
INSERT INTO `my_books` VALUES (19, '科幻', '星门', '传说，在那古老的星空深处，伫立着一道血与火侵染的红色之门。');
INSERT INTO `my_books` VALUES (20, '仙侠', '凡人修仙传', '小说讲述了一个普通的山村穷小子，偶然之下，跨入到一个江湖小门派，虽然资质平庸，但依靠自身努力和合理算计最后修炼成仙的故事。');
INSERT INTO `my_books` VALUES (21, '惊悚', '地狱公寓', '在这公寓内，如果住户房间的墙壁上出现了血字，住户就必须完成血字任务，一旦违背就会死亡。');
INSERT INTO `my_books` VALUES (22, '仙侠', '求魔', '该书主要讲述了主角苏铭不甘命运被掌控，与命运斗争的故事。修仙觅长生，热血任逍遥，踏莲曳波涤剑骨，凭虚御风塑圣魂。');
INSERT INTO `my_books` VALUES (23, '仙侠', '仙逆', '作该小说讲述的是一个平庸的少年，踏入仙途，如何一步一步走向巅峰，凭一己之力扬名修真界的故事。');
INSERT INTO `my_books` VALUES (24, '诗集', '炸裂志', '陈年喜以其平实婉转的文字，在诗句中建构了一个中年男人的世界，以白雪抗衡黑洞，以爱感悟生死，以诗超越世间。');
INSERT INTO `my_books` VALUES (25, '仙侠', '大奉打更人', '作者巧妙地将俗世朝堂背景，百家文化与仙侠修炼结合起来，并设计了一个个精妙的案件作为引线，一步步展现出了一个波澜壮阔的全新世界');
INSERT INTO `my_books` VALUES (26, '魔幻', '哈利波特', '一代法王哈利的成长之路');

-- ----------------------------
-- Table structure for my_music
-- ----------------------------
DROP TABLE IF EXISTS `my_music`;
CREATE TABLE `my_music`  (
  `id` int(0) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '歌名',
  `author` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '原唱',
  `type` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '类型',
  `album` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '专辑',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 16 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '歌单' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of my_music
-- ----------------------------
INSERT INTO `my_music` VALUES (1, '晴天', '周杰伦', '流行摇滚', '叶惠美');
INSERT INTO `my_music` VALUES (2, '星晴', '周杰伦', '民谣', 'Jay');
INSERT INTO `my_music` VALUES (3, '夜的第七章', '周杰伦', '古典说唱', '依然范特西');
INSERT INTO `my_music` VALUES (4, '暗号', '周杰伦', '节奏蓝调', '八度空间');
INSERT INTO `my_music` VALUES (5, '回到过去', '周杰伦', 'R&B', '八度空间');
INSERT INTO `my_music` VALUES (6, '园游会', '周杰伦', '民谣', '七里香');
INSERT INTO `my_music` VALUES (7, '七里香', '周杰伦', '古典音乐', '七里香');
INSERT INTO `my_music` VALUES (8, '说了再见', '周杰伦', '古典流行', '跨时代');
INSERT INTO `my_music` VALUES (9, '以父之名', '周杰伦', '古典说唱', '叶惠美');
INSERT INTO `my_music` VALUES (10, '烟花易冷', '周杰伦', '中国风', '跨时代');
INSERT INTO `my_music` VALUES (11, '夜的第七章', '周杰伦', '古典说唱', '依然范特西');
INSERT INTO `my_music` VALUES (12, '你好吗', '周杰伦', '古典流行', '惊叹号');
INSERT INTO `my_music` VALUES (13, '黑色毛衣', '周杰伦', '流行', '十一月的肖邦');
INSERT INTO `my_music` VALUES (14, '处处吻', '杨千嬅', '流行摇滚', 'Simply Me');
INSERT INTO `my_music` VALUES (15, '天下', '张杰', '流行摇滚', '明天过后');
INSERT INTO `my_music` VALUES (16, '花海', '周杰伦', '英式摇滚', '魔杰座');

SET FOREIGN_KEY_CHECKS = 1;
