package cn.jeeweb.modules.bbj.jingdiao.bbjzclitigationinformation.entity;

import cn.jeeweb.core.common.entity.AbstractEntity;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import cn.jeeweb.modules.sys.entity.User;
import java.util.Date;

/**   
 * @Title: 诉讼信息
 * @Description: 诉讼信息
 * @author somuns
 * @date 2018-01-24 19:50:28
 * @version V1.0   
 *
 */
@TableName("bbj_zc_litigation_information")
@SuppressWarnings("serial")
public class BbjZcLitigationInformation extends AbstractEntity<String> {

    /**字段主键*/
    @TableId(value = "id", type = IdType.UUID)
	private String id;
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
    /**删除标记（0：正常；1：删除）*/
    @TableField(value = "del_flag")
	private String delFlag;
    /**备注信息*/
    @TableField(value = "remarks")
	private String remarks;
    /**主债权时效最后到期日*/
    @TableField(value = "the_expiry_date_of_the_principal_credit")
	private Date theExpiryDateOfThePrincipalCredit;
    /**是否超过主债权时效*/
    @TableField(value = "sfzzq_timeout")
	private String sfzzqTimeout;
    /**担保时效最后到期日*/
    @TableField(value = "adsxzh_time")
	private Date adsxzhTime;
    /**是否超过担保时效*/
    @TableField(value = "sfab_timeout")
	private String sfabTimeout;
    /**立案时间*/
    @TableField(value = "la_time")
	private Date laTime;
    /**诉讼案号*/
    @TableField(value = "case_no")
	private String caseNo;
    /**诉讼所处阶段*/
    @TableField(value = "case_stage")
	private String caseStage;
    /**判决\仲裁\调解书生效日期*/
    @TableField(value = "pjzctj_effective_date")
	private Date pjzctjEffectiveDate;
    /**诉讼受理法院*/
    @TableField(value = "court_of_ppeal")
	private String courtOPeal;
    /**诉讼承办法官*/
    @TableField(value = "litigant")
	private String litigant;
    /**申请执行最后到期日*/
    @TableField(value = "sqzx_lasttime")
	private Date sqzxLsttime;
    /**执行案号*/
    @TableField(value = "zxaj_no")
	private String zxajNo;
    /**终止执行日期*/
    @TableField(value = "zx_endtime")
	private Date zxEdtime;
    /**终结本次执行日期*/
    @TableField(value = "end_the_execution_date")
	private Date endTheEutionDate;
    /**终结执行日期*/
    @TableField(value = "end_of_execution_date")
	private Date endOfecutionDate;
    /**执行受理法院*/
    @TableField(value = "enforcement_of_court")
	private String enforcementOfCourt;
    /**执行承办法官*/
    @TableField(value = "executive_contractor")
	private String executiveContractor;
    /**保全财产类型*/
    @TableField(value = "property_preservation_type")
	private String propertyPreservationType;
    /**查封\扣押\冻结裁定案号*/
    @TableField(value = "sdf_decision_number")
	private String sdfDecisionNumber;
    /**查封\扣押\冻结裁定日*/
    @TableField(value = "szf_verdict_day")
	private Date szfVerdictDay;
    /**最后到期日*/
    @TableField(value = "last_due_date")
	private Date lastDueDate;
    /**破产债权最后申报日*/
    @TableField(value = "pczqzhsbr")
	private Date pczqzhsbr;
    /**破产案号*/
    @TableField(value = "pcah")
	private String pcah;
    /**破产终结日期*/
    @TableField(value = "pczj_time")
	private Date pczjTime;
    /**是否追索保证人*/
    @TableField(value = "sfzsbzr")
	private String sfzsbzr;
	
	/**
	 * 获取  id
	 *@return: String  字段主键
	 */
	public String getId(){
		return this.id;
	}

	/**
	 * 设置  id
	 *@param: id  字段主键
	 */
	public void setId(String id){
		this.id = id;
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
	 * 获取  theExpiryDateOfThePrincipalCredit
	 *@return: Date  主债权时效最后到期日
	 */
	public Date getTheExpiryDateOfThePrincipalCredit(){
		return this.theExpiryDateOfThePrincipalCredit;
	}

	/**
	 * 设置  theExpiryDateOfThePrincipalCredit
	 *@param: theExpiryDateOfThePrincipalCredit  主债权时效最后到期日
	 */
	public void setTheExpiryDateOfThePrincipalCredit(Date theExpiryDateOfThePrincipalCredit){
		this.theExpiryDateOfThePrincipalCredit = theExpiryDateOfThePrincipalCredit;
	}
	/**
	 * 获取  sfzzqTimeout
	 *@return: String  是否超过主债权时效
	 */
	public String getSfzzqTimeout(){
		return this.sfzzqTimeout;
	}

	/**
	 * 设置  sfzzqTimeout
	 *@param: sfzzqTimeout  是否超过主债权时效
	 */
	public void setSfzzqTimeout(String sfzzqTimeout){
		this.sfzzqTimeout = sfzzqTimeout;
	}
	/**
	 * 获取  adsxzhTime
	 *@return: Date  担保时效最后到期日
	 */
	public Date getAdsxzhTime(){
		return this.adsxzhTime;
	}

	/**
	 * 设置  adsxzhTime
	 *@param: adsxzhTime  担保时效最后到期日
	 */
	public void setAdsxzhTime(Date adsxzhTime){
		this.adsxzhTime = adsxzhTime;
	}
	/**
	 * 获取  sfabTimeout
	 *@return: String  是否超过担保时效
	 */
	public String getSfabTimeout(){
		return this.sfabTimeout;
	}

	/**
	 * 设置  sfabTimeout
	 *@param: sfabTimeout  是否超过担保时效
	 */
	public void setSfabTimeout(String sfabTimeout){
		this.sfabTimeout = sfabTimeout;
	}
	/**
	 * 获取  laTime
	 *@return: Date  立案时间
	 */
	public Date getLaTime(){
		return this.laTime;
	}

	/**
	 * 设置  laTime
	 *@param: laTime  立案时间
	 */
	public void setLaTime(Date laTime){
		this.laTime = laTime;
	}
	/**
	 * 获取  caseNo
	 *@return: String  诉讼案号
	 */
	public String getCaseNo(){
		return this.caseNo;
	}

	/**
	 * 设置  caseNo
	 *@param: caseNo  诉讼案号
	 */
	public void setCaseNo(String caseNo){
		this.caseNo = caseNo;
	}
	/**
	 * 获取  caseStage
	 *@return: String  诉讼所处阶段
	 */
	public String getCaseStage(){
		return this.caseStage;
	}

	/**
	 * 设置  caseStage
	 *@param: caseStage  诉讼所处阶段
	 */
	public void setCaseStage(String caseStage){
		this.caseStage = caseStage;
	}
	/**
	 * 获取  pjzctjEffectiveDate
	 *@return: Date  判决\仲裁\调解书生效日期
	 */
	public Date getPjzctjEffectiveDate(){
		return this.pjzctjEffectiveDate;
	}

	/**
	 * 设置  pjzctjEffectiveDate
	 *@param: pjzctjEffectiveDate  判决\仲裁\调解书生效日期
	 */
	public void setPjzctjEffectiveDate(Date pjzctjEffectiveDate){
		this.pjzctjEffectiveDate = pjzctjEffectiveDate;
	}
	/**
	 * 获取  courtOPeal
	 *@return: String  诉讼受理法院
	 */
	public String getCourtOPeal(){
		return this.courtOPeal;
	}

	/**
	 * 设置  courtOPeal
	 *@param: courtOPeal  诉讼受理法院
	 */
	public void setCourtOPeal(String courtOPeal){
		this.courtOPeal = courtOPeal;
	}
	/**
	 * 获取  litigant
	 *@return: String  诉讼承办法官
	 */
	public String getLitigant(){
		return this.litigant;
	}

	/**
	 * 设置  litigant
	 *@param: litigant  诉讼承办法官
	 */
	public void setLitigant(String litigant){
		this.litigant = litigant;
	}
	/**
	 * 获取  sqzxLsttime
	 *@return: Date  申请执行最后到期日
	 */
	public Date getSqzxLsttime(){
		return this.sqzxLsttime;
	}

	/**
	 * 设置  sqzxLsttime
	 *@param: sqzxLsttime  申请执行最后到期日
	 */
	public void setSqzxLsttime(Date sqzxLsttime){
		this.sqzxLsttime = sqzxLsttime;
	}
	/**
	 * 获取  zxajNo
	 *@return: String  执行案号
	 */
	public String getZxajNo(){
		return this.zxajNo;
	}

	/**
	 * 设置  zxajNo
	 *@param: zxajNo  执行案号
	 */
	public void setZxajNo(String zxajNo){
		this.zxajNo = zxajNo;
	}
	/**
	 * 获取  zxEdtime
	 *@return: Date  终止执行日期
	 */
	public Date getZxEdtime(){
		return this.zxEdtime;
	}

	/**
	 * 设置  zxEdtime
	 *@param: zxEdtime  终止执行日期
	 */
	public void setZxEdtime(Date zxEdtime){
		this.zxEdtime = zxEdtime;
	}
	/**
	 * 获取  endTheEutionDate
	 *@return: Date  终结本次执行日期
	 */
	public Date getEndTheEutionDate(){
		return this.endTheEutionDate;
	}

	/**
	 * 设置  endTheEutionDate
	 *@param: endTheEutionDate  终结本次执行日期
	 */
	public void setEndTheEutionDate(Date endTheEutionDate){
		this.endTheEutionDate = endTheEutionDate;
	}
	/**
	 * 获取  endOfecutionDate
	 *@return: Date  终结执行日期
	 */
	public Date getEndOfecutionDate(){
		return this.endOfecutionDate;
	}

	/**
	 * 设置  endOfecutionDate
	 *@param: endOfecutionDate  终结执行日期
	 */
	public void setEndOfecutionDate(Date endOfecutionDate){
		this.endOfecutionDate = endOfecutionDate;
	}
	/**
	 * 获取  enforcementOfCourt
	 *@return: String  执行受理法院
	 */
	public String getEnforcementOfCourt(){
		return this.enforcementOfCourt;
	}

	/**
	 * 设置  enforcementOfCourt
	 *@param: enforcementOfCourt  执行受理法院
	 */
	public void setEnforcementOfCourt(String enforcementOfCourt){
		this.enforcementOfCourt = enforcementOfCourt;
	}
	/**
	 * 获取  executiveContractor
	 *@return: String  执行承办法官
	 */
	public String getExecutiveContractor(){
		return this.executiveContractor;
	}

	/**
	 * 设置  executiveContractor
	 *@param: executiveContractor  执行承办法官
	 */
	public void setExecutiveContractor(String executiveContractor){
		this.executiveContractor = executiveContractor;
	}
	/**
	 * 获取  propertyPreservationType
	 *@return: String  保全财产类型
	 */
	public String getPropertyPreservationType(){
		return this.propertyPreservationType;
	}

	/**
	 * 设置  propertyPreservationType
	 *@param: propertyPreservationType  保全财产类型
	 */
	public void setPropertyPreservationType(String propertyPreservationType){
		this.propertyPreservationType = propertyPreservationType;
	}
	/**
	 * 获取  sdfDecisionNumber
	 *@return: String  查封\扣押\冻结裁定案号
	 */
	public String getSdfDecisionNumber(){
		return this.sdfDecisionNumber;
	}

	/**
	 * 设置  sdfDecisionNumber
	 *@param: sdfDecisionNumber  查封\扣押\冻结裁定案号
	 */
	public void setSdfDecisionNumber(String sdfDecisionNumber){
		this.sdfDecisionNumber = sdfDecisionNumber;
	}
	/**
	 * 获取  szfVerdictDay
	 *@return: Date  查封\扣押\冻结裁定日
	 */
	public Date getSzfVerdictDay(){
		return this.szfVerdictDay;
	}

	/**
	 * 设置  szfVerdictDay
	 *@param: szfVerdictDay  查封\扣押\冻结裁定日
	 */
	public void setSzfVerdictDay(Date szfVerdictDay){
		this.szfVerdictDay = szfVerdictDay;
	}
	/**
	 * 获取  lastDueDate
	 *@return: Date  最后到期日
	 */
	public Date getLastDueDate(){
		return this.lastDueDate;
	}

	/**
	 * 设置  lastDueDate
	 *@param: lastDueDate  最后到期日
	 */
	public void setLastDueDate(Date lastDueDate){
		this.lastDueDate = lastDueDate;
	}
	/**
	 * 获取  pczqzhsbr
	 *@return: Date  破产债权最后申报日
	 */
	public Date getPczqzhsbr(){
		return this.pczqzhsbr;
	}

	/**
	 * 设置  pczqzhsbr
	 *@param: pczqzhsbr  破产债权最后申报日
	 */
	public void setPczqzhsbr(Date pczqzhsbr){
		this.pczqzhsbr = pczqzhsbr;
	}
	/**
	 * 获取  pcah
	 *@return: String  破产案号
	 */
	public String getPcah(){
		return this.pcah;
	}

	/**
	 * 设置  pcah
	 *@param: pcah  破产案号
	 */
	public void setPcah(String pcah){
		this.pcah = pcah;
	}
	/**
	 * 获取  pczjTime
	 *@return: Date  破产终结日期
	 */
	public Date getPczjTime(){
		return this.pczjTime;
	}

	/**
	 * 设置  pczjTime
	 *@param: pczjTime  破产终结日期
	 */
	public void setPczjTime(Date pczjTime){
		this.pczjTime = pczjTime;
	}
	/**
	 * 获取  sfzsbzr
	 *@return: String  是否追索保证人
	 */
	public String getSfzsbzr(){
		return this.sfzsbzr;
	}

	/**
	 * 设置  sfzsbzr
	 *@param: sfzsbzr  是否追索保证人
	 */
	public void setSfzsbzr(String sfzsbzr){
		this.sfzsbzr = sfzsbzr;
	}
	
}
