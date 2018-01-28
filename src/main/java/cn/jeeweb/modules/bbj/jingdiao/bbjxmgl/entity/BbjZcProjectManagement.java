package cn.jeeweb.modules.bbj.jingdiao.bbjxmgl.entity;

import cn.jeeweb.core.common.entity.AbstractEntity;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import cn.jeeweb.modules.sys.entity.User;
import java.util.Date;

/**   
 * @Title: 项目管理
 * @Description: 项目管理
 * @author somuns
 * @date 2018-01-28 14:31:20
 * @version V1.0   
 *
 */
@TableName("bbj_zc_project_management")
@SuppressWarnings("serial")
public class BbjZcProjectManagement extends AbstractEntity<String> {

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
    /**项目编号*/
    @TableField(value = "item_number")
	private String itemNumber;
    /**项目名称*/
    @TableField(value = "project_name")
	private String projectName;
    /**回款金额*/
    @TableField(value = "repayment_amount")
	private Double repaymentAmount;
    /**回款期限*/
    @TableField(value = "payback_period")
	private String paybackPeriod;
    /**回款进度*/
    @TableField(value = "payment_progress")
	private String paymentProgress;
    /**逾期天数*/
    @TableField(value = "days_overdue")
	private Integer daysOverdue;
    /**逾期说明*/
    @TableField(value = "overdue_instructions")
	private String overdueInstructions;
    /**经办人*/
    @TableField(value = "attn")
	private String attn;
	
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
	 * 获取  itemNumber
	 *@return: String  项目编号
	 */
	public String getItemNumber(){
		return this.itemNumber;
	}

	/**
	 * 设置  itemNumber
	 *@param: itemNumber  项目编号
	 */
	public void setItemNumber(String itemNumber){
		this.itemNumber = itemNumber;
	}
	/**
	 * 获取  projectName
	 *@return: String  项目名称
	 */
	public String getProjectName(){
		return this.projectName;
	}

	/**
	 * 设置  projectName
	 *@param: projectName  项目名称
	 */
	public void setProjectName(String projectName){
		this.projectName = projectName;
	}
	/**
	 * 获取  repaymentAmount
	 *@return: Double  回款金额
	 */
	public Double getRepaymentAmount(){
		return this.repaymentAmount;
	}

	/**
	 * 设置  repaymentAmount
	 *@param: repaymentAmount  回款金额
	 */
	public void setRepaymentAmount(Double repaymentAmount){
		this.repaymentAmount = repaymentAmount;
	}
	/**
	 * 获取  paybackPeriod
	 *@return: String  回款期限
	 */
	public String getPaybackPeriod(){
		return this.paybackPeriod;
	}

	/**
	 * 设置  paybackPeriod
	 *@param: paybackPeriod  回款期限
	 */
	public void setPaybackPeriod(String paybackPeriod){
		this.paybackPeriod = paybackPeriod;
	}
	/**
	 * 获取  paymentProgress
	 *@return: String  回款进度
	 */
	public String getPaymentProgress(){
		return this.paymentProgress;
	}

	/**
	 * 设置  paymentProgress
	 *@param: paymentProgress  回款进度
	 */
	public void setPaymentProgress(String paymentProgress){
		this.paymentProgress = paymentProgress;
	}
	/**
	 * 获取  daysOverdue
	 *@return: Integer  逾期天数
	 */
	public Integer getDaysOverdue(){
		return this.daysOverdue;
	}

	/**
	 * 设置  daysOverdue
	 *@param: daysOverdue  逾期天数
	 */
	public void setDaysOverdue(Integer daysOverdue){
		this.daysOverdue = daysOverdue;
	}
	/**
	 * 获取  overdueInstructions
	 *@return: String  逾期说明
	 */
	public String getOverdueInstructions(){
		return this.overdueInstructions;
	}

	/**
	 * 设置  overdueInstructions
	 *@param: overdueInstructions  逾期说明
	 */
	public void setOverdueInstructions(String overdueInstructions){
		this.overdueInstructions = overdueInstructions;
	}
	/**
	 * 获取  attn
	 *@return: String  经办人
	 */
	public String getAttn(){
		return this.attn;
	}

	/**
	 * 设置  attn
	 *@param: attn  经办人
	 */
	public void setAttn(String attn){
		this.attn = attn;
	}
	
}
