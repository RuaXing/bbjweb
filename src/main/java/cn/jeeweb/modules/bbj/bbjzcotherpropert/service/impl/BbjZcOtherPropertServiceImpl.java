package cn.jeeweb.modules.bbj.bbjzcotherpropert.service.impl;

import cn.jeeweb.core.common.service.impl.CommonServiceImpl;
import cn.jeeweb.modules.bbj.bbjzcotherpropert.mapper.BbjZcOtherPropertMapper;
import cn.jeeweb.modules.bbj.bbjzcotherpropert.entity.BbjZcOtherPropert;
import cn.jeeweb.modules.bbj.bbjzcotherpropert.service.IBbjZcOtherPropertService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**   
 * @Title: 其他财产
 * @Description: 其他财产
 * @author harvey
 * @date 2018-01-19 09:46:48
 * @version V1.0   
 *
 */
@Transactional
@Service("bbjZcOtherPropertService")
public class BbjZcOtherPropertServiceImpl  extends CommonServiceImpl<BbjZcOtherPropertMapper,BbjZcOtherPropert> implements  IBbjZcOtherPropertService {

}
