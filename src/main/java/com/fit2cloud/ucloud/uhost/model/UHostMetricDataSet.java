package com.fit2cloud.ucloud.uhost.model;

/**
 * Created by dhf on 2017/5/24.
 */
public class UHostMetricDataSet {
    private String ResourceId;
    private String Name;
    //阻塞进程数目
    private int BlockProcessCount;
    //CPU使用率
    private float CPUUtilization;
    //数据盘使用率
    private float DataSpaceUsage;
    //磁盘读次数
    private int DiskReadOps;
    //磁盘写次数
    private int DiskWriteOps;
    //磁盘读流量
    private int IORead;
    //磁盘写流量
    private int IOWrite;
    //内存使用率
    private float MemUsage;
    //网卡入带宽
    private int NICIn;
    //网卡出带宽
    private int NICOut;
    //网卡入包量
    private int NetPacketIn;
    //网卡出包量
    private int NetPacketOut;
    private String Remark;
    //系统盘使用率
    private float RootSpaceUsage;
    //运行进程数目
    private int RunnableProcessCount;
    private String Uuid;

    public String getResourceId() {
        return ResourceId;
    }

    public void setResourceId(String resourceId) {
        ResourceId = resourceId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getBlockProcessCount() {
        return BlockProcessCount;
    }

    public void setBlockProcessCount(int blockProcessCount) {
        BlockProcessCount = blockProcessCount;
    }

    public float getCPUUtilization() {
        return CPUUtilization;
    }

    public void setCPUUtilization(float CPUUtilization) {
        this.CPUUtilization = CPUUtilization;
    }

    public float getDataSpaceUsage() {
        return DataSpaceUsage;
    }

    public void setDataSpaceUsage(float dataSpaceUsage) {
        DataSpaceUsage = dataSpaceUsage;
    }

    public int getDiskReadOps() {
        return DiskReadOps;
    }

    public void setDiskReadOps(int diskReadOps) {
        DiskReadOps = diskReadOps;
    }

    public int getDiskWriteOps() {
        return DiskWriteOps;
    }

    public void setDiskWriteOps(int diskWriteOps) {
        DiskWriteOps = diskWriteOps;
    }

    public int getIORead() {
        return IORead;
    }

    public void setIORead(int IORead) {
        this.IORead = IORead;
    }

    public int getIOWrite() {
        return IOWrite;
    }

    public void setIOWrite(int IOWrite) {
        this.IOWrite = IOWrite;
    }

    public float getMemUsage() {
        return MemUsage;
    }

    public void setMemUsage(float memUsage) {
        MemUsage = memUsage;
    }

    public int getNICIn() {
        return NICIn;
    }

    public void setNICIn(int NICIn) {
        this.NICIn = NICIn;
    }

    public int getNICOut() {
        return NICOut;
    }

    public void setNICOut(int NICOut) {
        this.NICOut = NICOut;
    }

    public int getNetPacketIn() {
        return NetPacketIn;
    }

    public void setNetPacketIn(int netPacketIn) {
        NetPacketIn = netPacketIn;
    }

    public int getNetPacketOut() {
        return NetPacketOut;
    }

    public void setNetPacketOut(int netPacketOut) {
        NetPacketOut = netPacketOut;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }

    public float getRootSpaceUsage() {
        return RootSpaceUsage;
    }

    public void setRootSpaceUsage(float rootSpaceUsage) {
        RootSpaceUsage = rootSpaceUsage;
    }

    public int getRunnableProcessCount() {
        return RunnableProcessCount;
    }

    public void setRunnableProcessCount(int runnableProcessCount) {
        RunnableProcessCount = runnableProcessCount;
    }

    public String getUuid() {
        return Uuid;
    }

    public void setUuid(String uuid) {
        Uuid = uuid;
    }
}
