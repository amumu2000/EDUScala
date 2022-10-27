# Scala 学习笔记

## 项目概述

> 1. 作者：NEEPU_AMUMU
> 2. 项目周期：2022.10.25 - present

## Scala简介

> 1. Scala combines object-oriented and functional programming in one concise, high-level language. Scala's static types
     help avoid bugs in complex applications, and its JVM and JavaScript runtimes let you build high-performance systems
     with easy access to huge ecosystems of libraries.
> 2. Scala [官网链接](https://scala-lang.org/)

## 环境配置

### JDK and Scala runner

#### JDK

1. JDK [下载地址](https://www.oracle.com/cn/java/technologies/downloads/)
2. 直接双击下载的安装包，按步骤安装即可，可以将安装目录改为D盘，安装程序会自动将jdk/bin添加进系统path
3. 配置JAVA_HOME，如`D:\Program Files\Java\jdk-17.0.5`

#### Scala runner 安装方式1

1. [GitHub下载地址](https://github.com/lampepfl/dotty) **需科学上网**
2. 下载后得到 Scala 的压缩包，解压后，将*bin*目录加入系统*path*

#### Scala runner 安装方式2(推荐)

##### 1) 安装Scoop(一个windows平台的包管理器)

首先确保以**管理员身份**启动Powershell(win10)或Powershell in Terminal(win11自带)，执行以下命令。
若先前执行过该命令，可以逃过此步骤。该命令的作用是设置执行策略，确保有足够的权限运行ps1脚本来安装scoop。

```shell
set-executionpolicy remotesigned
```

以下命令是否是用管理员身份均可

设置Scoop安装目录的环境变量，默认为C盘，可以设置为D盘

```shell
$env:SCOOP='D:\Applications\Scoop'
[Environment]::SetEnvironmentVariable('SCOOP', $env:SCOOP, 'User')
```

下载并执行scoop安装脚本

```shell
iwr -useb https://gitee.com/glsnames/scoop-installer/raw/master/bin/install.ps1 | iex
```

查看scoop版本(测试scoop安装是否成功)

```shell
scoop --version
```

如以下结果

```text
Current Scoop version:
v0.3.0 - Released at 2022-10-10
```

##### 2) scoop一键安装 Scala runner

```shell
scoop install scala
```

scoop会自动将bin目录加入path

##### 3) 其他包推荐

```shell
scoop install aria2 git
```

## IntelliJ IDEA with Scala plugin

1. IDEA [下载地址](https://www.jetbrains.com/idea/download/)
2. 安装 scala 插件

[Top](#Scala 学习笔记)