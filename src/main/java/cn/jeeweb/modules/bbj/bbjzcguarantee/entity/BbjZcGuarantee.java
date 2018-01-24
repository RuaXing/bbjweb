package cn.jeeweb.modules.bbj.bbjzcguarantee.entity;

import cn.jeeweb.core.common.entity.AbstractEntity;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import cn.jeeweb.modules.sys.entity.User;
import java.util.Date;

/**   
 * @Title: 抵押物
 * @Description: 抵押物
 * @author harvey
 * @date 2018-01-19 17:03:01
 * @version V1.0   
 *
 */
@TableName("bbj_zc_guarantee")
@SuppressWarnings("serial")
public class BbjZcGuarantee extends AbstractEntity<String> {

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
    /**抵押物类型*/
    @TableField(value = "type")
	private String type;
    /**序号*/
    @TableField(value = "numerical_order")
	private String numericalOrder;
    /**抵押人*/
    @TableField(value = "mortgager")
	private String mortgager;
    /**抵押物名称*/
    @TableField(value = "guarantee_name")
	private String guaranteeName;
    /**抵押物地址*/
    @TableField(value = "guarantee_address")
	private String guaranteeAddress;
    /**抵押金额*/
    @TableField(value = "guarantee_money")
	private Double guaranteeMoney;
    /**抵押面积*/
    @TableField(value = "guarantee_area")
	private Double guaranteeArea;
    /**抵押权人*/
    @TableField(value = "pledge_pepole")
	private String pledgePepole;
    /**抵押登记时间*/
    @TableField(value = "register_time")
	private Date registerTime;
    /**注销时间*/
    @TableField(value = "logout_time")
	private Date logoutTime;
    /**注销标记*/
    @TableField(value = "logout_type")
	private String logoutType;
    /**备案登记号*/
    @TableField(value = "internet_content_provider")
	private String internetContentProvider;
    /**资料交接人*/
    @TableField(value = "data_connect_pepole")
	private String dataConnectPepole;
	
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
	 * 获取  type
	 *@return: String  抵押物类型
	 */
	public String getType(){
		return this.type;
	}

	/**
	 * 设置  type
	 *@param: type  抵押物类型
	 */
	public void setType(String type){
		this.type = type;
	}
	/**
	 * 获取  numericalOrder
	 *@return: String  序号
	 */
	public String getNumericalOrder(){
		return this.numericalOrder;
	}

	/**
	 * 设置  numericalOrder
	 *@param: numericalOrder  序号
	 */
	public void setNumericalOrder(String numericalOrder){
		this.numericalOrder = numericalOrder;
	}
	/**
	 * 获取  mortgager
	 *@return: String  抵押人
	 */
	public String getMortgager(){
		return this.mortgager;
	}

	/**
	 * 设置  mortgager
	 *@param: mortgager  抵押人
	 */
	public void setMortgager(String mortgager){
		this.mortgager = mortgager;
	}
	/**
	 * 获取  guaranteeName
	 *@return: String  抵押物名称
	 */
	public String getGuaranteeName(){
		return this.guaranteeName;
	}

	/**
	 * 设置  guaranteeName
	 *@param: guaranteeName  抵押物名称
	 */
	public void setGuaranteeName(String guaranteeName){
		this.guaranteeName = guaranteeName;
	}
	/**
	 * 获取  guaranteeAddress
	 *@return: String  抵押物地址
	 */
	public String getGuaranteeAddress(){
		return this.guaranteeAddress;
	}

	/**
	 * 设置  guaranteeAddress
	 *@param: guaranteeAddress  抵押物地址
	 */
	public void setGuaranteeAddress(String guaranteeAddress){
		this.guaranteeAddress = guaranteeAddress;
	}
	/**
	 * 获取  guaranteeMoney
	 *@return: Double  抵押金额
	 */
	public Double getGuaranteeMoney(){
		return this.guaranteeMoney;
	}

	/**
	 * 设置  guaranteeMoney
	 *@param: guaranteeMoney  抵押金额
	 */
	public void setGuaranteeMoney(Double guaranteeMoney){
		this.guaranteeMoney = guaranteeMoney;
	}
	/**
	 * 获取  guaranteeArea
	 *@return: Double  抵押面积
	 */
	public Double getGuaranteeArea(){
		return this.guaranteeArea;
	}

	/**
	 * 设置  guaranteeArea
	 *@param: guaranteeArea  抵押面积
	 */
	public void setGuaranteeArea(Double guaranteeArea){
		this.guaranteeArea = guaranteeArea;
	}
	/**
	 * 获取  pledgePepole
	 *@return: String  抵押权人
	 */
	public String getPledgePepole(){
		return this.pledgePepole;
	}

	/**
	 * 设置  pledgePepole
	 *@param: pledgePepole  抵押权人
	 */
	public void setPledgePepole(String pledgePepole){
		this.pledgePepole = pledgePepole;
	}
	/**
	 * 获取  registerTime
	 *@return: Date  抵押登记时间
	 */
	public Date getRegisterTime(){
		return this.registerTime;
	}

	/**
	 * 设置  registerTime
	 *@param: registerTime  抵押登记时间
	 */
	public void setRegisterTime(Date registerTime){
		this.registerTime = registerTime;
	}
	/**
	 * 获取  logoutTime
	 *@return: Date  注销时间
	 */
	public Date getLogoutTime(){
		return this.logoutTime;
	}

	/**
	 * 设置  logoutTime
	 *@param: logoutTime  注销时间
	 */
	public void setLogoutTime(Date logoutTime){
		this.logoutTime = logoutTime;
	}
	/**
	 * 获取  logoutType
	 *@return: String  注销标记
	 */
	public String getLogoutType(){
		return this.logoutType;
	}

	/**
	 * 设置  logoutType
	 *@param: logoutType  注销标记
	 */
	public void setLogoutType(String logoutType){
		this.logoutType = logoutType;
	}
	/**
	 * 获取  internetContentProvider
	 *@return: String  备案登记号
	 */
	public String getInternetContentProvider(){
		return this.internetContentProvider;
	}

	/**
	 * 设置  internetContentProvider
	 *@param: internetContentProvider  备案登记号
	 */
	public void setInternetContentProvider(String internetContentProvider){
		this.internetContentProvider = internetContentProvider;
	}
	/**
	 * 获取  dataConnectPepole
	 *@return: String  资料交接人
	 */
	public String getDataConnectPepole(){
		return this.dataConnectPepole;
	}

	/**
	 * 设置  dataConnectPepole
	 *@param: dataConnectPepole  资料交接人
	 */
	public void setDataConnectPepole(String dataConnectPepole){
		this.dataConnectPepole = dataConnectPepole;
	}
	
}
