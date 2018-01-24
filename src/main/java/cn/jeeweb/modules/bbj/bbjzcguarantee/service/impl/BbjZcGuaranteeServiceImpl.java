package cn.jeeweb.modules.bbj.bbjzcguarantee.service.impl;

import cn.jeeweb.core.common.service.impl.CommonServiceImpl;
import cn.jeeweb.modules.bbj.bbjzcguarantee.mapper.BbjZcGuaranteeMapper;
import cn.jeeweb.modules.bbj.bbjzcguarantee.entity.BbjZcGuarantee;
import cn.jeeweb.modules.bbj.bbjzcguarantee.service.IBbjZcGuaranteeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**   
 * @Title: 抵押物
 * @Description: 抵押物
 * @author harvey
 * @date 2018-01-19 17:03:01
 * @version V1.0   
 *
 */
@Transactional
@Service("bbjZcGuaranteeService")
public class BbjZcGuaranteeServiceImpl  extends CommonServiceImpl<BbjZcGuaranteeMapper,BbjZcGuarantee> implements  IBbjZcGuaranteeService {

}
