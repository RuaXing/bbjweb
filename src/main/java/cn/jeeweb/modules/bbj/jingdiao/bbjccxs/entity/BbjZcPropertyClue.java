package cn.jeeweb.modules.bbj.jingdiao.bbjccxs.entity;

import cn.jeeweb.core.common.entity.AbstractEntity;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import cn.jeeweb.modules.sys.entity.User;
import java.util.Date;

/**   
 * @Title: 财产线索
 * @Description: 财产线索
 * @author lqz
 * @date 2018-01-28 14:29:12
 * @version V1.0   
 *
 */
@TableName("bbj_zc_property_clue")
@SuppressWarnings("serial")
public class BbjZcPropertyClue extends AbstractEntity<String> {

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
    /**线索名称*/
    @TableField(value = "clue_name")
	private String cluename;
    /**线索详情*/
    @TableField(value = "clue_info")
	private String clueinfo;
	
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
	 * 获取  cluename
	 *@return: String  线索名称
	 */
	public String getCluename(){
		return this.cluename;
	}

	/**
	 * 设置  cluename
	 *@param: cluename  线索名称
	 */
	public void setCluename(String cluename){
		this.cluename = cluename;
	}
	/**
	 * 获取  clueinfo
	 *@return: String  线索详情
	 */
	public String getClueinfo(){
		return this.clueinfo;
	}

	/**
	 * 设置  clueinfo
	 *@param: clueinfo  线索详情
	 */
	public void setClueinfo(String clueinfo){
		this.clueinfo = clueinfo;
	}
	
}