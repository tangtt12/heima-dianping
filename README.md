# 黑马点评项目 - 商户点评系统

> 本项目是一个基于 Spring Boot 的商户点评系统，功能涵盖用户登录、商户信息展示、商户收藏、优惠券领取、评论、搜索、签到等，是电商系统中的高频模块实战项目。

## 📌 项目背景

该项目基于黑马程序员 Java 高级课程实战，适合作为后端工程师学习 Redis、MyBatis-Plus、分布式锁、令牌刷新机制等知识点的练手项目。

## 🛠️ 技术栈

- Java 11
- Spring Boot 2.7.6
- MyBatis-Plus
- Redis + Redisson
- MySQL 8.0
- Maven 3.6.1
- Nginx（用于静态资源代理）
- Vue（黑马提供的前端模板）

## ✨ 核心功能

- 用户登录（手机验证码登录）
- 商户信息展示与分类
- 商户收藏与取消
- 附近商户定位功能（Geo）
- 优惠券领取与核销（含秒杀券）
- 评论与点赞系统
- 用户签到与连续签到奖励
- 分布式唯一 ID 生成器（基于 Redis 实现）
- 分布式锁解决缓存击穿问题
- 缓存穿透、缓存雪崩解决方案
- 登录状态刷新与拦截器实现

## 🗂️ 项目结构简览

```bash
hm-dianping
├── src
│   ├── main
│   │   ├── java/com/hmdp
│   │   └── resources
│   └── test
├── pom.xml
└── README.md
