package cn.jeeweb.modules.bbj.jingdiao.bbjgldywqt.service.impl;

import cn.jeeweb.core.common.service.impl.CommonServiceImpl;
import cn.jeeweb.modules.bbj.jingdiao.bbjgldywqt.mapper.BbjGlMortgageOthersMapper;
import cn.jeeweb.modules.bbj.jingdiao.bbjgldywqt.entity.BbjGlMortgageOthers;
import cn.jeeweb.modules.bbj.jingdiao.bbjgldywqt.service.IBbjGlMortgageOthersService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**   
 * @Title: 抵押物_其他
 * @Description: 抵押物_其他
 * @author harvey
 * @date 2018-01-28 14:31:51
 * @version V1.0   
 *
 */
@Transactional
@Service("bbjGlMortgageOthersService")
public class BbjGlMortgageOthersServiceImpl  extends CommonServiceImpl<BbjGlMortgageOthersMapper,BbjGlMortgageOthers> implements  IBbjGlMortgageOthersService {

}
