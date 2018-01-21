# Spring mvc + Mybatis + MyEclipse

> a spring boot project.

## Java Framework

- Spring MVC
- MyBatis

## System Environment

- JDK 1.8
- Maven
- MySql
- Reference file path: /systemInit

## Intall Eclipse tools 

- 1.At eclipse software
- 2.Open menu: help >>> eclipse marketplace
- 3.Search: spring-tool-suite


## Build Setup

``` base
# Initialize Project And Build Project 
mvn package
```

## Init Database
- file path: src/main/resources/sql/user.sql


##  Request url

```
http://localhost:8080/api/user
```

## RESTful Sample

PATH: com.xuyao.user

## How To Use The Log Framework

```
# Create Log Object 
private Logger logger =  LoggerFactory.getLogger(this.getClass());
# INFO level
logger.info("message");
# ERROR level
logger.error("message");
# DEBUG level
logger.debug("message");
```



