package cn.jeeweb.modules.bbj.jingdiao.bbjkht.service.impl;

import cn.jeeweb.core.common.service.impl.CommonServiceImpl;
import cn.jeeweb.modules.bbj.jingdiao.bbjkht.mapper.BbjZcLoanContractMapper;
import cn.jeeweb.modules.bbj.jingdiao.bbjkht.entity.BbjZcLoanContract;
import cn.jeeweb.modules.bbj.jingdiao.bbjkht.service.IBbjZcLoanContractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**   
 * @Title: 借款合同
 * @Description: 借款合同
 * @author even
 * @date 2018-01-28 14:28:37
 * @version V1.0   
 *
 */
@Transactional
@Service("bbjZcLoanContractService")
public class BbjZcLoanContractServiceImpl  extends CommonServiceImpl<BbjZcLoanContractMapper,BbjZcLoanContract> implements  IBbjZcLoanContractService {

}
