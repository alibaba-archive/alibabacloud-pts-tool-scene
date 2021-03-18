package com.taobao.api.entity.pts.scene;


/**
 * 文件参数结构
 */
public class FileParameter {

    /**
     * 文件名
     */
    private String fileName;

    /**
     * 文件的oss地址，必须是公网可访问的
     */
    private String fileOssAddress;


    public FileParameter() {
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileOssAddress() {
        return fileOssAddress;
    }

    public void setFileOssAddress(String fileOssAddress) {
        this.fileOssAddress = fileOssAddress;
    }

    @Override
    public String toString() {
        return "FileParameter{" +
                "fileName='" + fileName + '\'' +
                ", fileOssAddress='" + fileOssAddress + '\'' +
                '}';
    }
}
