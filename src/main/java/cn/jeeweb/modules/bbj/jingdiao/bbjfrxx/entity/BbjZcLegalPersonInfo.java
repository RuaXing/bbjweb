package cn.jeeweb.modules.bbj.jingdiao.bbjfrxx.entity;

import cn.jeeweb.core.common.entity.AbstractEntity;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import cn.jeeweb.modules.sys.entity.User;
import java.util.Date;

/**   
 * @Title: 法人信息
 * @Description: 法人信息
 * @author lqz
 * @date 2018-01-28 14:22:39
 * @version V1.0   
 *
 */
@TableName("bbj_zc_legal_person_info")
@SuppressWarnings("serial")
public class BbjZcLegalPersonInfo extends AbstractEntity<String> {

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
    /**法人名称*/
    @TableField(value = "legal_person_name")
	private String legalpersonname;
    /**法定代表人*/
    @TableField(value = "legal_person")
	private String legalperson;
    /**注册资本*/
    @TableField(value = "registered_assets")
	private String registeredassets;
    /**注册时间*/
    @TableField(value = "registration_date")
	private Date registrationdate;
    /**地址*/
    @TableField(value = "address")
	private String address;
    /**核准日期*/
    @TableField(value = "approval_date")
	private Date approvaldate;
    /**登记机关*/
    @TableField(value = "registration_authority")
	private String registrationauthority;
    /**经营范围*/
    @TableField(value = "manage_scope")
	private String managescope;
	
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
	 * 获取  legalpersonname
	 *@return: String  法人名称
	 */
	public String getLegalpersonname(){
		return this.legalpersonname;
	}

	/**
	 * 设置  legalpersonname
	 *@param: legalpersonname  法人名称
	 */
	public void setLegalpersonname(String legalpersonname){
		this.legalpersonname = legalpersonname;
	}
	/**
	 * 获取  legalperson
	 *@return: String  法定代表人
	 */
	public String getLegalperson(){
		return this.legalperson;
	}

	/**
	 * 设置  legalperson
	 *@param: legalperson  法定代表人
	 */
	public void setLegalperson(String legalperson){
		this.legalperson = legalperson;
	}
	/**
	 * 获取  registeredassets
	 *@return: String  注册资本
	 */
	public String getRegisteredassets(){
		return this.registeredassets;
	}

	/**
	 * 设置  registeredassets
	 *@param: registeredassets  注册资本
	 */
	public void setRegisteredassets(String registeredassets){
		this.registeredassets = registeredassets;
	}
	/**
	 * 获取  registrationdate
	 *@return: Date  注册时间
	 */
	public Date getRegistrationdate(){
		return this.registrationdate;
	}

	/**
	 * 设置  registrationdate
	 *@param: registrationdate  注册时间
	 */
	public void setRegistrationdate(Date registrationdate){
		this.registrationdate = registrationdate;
	}
	/**
	 * 获取  address
	 *@return: String  地址
	 */
	public String getAddress(){
		return this.address;
	}

	/**
	 * 设置  address
	 *@param: address  地址
	 */
	public void setAddress(String address){
		this.address = address;
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
