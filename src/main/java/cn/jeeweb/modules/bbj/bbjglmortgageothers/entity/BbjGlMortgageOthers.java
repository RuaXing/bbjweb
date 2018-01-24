package cn.jeeweb.modules.bbj.bbjglmortgageothers.entity;

import cn.jeeweb.core.common.entity.AbstractEntity;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;

/**   
 * @Title: 抵押物_其他
 * @Description: 抵押物_其他
 * @author harvey
 * @date 2018-01-19 16:36:28
 * @version V1.0   
 *
 */
@TableName("bbj_gl_mortgage_others")
@SuppressWarnings("serial")
public class BbjGlMortgageOthers extends AbstractEntity<String> {

    /**字段主键*/
    @TableId(value = "id", type = IdType.UUID)
	private String id;
    /**抵押物编号*/
    @TableField(value = "mortgage_id")
	private String mortgageId;
    /**其他编号*/
    @TableField(value = "others_id")
	private String othersId;
	
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
	 * 获取  othersId
	 *@return: String  其他编号
	 */
	public String getOthersId(){
		return this.othersId;
	}

	/**
	 * 设置  othersId
	 *@param: othersId  其他编号
	 */
	public void setOthersId(String othersId){
		this.othersId = othersId;
	}
	
}
