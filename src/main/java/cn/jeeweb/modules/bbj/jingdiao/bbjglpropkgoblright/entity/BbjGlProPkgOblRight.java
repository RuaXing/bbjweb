package cn.jeeweb.modules.bbj.jingdiao.bbjglpropkgoblright.entity;

import cn.jeeweb.core.common.entity.AbstractEntity;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;

/**   
 * @Title: 资产包_债权
 * @Description: 资产包_债权
 * @author even
 * @date 2018-01-28 00:41:32
 * @version V1.0   
 *
 */
@TableName("bbj_gl_pro_pkg_obl_right")
@SuppressWarnings("serial")
public class BbjGlProPkgOblRight extends AbstractEntity<String> {

    /**主键*/
    @TableId(value = "id", type = IdType.UUID)
	private String id;
    /**资产包编号*/
    @TableField(value = "property_id")
	private String propertyId;
    /**债权编号*/
    @TableField(value = "obligatory_right_id")
	private String obligatoryRightId;
	
	/**
	 * 获取  id
	 *@return: String  主键
	 */
	public String getId(){
		return this.id;
	}

	/**
	 * 设置  id
	 *@param: id  主键
	 */
	public void setId(String id){
		this.id = id;
	}
	/**
	 * 获取  propertyId
	 *@return: String  资产包编号
	 */
	public String getPropertyId(){
		return this.propertyId;
	}

	/**
	 * 设置  propertyId
	 *@param: propertyId  资产包编号
	 */
	public void setPropertyId(String propertyId){
		this.propertyId = propertyId;
	}
	/**
	 * 获取  obligatoryRightId
	 *@return: String  债权编号
	 */
	public String getObligatoryRightId(){
		return this.obligatoryRightId;
	}

	/**
	 * 设置  obligatoryRightId
	 *@param: obligatoryRightId  债权编号
	 */
	public void setObligatoryRightId(String obligatoryRightId){
		this.obligatoryRightId = obligatoryRightId;
	}
	
}
