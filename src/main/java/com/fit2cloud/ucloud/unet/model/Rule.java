package com.fit2cloud.ucloud.unet.model;

/**
 * Created by chixq on 8/2/15.
 */
public class Rule {
    private String SrcIP;
    private Integer Priority;
    private String ProtocolType;
    private String DstPort;
    private String RuleAction;

    public String getSrcIP() {
        return SrcIP;
    }

    public void setSrcIP(String srcIP) {
        SrcIP = srcIP;
    }

    public int getPriority() {
        return Priority;
    }

    public void setPriority(Integer priority) {
        Priority = priority;
    }

    public String getProtocolType() {
        return ProtocolType;
    }

    public void setProtocolType(String protocolType) {
        ProtocolType = protocolType;
    }

    public String getDstPort() {
        return DstPort;
    }

    public void setDstPort(String dstPort) {
        DstPort = dstPort;
    }

    public String getRuleAction() {
        return RuleAction;
    }

    public void setRuleAction(String ruleAction) {
        RuleAction = ruleAction;
    }

    @Override
    public String toString() {
        return "Rule{" +
                "SrcIP='" + SrcIP + '\'' +
                ", Priority=" + Priority +
                ", ProtocolType='" + ProtocolType + '\'' +
                ", DstPort='" + DstPort + '\'' +
                ", RuleAction='" + RuleAction + '\'' +
                '}';
    }
}
