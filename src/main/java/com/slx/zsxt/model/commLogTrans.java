package com.slx.zsxt.model;

import java.math.BigDecimal;
import java.util.Date;

public class commLogTrans {
    private String logTransId;

    private String coreLogsId;

    private String custNo;

    private String transType;

    private String transRoute;

    private String payAcct;

    private String payName;

    private String recAcct;

    private String recName;

    private Date transDate;

    private String transTime;

    private BigDecimal transAmt;

    private String ccy;

    private BigDecimal fee;

    private String transPrupose;

    private String transStatus;

    private String remark;

    public String getLogTransId() {
        return logTransId;
    }

    public void setLogTransId(String logTransId) {
        this.logTransId = logTransId == null ? null : logTransId.trim();
    }

    public String getCoreLogsId() {
        return coreLogsId;
    }

    public void setCoreLogsId(String coreLogsId) {
        this.coreLogsId = coreLogsId == null ? null : coreLogsId.trim();
    }

    public String getCustNo() {
        return custNo;
    }

    public void setCustNo(String custNo) {
        this.custNo = custNo == null ? null : custNo.trim();
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType == null ? null : transType.trim();
    }

    public String getTransRoute() {
        return transRoute;
    }

    public void setTransRoute(String transRoute) {
        this.transRoute = transRoute == null ? null : transRoute.trim();
    }

    public String getPayAcct() {
        return payAcct;
    }

    public void setPayAcct(String payAcct) {
        this.payAcct = payAcct == null ? null : payAcct.trim();
    }

    public String getPayName() {
        return payName;
    }

    public void setPayName(String payName) {
        this.payName = payName == null ? null : payName.trim();
    }

    public String getRecAcct() {
        return recAcct;
    }

    public void setRecAcct(String recAcct) {
        this.recAcct = recAcct == null ? null : recAcct.trim();
    }

    public String getRecName() {
        return recName;
    }

    public void setRecName(String recName) {
        this.recName = recName == null ? null : recName.trim();
    }

    public Date getTransDate() {
        return transDate;
    }

    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public String getTransTime() {
        return transTime;
    }

    public void setTransTime(String transTime) {
        this.transTime = transTime == null ? null : transTime.trim();
    }

    public BigDecimal getTransAmt() {
        return transAmt;
    }

    public void setTransAmt(BigDecimal transAmt) {
        this.transAmt = transAmt;
    }

    public String getCcy() {
        return ccy;
    }

    public void setCcy(String ccy) {
        this.ccy = ccy == null ? null : ccy.trim();
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public String getTransPrupose() {
        return transPrupose;
    }

    public void setTransPrupose(String transPrupose) {
        this.transPrupose = transPrupose == null ? null : transPrupose.trim();
    }

    public String getTransStatus() {
        return transStatus;
    }

    public void setTransStatus(String transStatus) {
        this.transStatus = transStatus == null ? null : transStatus.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}