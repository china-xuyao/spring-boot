# SDC java 

> a spring boot project.

## Java Framework

- Spring MVC
- MyBatis

## System Environment

- JDK 1.8
- Maven
- MySql
- Reference file path: /systemInit

## Build Setup

``` base
# Initialize Project And Build Project 
mvn package
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



