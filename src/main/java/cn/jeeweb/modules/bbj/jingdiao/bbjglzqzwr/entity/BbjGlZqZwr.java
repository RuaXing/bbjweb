package cn.jeeweb.modules.bbj.jingdiao.bbjglzqzwr.entity;

import cn.jeeweb.core.common.entity.AbstractEntity;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;

/**   
 * @Title: 债权_债务人
 * @Description: 债权_债务人
 * @author even
 * @date 2018-01-27 17:59:47
 * @version V1.0   
 *
 */
@TableName("bbj_gl_zq_zwr")
@SuppressWarnings("serial")
public class BbjGlZqZwr extends AbstractEntity<String> {

    /**编号*/
    @TableId(value = "id", type = IdType.UUID)
	private String id;
    /**债权编号*/
    @TableField(value = "zq_id")
	private String zqId;
    /**债务人编号*/
    @TableField(value = "zwr_id")
	private String zwrId;
	
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
	
}
