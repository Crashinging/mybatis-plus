package com.chenjy.mp_demo;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;

/**
 * @Author: chenJY
 * @Description:
 * @Date: 2022-09-15 16:06
 */
@SpringBootTest
public class MPAutoGeneratorTest {

    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://127.0.0.1:3306/mybatis_plus?characterEncoding=utf-8&userSSL=false", "root", "admin")
                .globalConfig(builder -> {
                    builder.author("chenjy") // 设置作者
                            //.enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir("D:\\mybatisplus\\demo1"); // 指定输出目录
                })
                // 最终生成的代码会存在com.chenjy.mybatisplus之下
                .packageConfig(builder -> {
                    builder.parent("com.chenjy") // 设置父包名
                            .moduleName("mybatisplus") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.mapperXml, "D:\\Study\\projects\\se\\mp_demp")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("mp_user", "mp_product") // 设置需要生成的表名
                            .addTablePrefix("mp_", "t_"); // 设置过滤表前缀（可以设置多个前缀）
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();// 执行
    }

}
