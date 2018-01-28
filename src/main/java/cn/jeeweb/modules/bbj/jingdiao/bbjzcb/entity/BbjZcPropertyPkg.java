package cn.jeeweb.modules.bbj.jingdiao.bbjzcb.entity;

import cn.jeeweb.core.common.entity.AbstractEntity;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import cn.jeeweb.modules.sys.entity.User;
import java.util.Date;

/**   
 * @Title: 资产包
 * @Description: 资产包
 * @author even
 * @date 2018-01-28 14:32:21
 * @version V1.0   
 *
 */
@TableName("bbj_zc_property_pkg")
@SuppressWarnings("serial")
public class BbjZcPropertyPkg extends AbstractEntity<String> {

    /**主键*/
    @TableId(value = "id", type = IdType.UUID)
	private String id;
    /**贷款发放行*/
    @TableField(value = "loan_origination")
	private String loanOrigination;
    /**转让方*/
    @TableField(value = "transferor")
	private String transferor;
    /**持有方*/
    @TableField(value = "holder")
	private String holder;
    /**本金余额*/
    @TableField(value = "principal_balance")
	private Double principalBalance;
    /**利息*/
    @TableField(value = "interest")
	private Double interest;
    /**本息合计*/
    @TableField(value = "sotoppi")
	private Double sotoppi;
    /**计息截止日期*/
    @TableField(value = "interest_accrual_endtime")
	private String interestAccrualEndtime;
    /**贷款方转出时间*/
    @TableField(value = "cs_outtime")
	private String csOuttime;
    /**贷款方公告时间*/
    @TableField(value = "cs_ctime")
	private String csCtime;
    /**转让方转出时间*/
    @TableField(value = "transferor_outime")
	private String transferorOutime;
    /**上年度回现金额*/
    @TableField(value = "aocr_ly")
	private Double aocrLy;
    /**本年度回现金额*/
    @TableField(value = "aocr_ty")
	private Double aocrTy;
    /**年度回现目标*/
    @TableField(value = "annual_return_target")
	private String annualReturnTarget;
    /**创建者*/
    @TableField(value = "create_by",el="createBy.id",fill = FieldFill.INSERT)
	private User createBy;
    /**创建日期*/
    @TableField(value = "create_date",fill = FieldFill.INSERT)
	private Date createDate;
    /**更新者*/
    @TableField(value = "update_by",el="updateBy.id",fill = FieldFill.UPDATE)
	private User updateBy;
    /**更新日期*/
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
	 * 获取  loanOrigination
	 *@return: String  贷款发放行
	 */
	public String getLoanOrigination(){
		return this.loanOrigination;
	}

	/**
	 * 设置  loanOrigination
	 *@param: loanOrigination  贷款发放行
	 */
	public void setLoanOrigination(String loanOrigination){
		this.loanOrigination = loanOrigination;
	}
	/**
	 * 获取  transferor
	 *@return: String  转让方
	 */
	public String getTransferor(){
		return this.transferor;
	}

	/**
	 * 设置  transferor
	 *@param: transferor  转让方
	 */
	public void setTransferor(String transferor){
		this.transferor = transferor;
	}
	/**
	 * 获取  holder
	 *@return: String  持有方
	 */
	public String getHolder(){
		return this.holder;
	}

	/**
	 * 设置  holder
	 *@param: holder  持有方
	 */
	public void setHolder(String holder){
		this.holder = holder;
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
	 * 获取  sotoppi
	 *@return: Double  本息合计
	 */
	public Double getSotoppi(){
		return this.sotoppi;
	}

	/**
	 * 设置  sotoppi
	 *@param: sotoppi  本息合计
	 */
	public void setSotoppi(Double sotoppi){
		this.sotoppi = sotoppi;
	}
	/**
	 * 获取  interestAccrualEndtime
	 *@return: String  计息截止日期
	 */
	public String getInterestAccrualEndtime(){
		return this.interestAccrualEndtime;
	}

	/**
	 * 设置  interestAccrualEndtime
	 *@param: interestAccrualEndtime  计息截止日期
	 */
	public void setInterestAccrualEndtime(String interestAccrualEndtime){
		this.interestAccrualEndtime = interestAccrualEndtime;
	}
	/**
	 * 获取  csOuttime
	 *@return: String  贷款方转出时间
	 */
	public String getCsOuttime(){
		return this.csOuttime;
	}

	/**
	 * 设置  csOuttime
	 *@param: csOuttime  贷款方转出时间
	 */
	public void setCsOuttime(String csOuttime){
		this.csOuttime = csOuttime;
	}
	/**
	 * 获取  csCtime
	 *@return: String  贷款方公告时间
	 */
	public String getCsCtime(){
		return this.csCtime;
	}

	/**
	 * 设置  csCtime
	 *@param: csCtime  贷款方公告时间
	 */
	public void setCsCtime(String csCtime){
		this.csCtime = csCtime;
	}
	/**
	 * 获取  transferorOutime
	 *@return: String  转让方转出时间
	 */
	public String getTransferorOutime(){
		return this.transferorOutime;
	}

	/**
	 * 设置  transferorOutime
	 *@param: transferorOutime  转让方转出时间
	 */
	public void setTransferorOutime(String transferorOutime){
		this.transferorOutime = transferorOutime;
	}
	/**
	 * 获取  aocrLy
	 *@return: Double  上年度回现金额
	 */
	public Double getAocrLy(){
		return this.aocrLy;
	}

	/**
	 * 设置  aocrLy
	 *@param: aocrLy  上年度回现金额
	 */
	public void setAocrLy(Double aocrLy){
		this.aocrLy = aocrLy;
	}
	/**
	 * 获取  aocrTy
	 *@return: Double  本年度回现金额
	 */
	public Double getAocrTy(){
		return this.aocrTy;
	}

	/**
	 * 设置  aocrTy
	 *@param: aocrTy  本年度回现金额
	 */
	public void setAocrTy(Double aocrTy){
		this.aocrTy = aocrTy;
	}
	/**
	 * 获取  annualReturnTarget
	 *@return: String  年度回现目标
	 */
	public String getAnnualReturnTarget(){
		return this.annualReturnTarget;
	}

	/**
	 * 设置  annualReturnTarget
	 *@param: annualReturnTarget  年度回现目标
	 */
	public void setAnnualReturnTarget(String annualReturnTarget){
		this.annualReturnTarget = annualReturnTarget;
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
	 *@return: Date  创建日期
	 */
	public Date getCreateDate(){
		return this.createDate;
	}

	/**
	 * 设置  createDate
	 *@param: createDate  创建日期
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
	 *@return: Date  更新日期
	 */
	public Date getUpdateDate(){
		return this.updateDate;
	}

	/**
	 * 设置  updateDate
	 *@param: updateDate  更新日期
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
