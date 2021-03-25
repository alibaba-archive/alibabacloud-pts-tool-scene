package com.taobao.api.example.pts;

import com.taobao.api.entity.pts.scene.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 构建创建场景的入参
 */
public class BuildSceneEntity {

    /**
     * 获取场景实体类
     */
    public static Scene getSceneEntity() {
        Scene scene = new Scene();
        scene.setSceneName("场景名，30个字以内");      // 设置场景名 (必要)
        scene.setRelationList(getRelationList());   // 设置场景中的链路信息 (必要)
        scene.setLoadConfig(getLoadConfigCon());    // 设置场景的施压配置（并发模式）(必要)
        //  scene.setLoadConfig(getLoadConfigRps());    // 设置场景的施压配置（RPS模式）
        scene.setAdvanceSetting(getAdvanceSetting());   // 设置场景的高级设置信息 (非必要)
        scene.setFileParameterList(getFileParameterList());  // 设置场景的文件参数信息 (非必要)
        scene.setGlobalParameterList(getGlobalParameterList());  // 设置场景的全局自定义参数 (非必要)
        return scene;
    }

    /**
     * 获取场景的链路配置信息
     */
    public static List<Relation> getRelationList() {
        List<Relation> relationList = new ArrayList<>();
        Relation relation = new Relation();
        relation.setRelationName("第一条链路名");   // 设置链路名(必要)

        List<Api> apiList = new ArrayList<>();   // 设置链路中的API信息(必要)
        Api api1 = new Api();
        api1.setApiName("第一个链路第1个API");      // 设置链路中API名(必要)
        api1.setUrl("https://www.xxx.com");      // 设置链路中API的URL(必要)

        // 以下是API的非必要参数
        api1.setMethod(Method.POST);    // 设置API中url的请求方法 (非必要)
        Body body = new Body();         // 设置API中POST请求方法的body (非必要)
        body.setContentType("application/x-www-form-urlencoded");
        body.setBodyValue("{\"global\":\"${global}\",\"name\":\"${name}\"}");
        api1.setBody(body);

        api1.setTimeoutInSecond(10);    // 设置API中URL的超时时间 (非必要)
        api1.setRedirectCountLimit(0);  // 设置API中URL的重定向次数，只能是10或者0 (非必要)

        List<Header> headerList = new ArrayList<>();  // 设置API中URL的header信息 (非必要)
        Header header = new Header();
        header.setHeaderName("uid");
        header.setHeaderValue("1234567");
        headerList.add(header);
        api1.setHeaderList(headerList);

        List<Export> exportList = new ArrayList<>();  // 设置API中URL的导出参数信息 (非必要)
        Export export = new Export();
        export.setExportName("userId");
        export.setExportType("STATUS_CODE");
        exportList.add(export);
        api1.setExportList(exportList);


        List<CheckPoint> checkPointList = new ArrayList<>();  // 设置API中URL的检查点信息 (非必要)
        CheckPoint checkPoint = new CheckPoint();
        checkPoint.setCheckPoint("userId");
        checkPoint.setCheckType("EXPORTED_PARAM");
        checkPoint.setExpectValue("111");
        checkPoint.setOperator(CheckPointOperator.CHECK_CTN);
        checkPointList.add(checkPoint);
        api1.setCheckPointList(checkPointList);

        apiList.add(api1);
        relation.setApiList(apiList);

        List<FileParameterExplain> fileParameterExplainList = new ArrayList<>(); // 设置链路中文件参数说明信息 (非必要)
        FileParameterExplain explain = new FileParameterExplain();
        explain.setFileName("fileName.csv");       // 文件名
        explain.setFileParamName("name,uid,age");  // 文件中使用到的参数，使用英文逗号隔开
        explain.setCycleOnce(true);                // 文件中的参数是否循环使用  (非必要)
        explain.setBaseFile(true);                 // 文件列是否作为基准列     (非必要)
        fileParameterExplainList.add(explain);
        relation.setFileParameterExplainList(fileParameterExplainList);

        relationList.add(relation);
        return relationList;
    }

    /**
     * 获取施压配置实体类 (并发模式)
     */
    public static LoadConfig getLoadConfigCon() {
        LoadConfig loadConfig = new LoadConfig();
        loadConfig.setTestMode("concurrency_mode");  // 设置施压模式为并发模式 (必要)
        loadConfig.setAutoStep(true);                // 设置为自动递增
        loadConfig.setKeepTime(3);                   // 设置单量级持续时间为3分钟
        loadConfig.setIncrement(30);                 // 设置每个量级递增百分比为30%
        loadConfig.setMaxRunningTime(12);            // 设置压测时长为12分钟 (必要)
        Configuration configuration = new Configuration(); // 设置压测量级配置
        configuration.setAllConcurrencyBegin(10);
        configuration.setAllConcurrencyLimit(100);
        loadConfig.setConfiguration(configuration);
        return loadConfig;
    }

    /**
     * 获取施压配置实体类 (RPS模式)
     */
    public static LoadConfig getLoadConfigRps() {
        LoadConfig config = new LoadConfig();
        config.setTestMode("tps_mode");    // 设置施压模式为RPS模式
        config.setMaxRunningTime(10);      // 设置压测时间10分钟
        Configuration configuration = new Configuration();  // 设置压测量级配置
        configuration.setAllRpsBegin(10);
        configuration.setAllRpsLimit(100);
        config.setConfiguration(configuration);
        return config;
    }

    /**
     * 获取场景的高级设置实体类
     */
    public static AdvanceSetting getAdvanceSetting() {
        AdvanceSetting setting = new AdvanceSetting();
        setting.setLogRate(10);                       // 设置采样率 (非必要)
        setting.setConnectionTimeoutInSecond(10);     // 设置连接超时时间 (非必要)
        setting.setSuccessCode("429,404");            // 设置自定义成功状态码 (非必要)
        List<DomainBinding> domainBindingList = new ArrayList<>();  // 设置域名与IP绑定关系(非必要)
        DomainBinding domain = new DomainBinding();
        domain.setDomain("www.xxx.com");
        List<String> ips = new ArrayList<>();
        ips.add("1.1.1.1");
        ips.add("2.2.2.2");
        domain.setIps(ips);
        domainBindingList.add(domain);
        setting.setDomainBindingList(domainBindingList);
        return setting;
    }

    /**
     * 获取场景的文件参数配置
     */
    public static List<FileParameter> getFileParameterList() {
        List<FileParameter> fileParameterList = new ArrayList<>();
        FileParameter fileParameter = new FileParameter();
        // 一定是公网可访问的OSS地址
        fileParameter.setFileOssAddress("https://xxx.com/file/fileName.csv");
        fileParameter.setFileName("fileName.csv");
        fileParameterList.add(fileParameter);
        return fileParameterList;
    }

    /**
     * 获取场景的全局自定义参数
     */
    public static List<GlobalParameter> getGlobalParameterList() {
        List<GlobalParameter> globalParameterList = new ArrayList<>();
        GlobalParameter parameter = new GlobalParameter();
        parameter.setParamName("global");
        parameter.setParamValue("111111");
        globalParameterList.add(parameter);
        return globalParameterList;
    }

}
