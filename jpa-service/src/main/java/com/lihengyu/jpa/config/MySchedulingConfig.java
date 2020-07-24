package com.lihengyu.jpa.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.text.SimpleDateFormat;


@Configuration
//开启定时器
@EnableScheduling
public class MySchedulingConfig {

    //日期转换对象
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
    //定义日志对象
    private Logger logger = LoggerFactory.getLogger(MySchedulingConfig.class);

    /**
     * 第一个数字5 代表每5秒钟触发一次 秒 分 时 日期 月份 ？代表星期中的月份
     */
//    @Scheduled(cron = "0/5 * * * * ?")
//    public void timeTest() {
//        Date date = new Date();
//        logger.info("每隔5秒触发定时器@@@@"+simpleDateFormat.format(date));
//    }

    /*@Scheduled(fixedDelay = 5000)
    public void timeTest() {
        Date date = new Date();
        logger.info("每隔5秒触发定时器@@@@"+simpleDateFormat.format(date));
    }*/
}
