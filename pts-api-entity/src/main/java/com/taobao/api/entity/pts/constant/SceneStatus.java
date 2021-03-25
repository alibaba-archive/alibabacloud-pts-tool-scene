package com.taobao.api.entity.pts.constant;

/**
 * 场景状态常量
 */
public class SceneStatus {


    /**
     * 未启动
     */
    public static final String NO_START = "NO_START";

    /**
     * 场景构建成功
     */
    public static final String NON_EXIST = "NON_EXIST";

    /**
     * 初始化完成
     */
    public static final String CREATED = "CREATED";

    /**
     * 场景同步中
     */
    public static final String SYNCING = "SYNCING";

    /**
     * 场景同步完成
     */
    public static final String SYNC_DONE = "SYNC_DONE";

    /**
     * 文件上传中
     */
    public static final String UPLOADING = "UPLOADING";

    /**
     * 文件上传完成
     */
    public static final String UPLOADED = "UPLOADED";

    /**
     * 链路准备中
     */
    public static final String PREPARING = "PREPARING";

    /**
     * 启动中
     */
    public static final String READY = "READY";

    /**
     * 运行中
     */
    public static final String RUNNING = "RUNNING";

    /**
     * 停止中
     */
    public static final String STOPPING = "STOPPING";

    /**
     * 已停止
     */
    public static final String STOPPED = "STOPPED";

    /**
     * 同步计划失败
     */
    public static final String ERR_SYNC = "ERR_SYNC";

    /**
     * 数据上传失败
     */
    public static final String ERR_UPLOAD = "ERR_UPLOAD";

    /**
     * 压测准备失败
     */
    public static final String ERR_PREPARE = "ERR_PREPARE";

    /**
     * 压测运行失败
     */
    public static final String ERR_RUN = "ERR_RUN";

    /**
     * 压测停止失败
     */
    public static final String ERR_STOP = "ERR_STOP";

    /**
     * 超时
     */
    public static final String ERR_TIMEOUT = "ERR_TIMEOUT";
}
