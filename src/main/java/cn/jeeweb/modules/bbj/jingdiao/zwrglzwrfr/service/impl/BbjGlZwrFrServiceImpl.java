package cn.jeeweb.modules.bbj.jingdiao.zwrglzwrfr.service.impl;

import cn.jeeweb.core.common.service.impl.CommonServiceImpl;
import cn.jeeweb.modules.bbj.jingdiao.zwrglzwrfr.mapper.BbjGlZwrFrMapper;
import cn.jeeweb.modules.bbj.jingdiao.zwrglzwrfr.entity.BbjGlZwrFr;
import cn.jeeweb.modules.bbj.jingdiao.zwrglzwrfr.service.IBbjGlZwrFrService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**   
 * @Title: 债务人_法人
 * @Description: 债务人_法人
 * @author lqz
 * @date 2018-01-28 14:24:22
 * @version V1.0   
 *
 */
@Transactional
@Service("bbjGlZwrFrService")
public class BbjGlZwrFrServiceImpl  extends CommonServiceImpl<BbjGlZwrFrMapper,BbjGlZwrFr> implements  IBbjGlZwrFrService {

}
