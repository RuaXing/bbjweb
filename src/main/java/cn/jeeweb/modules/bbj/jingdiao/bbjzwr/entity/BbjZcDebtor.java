package cn.jeeweb.modules.bbj.jingdiao.bbjzwr.entity;

import cn.jeeweb.core.common.entity.AbstractEntity;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import cn.jeeweb.modules.sys.entity.User;
import java.util.Date;

/**   
 * @Title: 债务人
 * @Description: 债务人
 * @author even
 * @date 2018-01-28 14:21:58
 * @version V1.0   
 *
 */
@TableName("bbj_zc_debtor")
@SuppressWarnings("serial")
public class BbjZcDebtor extends AbstractEntity<String> {

    /**主键*/
    @TableId(value = "id", type = IdType.UUID)
	private String id;
    /**债务人类型*/
    @TableField(value = "debtor_type")
	private String debtorType;
    /**债务人名称*/
    @TableField(value = "debtor_name")
	private String debtorName;
    /**主体名称*/
    @TableField(value = "subject_name")
	private String subjectName;
    /**主体类型*/
    @TableField(value = "subjecttype")
	private String subjecttype;
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
	 * 获取  debtorType
	 *@return: String  债务人类型
	 */
	public String getDebtorType(){
		return this.debtorType;
	}

	/**
	 * 设置  debtorType
	 *@param: debtorType  债务人类型
	 */
	public void setDebtorType(String debtorType){
		this.debtorType = debtorType;
	}
	/**
	 * 获取  debtorName
	 *@return: String  债务人名称
	 */
	public String getDebtorName(){
		return this.debtorName;
	}

	/**
	 * 设置  debtorName
	 *@param: debtorName  债务人名称
	 */
	public void setDebtorName(String debtorName){
		this.debtorName = debtorName;
	}
	/**
	 * 获取  subjectName
	 *@return: String  主体名称
	 */
	public String getSubjectName(){
		return this.subjectName;
	}

	/**
	 * 设置  subjectName
	 *@param: subjectName  主体名称
	 */
	public void setSubjectName(String subjectName){
		this.subjectName = subjectName;
	}
	/**
	 * 获取  subjecttype
	 *@return: String  主体类型
	 */
	public String getSubjecttype(){
		return this.subjecttype;
	}

	/**
	 * 设置  subjecttype
	 *@param: subjecttype  主体类型
	 */
	public void setSubjecttype(String subjecttype){
		this.subjecttype = subjecttype;
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
