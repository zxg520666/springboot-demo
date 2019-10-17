package com.zxg.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author zhangxiaoguang
 * @createtime 2019/10/16-12:14
 */
//@ConfigurationProperties(prefix = "jdbc")
@Data
public class JdbcProperties {

     String driverClassName;
     String url;
     String username;
     String password;
}
