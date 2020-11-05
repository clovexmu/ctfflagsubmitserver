# ctfflagsubmitserver
# **简介**

Spring Boot项目, 仅REST接口，建议用Idea打开项目。

CTF AWD比赛中，需要开发脚本批量提交flag，因此建立了一个简单的FlagSubmit Server，用于模拟比赛的flag server。

服务网址： localhost:8080
主要接口：
提交flag
/flagsubmit , GET 方法

入参：String token ，String flags, int questionNumber
测试网址：http://localhost:8080/flagsubmit?token=aaa&flags=myflags&questionNumber=1

返回： 
{"errno":0,"data":"success","errmsg":"成功"}


/listflags

列出已经提交的所有flags

入参：无



/clearflags

清除所有flags

入参：无

