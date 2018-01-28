package cn.jeeweb.modules.bbj.jingdiao.bbjgldywgq.service.impl;

import cn.jeeweb.core.common.service.impl.CommonServiceImpl;
import cn.jeeweb.modules.bbj.jingdiao.bbjgldywgq.mapper.BbjGlMortgageInterestMapper;
import cn.jeeweb.modules.bbj.jingdiao.bbjgldywgq.entity.BbjGlMortgageInterest;
import cn.jeeweb.modules.bbj.jingdiao.bbjgldywgq.service.IBbjGlMortgageInterestService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**   
 * @Title: 抵押物_股权
 * @Description: 抵押物_股权
 * @author harvey
 * @date 2018-01-28 14:24:53
 * @version V1.0   
 *
 */
@Transactional
@Service("bbjGlMortgageInterestService")
public class BbjGlMortgageInterestServiceImpl  extends CommonServiceImpl<BbjGlMortgageInterestMapper,BbjGlMortgageInterest> implements  IBbjGlMortgageInterestService {

}
