package cn.jeeweb.modules.bbj.jingdiao.bbjzwr.service.impl;

import cn.jeeweb.core.common.service.impl.CommonServiceImpl;
import cn.jeeweb.modules.bbj.jingdiao.bbjzwr.mapper.BbjZcDebtorMapper;
import cn.jeeweb.modules.bbj.jingdiao.bbjzwr.entity.BbjZcDebtor;
import cn.jeeweb.modules.bbj.jingdiao.bbjzwr.service.IBbjZcDebtorService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**   
 * @Title: 债务人
 * @Description: 债务人
 * @author even
 * @date 2018-01-28 14:21:58
 * @version V1.0   
 *
 */
@Transactional
@Service("bbjZcDebtorService")
public class BbjZcDebtorServiceImpl  extends CommonServiceImpl<BbjZcDebtorMapper,BbjZcDebtor> implements  IBbjZcDebtorService {

}
