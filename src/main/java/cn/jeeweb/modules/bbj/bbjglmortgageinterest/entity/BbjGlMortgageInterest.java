package cn.jeeweb.modules.bbj.bbjglmortgageinterest.entity;

import cn.jeeweb.core.common.entity.AbstractEntity;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;

/**   
 * @Title: 抵押物_股权
 * @Description: 抵押物_股权
 * @author harvey
 * @date 2018-01-19 16:38:49
 * @version V1.0   
 *
 */
@TableName("bbj_gl_mortgage_interest")
@SuppressWarnings("serial")
public class BbjGlMortgageInterest extends AbstractEntity<String> {

    /**字段主键*/
    @TableId(value = "id", type = IdType.UUID)
	private String id;
    /**抵押物编号*/
    @TableField(value = "mortgage_id")
	private String mortgageId;
    /**股权编号*/
    @TableField(value = "equity_interest_id")
	private String equityInterestId;
	
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
	 * 获取  equityInterestId
	 *@return: String  股权编号
	 */
	public String getEquityInterestId(){
		return this.equityInterestId;
	}

	/**
	 * 设置  equityInterestId
	 *@param: equityInterestId  股权编号
	 */
	public void setEquityInterestId(String equityInterestId){
		this.equityInterestId = equityInterestId;
	}
	
}
