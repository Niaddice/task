package com.sync.task.syncTask.bean;

import java.math.BigDecimal;
import java.util.Date;

/** 
 *
 * @author  Niaddice
 * @date 2016-6-28 下午1:56:01 
 * @version 
 * @return
 */

public class TradeData
{
	private Integer cID;//c.cID,
	private Integer cState;//'状态[1=待审 2=审核通过 3=作废 4=退房]',
	private Integer pType;
	private Integer projectID;//'项目ID', 
	private Integer roomsID;//'房源ID',
	private Integer clientID;//'客户编号',
	private String pName;//'项目名称',
	private String UserName;//'业务员',
	private String louName;//'房源',
	private String GroupName;//'物业类型',
	private BigDecimal rBasePrice;//'底单价',
	private BigDecimal rBaseTotalPrice;//'底总价',
	private BigDecimal rListPrice;//'表单价',
	private BigDecimal rListTotalPrice;//'表总价',
	private BigDecimal rBuildingArea;//'建筑面积',
	private String cpClientName;//'客户姓名',
	private String cpPhone;//'电话',
	private String cCode;//'合同编号',
	private String cOrderCode;//'认购号',
	private BigDecimal cOrderUnitPrice;//'大定单价',
	private BigDecimal cOrderFactPrice;//'大定总价',
	private Date cOrderDate;//'大定日期',
	private BigDecimal cUnitPrice;//'签约单价',
	private BigDecimal cFactPrice;//'签约总价',
	private Date cContractDate;//'签约日期',
	private String pmName;//'付款方式'
	private String RCID;
	private String RTID;
	private String UserId;
	private Integer DeptId;
	private String FillName;
	private String Deptname;
	private Integer Mark;
	private Date lastUpdateDate;
	private BigDecimal PayAmount;
	private Date AuditDate;
	private Date ReturnDate;
	private Integer ID;
	private Long ContractID;
	private Long ppID;
	private String ppPayMode;
	private Date ppPrompt;
	private BigDecimal ppPrice;
	private BigDecimal ppPayedAmount;
	private Date billdate;
	private Date LastUpdate;
	private Date RealGiveDate;
	private String cVersion; // 客户性质
	public Integer getcID() {
		return cID;
	}
	public void setcID(Integer cID) {
		this.cID = cID;
	}
	public Integer getcState() {
		return cState;
	}
	public void setcState(Integer cState) {
		this.cState = cState;
	}
	public Integer getpType() {
		return pType;
	}
	public void setpType(Integer pType) {
		this.pType = pType;
	}
	public Integer getProjectID() {
		return projectID;
	}
	public void setProjectID(Integer projectID) {
		this.projectID = projectID;
	}
	public Integer getRoomsID() {
		return roomsID;
	}
	public void setRoomsID(Integer roomsID) {
		this.roomsID = roomsID;
	}
	public Integer getClientID() {
		return clientID;
	}
	public void setClientID(Integer clientID) {
		this.clientID = clientID;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getLouName() {
		return louName;
	}
	public void setLouName(String louName) {
		this.louName = louName;
	}
	public String getGroupName() {
		return GroupName;
	}
	public void setGroupName(String groupName) {
		GroupName = groupName;
	}
	public BigDecimal getrBasePrice() {
		return rBasePrice;
	}
	public void setrBasePrice(BigDecimal rBasePrice) {
		this.rBasePrice = rBasePrice;
	}
	public BigDecimal getrBaseTotalPrice() {
		return rBaseTotalPrice;
	}
	public void setrBaseTotalPrice(BigDecimal rBaseTotalPrice) {
		this.rBaseTotalPrice = rBaseTotalPrice;
	}
	public BigDecimal getrListPrice() {
		return rListPrice;
	}
	public void setrListPrice(BigDecimal rListPrice) {
		this.rListPrice = rListPrice;
	}
	public BigDecimal getrListTotalPrice() {
		return rListTotalPrice;
	}
	public void setrListTotalPrice(BigDecimal rListTotalPrice) {
		this.rListTotalPrice = rListTotalPrice;
	}
	public BigDecimal getrBuildingArea() {
		return rBuildingArea;
	}
	public void setrBuildingArea(BigDecimal rBuildingArea) {
		this.rBuildingArea = rBuildingArea;
	}
	public String getCpClientName() {
		return cpClientName;
	}
	public void setCpClientName(String cpClientName) {
		this.cpClientName = cpClientName;
	}
	public String getCpPhone() {
		return cpPhone;
	}
	public void setCpPhone(String cpPhone) {
		this.cpPhone = cpPhone;
	}
	public String getcCode() {
		return cCode;
	}
	public void setcCode(String cCode) {
		this.cCode = cCode;
	}
	public String getcOrderCode() {
		return cOrderCode;
	}
	public void setcOrderCode(String cOrderCode) {
		this.cOrderCode = cOrderCode;
	}
	public BigDecimal getcOrderUnitPrice() {
		return cOrderUnitPrice;
	}
	public void setcOrderUnitPrice(BigDecimal cOrderUnitPrice) {
		this.cOrderUnitPrice = cOrderUnitPrice;
	}
	public BigDecimal getcOrderFactPrice() {
		return cOrderFactPrice;
	}
	public void setcOrderFactPrice(BigDecimal cOrderFactPrice) {
		this.cOrderFactPrice = cOrderFactPrice;
	}
	public Date getcOrderDate() {
		return cOrderDate;
	}
	public void setcOrderDate(Date cOrderDate) {
		this.cOrderDate = cOrderDate;
	}
	public BigDecimal getcUnitPrice() {
		return cUnitPrice;
	}
	public void setcUnitPrice(BigDecimal cUnitPrice) {
		this.cUnitPrice = cUnitPrice;
	}
	public BigDecimal getcFactPrice() {
		return cFactPrice;
	}
	public void setcFactPrice(BigDecimal cFactPrice) {
		this.cFactPrice = cFactPrice;
	}
	public Date getcContractDate() {
		return cContractDate;
	}
	public void setcContractDate(Date cContractDate) {
		this.cContractDate = cContractDate;
	}
	public String getPmName() {
		return pmName;
	}
	public void setPmName(String pmName) {
		this.pmName = pmName;
	}
	public String getRCID() {
		return RCID;
	}
	public void setRCID(String rCID) {
		RCID = rCID;
	}
	public String getRTID() {
		return RTID;
	}
	public void setRTID(String rTID) {
		RTID = rTID;
	}
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public Integer getDeptId() {
		return DeptId;
	}
	public void setDeptId(Integer deptId) {
		DeptId = deptId;
	}
	public String getFillName() {
		return FillName;
	}
	public void setFillName(String fillName) {
		FillName = fillName;
	}
	public String getDeptname() {
		return Deptname;
	}
	public void setDeptname(String deptname) {
		Deptname = deptname;
	}
	public Integer getMark() {
		return Mark;
	}
	public void setMark(Integer mark) {
		Mark = mark;
	}
	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}
	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}
	public BigDecimal getPayAmount() {
		return PayAmount;
	}
	public void setPayAmount(BigDecimal payAmount) {
		PayAmount = payAmount;
	}
	public Date getAuditDate() {
		return AuditDate;
	}
	public void setAuditDate(Date auditDate) {
		AuditDate = auditDate;
	}
	public Date getReturnDate() {
		return ReturnDate;
	}
	public void setReturnDate(Date returnDate) {
		ReturnDate = returnDate;
	}
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public Long getContractID() {
		return ContractID;
	}
	public void setContractID(Long contractID) {
		ContractID = contractID;
	}
	public Long getPpID() {
		return ppID;
	}
	public void setPpID(Long ppID) {
		this.ppID = ppID;
	}
	public String getPpPayMode() {
		return ppPayMode;
	}
	public void setPpPayMode(String ppPayMode) {
		this.ppPayMode = ppPayMode;
	}
	public Date getPpPrompt() {
		return ppPrompt;
	}
	public void setPpPrompt(Date ppPrompt) {
		this.ppPrompt = ppPrompt;
	}
	public BigDecimal getPpPrice() {
		return ppPrice;
	}
	public void setPpPrice(BigDecimal ppPrice) {
		this.ppPrice = ppPrice;
	}
	public BigDecimal getPpPayedAmount() {
		return ppPayedAmount;
	}
	public void setPpPayedAmount(BigDecimal ppPayedAmount) {
		this.ppPayedAmount = ppPayedAmount;
	}
	public Date getBilldate() {
		return billdate;
	}
	public void setBilldate(Date billdate) {
		this.billdate = billdate;
	}
	public Date getLastUpdate() {
		return LastUpdate;
	}
	public void setLastUpdate(Date lastUpdate) {
		LastUpdate = lastUpdate;
	}
	public Date getRealGiveDate() {
		return RealGiveDate;
	}
	public void setRealGiveDate(Date realGiveDate) {
		RealGiveDate = realGiveDate;
	}

	public String getcVersion()
	{
		return cVersion;
	}

	public void setcVersion(String cVersion)
	{
		this.cVersion = cVersion;
	}
}
