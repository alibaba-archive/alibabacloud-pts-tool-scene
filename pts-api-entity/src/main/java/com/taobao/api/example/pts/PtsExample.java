package com.taobao.api.example.pts;

import com.alibaba.fastjson.JSONObject;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.pts.model.v20201020.*;
import com.taobao.api.entity.pts.constant.SceneStatus;
import com.taobao.api.entity.pts.scene.Scene;


/**
 * PTS的Open API教程
 */
public class PtsExample {

    public static void main(String[] args) {

        // 账号的 accessKeyId 和 accessSecret
        String accessKeyId = "xxx";
        String accessSecret = "xxx";

        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", accessKeyId, accessSecret);
        IAcsClient client = new DefaultAcsClient(profile);

        // 1、构造创建场景实体类，创建场景
        Scene scene = BuildSceneEntity.getSceneEntity();
        CreatePtsSceneResponse createResponse = createPtsScene(scene, client);
        String sceneId = null;
        if (createResponse.getSuccess()) {
            sceneId = createResponse.getSceneId();
        } else {
            System.out.println("createSceneFail message:" + createResponse.getMessage());
            return;
        }

        if (true) {
            return;
        }

        // 2、启动压测
        String planId = null;
        StartPtsSceneResponse startResponse = startPtsScene(sceneId, client);
        if (startResponse.getSuccess()) {
            planId = startResponse.getPlanId();
        } else {
            System.out.println("startSceneFail message:" + startResponse.getMessage());
            return;
        }

        // 3、轮询等待场景的状态是否处于压测中，再去查询实时数据
        GetPtsSceneRunningStatusResponse statusResponse = getPtsSceneRunningStatus(sceneId, client);
        Long timeNow = System.currentTimeMillis();
        while (System.currentTimeMillis() - timeNow < 5 * 60 * 1000) {  // 如果启动的是VPC场景，需要等待的时间稍长些
            // 场景已经处于压测运行中状态时结束轮询
            if (statusResponse.getSuccess() && SceneStatus.RUNNING.equals(statusResponse.getStatus())) {
                break;
            }
            try {
                Thread.sleep(5 * 1000);
            } catch (Exception ignore) {
            }
            statusResponse = getPtsSceneRunningStatus(sceneId, client);
        }
        // 场景没有在规定时间内启动，停止后续操作
        if (!statusResponse.getSuccess() || !SceneStatus.RUNNING.equals(statusResponse.getStatus())) {
            return;
        }

        // 4、获取实时压测数据
        while (statusResponse.getSuccess() && SceneStatus.RUNNING.equals(statusResponse.getStatus())) {
            GetPtsSceneRunningDataResponse dataResponse = getPtsSceneRunningData(sceneId, planId, client);
            if (dataResponse.getSuccess()) {
                // 根据业务需求，处理压测中数据
            }

            // 等3s中，再次查询数据
            try {
                Thread.sleep(3 * 1000);
            } catch (Exception ignore) {
            }
            statusResponse = getPtsSceneRunningStatus(sceneId, client);
        }

        // 5、获取压测报告数据
        GetPtsReportDetailsResponse reportResponse = getPtsReportDetails(sceneId, planId, client);
        if (reportResponse.getSuccess()) {
            // 根据业务需求，处理压测报告数据
        }

        // 6、获取场景的性能基线数据，和压测报告数据对比（前提是场景已经设置过基线）
        GetPtsSceneBaseLineResponse baseLineResponse = getPtsSceneBaseLine(sceneId, client);
        if (baseLineResponse.getSuccess() && null != baseLineResponse.getBaseline()) {
            // 根据业务需求，处理性能基线数据
        } else {
            // 如果场景没有性能基线，可以调用设置性能基线接口
            CreatePtsSceneBaseLineFromReportResponse createBaseResponse = createPtsSceneBaseLineFromReport(sceneId, planId, client);
        }

    }

    /**
     * 创建PTS场景
     */
    public static CreatePtsSceneResponse createPtsScene(Scene scene, IAcsClient client) {
        CreatePtsSceneResponse response = new CreatePtsSceneResponse();
        if (null == scene || null == client) {
            response.setMessage("创建场景，入参不能为空");
            return response;
        }
        CreatePtsSceneRequest request = new CreatePtsSceneRequest();
        request.setScene(JSONObject.toJSONString(scene));
        try {
            response = client.getAcsResponse(request);
        } catch (ServerException e) {
            response.setMessage(e.getErrMsg());
            response.setCode(e.getErrCode());
            response.setRequestId(e.getRequestId());
        } catch (ClientException e) {
            response.setMessage(e.getErrMsg());
            response.setCode(e.getErrCode());
            response.setRequestId(e.getRequestId());
        }
        return response;
    }

    /**
     * 启动压测
     */
    public static StartPtsSceneResponse startPtsScene(String sceneId, IAcsClient client) {
        StartPtsSceneResponse response = new StartPtsSceneResponse();
        if (null == sceneId || null == client) {
            response.setMessage("启动压测，入参不能为空");
            return response;
        }
        StartPtsSceneRequest request = new StartPtsSceneRequest();
        request.setSceneId(sceneId);
        try {
            response = client.getAcsResponse(request);
        } catch (ServerException e) {
            response.setMessage(e.getErrMsg());
            response.setCode(e.getErrCode());
            response.setRequestId(e.getRequestId());
        } catch (ClientException e) {
            response.setMessage(e.getErrMsg());
            response.setCode(e.getErrCode());
            response.setRequestId(e.getRequestId());
        }
        return response;
    }

    /**
     * 获取场景状态
     */
    public static GetPtsSceneRunningStatusResponse getPtsSceneRunningStatus(String sceneId, IAcsClient client) {
        GetPtsSceneRunningStatusResponse response = new GetPtsSceneRunningStatusResponse();
        if (null == sceneId || null == client) {
            response.setMessage("查询场景状态，入参不能为空");
            return response;
        }
        GetPtsSceneRunningStatusRequest request = new GetPtsSceneRunningStatusRequest();
        request.setSceneId(sceneId);
        try {
            response = client.getAcsResponse(request);
        } catch (ServerException e) {
            response.setMessage(e.getErrMsg());
            response.setCode(e.getErrCode());
            response.setRequestId(e.getRequestId());
        } catch (ClientException e) {
            response.setMessage(e.getErrMsg());
            response.setCode(e.getErrCode());
            response.setRequestId(e.getRequestId());
        }
        return response;
    }

    /**
     * 获取压测实时数据
     */
    public static GetPtsSceneRunningDataResponse getPtsSceneRunningData(String sceneId, String planId, IAcsClient client) {
        GetPtsSceneRunningDataResponse response = new GetPtsSceneRunningDataResponse();
        if (null == sceneId || null == planId || null == client) {
            response.setMessage("启动压测，入参不能为空");
            return response;
        }
        GetPtsSceneRunningDataRequest request = new GetPtsSceneRunningDataRequest();
        request.setSceneId(sceneId);
        request.setPlanId(planId);
        try {
            response = client.getAcsResponse(request);
        } catch (ServerException e) {
            response.setMessage(e.getErrMsg());
            response.setCode(e.getErrCode());
            response.setRequestId(e.getRequestId());
        } catch (ClientException e) {
            response.setMessage(e.getErrMsg());
            response.setCode(e.getErrCode());
            response.setRequestId(e.getRequestId());
        }
        return response;
    }

    /**
     * 获取压测报告详情
     */
    public static GetPtsReportDetailsResponse getPtsReportDetails(String sceneId, String planId, IAcsClient client) {
        GetPtsReportDetailsResponse response = new GetPtsReportDetailsResponse();
        if (null == sceneId || null == planId || null == client) {
            response.setMessage("查询压测报告详情，入参不能为空");
            return response;
        }
        GetPtsReportDetailsRequest request = new GetPtsReportDetailsRequest();
        request.setSceneId(sceneId);
        request.setPlanId(planId);
        try {
            response = client.getAcsResponse(request);
        } catch (ServerException e) {
            response.setMessage(e.getErrMsg());
            response.setCode(e.getErrCode());
            response.setRequestId(e.getRequestId());
        } catch (ClientException e) {
            response.setMessage(e.getErrMsg());
            response.setCode(e.getErrCode());
            response.setRequestId(e.getRequestId());
        }
        return response;
    }

    /**
     * 获取场景性能基线数据
     */
    public static GetPtsSceneBaseLineResponse getPtsSceneBaseLine(String sceneId, IAcsClient client) {
        GetPtsSceneBaseLineResponse response = new GetPtsSceneBaseLineResponse();
        if (null == sceneId || null == client) {
            response.setMessage("查询场景性能基线数据，入参不能为空");
            return response;
        }
        GetPtsSceneBaseLineRequest request = new GetPtsSceneBaseLineRequest();
        request.setSceneId(sceneId);
        try {
            response = client.getAcsResponse(request);
        } catch (ServerException e) {
            response.setMessage(e.getErrMsg());
            response.setCode(e.getErrCode());
            response.setRequestId(e.getRequestId());
        } catch (ClientException e) {
            response.setMessage(e.getErrMsg());
            response.setCode(e.getErrCode());
            response.setRequestId(e.getRequestId());
        }
        return response;
    }

    /**
     * 为场景设置性能基线数据
     */
    public static CreatePtsSceneBaseLineFromReportResponse createPtsSceneBaseLineFromReport(String sceneId, String planId, IAcsClient client) {
        CreatePtsSceneBaseLineFromReportResponse response = new CreatePtsSceneBaseLineFromReportResponse();
        if (null == sceneId || null == planId || null == client) {
            response.setMessage("设置场景性能基线数据，入参不能为空");
            return response;
        }
        CreatePtsSceneBaseLineFromReportRequest request = new CreatePtsSceneBaseLineFromReportRequest();
        request.setSceneId(sceneId);
        request.setReportId(planId);
        try {
            response = client.getAcsResponse(request);
        } catch (ServerException e) {
            response.setMessage(e.getErrMsg());
            response.setCode(e.getErrCode());
            response.setRequestId(e.getRequestId());
        } catch (ClientException e) {
            response.setMessage(e.getErrMsg());
            response.setCode(e.getErrCode());
            response.setRequestId(e.getRequestId());
        }
        return response;
    }
}
