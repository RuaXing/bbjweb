package cn.jeeweb.modules.bbj.jingdiao.bbjglzrrjtcy.service.impl;

import cn.jeeweb.core.common.service.impl.CommonServiceImpl;
import cn.jeeweb.modules.bbj.jingdiao.bbjglzrrjtcy.mapper.BbjGlZrrJtcyMapper;
import cn.jeeweb.modules.bbj.jingdiao.bbjglzrrjtcy.entity.BbjGlZrrJtcy;
import cn.jeeweb.modules.bbj.jingdiao.bbjglzrrjtcy.service.IBbjGlZrrJtcyService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**   
 * @Title: 自然人_家庭成员
 * @Description: 自然人_家庭成员
 * @author lqz
 * @date 2018-01-28 14:34:44
 * @version V1.0   
 *
 */
@Transactional
@Service("bbjGlZrrJtcyService")
public class BbjGlZrrJtcyServiceImpl  extends CommonServiceImpl<BbjGlZrrJtcyMapper,BbjGlZrrJtcy> implements  IBbjGlZrrJtcyService {

}
