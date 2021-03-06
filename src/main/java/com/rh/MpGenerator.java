package com.rh;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

/**
 * <p>
 * 代码生成器演示
 * </p>
 */
public class MpGenerator {

    /**
     * <p>
     * MySQL 生成演示
     * </p>
     */
    public static void main(String[] args) {
        //填写要生成代码的数据库的表名   改成自己的
        String[] tables=new String[]{"admin","user"};
        //String[] tables=new String[]{"user","student"};
        generaterCode(tables);
    }

    public static void generaterCode(String[] tableNames) {
        AutoGenerator mpg = new AutoGenerator();
        // 选择 freemarker 模板引擎，默认 Veloctiy，如果用的是Veloctiy模板引擎就不需要这句代码
        mpg.setTemplateEngine(new FreemarkerTemplateEngine());

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setAuthor("xxx");
        //改成自己的项目路径
        gc.setOutputDir("F:\\JAVA\\IDEA\\relife\\first\\src\\main\\java");
        gc.setFileOverride(true);// 是否覆盖同名文件，默认是false
        gc.setActiveRecord(true);// 不需要ActiveRecord特性的请改为false
        gc.setEnableCache(false);// XML 二级缓存
        gc.setBaseResultMap(true);// XML ResultMap
        gc.setBaseColumnList(true);// XML columList

        // 自定义文件命名，注意 %s 会自动填充表实体属性！
        gc.setMapperName("%sDAO");
        gc.setXmlName("%sDAOMapper");
        gc.setServiceName("%sService");
        gc.setServiceImplName("%sServiceImpl");
        gc.setControllerName("%sController");

        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
        dsc.setTypeConvert(new MySqlTypeConvert() {
            // 自定义数据库表字段类型转换【可选】
            @Override
            public DbColumnType processTypeConvert(String fieldType) {
                System.out.println("转换类型：" + fieldType);
                // 注意！！processTypeConvert 存在默认类型转换，如果不是你要的效果请自定义返回、非如下直接返回。
                return super.processTypeConvert(fieldType);
            }
        });
        //数据源参数改一下
        dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("root");
        dsc.setUrl("jdbc:mysql://localhost:3306/testems?useUnicode=true&characterEncoding=utf8");
        mpg.setDataSource(dsc);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setTablePrefix(new String[] { ""});// 此处可以修改为您的表前缀
        strategy.setNaming(NamingStrategy.underline_to_camel);// 表名生成策略
        strategy.setEntityLombokModel(true); // 启用lombok增加实体类的get，set方法简化代码；如果不启用可以改为false

        strategy.setInclude(tableNames); // 需要生成的表

        mpg.setStrategy(strategy);

        // 包配置
        PackageConfig pc = new PackageConfig();
        //在哪个父包下生成  改成自己的
        pc.setParent("com.rh");
        pc.setEntity("entity");
        pc.setMapper("dao");
        pc.setXml("dao.xml");
        pc.setService("service");
        pc.setServiceImpl("service.impl");
        pc.setController("controller");

        mpg.setPackageInfo(pc);

        // 执行生成
        mpg.execute();
    }

}