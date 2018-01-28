package cn.jeeweb.modules.bbj.jingdiao.bbjzqb.entity;

import cn.jeeweb.core.common.entity.AbstractEntity;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import java.util.Date;
import cn.jeeweb.modules.sys.entity.User;

/**   
 * @Title: 债权表
 * @Description: 债权表
 * @author even
 * @date 2018-01-28 14:13:43
 * @version V1.0   
 *
 */
@TableName("bbj_zc_obligatory_right")
@SuppressWarnings("serial")
public class BbjZcObligatoryRight extends AbstractEntity<String> {

    /**主键*/
    @TableId(value = "id", type = IdType.UUID)
	private String id;
    /**项目编号*/
    @TableField(value = "item_no")
	private String itemNo;
    /**项目名称*/
    @TableField(value = "item_name")
	private String itemName;
    /**授信类型*/
    @TableField(value = "credit_type")
	private String creditType;
    /**本金余额*/
    @TableField(value = "principal_balance")
	private Double principalBalance;
    /**利息*/
    @TableField(value = "interest")
	private Double interest;
    /**本息合计*/
    @TableField(value = "total_interest")
	private Double totalInterest;
    /**保证人*/
    @TableField(value = "guarantor")
	private String guarantor;
    /**抵/质押物*/
    @TableField(value = "pledge")
	private String pledge;
    /**诉讼阶段*/
    @TableField(value = "litigation_stage")
	private String litigationStage;
    /**抵/质押物查封顺序*/
    @TableField(value = "pledge_sequence")
	private String pledgeSequence;
    /**查封时间预警*/
    @TableField(value = "check_time_warning")
	private Date checkTimeWarning;
    /**重要时间预警*/
    @TableField(value = "important_time_warning")
	private Date importantTimeWarning;
    /**预计回款金额*/
    @TableField(value = "expected_amount_of_payment")
	private String expectedAmountOfPayment;
    /**预计回款时间*/
    @TableField(value = "expected_return_time")
	private Date expectedReturnTime;
    /**拟处置方式*/
    @TableField(value = "quasi_disposal_mode")
	private String quasiDisposalMode;
    /**备注*/
    @TableField(value = "remark")
	private String remark;
    /**经办人*/
    @TableField(value = "agent")
	private String agent;
    /**创建者*/
    @TableField(value = "create_by",el="createBy.id",fill = FieldFill.INSERT)
	private User createBy;
    /**创建时间*/
    @TableField(value = "create_date",fill = FieldFill.INSERT)
	private Date createDate;
    /**更新者*/
    @TableField(value = "update_by",el="updateBy.id",fill = FieldFill.UPDATE)
	private User updateBy;
    /**更新时间*/
    @TableField(value = "update_date",fill = FieldFill.UPDATE)
	private Date updateDate;
    /**备注信息*/
    @TableField(value = "remarks")
	private String remarks;
    /**删除标记（0：正常；1：删除）*/
    @TableField(value = "del_flag")
	private String delFlag;
	
	/**
	 * 获取  id
	 *@return: String  主键
	 */
	public String getId(){
		return this.id;
	}

	/**
	 * 设置  id
	 *@param: id  主键
	 */
	public void setId(String id){
		this.id = id;
	}
	/**
	 * 获取  itemNo
	 *@return: String  项目编号
	 */
	public String getItemNo(){
		return this.itemNo;
	}

	/**
	 * 设置  itemNo
	 *@param: itemNo  项目编号
	 */
	public void setItemNo(String itemNo){
		this.itemNo = itemNo;
	}
	/**
	 * 获取  itemName
	 *@return: String  项目名称
	 */
	public String getItemName(){
		return this.itemName;
	}

	/**
	 * 设置  itemName
	 *@param: itemName  项目名称
	 */
	public void setItemName(String itemName){
		this.itemName = itemName;
	}
	/**
	 * 获取  creditType
	 *@return: String  授信类型
	 */
	public String getCreditType(){
		return this.creditType;
	}

	/**
	 * 设置  creditType
	 *@param: creditType  授信类型
	 */
	public void setCreditType(String creditType){
		this.creditType = creditType;
	}
	/**
	 * 获取  principalBalance
	 *@return: Double  本金余额
	 */
	public Double getPrincipalBalance(){
		return this.principalBalance;
	}

	/**
	 * 设置  principalBalance
	 *@param: principalBalance  本金余额
	 */
	public void setPrincipalBalance(Double principalBalance){
		this.principalBalance = principalBalance;
	}
	/**
	 * 获取  interest
	 *@return: Double  利息
	 */
	public Double getInterest(){
		return this.interest;
	}

	/**
	 * 设置  interest
	 *@param: interest  利息
	 */
	public void setInterest(Double interest){
		this.interest = interest;
	}
	/**
	 * 获取  totalInterest
	 *@return: Double  本息合计
	 */
	public Double getTotalInterest(){
		return this.totalInterest;
	}

	/**
	 * 设置  totalInterest
	 *@param: totalInterest  本息合计
	 */
	public void setTotalInterest(Double totalInterest){
		this.totalInterest = totalInterest;
	}
	/**
	 * 获取  guarantor
	 *@return: String  保证人
	 */
	public String getGuarantor(){
		return this.guarantor;
	}

	/**
	 * 设置  guarantor
	 *@param: guarantor  保证人
	 */
	public void setGuarantor(String guarantor){
		this.guarantor = guarantor;
	}
	/**
	 * 获取  pledge
	 *@return: String  抵/质押物
	 */
	public String getPledge(){
		return this.pledge;
	}

	/**
	 * 设置  pledge
	 *@param: pledge  抵/质押物
	 */
	public void setPledge(String pledge){
		this.pledge = pledge;
	}
	/**
	 * 获取  litigationStage
	 *@return: String  诉讼阶段
	 */
	public String getLitigationStage(){
		return this.litigationStage;
	}

	/**
	 * 设置  litigationStage
	 *@param: litigationStage  诉讼阶段
	 */
	public void setLitigationStage(String litigationStage){
		this.litigationStage = litigationStage;
	}
	/**
	 * 获取  pledgeSequence
	 *@return: String  抵/质押物查封顺序
	 */
	public String getPledgeSequence(){
		return this.pledgeSequence;
	}

	/**
	 * 设置  pledgeSequence
	 *@param: pledgeSequence  抵/质押物查封顺序
	 */
	public void setPledgeSequence(String pledgeSequence){
		this.pledgeSequence = pledgeSequence;
	}
	/**
	 * 获取  checkTimeWarning
	 *@return: Date  查封时间预警
	 */
	public Date getCheckTimeWarning(){
		return this.checkTimeWarning;
	}

	/**
	 * 设置  checkTimeWarning
	 *@param: checkTimeWarning  查封时间预警
	 */
	public void setCheckTimeWarning(Date checkTimeWarning){
		this.checkTimeWarning = checkTimeWarning;
	}
	/**
	 * 获取  importantTimeWarning
	 *@return: Date  重要时间预警
	 */
	public Date getImportantTimeWarning(){
		return this.importantTimeWarning;
	}

	/**
	 * 设置  importantTimeWarning
	 *@param: importantTimeWarning  重要时间预警
	 */
	public void setImportantTimeWarning(Date importantTimeWarning){
		this.importantTimeWarning = importantTimeWarning;
	}
	/**
	 * 获取  expectedAmountOfPayment
	 *@return: String  预计回款金额
	 */
	public String getExpectedAmountOfPayment(){
		return this.expectedAmountOfPayment;
	}

	/**
	 * 设置  expectedAmountOfPayment
	 *@param: expectedAmountOfPayment  预计回款金额
	 */
	public void setExpectedAmountOfPayment(String expectedAmountOfPayment){
		this.expectedAmountOfPayment = expectedAmountOfPayment;
	}
	/**
	 * 获取  expectedReturnTime
	 *@return: Date  预计回款时间
	 */
	public Date getExpectedReturnTime(){
		return this.expectedReturnTime;
	}

	/**
	 * 设置  expectedReturnTime
	 *@param: expectedReturnTime  预计回款时间
	 */
	public void setExpectedReturnTime(Date expectedReturnTime){
		this.expectedReturnTime = expectedReturnTime;
	}
	/**
	 * 获取  quasiDisposalMode
	 *@return: String  拟处置方式
	 */
	public String getQuasiDisposalMode(){
		return this.quasiDisposalMode;
	}

	/**
	 * 设置  quasiDisposalMode
	 *@param: quasiDisposalMode  拟处置方式
	 */
	public void setQuasiDisposalMode(String quasiDisposalMode){
		this.quasiDisposalMode = quasiDisposalMode;
	}
	/**
	 * 获取  remark
	 *@return: String  备注
	 */
	public String getRemark(){
		return this.remark;
	}

	/**
	 * 设置  remark
	 *@param: remark  备注
	 */
	public void setRemark(String remark){
		this.remark = remark;
	}
	/**
	 * 获取  agent
	 *@return: String  经办人
	 */
	public String getAgent(){
		return this.agent;
	}

	/**
	 * 设置  agent
	 *@param: agent  经办人
	 */
	public void setAgent(String agent){
		this.agent = agent;
	}
	/**
	 * 获取  createBy
	 *@return: User  创建者
	 */
	public User getCreateBy(){
		return this.createBy;
	}

	/**
	 * 设置  createBy
	 *@param: createBy  创建者
	 */
	public void setCreateBy(User createBy){
		this.createBy = createBy;
	}
	/**
	 * 获取  createDate
	 *@return: Date  创建时间
	 */
	public Date getCreateDate(){
		return this.createDate;
	}

	/**
	 * 设置  createDate
	 *@param: createDate  创建时间
	 */
	public void setCreateDate(Date createDate){
		this.createDate = createDate;
	}
	/**
	 * 获取  updateBy
	 *@return: User  更新者
	 */
	public User getUpdateBy(){
		return this.updateBy;
	}

	/**
	 * 设置  updateBy
	 *@param: updateBy  更新者
	 */
	public void setUpdateBy(User updateBy){
		this.updateBy = updateBy;
	}
	/**
	 * 获取  updateDate
	 *@return: Date  更新时间
	 */
	public Date getUpdateDate(){
		return this.updateDate;
	}

	/**
	 * 设置  updateDate
	 *@param: updateDate  更新时间
	 */
	public void setUpdateDate(Date updateDate){
		this.updateDate = updateDate;
	}
	/**
	 * 获取  remarks
	 *@return: String  备注信息
	 */
	public String getRemarks(){
		return this.remarks;
	}

	/**
	 * 设置  remarks
	 *@param: remarks  备注信息
	 */
	public void setRemarks(String remarks){
		this.remarks = remarks;
	}
	/**
	 * 获取  delFlag
	 *@return: String  删除标记（0：正常；1：删除）
	 */
	public String getDelFlag(){
		return this.delFlag;
	}

	/**
	 * 设置  delFlag
	 *@param: delFlag  删除标记（0：正常；1：删除）
	 */
	public void setDelFlag(String delFlag){
		this.delFlag = delFlag;
	}
	
}
