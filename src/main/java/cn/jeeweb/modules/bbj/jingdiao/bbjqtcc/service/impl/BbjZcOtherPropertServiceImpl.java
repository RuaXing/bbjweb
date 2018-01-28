package cn.jeeweb.modules.bbj.jingdiao.bbjqtcc.service.impl;

import cn.jeeweb.core.common.service.impl.CommonServiceImpl;
import cn.jeeweb.modules.bbj.jingdiao.bbjqtcc.mapper.BbjZcOtherPropertMapper;
import cn.jeeweb.modules.bbj.jingdiao.bbjqtcc.entity.BbjZcOtherPropert;
import cn.jeeweb.modules.bbj.jingdiao.bbjqtcc.service.IBbjZcOtherPropertService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**   
 * @Title: 其他财产
 * @Description: 其他财产
 * @author harvey
 * @date 2018-01-28 14:27:43
 * @version V1.0   
 *
 */
@Transactional
@Service("bbjZcOtherPropertService")
public class BbjZcOtherPropertServiceImpl  extends CommonServiceImpl<BbjZcOtherPropertMapper,BbjZcOtherPropert> implements  IBbjZcOtherPropertService {

}
