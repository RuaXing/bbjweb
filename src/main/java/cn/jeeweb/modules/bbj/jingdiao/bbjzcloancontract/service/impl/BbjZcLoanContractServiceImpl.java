package cn.jeeweb.modules.bbj.jingdiao.bbjzcloancontract.service.impl;

import cn.jeeweb.core.common.service.impl.CommonServiceImpl;
import cn.jeeweb.modules.bbj.jingdiao.bbjzcloancontract.mapper.BbjZcLoanContractMapper;
import cn.jeeweb.modules.bbj.jingdiao.bbjzcloancontract.entity.BbjZcLoanContract;
import cn.jeeweb.modules.bbj.jingdiao.bbjzcloancontract.service.IBbjZcLoanContractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**   
 * @Title: 借款合同
 * @Description: 借款合同
 * @author even
 * @date 2018-01-27 22:45:22
 * @version V1.0   
 *
 */
@Transactional
@Service("bbjZcLoanContractService")
public class BbjZcLoanContractServiceImpl  extends CommonServiceImpl<BbjZcLoanContractMapper,BbjZcLoanContract> implements  IBbjZcLoanContractService {

}
