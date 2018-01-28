package cn.jeeweb.modules.bbj.jingdiao.bbjzrr.service.impl;

import cn.jeeweb.core.common.service.impl.CommonServiceImpl;
import cn.jeeweb.modules.bbj.jingdiao.bbjzrr.mapper.BbjZcNaturalPersonMapper;
import cn.jeeweb.modules.bbj.jingdiao.bbjzrr.entity.BbjZcNaturalPerson;
import cn.jeeweb.modules.bbj.jingdiao.bbjzrr.service.IBbjZcNaturalPersonService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**   
 * @Title: 自然人
 * @Description: 自然人
 * @author lqz
 * @date 2018-01-28 14:36:19
 * @version V1.0   
 *
 */
@Transactional
@Service("bbjZcNaturalPersonService")
public class BbjZcNaturalPersonServiceImpl  extends CommonServiceImpl<BbjZcNaturalPersonMapper,BbjZcNaturalPerson> implements  IBbjZcNaturalPersonService {

}
