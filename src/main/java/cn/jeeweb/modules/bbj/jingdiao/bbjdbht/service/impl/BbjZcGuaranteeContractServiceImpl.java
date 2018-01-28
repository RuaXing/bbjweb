package cn.jeeweb.modules.bbj.jingdiao.bbjdbht.service.impl;

import cn.jeeweb.core.common.service.impl.CommonServiceImpl;
import cn.jeeweb.modules.bbj.jingdiao.bbjdbht.mapper.BbjZcGuaranteeContractMapper;
import cn.jeeweb.modules.bbj.jingdiao.bbjdbht.entity.BbjZcGuaranteeContract;
import cn.jeeweb.modules.bbj.jingdiao.bbjdbht.service.IBbjZcGuaranteeContractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**   
 * @Title: 担保合同
 * @Description: 担保合同
 * @author lqz
 * @date 2018-01-28 14:33:35
 * @version V1.0   
 *
 */
@Transactional
@Service("bbjZcGuaranteeContractService")
public class BbjZcGuaranteeContractServiceImpl  extends CommonServiceImpl<BbjZcGuaranteeContractMapper,BbjZcGuaranteeContract> implements  IBbjZcGuaranteeContractService {

}
