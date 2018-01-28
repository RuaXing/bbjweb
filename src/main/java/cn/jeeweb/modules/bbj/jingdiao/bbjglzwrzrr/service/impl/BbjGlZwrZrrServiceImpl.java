package cn.jeeweb.modules.bbj.jingdiao.bbjglzwrzrr.service.impl;

import cn.jeeweb.core.common.service.impl.CommonServiceImpl;
import cn.jeeweb.modules.bbj.jingdiao.bbjglzwrzrr.mapper.BbjGlZwrZrrMapper;
import cn.jeeweb.modules.bbj.jingdiao.bbjglzwrzrr.entity.BbjGlZwrZrr;
import cn.jeeweb.modules.bbj.jingdiao.bbjglzwrzrr.service.IBbjGlZwrZrrService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**   
 * @Title: 债务人_自然人
 * @Description: 债务人_自然人
 * @author lqz
 * @date 2018-01-28 14:35:51
 * @version V1.0   
 *
 */
@Transactional
@Service("bbjGlZwrZrrService")
public class BbjGlZwrZrrServiceImpl  extends CommonServiceImpl<BbjGlZwrZrrMapper,BbjGlZwrZrr> implements  IBbjGlZwrZrrService {

}
