package cn.jeeweb.modules.bbj.jingdiao.bbjzcobligatoryright.service.impl;

import cn.jeeweb.core.common.service.impl.CommonServiceImpl;
import cn.jeeweb.modules.bbj.jingdiao.bbjzcobligatoryright.mapper.BbjZcObligatoryRightMapper;
import cn.jeeweb.modules.bbj.jingdiao.bbjzcobligatoryright.entity.BbjZcObligatoryRight;
import cn.jeeweb.modules.bbj.jingdiao.bbjzcobligatoryright.service.IBbjZcObligatoryRightService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**   
 * @Title: 债权表
 * @Description: 债权表
 * @author even
 * @date 2018-01-27 22:37:57
 * @version V1.0   
 *
 */
@Transactional
@Service("bbjZcObligatoryRightService")
public class BbjZcObligatoryRightServiceImpl  extends CommonServiceImpl<BbjZcObligatoryRightMapper,BbjZcObligatoryRight> implements  IBbjZcObligatoryRightService {

}
