package cn.jeeweb.modules.bbj.jingdiao.bbjgs.entity;

import cn.jeeweb.core.common.entity.AbstractEntity;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import cn.jeeweb.modules.sys.entity.User;
import java.util.Date;

/**   
 * @Title: 公司
 * @Description: 公司
 * @author lqz
 * @date 2018-01-28 14:30:35
 * @version V1.0   
 *
 */
@TableName("bbj_zc_company")
@SuppressWarnings("serial")
public class BbjZcCompany extends AbstractEntity<String> {

    /**编号*/
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
    /**统一社会信用代码*/
    @TableField(value = "credit_code")
	private String creditcode;
    /**企业名称*/
    @TableField(value = "enterprise_name")
	private String enterprisename;
    /**企业类型*/
    @TableField(value = "enterprise_type")
	private String enterprisetype;
    /**法定代表人*/
    @TableField(value = "legal_representative")
	private String legalrepresentative;
    /**注册资本*/
    @TableField(value = "registered_capital")
	private String registeredcapital;
    /**成立日期*/
    @TableField(value = "establishment_date")
	private Date establishment_date;
    /**营业期限自*/
    @TableField(value = "business_start")
	private Date businessstart;
    /**营业期限至*/
    @TableField(value = "business_end")
	private Date businessend;
    /**登记机关*/
    @TableField(value = "registration_authority")
	private String registrationauthority;
    /**核准日期*/
    @TableField(value = "approval_date")
	private Date approvaldate;
    /**登记状态*/
    @TableField(value = "registration_status")
	private String registrationstatus;
    /**住所*/
    @TableField(value = "domicile")
	private String domicile;
    /**经营范围*/
    @TableField(value = "manage_scope")
	private String managescope;
	
	/**
	 * 获取  id
	 *@return: String  编号
	 */
	public String getId(){
		return this.id;
	}

	/**
	 * 设置  id
	 *@param: id  编号
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
	 * 获取  creditcode
	 *@return: String  统一社会信用代码
	 */
	public String getCreditcode(){
		return this.creditcode;
	}

	/**
	 * 设置  creditcode
	 *@param: creditcode  统一社会信用代码
	 */
	public void setCreditcode(String creditcode){
		this.creditcode = creditcode;
	}
	/**
	 * 获取  enterprisename
	 *@return: String  企业名称
	 */
	public String getEnterprisename(){
		return this.enterprisename;
	}

	/**
	 * 设置  enterprisename
	 *@param: enterprisename  企业名称
	 */
	public void setEnterprisename(String enterprisename){
		this.enterprisename = enterprisename;
	}
	/**
	 * 获取  enterprisetype
	 *@return: String  企业类型
	 */
	public String getEnterprisetype(){
		return this.enterprisetype;
	}

	/**
	 * 设置  enterprisetype
	 *@param: enterprisetype  企业类型
	 */
	public void setEnterprisetype(String enterprisetype){
		this.enterprisetype = enterprisetype;
	}
	/**
	 * 获取  legalrepresentative
	 *@return: String  法定代表人
	 */
	public String getLegalrepresentative(){
		return this.legalrepresentative;
	}

	/**
	 * 设置  legalrepresentative
	 *@param: legalrepresentative  法定代表人
	 */
	public void setLegalrepresentative(String legalrepresentative){
		this.legalrepresentative = legalrepresentative;
	}
	/**
	 * 获取  registeredcapital
	 *@return: String  注册资本
	 */
	public String getRegisteredcapital(){
		return this.registeredcapital;
	}

	/**
	 * 设置  registeredcapital
	 *@param: registeredcapital  注册资本
	 */
	public void setRegisteredcapital(String registeredcapital){
		this.registeredcapital = registeredcapital;
	}
	/**
	 * 获取  establishment_date
	 *@return: Date  成立日期
	 */
	public Date getEstablishment_date(){
		return this.establishment_date;
	}

	/**
	 * 设置  establishment_date
	 *@param: establishment_date  成立日期
	 */
	public void setEstablishment_date(Date establishment_date){
		this.establishment_date = establishment_date;
	}
	/**
	 * 获取  businessstart
	 *@return: Date  营业期限自
	 */
	public Date getBusinessstart(){
		return this.businessstart;
	}

	/**
	 * 设置  businessstart
	 *@param: businessstart  营业期限自
	 */
	public void setBusinessstart(Date businessstart){
		this.businessstart = businessstart;
	}
	/**
	 * 获取  businessend
	 *@return: Date  营业期限至
	 */
	public Date getBusinessend(){
		return this.businessend;
	}

	/**
	 * 设置  businessend
	 *@param: businessend  营业期限至
	 */
	public void setBusinessend(Date businessend){
		this.businessend = businessend;
	}
	/**
	 * 获取  registrationauthority
	 *@return: String  登记机关
	 */
	public String getRegistrationauthority(){
		return this.registrationauthority;
	}

	/**
	 * 设置  registrationauthority
	 *@param: registrationauthority  登记机关
	 */
	public void setRegistrationauthority(String registrationauthority){
		this.registrationauthority = registrationauthority;
	}
	/**
	 * 获取  approvaldate
	 *@return: Date  核准日期
	 */
	public Date getApprovaldate(){
		return this.approvaldate;
	}

	/**
	 * 设置  approvaldate
	 *@param: approvaldate  核准日期
	 */
	public void setApprovaldate(Date approvaldate){
		this.approvaldate = approvaldate;
	}
	/**
	 * 获取  registrationstatus
	 *@return: String  登记状态
	 */
	public String getRegistrationstatus(){
		return this.registrationstatus;
	}

	/**
	 * 设置  registrationstatus
	 *@param: registrationstatus  登记状态
	 */
	public void setRegistrationstatus(String registrationstatus){
		this.registrationstatus = registrationstatus;
	}
	/**
	 * 获取  domicile
	 *@return: String  住所
	 */
	public String getDomicile(){
		return this.domicile;
	}

	/**
	 * 设置  domicile
	 *@param: domicile  住所
	 */
	public void setDomicile(String domicile){
		this.domicile = domicile;
	}
	/**
	 * 获取  managescope
	 *@return: String  经营范围
	 */
	public String getManagescope(){
		return this.managescope;
	}

	/**
	 * 设置  managescope
	 *@param: managescope  经营范围
	 */
	public void setManagescope(String managescope){
		this.managescope = managescope;
	}
	
}
