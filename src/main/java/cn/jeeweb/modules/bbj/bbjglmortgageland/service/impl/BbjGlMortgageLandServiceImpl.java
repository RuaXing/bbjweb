package cn.jeeweb.modules.bbj.bbjglmortgageland.service.impl;

import cn.jeeweb.core.common.service.impl.CommonServiceImpl;
import cn.jeeweb.modules.bbj.bbjglmortgageland.mapper.BbjGlMortgageLandMapper;
import cn.jeeweb.modules.bbj.bbjglmortgageland.entity.BbjGlMortgageLand;
import cn.jeeweb.modules.bbj.bbjglmortgageland.service.IBbjGlMortgageLandService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**   
 * @Title: 抵押物_土地
 * @Description: 抵押物_土地
 * @author harvey
 * @date 2018-01-19 16:24:29
 * @version V1.0   
 *
 */
@Transactional
@Service("bbjGlMortgageLandService")
public class BbjGlMortgageLandServiceImpl  extends CommonServiceImpl<BbjGlMortgageLandMapper,BbjGlMortgageLand> implements  IBbjGlMortgageLandService {

}
