

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.FileOutConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.TemplateConfig;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class MpGenerator {
	 
    /**
     * <p>
     * MySQL ??��?��?�示
     * </p>
     */
    public static void main(String[] args) {
        AutoGenerator mpg = new AutoGenerator();
        // ?�择 freemarker 引�?��?��?�认 Veloctiy
        // mpg.setTemplateEngine(new FreemarkerTemplateEngine());
 
        // ?���???�置
        GlobalConfig gc = new GlobalConfig();
        gc.setOutputDir(System.getProperty("user.dir")+"/src/main/java/");
        gc.setFileOverride(true);
        gc.setActiveRecord(true);// 不�?要ActiveRecord?��?��?�请?��为false
        gc.setEnableCache(false);// XML 二级缓�??
        gc.setBaseResultMap(true);// XML ResultMap
        gc.setBaseColumnList(true);// XML columList
        //gc.setKotlin(true);//?��?��??��?? kotlin �????
        gc.setAuthor("Ablett_Chen");
 
        // ?��定�?��?�件?��??��?�注??? %s 会自?��填�?�表实�?��?��?��??
        // gc.setMapperName("%sDao");
        // gc.setXmlName("%sDao");
        // gc.setServiceName("MP%sService");
        // gc.setServiceImplName("%sServiceDiy");
        // gc.setControllerName("%sAction");
        mpg.setGlobalConfig(gc);
 
        // ?��?��源�?�置
        DataSourceConfig dsc = new DataSourceConfig();
        //?��定�?�数?��类�?�转?��
        dsc.setTypeConvert(new MySqlTypeConvert());
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("");
        dsc.setUrl("jdbc:mysql://localhost:3306/fixture?useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai");
        mpg.setDataSource(dsc);
 
        // 策略??�置
        StrategyConfig strategy = new StrategyConfig();
        // strategy.setCapitalMode(true);// ?���?大�?�命??? ORACLE 注�??
        //strategy.setTablePrefix(new String[] { "tlog_", "tsys_" });// 此�?�可以修?��为您??�表??��?
        strategy.setNaming(NamingStrategy.underline_to_camel);// 表�?��?��?��?�略
        strategy.setInclude(new String[] { "fix_listy" }); // ??要�?��?��?�表
        // strategy.setExclude(new String[]{"test"}); // ??�除??��?��?�表
        // ?��定�?��?��?�父�?
        // strategy.setSuperEntityClass("com.baomidou.demo.TestEntity");
        // ?��定�?��?��?��?�公?��字段
        // strategy.setSuperEntityColumns(new String[] { "test_id", "age" });
        // ?��定�?? mapper ?���?
        // strategy.setSuperMapperClass("com.baomidou.demo.TestMapper");
        // ?��定�?? service ?���?
        // strategy.setSuperServiceClass("com.baomidou.demo.TestService");
        // ?��定�?? service 实现类父�?
        // strategy.setSuperServiceImplClass("com.baomidou.demo.TestServiceImpl");
        // ?��定�?? controller ?���?
        // strategy.setSuperControllerClass("com.baomidou.demo.TestController");
        // ?��?��?��?�是?��??��?��?�段常�?��?��?�认 false�?
        // public static final String ID = "test_id";
         strategy.setEntityColumnConstant(true);
        // ?��?��?��?�是?��为�?�建?�模??��?��?�认 false�?
        // public User setName(String name) {this.name = name; return this;}
        //strategy.setEntityBuilderModel(true);
        mpg.setStrategy(strategy);
 
        // ??��?�置
        PackageConfig pc = new PackageConfig();
        pc.setParent("com.fix");
        pc.setController("controller");
        pc.setEntity("model");
        mpg.setPackageInfo(pc);
 
        // 注入?��定�?��?�置，可以在 VM 中使?�� cfg.abc ?�可??��??  ${cfg.abc}
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                Map<String, Object> map = new HashMap<String, Object>();
                map.put("abc", this.getConfig().getGlobalConfig().getAuthor() + "-mp");
                this.setMap(map);
            }
        };
        
        // ?��定�?? xxListIndex.html ??��??
        List<FileOutConfig> focList = new ArrayList<FileOutConfig>();
        focList.add(new FileOutConfig("/templates/mapper.xml.vm") {
            @Override
            public String outputFile(TableInfo tableInfo) {
                // ?��定�?��?�入??�件??�称
                return System.getProperty("user.dir")+"/src/main/resources/mapper/fix/" + tableInfo.getEntityName() + "Mapper.xml";
            }
        });
        cfg.setFileOutConfigList(focList);
        mpg.setCfg(cfg);
        
        // ?��?��默认 xml ??��?��?��?�整??��?? ?�� ?��?���?
        /*TemplateConfig tc = new TemplateConfig();
        tc.setXml(null);
        mpg.setTemplate(tc);*/
 
        // ?��定�?�模?��??�置，可�? copy 源�?? mybatis-plus/src/main/resources/templates 下面??�容修改�?
        // ?��置自己项?��??? src/main/resources/templates ?��录�??, 默认??�称�?下可以�?��?�置，�?�可以自定�?�模?��??�称
         TemplateConfig tc = new TemplateConfig();
			
			
			 tc.setController("/templates/controller.java.vm");
			 tc.setService("/templates/service.java.vm");
			 tc.setServiceImpl("/templates/serviceImpl.java.vm");
			 tc.setEntity("/templates/entity.java.vm");
			 tc.setMapper("/templates/mapper.java.vm");
			 tc.setXml(null);
			 
        // 如�?�任何�?个模??��?��?�设�? �? OR Null 将�?��?��?�该模�?��??
         mpg.setTemplate(tc);
 
        // ?��行�?��??
        mpg.execute();
 
        // ??�印注入设置?�可??��??
        System.err.println(mpg.getCfg().getMap().get("abc"));
    }
}