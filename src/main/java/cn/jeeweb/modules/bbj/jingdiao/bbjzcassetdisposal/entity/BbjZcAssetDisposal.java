package cn.jeeweb.modules.bbj.jingdiao.bbjzcassetdisposal.entity;

import cn.jeeweb.core.common.entity.AbstractEntity;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import cn.jeeweb.modules.sys.entity.User;
import java.util.Date;

/**   
 * @Title: 资产处置障碍
 * @Description: 资产处置障碍
 * @author somuns
 * @date 2018-01-24 22:42:00
 * @version V1.0   
 *
 */
@TableName("bbj_zc_asset_disposal")
@SuppressWarnings("serial")
public class BbjZcAssetDisposal extends AbstractEntity<String> {

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
    /**资产*/
    @TableField(value = "assets")
	private Double assets;
    /**类型*/
    @TableField(value = "type")
	private String type;
    /**产权人*/
    @TableField(value = "property_owner")
	private String propertyOwner;
    /**存在问题*/
    @TableField(value = "problem")
	private String problem;
    /**解决办法*/
    @TableField(value = "solution")
	private String solution;
	
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
	 * 获取  assets
	 *@return: Double  资产
	 */
	public Double getAssets(){
		return this.assets;
	}

	/**
	 * 设置  assets
	 *@param: assets  资产
	 */
	public void setAssets(Double assets){
		this.assets = assets;
	}
	/**
	 * 获取  type
	 *@return: String  类型
	 */
	public String getType(){
		return this.type;
	}

	/**
	 * 设置  type
	 *@param: type  类型
	 */
	public void setType(String type){
		this.type = type;
	}
	/**
	 * 获取  propertyOwner
	 *@return: String  产权人
	 */
	public String getPropertyOwner(){
		return this.propertyOwner;
	}

	/**
	 * 设置  propertyOwner
	 *@param: propertyOwner  产权人
	 */
	public void setPropertyOwner(String propertyOwner){
		this.propertyOwner = propertyOwner;
	}
	/**
	 * 获取  problem
	 *@return: String  存在问题
	 */
	public String getProblem(){
		return this.problem;
	}

	/**
	 * 设置  problem
	 *@param: problem  存在问题
	 */
	public void setProblem(String problem){
		this.problem = problem;
	}
	/**
	 * 获取  solution
	 *@return: String  解决办法
	 */
	public String getSolution(){
		return this.solution;
	}

	/**
	 * 设置  solution
	 *@param: solution  解决办法
	 */
	public void setSolution(String solution){
		this.solution = solution;
	}
	
}
