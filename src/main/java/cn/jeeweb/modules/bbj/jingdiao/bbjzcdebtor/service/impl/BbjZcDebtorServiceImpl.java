package cn.jeeweb.modules.bbj.jingdiao.bbjzcdebtor.service.impl;

import cn.jeeweb.core.common.service.impl.CommonServiceImpl;
import cn.jeeweb.modules.bbj.jingdiao.bbjzcdebtor.mapper.BbjZcDebtorMapper;
import cn.jeeweb.modules.bbj.jingdiao.bbjzcdebtor.entity.BbjZcDebtor;
import cn.jeeweb.modules.bbj.jingdiao.bbjzcdebtor.service.IBbjZcDebtorService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**   
 * @Title: 债务人
 * @Description: 债务人
 * @author even
 * @date 2018-01-27 23:57:26
 * @version V1.0   
 *
 */
@Transactional
@Service("bbjZcDebtorService")
public class BbjZcDebtorServiceImpl  extends CommonServiceImpl<BbjZcDebtorMapper,BbjZcDebtor> implements  IBbjZcDebtorService {

}
