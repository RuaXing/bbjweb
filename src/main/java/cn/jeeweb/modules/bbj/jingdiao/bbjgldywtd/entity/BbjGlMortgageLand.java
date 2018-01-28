package cn.jeeweb.modules.bbj.jingdiao.bbjgldywtd.entity;

import cn.jeeweb.core.common.entity.AbstractEntity;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;

/**   
 * @Title: 抵押物_土地
 * @Description: 抵押物_土地
 * @author harvey
 * @date 2018-01-28 14:27:13
 * @version V1.0   
 *
 */
@TableName("bbj_gl_mortgage_land")
@SuppressWarnings("serial")
public class BbjGlMortgageLand extends AbstractEntity<String> {

    /**字段主键*/
    @TableId(value = "id", type = IdType.UUID)
	private String id;
    /**抵押物编号*/
    @TableField(value = "mortgage_id")
	private String mortgageId;
    /**土地信息编号*/
    @TableField(value = "land_id")
	private String landId;
	
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
	 * 获取  mortgageId
	 *@return: String  抵押物编号
	 */
	public String getMortgageId(){
		return this.mortgageId;
	}

	/**
	 * 设置  mortgageId
	 *@param: mortgageId  抵押物编号
	 */
	public void setMortgageId(String mortgageId){
		this.mortgageId = mortgageId;
	}
	/**
	 * 获取  landId
	 *@return: String  土地信息编号
	 */
	public String getLandId(){
		return this.landId;
	}

	/**
	 * 设置  landId
	 *@param: landId  土地信息编号
	 */
	public void setLandId(String landId){
		this.landId = landId;
	}
	
}
