package cn.kaciner.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 1. 整合Mybatis-plus
 * 2. 配置
 *    1.数据源：
 *      导入数据库的驱动
 *      在application.yml配置数据源相关信息
 *    2.配置Mybatis-plus:
 *      1.使用@MapperScan
 *      2.配置sql映射文件位置
 */

@MapperScan("cn.kaciner.gulimall.product.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
