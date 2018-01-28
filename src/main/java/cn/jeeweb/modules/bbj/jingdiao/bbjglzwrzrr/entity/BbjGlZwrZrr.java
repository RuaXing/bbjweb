package cn.jeeweb.modules.bbj.jingdiao.bbjglzwrzrr.entity;

import cn.jeeweb.core.common.entity.AbstractEntity;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import cn.jeeweb.modules.sys.entity.User;
import java.util.Date;

/**   
 * @Title: 债务人_自然人
 * @Description: 债务人_自然人
 * @author lqz
 * @date 2018-01-28 14:35:51
 * @version V1.0   
 *
 */
@TableName("bbj_gl_zwr_zrr")
@SuppressWarnings("serial")
public class BbjGlZwrZrr extends AbstractEntity<String> {

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
    /**备注信息*/
    @TableField(value = "remarks")
	private String remarks;
    /**债务人编号*/
    @TableField(value = "zwr_id")
	private String zwrId;
    /**自然人编号*/
    @TableField(value = "zrr_id")
	private String zrrId;
	
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
	 * 获取  zwrId
	 *@return: String  债务人编号
	 */
	public String getZwrId(){
		return this.zwrId;
	}

	/**
	 * 设置  zwrId
	 *@param: zwrId  债务人编号
	 */
	public void setZwrId(String zwrId){
		this.zwrId = zwrId;
	}
	/**
	 * 获取  zrrId
	 *@return: String  自然人编号
	 */
	public String getZrrId(){
		return this.zrrId;
	}

	/**
	 * 设置  zrrId
	 *@param: zrrId  自然人编号
	 */
	public void setZrrId(String zrrId){
		this.zrrId = zrrId;
	}
	
}
