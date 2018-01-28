package cn.jeeweb.modules.bbj.jingdiao.bbjdbht.entity;

import cn.jeeweb.core.common.entity.AbstractEntity;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import cn.jeeweb.modules.sys.entity.User;
import java.util.Date;

/**   
 * @Title: 担保合同
 * @Description: 担保合同
 * @author lqz
 * @date 2018-01-28 14:33:35
 * @version V1.0   
 *
 */
@TableName("bbj_zc_guarantee_contract")
@SuppressWarnings("serial")
public class BbjZcGuaranteeContract extends AbstractEntity<String> {

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
    /**合同编号*/
    @TableField(value = "contract_id")
	private String contractid;
    /**合同类型*/
    @TableField(value = "contract_type")
	private String contracttype;
    /**担保人*/
    @TableField(value = "guarantee")
	private String guarantee;
    /**担保类型*/
    @TableField(value = "guarantee_type")
	private String guaranteetype;
    /**合同签订日期*/
    @TableField(value = "date_of_contract")
	private Date dateofcontract;
    /**担保主债权开始时间*/
    @TableField(value = "dbzzq_starttime")
	private Date dbzzqstarttime;
    /**担保主债权结束时间*/
    @TableField(value = "dbzzq_entime")
	private Date dbzzqentime;
    /**担保期限*/
    @TableField(value = "guarantee_period")
	private String guaranteeperiod;
    /**担保金额*/
    @TableField(value = "amount_guaranteed")
	private String amountguaranteed;
    /**担保期限主债权金额*/
    @TableField(value = "dbqxzzq_money")
	private String dbqxzzqmoney;
    /**担保方式*/
    @TableField(value = "guarantee_way")
	private String guaranteeway;
    /**是否诉讼*/
    @TableField(value = "is_lawsuit")
	private String islawsuit;
    /**经办人*/
    @TableField(value = "agent")
	private String agent;
	
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
	 * 获取  contractid
	 *@return: String  合同编号
	 */
	public String getContractid(){
		return this.contractid;
	}

	/**
	 * 设置  contractid
	 *@param: contractid  合同编号
	 */
	public void setContractid(String contractid){
		this.contractid = contractid;
	}
	/**
	 * 获取  contracttype
	 *@return: String  合同类型
	 */
	public String getContracttype(){
		return this.contracttype;
	}

	/**
	 * 设置  contracttype
	 *@param: contracttype  合同类型
	 */
	public void setContracttype(String contracttype){
		this.contracttype = contracttype;
	}
	/**
	 * 获取  guarantee
	 *@return: String  担保人
	 */
	public String getGuarantee(){
		return this.guarantee;
	}

	/**
	 * 设置  guarantee
	 *@param: guarantee  担保人
	 */
	public void setGuarantee(String guarantee){
		this.guarantee = guarantee;
	}
	/**
	 * 获取  guaranteetype
	 *@return: String  担保类型
	 */
	public String getGuaranteetype(){
		return this.guaranteetype;
	}

	/**
	 * 设置  guaranteetype
	 *@param: guaranteetype  担保类型
	 */
	public void setGuaranteetype(String guaranteetype){
		this.guaranteetype = guaranteetype;
	}
	/**
	 * 获取  dateofcontract
	 *@return: Date  合同签订日期
	 */
	public Date getDateofcontract(){
		return this.dateofcontract;
	}

	/**
	 * 设置  dateofcontract
	 *@param: dateofcontract  合同签订日期
	 */
	public void setDateofcontract(Date dateofcontract){
		this.dateofcontract = dateofcontract;
	}
	/**
	 * 获取  dbzzqstarttime
	 *@return: Date  担保主债权开始时间
	 */
	public Date getDbzzqstarttime(){
		return this.dbzzqstarttime;
	}

	/**
	 * 设置  dbzzqstarttime
	 *@param: dbzzqstarttime  担保主债权开始时间
	 */
	public void setDbzzqstarttime(Date dbzzqstarttime){
		this.dbzzqstarttime = dbzzqstarttime;
	}
	/**
	 * 获取  dbzzqentime
	 *@return: Date  担保主债权结束时间
	 */
	public Date getDbzzqentime(){
		return this.dbzzqentime;
	}

	/**
	 * 设置  dbzzqentime
	 *@param: dbzzqentime  担保主债权结束时间
	 */
	public void setDbzzqentime(Date dbzzqentime){
		this.dbzzqentime = dbzzqentime;
	}
	/**
	 * 获取  guaranteeperiod
	 *@return: String  担保期限
	 */
	public String getGuaranteeperiod(){
		return this.guaranteeperiod;
	}

	/**
	 * 设置  guaranteeperiod
	 *@param: guaranteeperiod  担保期限
	 */
	public void setGuaranteeperiod(String guaranteeperiod){
		this.guaranteeperiod = guaranteeperiod;
	}
	/**
	 * 获取  amountguaranteed
	 *@return: String  担保金额
	 */
	public String getAmountguaranteed(){
		return this.amountguaranteed;
	}

	/**
	 * 设置  amountguaranteed
	 *@param: amountguaranteed  担保金额
	 */
	public void setAmountguaranteed(String amountguaranteed){
		this.amountguaranteed = amountguaranteed;
	}
	/**
	 * 获取  dbqxzzqmoney
	 *@return: String  担保期限主债权金额
	 */
	public String getDbqxzzqmoney(){
		return this.dbqxzzqmoney;
	}

	/**
	 * 设置  dbqxzzqmoney
	 *@param: dbqxzzqmoney  担保期限主债权金额
	 */
	public void setDbqxzzqmoney(String dbqxzzqmoney){
		this.dbqxzzqmoney = dbqxzzqmoney;
	}
	/**
	 * 获取  guaranteeway
	 *@return: String  担保方式
	 */
	public String getGuaranteeway(){
		return this.guaranteeway;
	}

	/**
	 * 设置  guaranteeway
	 *@param: guaranteeway  担保方式
	 */
	public void setGuaranteeway(String guaranteeway){
		this.guaranteeway = guaranteeway;
	}
	/**
	 * 获取  islawsuit
	 *@return: String  是否诉讼
	 */
	public String getIslawsuit(){
		return this.islawsuit;
	}

	/**
	 * 设置  islawsuit
	 *@param: islawsuit  是否诉讼
	 */
	public void setIslawsuit(String islawsuit){
		this.islawsuit = islawsuit;
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
	
}
