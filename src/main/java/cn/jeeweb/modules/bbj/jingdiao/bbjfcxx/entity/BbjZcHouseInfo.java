package cn.jeeweb.modules.bbj.jingdiao.bbjfcxx.entity;

import cn.jeeweb.core.common.entity.AbstractEntity;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import cn.jeeweb.modules.sys.entity.User;
import java.util.Date;

/**   
 * @Title: 房产信息
 * @Description: 房产信息
 * @author harvey
 * @date 2018-01-28 14:30:11
 * @version V1.0   
 *
 */
@TableName("bbj_zc_house_info")
@SuppressWarnings("serial")
public class BbjZcHouseInfo extends AbstractEntity<String> {

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
    /**地址*/
    @TableField(value = "address")
	private String address;
    /**权属人*/
    @TableField(value = "property_owner")
	private String propertyOwner;
    /**房产性质*/
    @TableField(value = "house_property")
	private String houseProperty;
    /**房产面积*/
    @TableField(value = "house_acreage")
	private Double houseAcreage;
    /**权属证号*/
    @TableField(value = "ownership_number")
	private String ownershipNumber;
    /**他项权证号*/
    @TableField(value = "mortgages_number")
	private String mortgagesNumber;
    /**抵押顺位*/
    @TableField(value = "impawn_order")
	private String impawnOrder;
    /**前序顺位抵押金额*/
    @TableField(value = "preorder_mortgage_amount")
	private Double preorderMortgageAmount;
    /**查封顺位*/
    @TableField(value = "sealed_order")
	private String sealedOrder;
    /**首封法院*/
    @TableField(value = "first_seizure_court")
	private String firstSeizureCourt;
    /**建筑结构*/
    @TableField(value = "building_structure")
	private String buildingStructure;
    /**建成日期*/
    @TableField(value = "completion_date")
	private Date completionDate;
    /**所在层数*/
    @TableField(value = "layer_number")
	private Integer layerNumber;
    /**总层数*/
    @TableField(value = "total_layer_number")
	private Integer totalLayerNumber;
    /**出租情况*/
    @TableField(value = "rent_out")
	private String rentOut;
    /**是否有未成年人*/
    @TableField(value = "minors")
	private String minors;
    /**是否唯一住房*/
    @TableField(value = "only_housing")
	private String onlyHousing;
    /**是否需腾房*/
    @TableField(value = "lei_housing")
	private String leiHousing;
	
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
	 * 获取  propertyOwner
	 *@return: String  权属人
	 */
	public String getPropertyOwner(){
		return this.propertyOwner;
	}

	/**
	 * 设置  propertyOwner
	 *@param: propertyOwner  权属人
	 */
	public void setPropertyOwner(String propertyOwner){
		this.propertyOwner = propertyOwner;
	}
	/**
	 * 获取  houseProperty
	 *@return: String  房产性质
	 */
	public String getHouseProperty(){
		return this.houseProperty;
	}

	/**
	 * 设置  houseProperty
	 *@param: houseProperty  房产性质
	 */
	public void setHouseProperty(String houseProperty){
		this.houseProperty = houseProperty;
	}
	/**
	 * 获取  houseAcreage
	 *@return: Double  房产面积
	 */
	public Double getHouseAcreage(){
		return this.houseAcreage;
	}

	/**
	 * 设置  houseAcreage
	 *@param: houseAcreage  房产面积
	 */
	public void setHouseAcreage(Double houseAcreage){
		this.houseAcreage = houseAcreage;
	}
	/**
	 * 获取  ownershipNumber
	 *@return: String  权属证号
	 */
	public String getOwnershipNumber(){
		return this.ownershipNumber;
	}

	/**
	 * 设置  ownershipNumber
	 *@param: ownershipNumber  权属证号
	 */
	public void setOwnershipNumber(String ownershipNumber){
		this.ownershipNumber = ownershipNumber;
	}
	/**
	 * 获取  mortgagesNumber
	 *@return: String  他项权证号
	 */
	public String getMortgagesNumber(){
		return this.mortgagesNumber;
	}

	/**
	 * 设置  mortgagesNumber
	 *@param: mortgagesNumber  他项权证号
	 */
	public void setMortgagesNumber(String mortgagesNumber){
		this.mortgagesNumber = mortgagesNumber;
	}
	/**
	 * 获取  impawnOrder
	 *@return: String  抵押顺位
	 */
	public String getImpawnOrder(){
		return this.impawnOrder;
	}

	/**
	 * 设置  impawnOrder
	 *@param: impawnOrder  抵押顺位
	 */
	public void setImpawnOrder(String impawnOrder){
		this.impawnOrder = impawnOrder;
	}
	/**
	 * 获取  preorderMortgageAmount
	 *@return: Double  前序顺位抵押金额
	 */
	public Double getPreorderMortgageAmount(){
		return this.preorderMortgageAmount;
	}

	/**
	 * 设置  preorderMortgageAmount
	 *@param: preorderMortgageAmount  前序顺位抵押金额
	 */
	public void setPreorderMortgageAmount(Double preorderMortgageAmount){
		this.preorderMortgageAmount = preorderMortgageAmount;
	}
	/**
	 * 获取  sealedOrder
	 *@return: String  查封顺位
	 */
	public String getSealedOrder(){
		return this.sealedOrder;
	}

	/**
	 * 设置  sealedOrder
	 *@param: sealedOrder  查封顺位
	 */
	public void setSealedOrder(String sealedOrder){
		this.sealedOrder = sealedOrder;
	}
	/**
	 * 获取  firstSeizureCourt
	 *@return: String  首封法院
	 */
	public String getFirstSeizureCourt(){
		return this.firstSeizureCourt;
	}

	/**
	 * 设置  firstSeizureCourt
	 *@param: firstSeizureCourt  首封法院
	 */
	public void setFirstSeizureCourt(String firstSeizureCourt){
		this.firstSeizureCourt = firstSeizureCourt;
	}
	/**
	 * 获取  buildingStructure
	 *@return: String  建筑结构
	 */
	public String getBuildingStructure(){
		return this.buildingStructure;
	}

	/**
	 * 设置  buildingStructure
	 *@param: buildingStructure  建筑结构
	 */
	public void setBuildingStructure(String buildingStructure){
		this.buildingStructure = buildingStructure;
	}
	/**
	 * 获取  completionDate
	 *@return: Date  建成日期
	 */
	public Date getCompletionDate(){
		return this.completionDate;
	}

	/**
	 * 设置  completionDate
	 *@param: completionDate  建成日期
	 */
	public void setCompletionDate(Date completionDate){
		this.completionDate = completionDate;
	}
	/**
	 * 获取  layerNumber
	 *@return: Integer  所在层数
	 */
	public Integer getLayerNumber(){
		return this.layerNumber;
	}

	/**
	 * 设置  layerNumber
	 *@param: layerNumber  所在层数
	 */
	public void setLayerNumber(Integer layerNumber){
		this.layerNumber = layerNumber;
	}
	/**
	 * 获取  totalLayerNumber
	 *@return: Integer  总层数
	 */
	public Integer getTotalLayerNumber(){
		return this.totalLayerNumber;
	}

	/**
	 * 设置  totalLayerNumber
	 *@param: totalLayerNumber  总层数
	 */
	public void setTotalLayerNumber(Integer totalLayerNumber){
		this.totalLayerNumber = totalLayerNumber;
	}
	/**
	 * 获取  rentOut
	 *@return: String  出租情况
	 */
	public String getRentOut(){
		return this.rentOut;
	}

	/**
	 * 设置  rentOut
	 *@param: rentOut  出租情况
	 */
	public void setRentOut(String rentOut){
		this.rentOut = rentOut;
	}
	/**
	 * 获取  minors
	 *@return: String  是否有未成年人
	 */
	public String getMinors(){
		return this.minors;
	}

	/**
	 * 设置  minors
	 *@param: minors  是否有未成年人
	 */
	public void setMinors(String minors){
		this.minors = minors;
	}
	/**
	 * 获取  onlyHousing
	 *@return: String  是否唯一住房
	 */
	public String getOnlyHousing(){
		return this.onlyHousing;
	}

	/**
	 * 设置  onlyHousing
	 *@param: onlyHousing  是否唯一住房
	 */
	public void setOnlyHousing(String onlyHousing){
		this.onlyHousing = onlyHousing;
	}
	/**
	 * 获取  leiHousing
	 *@return: String  是否需腾房
	 */
	public String getLeiHousing(){
		return this.leiHousing;
	}

	/**
	 * 设置  leiHousing
	 *@param: leiHousing  是否需腾房
	 */
	public void setLeiHousing(String leiHousing){
		this.leiHousing = leiHousing;
	}
	
}
