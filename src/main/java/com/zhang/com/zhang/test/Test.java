package com.zhang.com.zhang.test;


import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/8/29/029.
 */
public class Test {
    public static  void main(String[] args) throws IOException, XMLParserException, InvalidConfigurationException, SQLException, InterruptedException {
        List<String> list=new ArrayList<String>();
        //使用步骤：
        //1、加载配置文件
        File file=new File("src/main/resources/generatorConfig.xml");
        //2、创建解析配置文件对象
        ConfigurationParser parser=new ConfigurationParser(list);
        //3、获取配置文件对象
        Configuration configuration=parser.parseConfiguration(file);
        //4、设置是否覆盖
        DefaultShellCallback callback=new DefaultShellCallback(true);
        //5、创建自动生成对象
        MyBatisGenerator generator=new MyBatisGenerator(configuration, callback,list );
        //6、生成
        generator.generate(null);

        System.out.println("");
    }
}
