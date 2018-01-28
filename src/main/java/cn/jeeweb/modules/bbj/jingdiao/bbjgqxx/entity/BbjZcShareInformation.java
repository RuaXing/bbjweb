package cn.jeeweb.modules.bbj.jingdiao.bbjgqxx.entity;

import cn.jeeweb.core.common.entity.AbstractEntity;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import cn.jeeweb.modules.sys.entity.User;
import java.util.Date;

/**   
 * @Title: 股权信息
 * @Description: 股权信息
 * @author somuns
 * @date 2018-01-28 14:23:00
 * @version V1.0   
 *
 */
@TableName("bbj_zc_share_information")
@SuppressWarnings("serial")
public class BbjZcShareInformation extends AbstractEntity<String> {

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
    /**质押物(股权)*/
    @TableField(value = "pledge_equity")
	private String pledgeEquity;
    /**质押人*/
    @TableField(value = "pledgor")
	private String pledgor;
    /**注册资金*/
    @TableField(value = "the_registered_capital")
	private Double theRegisteredCapital;
    /**占股比例*/
    @TableField(value = "the_percentage_shares")
	private String thePercentageShares;
    /**经营范围*/
    @TableField(value = "business_scope")
	private String businessScope;
    /**查封顺序*/
    @TableField(value = "attachment_order")
	private String attachmentOrder;
    /**首封法院*/
    @TableField(value = "the_first_letter_court")
	private String theFirstLetterCourt;
	
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
	 * 获取  pledgeEquity
	 *@return: String  质押物(股权)
	 */
	public String getPledgeEquity(){
		return this.pledgeEquity;
	}

	/**
	 * 设置  pledgeEquity
	 *@param: pledgeEquity  质押物(股权)
	 */
	public void setPledgeEquity(String pledgeEquity){
		this.pledgeEquity = pledgeEquity;
	}
	/**
	 * 获取  pledgor
	 *@return: String  质押人
	 */
	public String getPledgor(){
		return this.pledgor;
	}

	/**
	 * 设置  pledgor
	 *@param: pledgor  质押人
	 */
	public void setPledgor(String pledgor){
		this.pledgor = pledgor;
	}
	/**
	 * 获取  theRegisteredCapital
	 *@return: Double  注册资金
	 */
	public Double getTheRegisteredCapital(){
		return this.theRegisteredCapital;
	}

	/**
	 * 设置  theRegisteredCapital
	 *@param: theRegisteredCapital  注册资金
	 */
	public void setTheRegisteredCapital(Double theRegisteredCapital){
		this.theRegisteredCapital = theRegisteredCapital;
	}
	/**
	 * 获取  thePercentageShares
	 *@return: String  占股比例
	 */
	public String getThePercentageShares(){
		return this.thePercentageShares;
	}

	/**
	 * 设置  thePercentageShares
	 *@param: thePercentageShares  占股比例
	 */
	public void setThePercentageShares(String thePercentageShares){
		this.thePercentageShares = thePercentageShares;
	}
	/**
	 * 获取  businessScope
	 *@return: String  经营范围
	 */
	public String getBusinessScope(){
		return this.businessScope;
	}

	/**
	 * 设置  businessScope
	 *@param: businessScope  经营范围
	 */
	public void setBusinessScope(String businessScope){
		this.businessScope = businessScope;
	}
	/**
	 * 获取  attachmentOrder
	 *@return: String  查封顺序
	 */
	public String getAttachmentOrder(){
		return this.attachmentOrder;
	}

	/**
	 * 设置  attachmentOrder
	 *@param: attachmentOrder  查封顺序
	 */
	public void setAttachmentOrder(String attachmentOrder){
		this.attachmentOrder = attachmentOrder;
	}
	/**
	 * 获取  theFirstLetterCourt
	 *@return: String  首封法院
	 */
	public String getTheFirstLetterCourt(){
		return this.theFirstLetterCourt;
	}

	/**
	 * 设置  theFirstLetterCourt
	 *@param: theFirstLetterCourt  首封法院
	 */
	public void setTheFirstLetterCourt(String theFirstLetterCourt){
		this.theFirstLetterCourt = theFirstLetterCourt;
	}
	
}
