package cn.jeeweb.modules.bbj.jingdiao.bbjgldywfc.service.impl;

import cn.jeeweb.core.common.service.impl.CommonServiceImpl;
import cn.jeeweb.modules.bbj.jingdiao.bbjgldywfc.mapper.BbjGlMortgageRealEstateMapper;
import cn.jeeweb.modules.bbj.jingdiao.bbjgldywfc.entity.BbjGlMortgageRealEstate;
import cn.jeeweb.modules.bbj.jingdiao.bbjgldywfc.service.IBbjGlMortgageRealEstateService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**   
 * @Title: 抵押物_房产
 * @Description: 抵押物_房产
 * @author harvey
 * @date 2018-01-28 14:28:14
 * @version V1.0   
 *
 */
@Transactional
@Service("bbjGlMortgageRealEstateService")
public class BbjGlMortgageRealEstateServiceImpl  extends CommonServiceImpl<BbjGlMortgageRealEstateMapper,BbjGlMortgageRealEstate> implements  IBbjGlMortgageRealEstateService {

}
