package cn.jeeweb.modules.bbj.bbjglmortgagerealestate.entity;

import cn.jeeweb.core.common.entity.AbstractEntity;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;

/**   
 * @Title: 抵押物_房产
 * @Description: 抵押物_房产
 * @author harvey
 * @date 2018-01-19 16:26:12
 * @version V1.0   
 *
 */
@TableName("bbj_gl_mortgage_real_estate")
@SuppressWarnings("serial")
public class BbjGlMortgageRealEstate extends AbstractEntity<String> {

    /**字段主键*/
    @TableId(value = "id", type = IdType.UUID)
	private String id;
    /**抵押物编号*/
    @TableField(value = "mortgage_id")
	private String mortgageId;
    /**房产编号*/
    @TableField(value = "real_estate_id")
	private String realEstateId;
	
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
	 * 获取  realEstateId
	 *@return: String  房产编号
	 */
	public String getRealEstateId(){
		return this.realEstateId;
	}

	/**
	 * 设置  realEstateId
	 *@param: realEstateId  房产编号
	 */
	public void setRealEstateId(String realEstateId){
		this.realEstateId = realEstateId;
	}
	
}
