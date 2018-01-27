package cn.jeeweb.modules.bbj.jingdiao.bbjzcloancontract.entity;

import cn.jeeweb.core.common.entity.AbstractEntity;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import java.util.Date;
import cn.jeeweb.modules.sys.entity.User;

/**   
 * @Title: 借款合同
 * @Description: 借款合同
 * @author even
 * @date 2018-01-27 22:45:22
 * @version V1.0   
 *
 */
@TableName("bbj_zc_loan_contract")
@SuppressWarnings("serial")
public class BbjZcLoanContract extends AbstractEntity<String> {

    /**主键*/
    @TableId(value = "id", type = IdType.UUID)
	private String id;
    /**合同类型*/
    @TableField(value = "contract_type")
	private String contractType;
    /**借款人*/
    @TableField(value = "borrower")
	private String borrower;
    /**贷款行*/
    @TableField(value = "loan_lender")
	private String loanLender;
    /**借款合同编号*/
    @TableField(value = "loan_contract_no")
	private String loanContractNo;
    /**合同签订日*/
    @TableField(value = "contract_date")
	private Date contractDate;
    /**合同本金*/
    @TableField(value = "contract_principal")
	private Double contractPrincipal;
    /**合同本息*/
    @TableField(value = "contract_amount")
	private Double contractAmount;
    /**本金余额*/
    @TableField(value = "principal_balance")
	private Double principalBalance;
    /**本息余额*/
    @TableField(value = "amount_balance")
	private Double amountBalance;
    /**计息截至日期*/
    @TableField(value = "interest_rate_deadline")
	private Date interestRateDeadline;
    /**借款开始时间*/
    @TableField(value = "borrowed_start")
	private Date borrowedStart;
    /**借款结束时间*/
    @TableField(value = "borrowed_end")
	private Date borrowedEnd;
    /**借款用途*/
    @TableField(value = "borrowing_use")
	private String borrowingUse;
    /**是否诉讼*/
    @TableField(value = "id_litigation")
	private String idLitigation;
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
    /**删除标志*/
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
	 * 获取  contractType
	 *@return: String  合同类型
	 */
	public String getContractType(){
		return this.contractType;
	}

	/**
	 * 设置  contractType
	 *@param: contractType  合同类型
	 */
	public void setContractType(String contractType){
		this.contractType = contractType;
	}
	/**
	 * 获取  borrower
	 *@return: String  借款人
	 */
	public String getBorrower(){
		return this.borrower;
	}

	/**
	 * 设置  borrower
	 *@param: borrower  借款人
	 */
	public void setBorrower(String borrower){
		this.borrower = borrower;
	}
	/**
	 * 获取  loanLender
	 *@return: String  贷款行
	 */
	public String getLoanLender(){
		return this.loanLender;
	}

	/**
	 * 设置  loanLender
	 *@param: loanLender  贷款行
	 */
	public void setLoanLender(String loanLender){
		this.loanLender = loanLender;
	}
	/**
	 * 获取  loanContractNo
	 *@return: String  借款合同编号
	 */
	public String getLoanContractNo(){
		return this.loanContractNo;
	}

	/**
	 * 设置  loanContractNo
	 *@param: loanContractNo  借款合同编号
	 */
	public void setLoanContractNo(String loanContractNo){
		this.loanContractNo = loanContractNo;
	}
	/**
	 * 获取  contractDate
	 *@return: Date  合同签订日
	 */
	public Date getContractDate(){
		return this.contractDate;
	}

	/**
	 * 设置  contractDate
	 *@param: contractDate  合同签订日
	 */
	public void setContractDate(Date contractDate){
		this.contractDate = contractDate;
	}
	/**
	 * 获取  contractPrincipal
	 *@return: Double  合同本金
	 */
	public Double getContractPrincipal(){
		return this.contractPrincipal;
	}

	/**
	 * 设置  contractPrincipal
	 *@param: contractPrincipal  合同本金
	 */
	public void setContractPrincipal(Double contractPrincipal){
		this.contractPrincipal = contractPrincipal;
	}
	/**
	 * 获取  contractAmount
	 *@return: Double  合同本息
	 */
	public Double getContractAmount(){
		return this.contractAmount;
	}

	/**
	 * 设置  contractAmount
	 *@param: contractAmount  合同本息
	 */
	public void setContractAmount(Double contractAmount){
		this.contractAmount = contractAmount;
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
	 * 获取  amountBalance
	 *@return: Double  本息余额
	 */
	public Double getAmountBalance(){
		return this.amountBalance;
	}

	/**
	 * 设置  amountBalance
	 *@param: amountBalance  本息余额
	 */
	public void setAmountBalance(Double amountBalance){
		this.amountBalance = amountBalance;
	}
	/**
	 * 获取  interestRateDeadline
	 *@return: Date  计息截至日期
	 */
	public Date getInterestRateDeadline(){
		return this.interestRateDeadline;
	}

	/**
	 * 设置  interestRateDeadline
	 *@param: interestRateDeadline  计息截至日期
	 */
	public void setInterestRateDeadline(Date interestRateDeadline){
		this.interestRateDeadline = interestRateDeadline;
	}
	/**
	 * 获取  borrowedStart
	 *@return: Date  借款开始时间
	 */
	public Date getBorrowedStart(){
		return this.borrowedStart;
	}

	/**
	 * 设置  borrowedStart
	 *@param: borrowedStart  借款开始时间
	 */
	public void setBorrowedStart(Date borrowedStart){
		this.borrowedStart = borrowedStart;
	}
	/**
	 * 获取  borrowedEnd
	 *@return: Date  借款结束时间
	 */
	public Date getBorrowedEnd(){
		return this.borrowedEnd;
	}

	/**
	 * 设置  borrowedEnd
	 *@param: borrowedEnd  借款结束时间
	 */
	public void setBorrowedEnd(Date borrowedEnd){
		this.borrowedEnd = borrowedEnd;
	}
	/**
	 * 获取  borrowingUse
	 *@return: String  借款用途
	 */
	public String getBorrowingUse(){
		return this.borrowingUse;
	}

	/**
	 * 设置  borrowingUse
	 *@param: borrowingUse  借款用途
	 */
	public void setBorrowingUse(String borrowingUse){
		this.borrowingUse = borrowingUse;
	}
	/**
	 * 获取  idLitigation
	 *@return: String  是否诉讼
	 */
	public String getIdLitigation(){
		return this.idLitigation;
	}

	/**
	 * 设置  idLitigation
	 *@param: idLitigation  是否诉讼
	 */
	public void setIdLitigation(String idLitigation){
		this.idLitigation = idLitigation;
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
	 *@return: String  删除标志
	 */
	public String getDelFlag(){
		return this.delFlag;
	}

	/**
	 * 设置  delFlag
	 *@param: delFlag  删除标志
	 */
	public void setDelFlag(String delFlag){
		this.delFlag = delFlag;
	}
	
}
