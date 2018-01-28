package cn.jeeweb.modules.bbj.jingdiao.bbjzqb.service.impl;

import cn.jeeweb.core.common.service.impl.CommonServiceImpl;
import cn.jeeweb.modules.bbj.jingdiao.bbjzqb.mapper.BbjZcObligatoryRightMapper;
import cn.jeeweb.modules.bbj.jingdiao.bbjzqb.entity.BbjZcObligatoryRight;
import cn.jeeweb.modules.bbj.jingdiao.bbjzqb.service.IBbjZcObligatoryRightService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**   
 * @Title: 债权表
 * @Description: 债权表
 * @author even
 * @date 2018-01-28 14:13:43
 * @version V1.0   
 *
 */
@Transactional
@Service("bbjZcObligatoryRightService")
public class BbjZcObligatoryRightServiceImpl  extends CommonServiceImpl<BbjZcObligatoryRightMapper,BbjZcObligatoryRight> implements  IBbjZcObligatoryRightService {

}
