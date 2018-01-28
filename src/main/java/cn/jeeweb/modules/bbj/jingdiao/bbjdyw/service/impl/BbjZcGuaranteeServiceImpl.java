package cn.jeeweb.modules.bbj.jingdiao.bbjdyw.service.impl;

import cn.jeeweb.core.common.service.impl.CommonServiceImpl;
import cn.jeeweb.modules.bbj.jingdiao.bbjdyw.mapper.BbjZcGuaranteeMapper;
import cn.jeeweb.modules.bbj.jingdiao.bbjdyw.entity.BbjZcGuarantee;
import cn.jeeweb.modules.bbj.jingdiao.bbjdyw.service.IBbjZcGuaranteeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**   
 * @Title: 抵押物
 * @Description: 抵押物
 * @author harvey
 * @date 2018-01-28 14:12:59
 * @version V1.0   
 *
 */
@Transactional
@Service("bbjZcGuaranteeService")
public class BbjZcGuaranteeServiceImpl  extends CommonServiceImpl<BbjZcGuaranteeMapper,BbjZcGuarantee> implements  IBbjZcGuaranteeService {

}
