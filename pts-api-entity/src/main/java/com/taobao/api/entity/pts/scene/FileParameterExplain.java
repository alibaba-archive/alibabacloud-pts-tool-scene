package com.taobao.api.entity.pts.scene;

/**
 * 文件在链路中的使用配置说明
 */
public class FileParameterExplain {

    /**
     * 文件名
     */
    private String fileName;

    /**
     * 文件使用的参数列名
     */
    private String fileParamName;

    /**
     * 文件是否轮询一次
     */
    private Boolean cycleOnce;

    /**
     * 是否作为基准文件
     */
    private Boolean baseFile;


    public FileParameterExplain() {
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Boolean getCycleOnce() {
        return cycleOnce;
    }

    public void setCycleOnce(Boolean cycleOnce) {
        this.cycleOnce = cycleOnce;
    }

    public Boolean getBaseFile() {
        return baseFile;
    }

    public void setBaseFile(Boolean baseFile) {
        this.baseFile = baseFile;
    }

    public String getFileParamName() {
        return fileParamName;
    }

    public void setFileParamName(String fileParamName) {
        this.fileParamName = fileParamName;
    }

    @Override
    public String toString() {
        return "FileParameterExplain{" +
                "fileName='" + fileName + '\'' +
                ", fileParamName='" + fileParamName + '\'' +
                ", cycleOnce=" + cycleOnce +
                ", baseFile=" + baseFile +
                '}';
    }
}
