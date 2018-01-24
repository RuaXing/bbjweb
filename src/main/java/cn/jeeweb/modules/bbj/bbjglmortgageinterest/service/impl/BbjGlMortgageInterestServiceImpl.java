package cn.jeeweb.modules.bbj.bbjglmortgageinterest.service.impl;

import cn.jeeweb.core.common.service.impl.CommonServiceImpl;
import cn.jeeweb.modules.bbj.bbjglmortgageinterest.mapper.BbjGlMortgageInterestMapper;
import cn.jeeweb.modules.bbj.bbjglmortgageinterest.entity.BbjGlMortgageInterest;
import cn.jeeweb.modules.bbj.bbjglmortgageinterest.service.IBbjGlMortgageInterestService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**   
 * @Title: 抵押物_股权
 * @Description: 抵押物_股权
 * @author harvey
 * @date 2018-01-19 16:38:49
 * @version V1.0   
 *
 */
@Transactional
@Service("bbjGlMortgageInterestService")
public class BbjGlMortgageInterestServiceImpl  extends CommonServiceImpl<BbjGlMortgageInterestMapper,BbjGlMortgageInterest> implements  IBbjGlMortgageInterestService {

}
