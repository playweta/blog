## 创建背景

之前在：CSDN、博客园写博客。<br/>
写了1年多后，有了想自己搭建博客的冲动。 毕竟 "租房"总是让人感到没有"归属感"。<br/>
于是我尝试过：用Hexo搭建静态博客，托管到GitHub上, 虽然轻巧炫酷，但体验后，才知：文章管理之不便。<br/>
因此：便开始创建（五月工作室）的征途。



## 项目介绍

`工作室`项目是一个（个人博客系统），包括前台博客页面及后台管理系统，基于SpringBoot+MyBatis实现，采用Tomcat容器部署。<br/>

前台博客页面包含：首页、博客文章页面、博客分类、归档页面、关于我页面、搜索页面、登录页面。<br/>

后台管理系统包含：博客管理、分类管理、标签管理、用户管理 <br/>



### 项目演示

项目演示地址： 

> 前台：博客页面

![前台](https://gitee.com/Im_age/blog-img/raw/master/images/202109111243100.jpg)

> 后台：管理系统

![后台](https://gitee.com/Im_age/blog-img/raw/master/images/image-20210911113602543.png)

### 组织结构

``` lua
laoyangzhijia
├── src -- 源代码
├── blog.sql -- 数据库表
├── pom.xml -- 依赖配置文件
```



### 技术选型

#### 前端技术

| 技术        | 说明            | 官网                                                 |
| ----------- | --------------- | ---------------------------------------------------- |
| Semantic UI | 前端框架        | https://semantic-ui.com/                             |
| LayUi       | 前端框架        | https://www.layui.com/                               |
| X-admin     | 后台模板        | https://gitee.com/daniuit/X-admin?_from=gitee_search |
| jQuery      | JavaScript 库   | https://github.com/jquery/jquery                     |
| Editormd    | Markdown 编辑器 | https://pandao.github.io/editor.md/                  |




#### 后端技术

| 技术       | 说明                | 官网                                           |
| ---------- | ------------------- | ---------------------------------------------- |
| SpringBoot | 容器+MVC框架        | https://spring.io/projects/spring-boo          |
| MyBatis    | ORM框架             | http://www.mybatis.org/mybatis-3/zh/index.html |
| SLF4J      | 日志门面            | http://www.slf4j.org/                          |
| Logback    | 日志技术            | http://logback.qos.ch/                         |
| Lombok     | 简化对象封装工具    | https://github.com/rzwitserloot/lombok         |
| PageHelper | MyBatis物理分页插件 | http://git.oschina.net/free/Mybatis_PageHelper |



#### 架构图



##### 业务架构图



![个人博客架构图](https://gitee.com/Im_age/blog-img/raw/master/images/202109111303916.png)



##### 数据库E-R图

<img src="https://gitee.com/Im_age/blog-img/raw/master/images/202109111310313.png" alt="image-20210717173057950" style="zoom: 50%;" />





## 环境搭建

### 开发工具

| 工具          | 说明                | 官网                                            |
| ------------- | ------------------- | ----------------------------------------------- |
| IDEA          | 开发IDE             | https://www.jetbrains.com/idea/download         |
| Navicat   | 数据库连接工具    | http://www.formysql.com/xiazai.html             |                                               |
| X-shell       | Linux远程连接工具   | http://www.netsarang.com/download/software.html |
| Xftp | Linux远程传输工具 | https://www.netsarang.com/zh/xftp/ |
| ProcessOn     | 流程图绘制工具      | https://www.processon.com/                      |
| Snipaste  | 屏幕截图工具      | https://www.snipaste.com/                       |
| Typora | Markdown编辑器 | https://typora.io/ |

### 开发环境

| 工具  | 版本号 | 下载                                                         |
| ----- | ------ | ------------------------------------------------------------ |
| JDK   | 1.8    | https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html |
| Mysql | 8.0    | https://www.mysql.com/                                       |

