package cn.jeeweb.modules.bbj.jingdiao.bbjglzqjkht.entity;

import cn.jeeweb.core.common.entity.AbstractEntity;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;

/**   
 * @Title: 债权_借款合同
 * @Description: 债权_借款合同
 * @author even
 * @date 2018-01-27 18:00:27
 * @version V1.0   
 *
 */
@TableName("bbj_gl_zq_jkht")
@SuppressWarnings("serial")
public class BbjGlZqJkht extends AbstractEntity<String> {

    /**编号*/
    @TableId(value = "id", type = IdType.UUID)
	private String id;
    /**债权编号*/
    @TableField(value = "zq_id")
	private String zqId;
    /**合同编号*/
    @TableField(value = "ht_id")
	private String htId;
	
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
	 * 获取  zqId
	 *@return: String  债权编号
	 */
	public String getZqId(){
		return this.zqId;
	}

	/**
	 * 设置  zqId
	 *@param: zqId  债权编号
	 */
	public void setZqId(String zqId){
		this.zqId = zqId;
	}
	/**
	 * 获取  htId
	 *@return: String  合同编号
	 */
	public String getHtId(){
		return this.htId;
	}

	/**
	 * 设置  htId
	 *@param: htId  合同编号
	 */
	public void setHtId(String htId){
		this.htId = htId;
	}
	
}
