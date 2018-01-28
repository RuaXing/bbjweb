package cn.jeeweb.modules.bbj.jingdiao.bbjzrr.entity;

import cn.jeeweb.core.common.entity.AbstractEntity;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import cn.jeeweb.modules.sys.entity.User;
import java.util.Date;

/**   
 * @Title: 自然人
 * @Description: 自然人
 * @author lqz
 * @date 2018-01-28 14:36:19
 * @version V1.0   
 *
 */
@TableName("bbj_zc_natural_person")
@SuppressWarnings("serial")
public class BbjZcNaturalPerson extends AbstractEntity<String> {

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
    /**姓名*/
    @TableField(value = "name")
	private String name;
    /**证件类型*/
    @TableField(value = "certificate_type")
	private String certificatetype;
    /**证件号码*/
    @TableField(value = "certificate_no")
	private String certificateno;
    /**出生年月*/
    @TableField(value = "birthday")
	private Date birthday;
    /**出生地*/
    @TableField(value = "birthplace")
	private String birthplace;
    /**住址*/
    @TableField(value = "address")
	private String address;
    /**职业*/
    @TableField(value = "occupation")
	private String occupation;
    /**工作单位*/
    @TableField(value = "work_unit")
	private String workunit;
    /**联系方式*/
    @TableField(value = "contact_way")
	private String contactway;
    /**与债务人关系*/
    @TableField(value = "relationship_with_debtor")
	private String relationshipwith_debtor;
    /**曾经住所*/
    @TableField(value = "once_home")
	private String oncehome;
    /**对外负债*/
    @TableField(value = "foreign_debt")
	private String foreigndebt;
	
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
	 * 获取  name
	 *@return: String  姓名
	 */
	public String getName(){
		return this.name;
	}

	/**
	 * 设置  name
	 *@param: name  姓名
	 */
	public void setName(String name){
		this.name = name;
	}
	/**
	 * 获取  certificatetype
	 *@return: String  证件类型
	 */
	public String getCertificatetype(){
		return this.certificatetype;
	}

	/**
	 * 设置  certificatetype
	 *@param: certificatetype  证件类型
	 */
	public void setCertificatetype(String certificatetype){
		this.certificatetype = certificatetype;
	}
	/**
	 * 获取  certificateno
	 *@return: String  证件号码
	 */
	public String getCertificateno(){
		return this.certificateno;
	}

	/**
	 * 设置  certificateno
	 *@param: certificateno  证件号码
	 */
	public void setCertificateno(String certificateno){
		this.certificateno = certificateno;
	}
	/**
	 * 获取  birthday
	 *@return: Date  出生年月
	 */
	public Date getBirthday(){
		return this.birthday;
	}

	/**
	 * 设置  birthday
	 *@param: birthday  出生年月
	 */
	public void setBirthday(Date birthday){
		this.birthday = birthday;
	}
	/**
	 * 获取  birthplace
	 *@return: String  出生地
	 */
	public String getBirthplace(){
		return this.birthplace;
	}

	/**
	 * 设置  birthplace
	 *@param: birthplace  出生地
	 */
	public void setBirthplace(String birthplace){
		this.birthplace = birthplace;
	}
	/**
	 * 获取  address
	 *@return: String  住址
	 */
	public String getAddress(){
		return this.address;
	}

	/**
	 * 设置  address
	 *@param: address  住址
	 */
	public void setAddress(String address){
		this.address = address;
	}
	/**
	 * 获取  occupation
	 *@return: String  职业
	 */
	public String getOccupation(){
		return this.occupation;
	}

	/**
	 * 设置  occupation
	 *@param: occupation  职业
	 */
	public void setOccupation(String occupation){
		this.occupation = occupation;
	}
	/**
	 * 获取  workunit
	 *@return: String  工作单位
	 */
	public String getWorkunit(){
		return this.workunit;
	}

	/**
	 * 设置  workunit
	 *@param: workunit  工作单位
	 */
	public void setWorkunit(String workunit){
		this.workunit = workunit;
	}
	/**
	 * 获取  contactway
	 *@return: String  联系方式
	 */
	public String getContactway(){
		return this.contactway;
	}

	/**
	 * 设置  contactway
	 *@param: contactway  联系方式
	 */
	public void setContactway(String contactway){
		this.contactway = contactway;
	}
	/**
	 * 获取  relationshipwith_debtor
	 *@return: String  与债务人关系
	 */
	public String getRelationshipwith_debtor(){
		return this.relationshipwith_debtor;
	}

	/**
	 * 设置  relationshipwith_debtor
	 *@param: relationshipwith_debtor  与债务人关系
	 */
	public void setRelationshipwith_debtor(String relationshipwith_debtor){
		this.relationshipwith_debtor = relationshipwith_debtor;
	}
	/**
	 * 获取  oncehome
	 *@return: String  曾经住所
	 */
	public String getOncehome(){
		return this.oncehome;
	}

	/**
	 * 设置  oncehome
	 *@param: oncehome  曾经住所
	 */
	public void setOncehome(String oncehome){
		this.oncehome = oncehome;
	}
	/**
	 * 获取  foreigndebt
	 *@return: String  对外负债
	 */
	public String getForeigndebt(){
		return this.foreigndebt;
	}

	/**
	 * 设置  foreigndebt
	 *@param: foreigndebt  对外负债
	 */
	public void setForeigndebt(String foreigndebt){
		this.foreigndebt = foreigndebt;
	}
	
}
