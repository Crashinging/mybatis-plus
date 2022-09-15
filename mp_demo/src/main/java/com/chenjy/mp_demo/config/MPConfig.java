package com.chenjy.mp_demo.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.OptimisticLockerInnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: chenJY
 * @Description:
 * @Date: 2022-09-15 10:44
 */
@Configuration
@MapperScan("com.chenjy.mp_demo.mapper")
public class MPConfig {
    @Bean
    public MybatisPlusInterceptor plusInterceptor() {
        // 使用插件需要使用到的类
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        // 添加分页插件（PaginationInnerInterceptor）到interceptor实例中
        // DbType 指定数据库类型为 MySQL
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));
        // 添加乐观锁插件
        interceptor.addInnerInterceptor(new OptimisticLockerInnerInterceptor());
        // 返回实例
        return interceptor;
    }
}
