package cn.jeeweb.modules.bbj.jingdiao.bbjqtcc.entity;

import cn.jeeweb.core.common.entity.AbstractEntity;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import cn.jeeweb.modules.sys.entity.User;
import java.util.Date;

/**   
 * @Title: 其他财产
 * @Description: 其他财产
 * @author harvey
 * @date 2018-01-28 14:27:43
 * @version V1.0   
 *
 */
@TableName("bbj_zc_other_propert")
@SuppressWarnings("serial")
public class BbjZcOtherPropert extends AbstractEntity<String> {

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
    /**资产性质*/
    @TableField(value = "nature_of_the_assets")
	private String natureOfTheAssets;
    /**地址*/
    @TableField(value = "address")
	private String address;
    /**面积*/
    @TableField(value = "area")
	private Double area;
    /**权属人*/
    @TableField(value = "the_ownership_of")
	private String theOwnershipOf;
    /**权属证号*/
    @TableField(value = "the_ownership_card_number")
	private String theOwnershipCardNumber;
    /**抵押权人*/
    @TableField(value = "a_mortgagee")
	private String aMortgagee;
    /**抵押金额*/
    @TableField(value = "the_mortgage_amount")
	private Double theMortgageAmount;
    /**查封顺位*/
    @TableField(value = "seizure_of_the_sequence")
	private String seizureOfTheSequence;
    /**首封法院*/
    @TableField(value = "the_first_letter_court")
	private String theFirstLetterCourt;
    /**权属人与债务人关系*/
    @TableField(value = "relationship")
	private String relationship;
    /**估值*/
    @TableField(value = "valuation")
	private Double valuation;
    /**预计余值*/
    @TableField(value = "estimated_residual_value")
	private Double estimatedResidualValue;
    /**是否处置*/
    @TableField(value = "is_do")
	private String isDo;
	
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
	 * 获取  natureOfTheAssets
	 *@return: String  资产性质
	 */
	public String getNatureOfTheAssets(){
		return this.natureOfTheAssets;
	}

	/**
	 * 设置  natureOfTheAssets
	 *@param: natureOfTheAssets  资产性质
	 */
	public void setNatureOfTheAssets(String natureOfTheAssets){
		this.natureOfTheAssets = natureOfTheAssets;
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
	 * 获取  area
	 *@return: Double  面积
	 */
	public Double getArea(){
		return this.area;
	}

	/**
	 * 设置  area
	 *@param: area  面积
	 */
	public void setArea(Double area){
		this.area = area;
	}
	/**
	 * 获取  theOwnershipOf
	 *@return: String  权属人
	 */
	public String getTheOwnershipOf(){
		return this.theOwnershipOf;
	}

	/**
	 * 设置  theOwnershipOf
	 *@param: theOwnershipOf  权属人
	 */
	public void setTheOwnershipOf(String theOwnershipOf){
		this.theOwnershipOf = theOwnershipOf;
	}
	/**
	 * 获取  theOwnershipCardNumber
	 *@return: String  权属证号
	 */
	public String getTheOwnershipCardNumber(){
		return this.theOwnershipCardNumber;
	}

	/**
	 * 设置  theOwnershipCardNumber
	 *@param: theOwnershipCardNumber  权属证号
	 */
	public void setTheOwnershipCardNumber(String theOwnershipCardNumber){
		this.theOwnershipCardNumber = theOwnershipCardNumber;
	}
	/**
	 * 获取  aMortgagee
	 *@return: String  抵押权人
	 */
	public String getAMortgagee(){
		return this.aMortgagee;
	}

	/**
	 * 设置  aMortgagee
	 *@param: aMortgagee  抵押权人
	 */
	public void setAMortgagee(String aMortgagee){
		this.aMortgagee = aMortgagee;
	}
	/**
	 * 获取  theMortgageAmount
	 *@return: Double  抵押金额
	 */
	public Double getTheMortgageAmount(){
		return this.theMortgageAmount;
	}

	/**
	 * 设置  theMortgageAmount
	 *@param: theMortgageAmount  抵押金额
	 */
	public void setTheMortgageAmount(Double theMortgageAmount){
		this.theMortgageAmount = theMortgageAmount;
	}
	/**
	 * 获取  seizureOfTheSequence
	 *@return: String  查封顺位
	 */
	public String getSeizureOfTheSequence(){
		return this.seizureOfTheSequence;
	}

	/**
	 * 设置  seizureOfTheSequence
	 *@param: seizureOfTheSequence  查封顺位
	 */
	public void setSeizureOfTheSequence(String seizureOfTheSequence){
		this.seizureOfTheSequence = seizureOfTheSequence;
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
	/**
	 * 获取  relationship
	 *@return: String  权属人与债务人关系
	 */
	public String getRelationship(){
		return this.relationship;
	}

	/**
	 * 设置  relationship
	 *@param: relationship  权属人与债务人关系
	 */
	public void setRelationship(String relationship){
		this.relationship = relationship;
	}
	/**
	 * 获取  valuation
	 *@return: Double  估值
	 */
	public Double getValuation(){
		return this.valuation;
	}

	/**
	 * 设置  valuation
	 *@param: valuation  估值
	 */
	public void setValuation(Double valuation){
		this.valuation = valuation;
	}
	/**
	 * 获取  estimatedResidualValue
	 *@return: Double  预计余值
	 */
	public Double getEstimatedResidualValue(){
		return this.estimatedResidualValue;
	}

	/**
	 * 设置  estimatedResidualValue
	 *@param: estimatedResidualValue  预计余值
	 */
	public void setEstimatedResidualValue(Double estimatedResidualValue){
		this.estimatedResidualValue = estimatedResidualValue;
	}
	/**
	 * 获取  isDo
	 *@return: String  是否处置
	 */
	public String getIsDo(){
		return this.isDo;
	}

	/**
	 * 设置  isDo
	 *@param: isDo  是否处置
	 */
	public void setIsDo(String isDo){
		this.isDo = isDo;
	}
	
}
